<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <style>
	    body {
            margin: 0;
            padding: 0;
        }
        tr {
        	max-height:130px;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #007BFF;
            color: white;
        }

        td {
            border-top: 1px solid #ccc;
        }

        /* 메뉴 이미지 입력 엘리먼트 스타일 */
        

        /* 메뉴 정보 입력 엘리먼트 스타일 */
        .menu-info {
            display: flex;
            flex-direction: column;
        }

        .menu-info div {
            display: flex;
        }

        /* 등록 버튼 스타일 */
        button[type="submit"] {
            background-color: #007BFF;
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            font-size: 16px;
            border-radius: 4px;
        }

        button[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
<!-- 카페메뉴등록하기 -->
<div id="modalCafeMenuRegister">
<form id="cafeMenuForm">
 	<div id="modalCafeMenuRegisterWrapper">
	 	<input type="hidden" name="cafeid" value="${cafeVo.cafeid}">
		<input type="hidden" name="cafename" value="${cafeVo.cafename}">
		<input type="hidden" name="addr" value="${cafeVo.addr}">
        <h2>카페 메뉴 등록</h2>
        <div>
        	<label for="openTime1">오픈시간</label>
        	<input type="text" id="openTime1" name="opentime">
        </div>
        <div>
            <label for="closeTime1">닫는시간</label>
        	<input type="text" id="closeTime1" name="closetime">
        </div>
        <table border="1" style="background-color:lightblue; border-color: gray;">
            <thead>
                <tr>
                    <th style="width:40%;">메뉴 사진</th>
                    <th>메뉴 정보</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <input type="file" id="menuImage1" name="menuImage1" accept="image/*" required>
                    </td>
                    <td>
                        <div class="menu-info">
                            <div>
                                <label for="menuName1">메뉴명</label>
                                <input type="text" id="menuName1" name="menuName1" required>
                            </div>
                            <div>
                                <label for="menuPrice1">가격</label>
                                <input type="number" id="menuPrice1" name="menuPrice1" required>
                            </div>
                        </div>
                    </td>
                </tr>
               <tr>
            <td>
                <input type="file" id="menuImage2" name="menuImage2" accept="image/*">
            </td>
            <td>
                <div class="menu-info">
                    <div>
                        <label for="menuName2">메뉴명</label>
                        <input type="text" id="menuName2" name="menuName2">
                    </div>
                    <div>
                        <label for="menuPrice2">가격</label>
                        <input type="number" id="menuPrice2" name="menuPrice2">
                    </div>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <input type="file" id="menuImage3" name="menuImage3" accept="image/*">
            </td>
            <td>
                <div class="menu-info">
                    <div>
                        <label for="menuName3">메뉴명</label>
                        <input type="text" id="menuName3" name="menuName3">
                    </div>
                    <div>
                        <label for="menuPrice3">가격</label>
                        <input type="number" id="menuPrice3" name="menuPrice3">
                    </div>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <input type="file" id="menuImage4" name="menuImage4" accept="image/*">
            </td>
            <td>
                <div class="menu-info">
                    <div>
                        <label for="menuName4">메뉴명</label>
                        <input type="text" id="menuName4" name="menuName4">
                    </div>
                    <div>
                        <label for="menuPrice4">가격</label>
                        <input type="number" id="menuPrice4" name="menuPrice4">
                    </div>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
	<div style="width:500px; text-align:center; margin-top:10px;">
		<button type="submit" id="cafeMenu">등록</button>
	</div>
		</div>
		<span id="closeModalCafeMenuRegister">&times;</span>
	</div>
