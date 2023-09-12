<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	$(function() {
		$("#deletePZ").click(function() {
			var unq = $("#PZUnq").val();
			location = "/pz/deletePZ.do?unq="+unq
		});
	});
</script>

<!-- PZ 디테일 모달 -->
<div id="modalPZDetail">
	<div id="modalPZDetailWrapper">
		<input type="hidden" id="PZUnq">
		<div id="modalPZDetailHeader">
	    	<div class="flex-row">
		        <h2 id="PZDetailUserid"></h2>
		        <div class="flex-row">
		        	<img src="image/insta_icon.jpg" style="width:20px; height:20px; margin-top:33px; margin-left:5px;">
		        	<h3 id="PZDetailInsta" style="height:20px; margin-top:30px; margin-right:10px;"></h3>
		        </div>
		        <div style="flex-grow: 1; text-align: right; margin-top:20px;">
			        <input type="button" id="deletePZ" value="삭제">
			    </div>
		    </div>
	    </div>
	    <div class="flex-row">
		    <div style="width:360px; height:400px; background-color:skyblue; display: flex; align-items: center; justify-content: center;">
		    	<img id="PZDetailImage" src="" alt="PZDetailImage" style="width:360px; height:400px;">
		    </div>
		</div>
		<div id="PZButtons" style="margin-top: 15px;">
			<button type="button">좋아요</button>
			<button type="button">인스타그램</button>
		</div>
	</div>
	<span id="closeModalPZDetail">&times;</span>
</div>