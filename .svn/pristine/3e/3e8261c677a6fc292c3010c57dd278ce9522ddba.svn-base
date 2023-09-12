<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="modalMyPage">
	<form id="mypageForm">
		<div id="modalMyPageWrapper">
		    <h2>마이페이지</h2>
				<input type="hidden" id="mypageNicknameCheck" value="false">
				<input type="hidden" id="mypageBeforeNickname" value="${userVo.nickname}">
			    <input type="hidden" name="userid" value="${userVo.userid}">
			    <label for="userId">아이디 </label>
			    <div class="input-with-button">
			        <input type="text" id="mypageUserid" value="${userVo.userid}" disabled>
			    </div>
			    
			    <label for="password">현재 비밀번호<span></span></label>
			    <input type="password" id="mypagePwd" name="pwd" required pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,16}$">
			    
			    <label for="password">변경 비밀번호<span></span></label>
			    <input type="password" id="mypageChangePwd" name="changePwd" required pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,16}$">
			   
			    <label for="fullName">이름 <span></span></label>
			    <input type="text" id="mypageUsername" name="username" value="${userVo.username}" required>
			    
			    <label for="nickname">닉네임</label>
			    <div class="input-with-button">
			        <input type="text" id="mypageNickname" name="nickname" value="${userVo.nickname}" required>
			        <button type="button" id="mypageNicknameCheckButton">중복확인</button>
			    </div>
			    
			    <label for="phoneNumber">연락처</label>
			    <div class="phone-input">
			        <input type="tel" id="mypagePhoneNumber1" name="phoneNumber1" pattern="(010|011)" value="${userVo.phoneNumber1}" required>
			        <span>-</span>
			        <input type="tel" id="mypagePhoneNumber2" name="phoneNumber2" pattern="[0-9]{4}" value="${userVo.phoneNumber2}" required>
			        <span>-</span>
			        <input type="tel" id="mypagePhoneNumber3" name="phoneNumber3" pattern="[0-9]{4}" value="${userVo.phoneNumber3}" required>
			    </div>

			    <label for="instagram">인스타 <span></span></label>
			    <input type="text" id="mypageInsta" name="insta" value="${userVo.insta}" required>
			    
			    <label for="email">이메일</label>
			    <div class="email-input">
			        <input type="text" id="mypageEmailId" name="emailId" value="${userVo.emailId}" required>
			        <span> @ </span>&nbsp;
			        <input type="text" id="mypageEmailDomain" name="emailDomain" value="${userVo.emailDomain}" required>
			    </div>
		    <div id="myPageModifyButton">
		    	<button type="button" id="myPageModify">수정하기</button>
	    	</div>
	    </div>
	    <span id="closeModalMyPage">&times;</span>
    </form>
</div>