<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <div>home. hello!</div>

        <c:forEach var="student" items="${students}">
            ${student.firstName}:<br />

            <c:forEach var="college" items="${student.colleges}">
                ${college.collegeName}<br />
            </c:forEach>

            <%--<c:set var="colleges" value="${studentCollege.colleges}"/>
            <c:forEach var="college" items="colleges">
                ${college}
            </c:forEach>--%>
            <br /><br />
        </c:forEach>
    </body>
</html>
