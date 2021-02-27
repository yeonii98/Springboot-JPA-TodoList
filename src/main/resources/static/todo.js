let index = {
	init: function() {
		$("#btn-todo").on("click", () => {
			this.todo();
		});
	},

	todo: function() {
		let data = {
			todo: $("#todo").val()
		};
		
		$.ajax({
			type:"POST", 
			url:"/api/todo", 
			data: JSON.stringify(data), 
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("일정이 추가되었습니다.");
			location.href="/todolist";
		}).fail(function(error){
			alert(JSON.stringfy(error));
		}); 
	},
	
	deleteById: function(id) {
		$.ajax({
			type: "DELETE", 
			url: "/api/todo/"+id, 
			dataType:"json"
		}).done(function(resp){
			alert("일정을 목록에서 삭제합니다.");
			location.href="/todolist";
		}).fail(function(error){
			alert(JSON.stringfy(error));
		}); 
	},

}

index.init();