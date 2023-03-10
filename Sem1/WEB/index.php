<!DOCTYPE html>
<html>

<head>
	<title>Css styles</title>
	<link rel="stylesheet" type="text/css" href="styles.css">
	<style type="text/css">
		input {
			margin-bottom: 8px;
			margin-top: 2px;
		}

		.tv {
			padding: 10px 8px 10px 8px;
			border-radius: 5px;
			border: solid #798793 1px;
			outline: none;
			width: 14rem;
			margin-right: 5px;
		}

		.tv:focus-visible {
			border-color: #2196F3;
		}

		form {
			margin: 3em auto;
			box-shadow: 5px 4px 8px #7e7e7e;
			background-color: white;
		}
	</style>
	<script src="Js.js"></script>
</head>

<body>
	<form class="fs" name='f1'>
		<h2 align="center">Please Enter Details</h2>
		<table>
			<tr>
				<td>
					<input class="tv" type="text" name="name" placeholder="Name"><br>
					<input class="tv" type="password" name="pw" placeholder="password"><br>
					<input class="tv" type="password" name="pwcon" placeholder="password confirm">
				</td>
				<td>
					<input class="tv" type="email" name="mail" placeholder="Email"><br>
					<input class="tv" type="month" name="dob"><br>
					<select class="tv mbot" name="course">
						<option>--Select course--</option>
						<option>MCA</option>
						<option>M.Tech</option>
						<option>B.Tech</option>
					</select>
				</td>
			</tr>
		</table>

		<div>
			<b>Gender</b>
			<div>
				<input type="radio" name="sex" value="Male">
				<label>Male</label>
			</div>
			<div>
				<input type="radio" name="sex" value="Female">
				<label>Female</label>
			</div>
			<div>
				<input type="radio" name="sex" value="Other">
				<label>Other</label>
			</div>
		</div>
		</div>
		<div>

		</div>

		<b>Photo</b>
		<input type="file" name="photo" placeholder="photo">

		<div>
			<input type="checkbox" name="tru">
			<label>All above details are true</label>
		</div>
		<div class="fle">
			<button type="Reset">Reset</button>
			<button onclick="return valdt()">Send</button>
		</div>
	</form>
</body>

</html>