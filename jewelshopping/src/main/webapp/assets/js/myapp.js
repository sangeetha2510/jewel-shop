$(function() {
	switch (menu) {

		case 'About Us' :
			$('#about').addclass('active');
			break;

		case 'Contact Us' :
			$('#contact').addclass('active');
			break;

		case 'All Product' :
			$('#listProducts').addClass('active');

		default :
			$('#listProducts').addclass('active');
			$('#a_' + menu).addClass('active');
			break;

	}
});