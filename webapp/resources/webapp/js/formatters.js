(jQuery(function() { // run when the page has loaded.

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
  var formatUrl = function(text){
    var parts = text.split(":",2);
    var e = urlTemplates[parts[0].toLowerCase()];
    if(!e) return text;
    var lt = e.stripPrefix ? parts[1] : text;
    var url= e.url.replace(/@@@@/, lt);
    return '<i class="icon-globe"></i> <a href="'+url+'" target="_blank" >'+text+'</a>';
  };
  var formatWithText = function(imObj){ 
    var t = imObj.get('withText');
    if(!t) return null;
    return t.split("|").map(formatUrl).join("<br/>");
  };

  if (intermine) {   // but only if there is something to do.
    //intermine.setOptions({CellPreviewTrigger: 'hover'});
    intermine.setOptions({
      'Location.start': true,
      'Location.end': true,
    }, 'intermine.results.formatsets.genomic');

    intermine.scope('intermine.results.formatters', 
        {OntologyAnnotationEvidence: formatWithText});
    intermine.scope('intermine.results.formatsets.genomic', 
        {'OntologyAnnotationEvidence.withText': true});	
  }
}));
