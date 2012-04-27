<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<!-- gbrowseDisplayer.jsp -->

<c:if test="${((!empty object.chromosomeLocation && !empty object.chromosome)
                || cld.unqualifiedName == 'Chromosome') && cld.unqualifiedName != 'ChromosomeBand'}">

<c:if test="${object.organism.taxonId==10090}">

<div id="gBrowse" class="feature">

  <h3><fmt:message key="sequenceFeature.GBrowse.message"/></h3>

  <c:set var="type" value="MGI_Representative_Transcripts"/>

  <c:set var="label" value="${type}"/>
  <c:set var="name" value="${object.symbol}"/>
  <c:set var="name" value="${object.chromosomeLocation.locatedOn.primaryIdentifier}:${object.chromosomeLocation.start}..${object.chromosomeLocation.end}"/>

  <c:choose>
  <c:when test="${WEB_PROPERTIES['gbrowse.database.source'] != null}">
    <div align="center">
      <html:link href="${WEB_PROPERTIES['gbrowse.prefix']}/${WEB_PROPERTIES['gbrowse.database.source']}?source=${WEB_PROPERTIES['gbrowse.database.source']};label=${label};name=${name};width=750;grid=1"></html:link>
    </div>
  </c:when>
  <c:otherwise>
    <p class="gbrowse-not-configured"><i>GBrowse is not configured in web.properties</i></p>
  </c:otherwise>
  </c:choose>

<br/>
</div>

<c:if test="${cld.unqualifiedName != 'Chromosome'}">
<script type="text/javascript">
  jQuery(document).ready(function() {
      var img = new Image();
      // wrap our new image in jQuery
      jQuery(img)
        // once the image has loaded, execute this code
        .load(function() {
          // 'remove' loading
          jQuery("#gBrowse div").removeClass('loading');
          // attach image
          jQuery('#gBrowse a').html(this);
        })
        .error(function() {
          // 'remove' loading
          jQuery("#gBrowse div").removeClass('loading');
          // notify the user that the image could not be loaded
          jQuery('#gBrowse a').html("The genome browser could not be loaded.")
          .attr('style', 'color:#ff0000;font-weight:bold;');
        })
        // set the attributes of the image
        .attr('src', "${WEB_PROPERTIES['gbrowse_image.prefix']}/${WEB_PROPERTIES['gbrowse.database.source']}?source=${WEB_PROPERTIES['gbrowse.database.source']};type=${type};name=${name};width=600;b=1;grid=1")
        .attr('style', 'border:1px solid #000;')
        .attr('title', 'GBrowse');
  });
</script>
</c:if>

</c:if>
</c:if>
<!-- /gbrowseDisplayer.jsp -->
