<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>To do list </title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/custom.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body style="background-color:#FFF0F0">
	<br>
	<div class="container center-block" style="width: 500px">
		<h2 style="text-align:center">To Do List</h2>
		<form>
			<div class="form-row" style="width: 500px">
				<div class="col">
					<input type="text" autocomplete="off" style="width: 400px" class="form-control" placeholder="일정을 추가하세요" id="todo">
				</div>
				<div>
					<button id="btn-todo" class="btn btn-primary active">일정 추가</button>
				</div>
			</div>
			<c:forEach var="todo"  items="${todolist.content}">
				<br>
				<div class="card" style="width: 500px">
					<div class="card-body">
						<p>${todo.createDate.getMonth()+1 }월 ${todo.createDate.getDate() }일</p>
						<div class = "form-row">
						<div class="col">
						<h4 class="card-title">${todo.todo}</h4>
						</div>
						<div class="col">
						<button onClick="index.deleteById(${todo.id})" id ="btn-delete" class="btn btn-success float-right active" >일정 완료</button>
						</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</form>
	</div>
	<script src="/todo.js"></script>
</body>
</html>

