(jQuery(function() { // run when the page has loaded.

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
	  url : 'http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids='
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
    return '<i class="icon-globe"></i> <a href="'+url+'" target="_blank" >'+id+'</a>';
  };

  /*
  * Given an OntologyAnnotationEvidence object, format the withText field with links.
  */
  var formatWithText = function(imObj){ 
    var t = imObj.get('withText');
    if(!t) return null;
    return t.split("|").map(formatUrl).join("<br/>");
  };

  var abbreviate = function(val, len){
    return val.substr(0,len) + (val.length>len ? "...":"");
  };

  if (intermine) { 
    //intermine.setOptions({CellPreviewTrigger: 'hover'});

    delete intermine.results.formatters.Publication;
    delete intermine.results.formatsets.genomic["Publication.title"];

    intermine.setOptions({
        'Location.start': true,
        'Location.end': true,
	'Location.strand' : true
      }, 
      'intermine.results.formatsets.genomic');

    // standard Location formatter doesn't include the strand. Here's a shim to make it.
    var lf = intermine.results.formatters.Location;
    var lfnew = function(o){
        var s = o.get('strand');
        return lf.call(this,o) + (s>0?' +':s<0?' -':'');
        };
    lfnew.replaces = lf.replaces;
    lfnew.merge = lf.merge;
    lfnew.replaces.push('strand');
    intermine.results.formatters.Location = lfnew;

    intermine.scope('intermine.results.formatsets.genomic', 
        {
	'OntologyAnnotationEvidence.withText' : formatWithText ,
        'Publication.title': function(o){return abbreviate(o.get("title"),35);}, 
        'Publication.citation':function(o){return abbreviate(o.get("citation"),35);}
        });	
  }
}));
