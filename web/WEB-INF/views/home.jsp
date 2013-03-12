<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        home. hello!
        <c:forEach var="studentCollege" items="${studentColleges}">
            ${studentCollege.collegeName} <br/>
        </c:forEach>
    </body>
</html>
