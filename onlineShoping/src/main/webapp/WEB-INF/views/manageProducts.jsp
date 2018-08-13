<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="continer">

	<div class="row">
	<c:if test="${not empty  message}">
	<div class="col-xs-12">
	
	<div class="alert aler-success alert-dismissible">
	
	<button type="button" class="close" data-dismiss="alert">&tims;</button>
	${message}
	</div>	
	</div>
	</c:if>

		<div class="col-md-offset-2 col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">

					<h4>Product Management</h4>

				</div>

				<div class="panel-body">
					<!--Form element  -->
					<sf:form class="form-horizontal" modelAttribute="product"
					action="${contextRoot}/manage/products"
					method="POST" >
					
					<div class="form-group">
						<lebel class="control-lebel col-md-4" for="name">Enter Name
						</lebel>
						<div class="col-md-8">
						<sf:input type="text" path="name" id="name" placeholder="Product Name" class="form-control"/>
						<em class="help-block">Please enter Product Name!</em>
						</div> 
					
					</div>
					
					
					
					<div class="form-group">
						<lebel class="control-lebel col-md-4" for="brand">Enter Brand
						</lebel>
						<div class="col-md-8">
						<sf:input type="text" path="brand" id="brand" placeholder="Product Brand" class="form-control"/>
						<em class="help-block">Please enter Product Brand!</em>
						</div> 
					
					</div>
					
					
					
					
					
					<div class="form-group">
						<lebel class="control-lebel col-md-4" for="Description">Enter Description
						</lebel>
						<div class="col-md-8">
						
						<sf:textarea path="description" id="description" rows="4" placeholder="Write a Desciption" class="form-control" />
						
						<em class="help-block">Please enter Product Description!</em>
						</div> 
					
					</div>
					
					
					
						<div class="form-group">
						<lebel class="control-lebel col-md-4" for="unitPrice">Enter Price
						</lebel>
						<div class="col-md-8">
						<sf:input type="number" path="unitPrice" id="unitPrice" placeholder="Product Price in  &#8377;" class="form-control"/>
						<em class="help-block">Please enter Product Price!</em>
						</div> 
					
					   </div>
                                        
					
					
					
					
					
					<div class="form-group">
						<lebel class="control-lebel col-md-4" for="quantity"> Quantity Avilable
						</lebel>
						<div class="col-md-8">
						<sf:input type="text" path="quantity" id="quantity" placeholder="Quantity Available" class="form-control"/>
						<em class="help-block">Please enter Product Quantity!</em>
						</div> 
					
					</div>
					
					<div class="form-group">
						<lebel class="control-lebel col-md-4" for="categoryId"> Select Category
						</lebel>
						<div class="col-md-8">
						<sf:select class="form-control" id="categoryId" path="categoryId"
						items="${categories}"
						itemLabel="name"
						itemValue="id"
						/>
						
						
						
						<em class="help-block">Please enter Product Quantity!</em>
						</div> 
					
					</div>
					
					
					<div class="form-group">
						<!-- hidden field for product -->
						<div class="col-md-offset-5 col-md-8">
						<input type="submit" name="submit" id="submit" value="Submit" class="btn btn-primary"/>
						<sf:hidden path="id"/>
						<sf:hidden path="code"/>
						<sf:hidden path="active"/>
						<sf:hidden path="supplierId"/>
						<sf:hidden path="purchases"/>
						<sf:hidden path="views"/>
						
						</div> 
					
					</div>
					
					 
					
					
					</sf:form>
				</div>
				<div></div>
			</div>
		</div>
	</div>
</div>