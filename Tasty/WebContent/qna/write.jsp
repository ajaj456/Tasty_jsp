<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QnA - 질문하기</title>
<link rel="stylesheet" type="text/css" href="../css/qna/write.css">
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/qna/writeNull.js"></script>
</head>
<body>
	<form action="writeProcess.jsp" method="post" class="writeForm">
		<div id="form_wrapper">
		<div id="list_head">질문하기</div>
			<ul>
				<li><label for="title">제목</label><input id="title" name="title"></li>
				<li><label for="content">내용</label><textarea rows="5" cols="40" id="content" name="content"></textarea></li>
				<li><label for="writer">작성자</label><input id="writer" name="writer"></li>
			</ul>
			<button>질문</button>
		</div>
	</form>
</body>
</html>