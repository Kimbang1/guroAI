<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="stylesheet" href="style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>업로드 페이지</h1>

		<!-- 경로를 쓸때에는 \\ 두개씩 해줘야 함. -->

		<%
String saveFolder = "E:\\java_Web_AI\\silsp\\jsp\\p10_FileDown_Remove\\src\\main\\webapp\\fileStorage";
int maxSize = 5 * 1024 * 1024; //5Mbyte단위 까지 최대 업로드 허용
String encType = "UTF-8";

String upFileName = "";

try {

	MultipartRequest multiReq = new MultipartRequest(request, saveFolder, maxSize, encType,
	new DefaultFileRenamePolicy());

	upFileName = multiReq.getFilesystemName("fileName");
	//업로드 후 저장된 파일명

	%>
	
		<ul id="prnSummary">
		<li> 저장된 파일명 : <%=upFileName %></li>
		<li> upload OK!! </li>
		</ul>

		
		<% 
		} catch (IOException e) { out.print(e.getMessage()); } 
		%>
		<hr>

		<div id="btnArea">
			<input type="hidden" id="upFileName" value="<%=upFileName%>">

			<button type="button" id="downloadBtn">다운로드</button>
			<button type="button" id="removeBtn">삭제</button>
			<button type="button" id="goInput">입력하기</button>

		</div>
		<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
		<script src="/script/script.js"></script>
</body>
</html>
