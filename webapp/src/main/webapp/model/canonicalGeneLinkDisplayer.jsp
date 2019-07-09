<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>


<c:choose>
<c:when test="${not empty interMineObject.canonical}">
<a href="report.do?id=${interMineObject.canonical.id}">${interMineObject.canonical.symbol} (${interMineObject.canonical.primaryIdentifier})</a>
</c:when>
<c:otherwise>
</c:otherwise>
</c:choose>
