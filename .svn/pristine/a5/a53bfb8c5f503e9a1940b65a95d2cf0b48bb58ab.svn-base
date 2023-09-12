$(function() {
	$("#addPlace").click(function() {
		var form = $('#addPlaceForm')[0];  	    
    	// Create an FormData object          
   		var data = new FormData(form);
		console.log(data);
		$.ajax({
	        url: 'addPlace.do',
	        type: 'POST',
	        data: data,
			enctype:'multipart/form-data',
			contentType : false,
        	processData : false,
	        dataType: 'json',
   			cache:false,
	        success: function (result) {
	            if (result){
	                alert("위치등록을 신청하셨습니다. 관리자의 승인을 기다려주세요.");
	            } else {
					alert("주소를 확인해주세요.");
				}
        	},
			error: function() {
				alert("주소를 확인해주세요.");
			}
    	});
	});
	
	$("[id='accept']").click(function() {
		var value = $(this).attr("value");
		$.ajax({
	        url: 'acceptPlace.do',
	        type: 'POST',
	        data: {unq: value},
			enctype:'application/x-www-form-urlencoded; charset=UTF-8',
	        dataType: 'text',
	        success: function (result) {
	            if (result){
	                alert("위치등록을 승인하였습니다.");
	            } else {
					alert("주소를 확인해주세요.");
				}
        	},
			error: function() {
				alert("주소를 확인해주세요.");
			}
    	});
	});
	
	$("[id='reject']").click(function() {
		var value = $(this).attr("value");
		$.ajax({
	        url: 'rejectPlace.do',
	        type: 'POST',
	        data: {unq: value},
			enctype:'application/x-www-form-urlencoded; charset=UTF-8',
	        dataType: 'text',
	        success: function (result) {
	            if (result){
	                alert("위치등록을 거절하셨습니다. ");
	            } else {
				}
        	},
			error: function() {
			}
    	});
	});
});