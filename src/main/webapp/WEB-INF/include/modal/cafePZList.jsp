<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 게시글목록보기(카페) -->
<div id="modalCafeListInfo">
   <div id="modalCafeListInfoWrapper">
      <div id="modalCafeListInfoHeader" class="flex-container">
         <div
            style="display: flex; justify-content: flex-end; width: 350px; height: 30px; margin-right: 50px;">
            <button type="button" id="cafePZWrite"
               style="background-color: #3498db; color: white; border: none; padding: 8px 12px; cursor: pointer; border-radius: 15px; margin-left: 15px;">
               게시글작성
            </button>
         </div>
         <div style="height: 50px;">
            <h2 id="cafeInfoName"></h2>
         </div>
         <div style="height: 50px;">
            <font color="gray"><h3 id="cafeInfoAddr"></h3></font>
         </div>
      </div>
      <div id="modalCafeListInfoContentContainer" style="overflow-y: auto; max-height: 365px; margin-top:30px;">
         <div id="modalCafeListInfoContent">
            <table id=cafePZListTable>
               
            </table>
         </div>
      </div>
   </div>
   <span id="closeModalCafeListInfo">&times;</span>
</div>