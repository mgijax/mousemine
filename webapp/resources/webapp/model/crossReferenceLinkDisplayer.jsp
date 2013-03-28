<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>

<c:choose>
<c:when test="${not empty interMineObject.source.url}">
<c:set var="urlStr" value="${interMineObject.source.url}"/>
<c:set var="id" value="${interMineObject.identifier}"/>
<c:set var="newURL" value="${fn:replace(urlStr,'@@@@',id)}"/>
<a class="external" href="${newURL}" target="_new">${interMineObject.source.name}</a>
</c:when>
<c:otherwise>
${interMineObject.source.name}
</c:otherwise>
</c:choose>
