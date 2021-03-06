<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
 <spring:url var="css" value="/resources/css"/>
 <spring:url var="js" value="/resources/js"/>
 <spring:url var="images" value="/resources/images"/>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>
<script>
window.menu='${title}';
window.contextRoot='${contextRoot}';
</script>
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.css" rel="stylesheet">
    <!-- Bootstrap readable them css-->
    <link href="${css}/bootreadable.css" rel="stylesheet">
<!--  datatble css-->
    <link href="${css}/dataTables.bootstrap.css " rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

<div class="wrapper">
      <!--navigation  -->
      <%@include file="./shared/navbar.jsp" %>
   <!--Page container comes here  -->
   
   <div class="content">
   <c:if test="${userClickHome == true}">
   <%@include file="home.jsp" %>
   </c:if>
   
   
   <!--Load only when user click Avbout Us  -->
   
   <c:if test="${userClickAbout == true}">
   <%@include file="about.jsp" %>
   </c:if>
   
   
   <!--Load only when user click Contact Us  -->
   
      <c:if test="${userClickContact == true}">
   <%@include file="contact.jsp" %>
   </c:if>
   <!--Load only when user click viewproduct  -->
       <c:if test="${userClickCategoryProducts == true or  userClickAllProducts==true}">
   <%@include file="listproduct.jsp" %>
   </c:if>
   
     <!--Load only when user click Contact Us  -->
   
      <c:if test="${UserClickShowProduct == true}">
   <%@include file="singleProduct.jsp" %>
   </c:if>
   <!--load only when click manage prodct - -->
    <c:if test="${userClickManageProducts == true}">
   <%@include file="manageProducts.jsp" %>
   </c:if>
   
   </div>
   <!-- footer conmes here -->
   
   <%@include file="./shared/footer.jsp" %>
    <!-- /.container -->

    <!-- JavaScript -->
    <script src="${js}/jquery.js"></script>
   
   
   <script src="${js}/bootstrap.js"></script>
   
   <!-- data table -->
   
       <script src="${js}/datatables.js"></script>
   
  <!--datatabel   -->
         <script src="${js}/dataTables.bootstrap.js"></script>
  
<!--self codded js file  -->

    <script src="${js}/myapp.js"></script>
    </div>

</body>

</html>