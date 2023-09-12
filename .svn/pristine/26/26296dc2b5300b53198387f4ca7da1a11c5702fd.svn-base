$(function() {
	$("#PZNoticeWriteSubmitButton").click(function() {
		 var form = $('#pzWriteForm')[0];  	    
   		var data = new FormData(form);
		$.ajax({
	        url: 'PZWrite.do',
	        type: 'POST',
	        data: data,
			enctype:'multipart/form-data',
			contentType : false,
        	processData : false,
	        dataType: 'json',
   			cache: false,
	        success: function(result) {
	            if (result) { 
	                alert("게시물 작성 성공");
	            } else {
					alert("게시물 작성 실패");
				}
        	},
			error: function() {
				alert("전송 실패");
			}
    	});
		$("#modalPZWrite").css("display", "none");
	});
	
});