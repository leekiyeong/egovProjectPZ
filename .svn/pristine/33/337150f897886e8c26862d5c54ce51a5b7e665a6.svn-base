<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script>
$(document).ready(function(){
    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function(e) {
                $('#cafePhotoTable').css('background-image', 'url(' + e.target.result + ')');
            }

            reader.readAsDataURL(input.files[0]); // convert to base64 string
        }
    }

    $("#cafepzPhoto").change(function() {
        readURL(this);
    });
});
</script>
    
    
    <!-- 아아 -->
<!-- 게시물 작성(카페) -->
<div id="modalCafePZWrite">
	<form id="cafepzWriteForm">
	<div id="modalCafePZWriteWrapper">
		<div id="modalCafePZWriteHeader">
			<h2>게시물 작성</h2>
		</div>
		 <div class="cafePZWriteContent">
	      <div id="cafePhotoTable" style="width: 300px; height: 400px; background-color:lightgray; text-align: center; display: flex; flex-direction: column; justify-content: center;">
	         <label for="cafepzPhoto">사진등록</label>
	            <input type="file" id="cafepzPhoto" name="photo" style="margin: 0 auto;">
	      </div>
		    <input type="hidden" name="userid" value="${userVo.userid}">
			<input type="hidden" name="nickname" value="${userVo.nickname}">
			<input type="hidden" name="insta" value="${userVo.insta}">
			<input type="hidden" name="addr" id="cafeWriteAddr">
        	<input type="hidden" name="cafename" id="cafeWriteCafename" >
			<div id="cafePZWriteSubmit">
				<button id="cafePZWriteSubmitButton">등록하기</button>
			</div>
		</div>
		</div>
		</form>
	<span id="closeModalCafePZWrite">&times;</span>
</div>