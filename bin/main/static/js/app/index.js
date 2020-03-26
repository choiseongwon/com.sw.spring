var index = {
	init : function() {
		var _this = this;
		var btn_save = document.getElementById('btn-save');
		btn_save.onclick = function() {
			_this.save();
		};
	}, 
	save : function () {
		var inputText = document.getElementById('inputText').value;
		var data = {
			content : inputText
		};
		
		$.ajax({
			type: 'POST',
			url: '/api/v1/lists',
			dataType: 'json', 
			contentType: 'application/json; charset=utf-8',
			data: JSON.stringify(data)
		}).done(function() {
			alert('리스트가 저장됐습니다 ' + $('#inputText').val());
			location.reload();
		}).fail(function (error) {
			alert(error);
		});
	}
}

index.init();