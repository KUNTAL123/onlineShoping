<div class="container">
	<!-- breadcrumb -->
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">

				<li><a href="${contextRoot}/home">Home</a></li>
				<li><a href="${contextRoot}/show/all/products">Product</a></li>
				<li><a href="${contextRoot}/home">${product.name}</a></li>

			</ol>

		</div>


		<div class="row">
			<!--Product image  -->
			<div class="col-xs-12 col-sm-4">

				<div class="thumbnail">

					<img src="${images}/${product.code}.jpg" class="img img-responsive" />
				</div>

			</div>
			<!--  Product Description-->
			<div class="col-xs-12 col-sm-12">
				<h3>${product.name}</h3>
				<hr />

				<p>${product.description}</p>
				<hr />


				<h4>
					Price<strong>${product.unitPrice}</strong>
				</h4>
				<h6>Qty. Avilable ${product.quantity}</h6>

				<a href="${contextRoot}/cart/add/${product.id}/product"
					class="btn btn-success"> <span
					class="glyohicon 	glyphicon-shopping-cart">Add to cart </span></a> <a
					href="${contextRoot}/show/all/products" class="btn btn-success">
					Back</a>

			</div>
		</div>



	</div>