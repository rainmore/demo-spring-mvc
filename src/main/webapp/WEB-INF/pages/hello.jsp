<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../templates/main.jsp" %>
<html>
<body>
	<h1>${message}</h1>
    <body><fmt:message key="index.title"/></body>

    <%@ include file="../templates/footer.jsp" %>
</body>
</html>
