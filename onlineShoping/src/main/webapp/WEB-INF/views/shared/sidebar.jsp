
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<p class="lead">Shop Name</p>


<c:forEach  items="${categories}"  var="category">
<a href="${contextRoot}/show/all/${category.id}/products" class="list-group-item" id="a_${category.name}">
 
${category.name}

</a>
</c:forEach>


	
	