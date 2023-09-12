<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="modalUpdateLocationData">
    <div id="modalUpdateLocationDataWrapper">
        <h2>위치등록허가창</h2>
        <form id="addLocationAccept">
        	<input type="hidden" id="acceptPlaceUnq" value="${place.unq}">
            <label for="acceptPlaceName">장소명</label>
            <input type="text" id="acceptPlaceName" name="placeName" value="${place.placeName}" required disabled>
	
            <label for="acceptAddress">주소</label>
            <input type="text" id="acceptAddress" name="addr" value="${place.addr}" required disabled>
	
            <label for="acceptPhoto">사진</label>
            <img id="acceptPhoto" src="/fileUpload/${place.photoPath}">
	
            <label for="acceptExplain">부가설명</label>
            <textarea id="acceptExplain" name="explain" disabled>
            	<c:out value="${place.explain}" />
            </textarea>
	
            <label for="acceptSource">출처</label>
            <input type="url" id="acceptSource" name="source" value="${place.placeName}" placeholder="https://" disabled>
	
            <div class="buttons">
                <button type="button" id="acceptButton">승인하기</button>
                <button type="button" id="rejectButton">거절하기</button>
            </div>
        </form>
    </div>
    <span id="closeModalUpdateLocationData">&times;</span>
</div>