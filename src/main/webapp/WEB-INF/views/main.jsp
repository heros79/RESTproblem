<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 9/9/2017
  Time: 12:34 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <link integrity="import" href="additem.jsp">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>



    <title>Main</title>
</head>
<body>

<form:form method="POST" modelAttribute="selectStudent">
    <div class="container">
        <form:select path="id" onchange="this.form.submit()" >
            <form:option value="0" label="--- Select ---" />
            <form:options items="${studentsList}" itemValue="id" itemLabel="studentName"/>
        </form:select>
    </div>
</form:form>

<form:form method="POST" modelAttribute="selectSection">
    <div class="container">
        <form:select path="sectionName">
            <form:option value="NONE" label="--- Select ---" />
            <form:options items="${sectionsList}" itemValue="sectionName" itemLabel="sectionName"/>
        </form:select>
    </div>
</form:form>




<form:form method="PUT" modelAttribute="studentForm" class="form-signin">
    <h2 class="form-signin-heading">Create your account</h2>
        <div class="form-group">
            <form:input type="text" path="studentName" class="form-control" placeholder="Studentname"></form:input>
        </div>

        <div class="form-group">
            <form:input type="text" path="studentLastName" class="form-control" placeholder="StudentLastName"></form:input>
        </div>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
</form:form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>
