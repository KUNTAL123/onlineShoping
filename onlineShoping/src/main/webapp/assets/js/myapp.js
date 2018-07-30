$(function(){
	switch(menu){
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'listproduct':
		$('#All Products').addClass('active');
		break;
	default:
		$('#listproduct').addClass('active');
	   $('#a_'+menu).addClass('active');
		break;
	
	}
	
	
	//code for jquery data table
	// create a data set
	
	
	
	var $table=$('#productListTable');
	
	//execute the code only when where we have this table
	
		if($table.length){ 
		console.log('indside this table');
			
			var jsonUrl='';
			if(categoryId=='')
				{
				jsonUrl=window.contextRoot+'/json/data/all/products';
				console.log(jsonUrl);
				console.log($table.length);

				
				
				}
			else
				{
				jsonUrl=window.contextRoot+'/json/data/category/'+window.categoryId+'/products';
				}
			
			$table.DataTable({
				lengthMenu: [[3,5,10.-1],['3 Records','5 Records','10 Records','All']],
			    pageLength: 5,
			    
			    
				ajax:{
					
					url:jsonUrl,
					dataSrc:''
				},
				columns:[
				         {
				        	 data:'code',
				        	mRender:function(data,type,row){
				        		return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableimg"/>'
				        	} 
				        	 
				         },
				         {
				        	 data:'name'
				         },
				         
				         {
				        	 data:'brand'
				         },
				        
				         {
				        	 data:'udnitPrice',
				           mRender:function(data,type,row){
				        	 return '&#8377 '+data  
				           }	 
				         },
				         {
				        	 data:'quantity'
				         },
				         
				         ]
			});
		}
	
});