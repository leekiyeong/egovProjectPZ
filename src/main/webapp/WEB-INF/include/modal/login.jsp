<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="modalLogin">
    <div id="modalLoginWrapper">
    	<h2>로그인</h2>
    	<p style="font-size: 12px; color: gray; margin-top: -10px;">사업자이신가요? <br><a href="#" id="cafeLoginButton">여기</a>를 클릭하여 사업자 로그인을 진행하세요.</p>
        <div class="input-container">
		    <input type="text" id="loginUserid" name="userid" class="input-field" placeholder="Enter ID" required>
		</div>
	    <div class="input-container">
		    <input type="password" id="loginPwd" name="pwd" class="input-field" placeholder="Password" required>
		</div>
     
        <button type="button" id="loginSubmit">로그인</button>
        
        <div id="loginOptions">
            <label>
                <input type="checkbox" id="autoLogin"> 자동로그인
            </label>
            <a href="#">아이디 찾기</a> /
            <a href="#">비밀번호 찾기</a>
        </div>
        
        <div id="socialLogin" style="display: flex; justify-content: center; margin-top: 20px;">
		    <button type="button" id="kakaoLogin" style="background-color: #FFEB00; color: black; border: none; border-radius: 10px; padding: 10px 20px; cursor: pointer;">카카오 로그인</button>
		    <button type="button" id="facebookLogin" style="background-color: #1877F2; color: white; border: none; border-radius: 10px; padding: 10px 20px; cursor: pointer; margin-left: 10px;">페이스북 로그인</button>
		</div>
        
        <div id="goSignUp">
            <p>아직 계정이 없으신가요?</p>
            <button type="button" id="goSignUpButton2">회원가입</button>
        </div>
    </div>
    <span id="closeModalLogin">&times;</span>
</div>