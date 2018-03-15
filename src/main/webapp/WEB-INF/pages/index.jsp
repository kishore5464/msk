<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bike</title>
<base href="/">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/x-icon" href="favicon.ico">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
.banner {
	background: url('https://royalenfield.com/images/classicmatte.jpg');
	background-repeat: no-repeat;
	background-size: 100% auto;
	background-position: center top;
	background-attachment: fixed;
	height: 700px;
	text-align: center;
}

.loginbutton {
	position: center;
	margin: 0 auto;
	margin-top: 22%;
	background-color: #DAAB01;
	border: none;
	width: 160px;
	padding: 0.75%;
	border-radius: 0px;
}

.bgset {
	background-color: #161616;
	height: 700px;
}
</style>
</head>
<body>

	<div class="bgset">
		<div class="banner">
			<a routerLink="/login">
				<button class="btn btn-success loginbutton">LOGIN</button>
			</a>
		</div>
	</div>
</body>
</html>
