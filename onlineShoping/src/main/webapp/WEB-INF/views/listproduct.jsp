<div class="container">

<div class="row">
<!-- would be to display side bar-->

<div class="col-md-3">
<%@include file="./shared/sidebar.jsp" %>

</div>

<!--to display the product  -->
<div class="col-md-9">
<div class="row">
<!--added bredcrump componet  -->
<div class="col-lg-12">

<c:if test="${userClickAllProducts==true}">
<ol class="breadcrumb">
<li> <a href="${contextRoot}/home">Home</a></li>
<li class="active">All product</li>
</c:if>

<c:if test="${userClickCategoryProducts==true}">
<ol class="breadcrumb">
<li> <a href="${contextRoot}/home">Home</a></li>
<li> <a class="active">Category</a></li>
<li> <a class="active">${category.name}</a></li>

</c:if>
</ol>

</div>


</div>


</div>


</div>

</div>