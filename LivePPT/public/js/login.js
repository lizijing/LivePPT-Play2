define(function(require, exports, module) {

	console.log("login.js");

	var alertBox = $("#alertBox");

	$('.btn-login-submit').on('click', function(e){
		e.preventDefault();
		

		$.ajax({
			url: '/login',
			type: 'post',
			dataType: 'json',
			data: {
				email: $('#inputEmail').val(),
				password: $('#inputPassword').val()
			},
			success: function(res, status){
				if (res.isSuccess){
					//注册成功，跳转页面
					window.location.href = '/myppt';
				} else {
					//注册不成功，显示错误信息
					$("#alertBox span").html(res.message);
					alertBox.show();
				}
			},
			error: function(res, status){
				$("#alertBox span").html("网络错误？");
				alertBox.show();
			}
		});
	});

});