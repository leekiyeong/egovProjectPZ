$(function() {
	$("#cafePZWriteSubmitButton").click(function() {
		 var form = $('#cafepzWriteForm')[0];  	    
   		var data = new FormData(form);
		$.ajax({
	        url: 'cafePZWrite.do',
	        type: 'POST',
	        data: data,
			enctype:'multipart/form-data',
			contentType : false,
        	processData : false,
	        dataType: 'json',
   			cache: false,
	        success: function(result) {
	            if (result) { 
	            } else {
				}
        	},
			error: function() {
			}
    	});
		$("#modalCafePZWrite").css("display", "none");
	});
	
});