<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- PZ목록보기(PZ) -->
<div id="modalPZListInfo">
	<div id="modalPZListInfoWrapper">
		<div id="modalPZListInfoHeader" class="flex-container">
			<div
				style="display: flex; justify-content: flex-end; width: 350px; height: 30px; margin-right: 50px;">
				<h2 id="pzListPlaceName"></h2>
				<button type="button" id="PZWrite"
					style="background-color: #3498db; color: white; border: none; padding: 8px 12px; cursor: pointer; border-radius: 15px; margin-left: 15px;">
					게시글작성</button>
			</div>
			<div style="height: 50px;">
				<font color="gray"><h3 id="pzListAddr"></h3></font>
			</div>
		</div>
		<div id="modalPZListInfoContentContainer" style="overflow-y: auto; max-height: 365px; margin-top:30px;">
			<div id="modalPZListInfoContent">
				<table id="PZListTable">
					
				</table>
			</div>
		</div>
	</div>
	<span id="closeModalPZListInfo">&times;</span>
</div>