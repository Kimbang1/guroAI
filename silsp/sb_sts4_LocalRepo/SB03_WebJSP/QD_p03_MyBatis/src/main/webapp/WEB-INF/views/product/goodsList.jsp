<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Document</title>

    <script type="text/javascript">
    // param.error 값이 존재할 경우 경고창을 띄움
    <c:if test="${not empty param.error}">
        alert('${param.error}');
    </c:if>
</script>

    <link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
    <div id="wrap2">
        <div class="dFlex" id="head2">

            <div id="left">
                <h3>상품목록</h3>
            </div>

            <div id="right">
                <div class="showin">
                    <span><a href="/list">목록보기</a></span>
                </div>
                <div class="showin">
                    <span><a href="/">등록하기</a></span>
                </div>
            </div>
        </div>

        <!-- 에러메세지 출력 -->
        <c:out value="${param.error}" />
        <c:if test="${not empty param.error}">
            <div style="color:red; font-weight: bold;">${param.error}</div>
        </c:if>

        <div id="list">
            <form action="/del" method="post" id="delForm">
                <table>
                    <tr>
                        <th><input type="checkbox" name="num" value="${goods.num}"></th>
                        <th>번호</th>
                        <th>상품명</th>
                        <th>상품코드</th>
                        <th>가격</th>
                        <th>재고</th>
                        <th>등록시간</th>
                    </tr>
                    <c:forEach var="goods" items="${goodsList}">                  
                        <tr>
                            <td><input type="checkbox" name="num" value="${goods.num}"></td>
                            <td>${goods.num}</td>
                            <td>${goods.goodsName}</td>
                            <td>${goods.goodsCode}</td>
                            <td>${goods.price} 원</td>
                            <td>${goods.cnt}</td>
                            <td><fmt:formatDate value="${goods.regTM}" pattern="yyyy-MM-dd"/></td>
                        </tr>
                    </c:forEach>
                </table>
                <hr>
			<div class="dFlex">
                <div id="delArea">
                    <button>선택삭제</button>
                </div>

            </form>
            <div id="left2">
                <form action="/search" method="get" id="searchForm">
                    <span>상품검색</span>
                    <input type="text" name="keyword" placeholder="상품명 또는 코드 입력">
                    <button>검색</button>
                </form>
           
            </div>
            </div>
        </div>
    </div>

    <!-- div#wrap -->
    <script src="/script/jquery-3.7.1.min.js"></script>
    <script src="/script/script.js"></script>
</body>
</html>
