<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="modalAdminUserInfos">
    <div id="modalAdminPageWrapper">
        <h3>회원정보</h3>
        <table>
            <thead>
                <tr>
                    <th>아이디</th>
                    <th>닉네임</th>
                    <th>인스타</th>
                    <th>이메일</th>
                    <th>가입일</th>
                    <th>회원등급</th>
                    <th>관리권한</th>
                    <th>상태</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="userInfo" items="${userInfos}">
                	<tr>
	                    <td>${userInfo.userid}</td>
	                    <td>${userInfo.nickname}</td>
	                    <td>${userInfo.insta}</td>
	                    <td>${userInfo.email}</td>
	                    <td>${userInfo.rdate}</td>
	                    <td>${userInfo.ranks}</td>
	                    <td>${userInfo.auth}</td>
	                    <td>${userInfo.delete_yn}</td>
	                </tr>
                </c:forEach>
            </tbody>
        </table>
	</div>
	<span id="closeModalAdminUserinfos">&times;</span>
</div>