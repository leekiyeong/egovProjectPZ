<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="modalAdminPage">
    <div id="modalAdminPageWrapper">
        <h2>관리 페이지</h2>
        <h3>회원관리</h3>
        <div style="overflow: auto; max-height: 150px;">
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
                    <th>삭제</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="userInfo" items="${userInfos}" varStatus="status">
                	<tr>
	                    <td>${userInfo.userid}</td>
	                    <td>${userInfo.nickname}</td>
	                    <td>${userInfo.insta}</td>
	                    <td>${userInfo.email}</td>
	                    <td>${userInfo.rdate}</td>
	                    <td>${userInfo.ranks}</td>
	                    <td>${userInfo.auth}</td>
	                    <td>
	                    <button id="deleteUser" value="${userInfo.userid}" style="background-color: red; color: white; border: none; border-radius: 5px; padding: 5px 10px; cursor: pointer;">
						 삭제
						</button>
						</td>
	                </tr>
                </c:forEach>
            </tbody>
        </table>
        </div>
        
        <h3>위치등록신청</h3>
        <div style="overflow: auto; max-height: 150px;">
		<table style="overflow:scroll;">
			<thead>
				<tr>
					<th>신청자</th>
		            <th>장소명</th>
		            <th>주소</th>
		            <th>신청일</th>
		            <th>승인여부</th>
				</tr>
			</thead>
			<tbody>
				<!-- 추가 데이터 행들 -->
				<c:forEach var="waitPlace" items="${waitPlaces}" varStatus="status">
                	<tr id="waitPlace" value="${status.index}">
	                    <td>${waitPlace.nickname}</td>
	                    <td>${waitPlace.placeName}</td>
	                    <td>${waitPlace.addr}</td>
	                    <td>${waitPlace.appdate}</td>
				    	<td>
				    	<button id="accept" value="${waitPlace.unq}">승인</button>
				    	<button id="reject" value="${waitPlace.unq}">거절</button>
				    	</td>
	                </tr>
                </c:forEach>
			</tbody>
		</table>
		</div>
		
		<h3>카페 등록 신청</h3>
		<div style="overflow: auto; max-height: 150px;">
		<table>
			<thead>
				<tr>
			        <th>아이디</th>
			        <th>카페명</th>
			        <th>인스타</th>
			        <th>주소</th>
			        <th>신청일</th>
			        <th>승인여부</th>
			    </tr>
			</thead>
			<tbody>
                <c:forEach var="cafeList" items="${cafeLists}" varStatus="status">
                	<tr>
	                    <td>${cafeList.cafeid}</td>
	                    <td><a href="#" class="updateCafeLocationData" data-cafeid="${cafeList.cafeid}">${cafeList.cafename}</a></td>
	                    <td>${cafeList.insta}</td>
	                    <td>${cafeList.addr}</td>
	                    <td>${cafeList.rdate}</td>
	                    <td>
			                <button class="approveCafe-button" data-cafeid="${cafeList.cafeid}">승인</button>
			                <button class="rejectCafe-button" data-cafeid="${cafeList.cafeid}">거절</button>
			            </td>
	                </tr>
                </c:forEach>
            </tbody>
		</table>
		</div>
	</div>
	<span id="closeModalAdminPage">&times;</span>
</div>

<script>
    // 카페 승인 버튼 클릭 시 처리
   $(document).ready(function() {
    $(".approveCafe-button").click(function() {
        var cafeid = $(this).data("cafeid");
        approveCafe(cafeid);
    });
});

function approveCafe(cafeid) {
    $.ajax({
        url: "approveCafe", // 컨트롤러의 매핑 경로
        type: "POST",
        data: { cafeid: cafeid },
        success: function(result) {
        	if (result){
                alert("카페가 승인되었습니다.");
                window.location.href = "main.do";
                openAdminPageModal();
                /* location.reload(); // 페이지 리로드 */
            } else {
                alert("카페가 승인되지 않았습니다.");
			}
    	},
		error: function() {
			alert("전송 실패");
		}
	});
}

//모달 열기 로직
function openAdminPageModal() {
    $("#modalAdminPage").css("display", "block");
}

// 카페 거절 버튼 클릭 시 처리
$(document).ready(function() {
	 $(".rejectCafe-button").click(function() {
	     var cafeid = $(this).data("cafeid");
	     rejectCafe(cafeid);
	 });
});

function rejectCafe(cafeid) {
 $.ajax({
     url: "rejectCafe", // 컨트롤러의 매핑 경로
     type: "POST",
     data: { cafeid: cafeid },
     success: function(result) {
     	if (result){
             alert("카페등록이 거절되었습니다.");
             location.reload(); // 페이지 리로드
         } else {
             alert("다시확인해주세요.");
			}
 	},
		error: function() {
			alert("전송 실패");
		}
	});
}
//==============================================================//
$(document).ready(function() {
    // 카페이름을 눌렀을 때 모달 열기
    $(".updateCafeLocationData").click(function() {
        var cafeid = $(this).data("cafeid"); // 원하는 데이터 속성 가져오기
        openCafeDetailModal(cafeid); // 모달 열기 함수 호출
    });
});

// 모달 열기 로직
function openCafeDetailModal(cafeid) {
    // AJAX를 통해 서버에서 해당 카페의 정보 가져오기
    $.ajax({
        url: "getCafeInfo", // 적절한 서버 경로 설정
        type: "POST",
        data: { cafeid: cafeid }, // 카페id를 서버에 전달
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
        dataType: 'json',
        success: function(response) {
            // 가져온 카페 정보를 모달 내부의 필드에 채우기
            $("#updateCafeId").val(response.cafeid); 
            $("#updateCafeName").val(response.cafename); 
            $("#updateCafeAddress").val(response.addr); 
		    $("#updateCafeNumber1").val(response.phoneNumber1);
		    $("#updateCafeNumber2").val(response.phoneNumber2);
		    $("#updateCafeNumber3").val(response.phoneNumber3);
		    $("#updateCafeInsta").val(response.insta);
		    $("#updateCafePhoto").val(response.photopath);
		    $("#updateCafeLicense").val(response.certifypath);
		    
		    $("#modalUpdateCafeLocationData").css("display", "block"); // 모달 열기
        },
        error: function() {
            alert("데이터 가져오기 실패");
        }
    });
}

</script>