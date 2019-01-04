(jQuery(function() { // run when the page has loaded.

  if(!intermine)
      return;

  /*
  * Mapping from a database prefix (lowercase) to a record containing the 
  * info for creating id-based links to that database. The info includes a
  * URL template and a flag indicating whether the prefix should be stripped
  * (true) or preserved (false) when forming the link.
  */
  var urlTemplates = {
      'chebi' : {
	  stripPrefix : true,
	  url : 'http://www.ebi.ac.uk/chebi/advancedSearchFT.do?searchString=@@@@'
          },
      'ec' : {
	  stripPrefix : true,
	  url : 'http://www.expasy.org/enzyme/@@@@'
          },
      'embl' : {
	  stripPrefix : true,
	  url : 'http://www.ebi.ac.uk/htbin/emblfetch?@@@@'
          },
      'interpro' : {
	  stripPrefix : true,
	  url : 'http://www.ebi.ac.uk/interpro/entry/@@@@'
          },
      'go' : {
	  stripPrefix : false,
	  url : 'http://amigo.geneontology.org/cgi-bin/amigo/term_details?term=@@@@'
          },
      'mgi' : {
	  stripPrefix : false,
	  url : 'http://www.informatics.jax.org/accession/@@@@'
          },
      'ncbi_gene' : {
	  stripPrefix : true,
	  url : 'http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids=@@@@'
          },
      'panther' : {
	  stripPrefix : true,
	  url : 'http://pantree.org/node/annotationNode.jsp?id=@@@@'
          },
      'pir' : {
	  stripPrefix : true,
	  url : 'http://pir.georgetown.edu/cgi-bin/ipcSF?id=@@@@'
          },
      'pfam' : {
	  stripPrefix : true,
	  url : 'http://pfam.sanger.ac.uk/family?entry=@@@@'
          },
      'pombase' : {
	  stripPrefix : true,
	  url : 'http://www.pombase.org/spombe/result/@@@@'
          },
      'pr' : {
	  stripPrefix : false,
	  url : 'http://www.proconsortium.org/cgi-bin/pro/entry_pro?id=@@@@'
          },
      'refseq' : {
	  stripPrefix : true,
	  url : 'http://www.ncbi.nlm.nih.gov/entrez/viewer.cgi?val=@@@@'
          },
      'rgd' : {
	  stripPrefix : false,
	  url : 'http://rgd.mcw.edu/generalSearch/RgdSearch.jsp?quickSearch=1&searchKeyword=@@@@'
          },
      'sgd' : {
	  stripPrefix : false,
	  url : 'http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=@@@@'
          },
      'uniprotkb' : {
	  stripPrefix : true,
	  url : 'http://www.uniprot.org/entry/@@@@'
          },
      'uniprotkb-kw' : {
	  stripPrefix : true,
	  url : 'http://www.uniprot.org/keywords/@@@@'
          },
      };

  /*
   * Formats an anchor tag from individual pieces.
   */
  var formatLink = function(url, text, target, cls){
    target = target || "_self";
    cls = (cls===true?"icon-globe":cls) || "";
    text = text || url;
    return '<a class="'+cls+'" href="'+url+'" target="'+target+'">'+text+'</a>';
  };

  var wrapSpan = function(text){
      return '<span>'+text+'</span>';
  };

  /*
  * Given an id like "MGI:123456" or "OMIM:76543", returns a link to the corresponding page at
  * the corresponding resource. If the database (as indicated by the prefix part) is unknown, returns
  * the id unchanged. Otherwise, returns an html <a> tag.
  */
  var formatUrl = function(id){
    var parts = id.split(":",2);
    var e = urlTemplates[parts[0].toLowerCase()];
    if(!e) return id;
    var lt = e.stripPrefix ? parts[1] : id; // link text
    var url= e.url.replace(/@@@@/, lt);	    // href
    return formatLink(url, wrapSpan(id), "_blank", true);
  };

  /*
   * Escape HTML-special characters (e.g., "<", "&") to their character entity versions
   * (e.g., "&lt;" and "&amp;")
   */
  var escapeHtml = function(str) {
      var div = document.createElement('div');
      div.appendChild(document.createTextNode(str));
      return div.innerHTML;
  };

  /*
  * Given an OntologyAnnotationEvidence object, format the withText field with links.
  */
  var formatWithText = function(imObj){ 
    var t = imObj.get('withText');
    if(!t) return null;
    return t.split("|").map(formatUrl).join("<br/>");
  };

  /*
   * Truncate a string to no more than len characters, with a trailing "...".
   */
  var abbreviate = function(val, len){
    if(val == null) return null;
    return val.substr(0,len) + (val.length>len ? "...":"");
  };

  /*
   * Returns an anchor tag to MGI, given an MGI id.
   */
  var formatMGILink = function(id){
    var url = 'http://www.informatics.jax.org/accession/'+id;
    return formatLink(url, wrapSpan(id), "_blank", true);
  };

  /*
   */
  var formatExpressionAge = function(age){
    return age.replace('embryonic day ','E').replace('postnatal day ','P');
  };

  /*
   */
  var formatIsFragment = function(isFragment){
    return isFragment ? "fragment" : "";
  };

  /*
   * Returns an anchor tag to a specific location on a GXD assay detail.
   * ImageLabel is the displayed label of the specimen (for insitu data) or of the
   * gel image (for gel data).
   * id ths the MGI id of the assay.
   */
  var formatExpressionImage = function(imageLabel, id){

      if (imageLabel == null)
	  return null;

      var figure = imageLabel.replace(/[^a-zA-Z0-9]+/g, "_");
      if(!id)
          return wrapSpan(escapeHtml(imageLabel));
      var url = 'http://www.informatics.jax.org/assay/'+id+'#'+figure+'_id';
      return formatLink(url, wrapSpan(escapeHtml(imageLabel)), "_blank", true)
  };

  imtables.formatting.registerFormatter(
    function(o){return formatMGILink(o.get("assayId"));},
    "genomic",
    "GXDExpression",
    ["assayId"]);

  imtables.formatting.registerFormatter(
    function(o){return formatExpressionAge(o.get("age"));},
    "genomic",
    "GXDExpression",
    ["age"]);

  imtables.formatting.registerFormatter(
    function(o){ return formatExpressionImage(o.get("image"),o.get("assayId")); },
    "genomic",
    "GXDExpression",
    ["image"]);

  imtables.formatting.registerFormatter(
    function(o){return formatMGILink(o.get("probe"));},
    "genomic",
    "GXDExpression",
    ["probe"]);

  imtables.formatting.registerFormatter(
    formatWithText,
    "genomic",
    "OntologyAnnotationEvidence",
    ["withText"]);

  imtables.formatting.registerFormatter(
    function(o){return formatIsFragment(o.get("isFragment"));},
    "genomic",
    "Protein",
    ["isFragment"]);

  imtables.configure({TableCell: {PreviewTrigger: 'click'}});
  
}));
