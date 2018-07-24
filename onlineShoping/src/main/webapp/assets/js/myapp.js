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
	
	
	
});