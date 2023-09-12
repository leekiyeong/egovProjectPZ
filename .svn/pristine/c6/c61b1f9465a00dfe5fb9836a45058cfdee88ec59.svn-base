$(document).ready(function() {
    $(".approveCafe-button").click(function() {
        var cafeid = $(this).data("cafeid");
        approveCafe(cafeid);
    });

	$("[id='deleteUser']").click(function() {
		var value = $(this).attr("value");
		$.ajax({
	        url: 'deleteUser.do',
	        type: 'POST',
	        data: {userid: value},
			enctype:'application/x-www-form-urlencoded; charset=UTF-8',
	        dataType: 'text',
	        success: function (result) {
	            if (result){
	            } else {
				}
        	},
			error: function() {
				alert("전송 실패");
			}
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
        }
    });
}
});