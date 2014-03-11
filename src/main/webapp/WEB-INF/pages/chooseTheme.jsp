<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="/webclient/css/style.css" type="text/css" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
	<table align=center border="0" cellpadding="0" cellspacing="0"
		class="tbl1" width="795">
		<tr>
			<td colspan="4"></td>
		</tr>
		<tr valign="top">
			<td width="60%" height="91"><img src="single_pixel.gif"
				width="0" height="93"></td>
			<td width="40%" height="91" colspan="3" valign="top" align="center">


			</td>
		</tr>
		<tr>
			<td colspan="3">
		<tr>
			<td valign="top" colspan="4">
				<table width="100%" border="0" cellspacing="15">
					<tr>
						<td width="17%" valign="top"><img src="single_pixel.gif"
							width="60" height="1"><br>
							<div id="navcontainer">
								<ul id="navlist">
									<li><a href="./" title="Back to homepage">Home</a></li>
									<li><a href="/webclient/aboutUs" title="About us ">About
											us</a></li>
									<li><a href="/webclient/loginPage" title="login">Login</a></li>
									<li><a href="/webclient/registrationPage" title="reg ">Registration</a></li>
								</ul>
							</div></td>
						<td width="100%">
							<h2>Choose theme for testing</h2>

							<p>
							<table border="1">
								<tr>
									<td width=" 500" align="center">Theme text</td>
									<td width=" 70" align="center">Choose</td>
								</tr>
								<c:forEach var="a" items="${a}">
								<tr>
								
								
									<td> "${a.nameOfTheme}"</td>
								
									<td><input type = "button" value = "Coose Theme" onClick="location.href='/webclient/chooseTest?id=${a.idTheme}'"/>
									
									
								</tr>
								</form>
								</c:forEach>
							</table>
							</p>

							<p></p>
<h1>${b}</h1>
							<p></p>

						</td>
					</tr>
				</table>
				<h2>&nbsp;</h2>
			</td>
		</tr>
	</table>
	<!-- Do not remove this div -->
	<div align="center">
		<p>
			<a href="http://www.ololcom/">Ololo</a>
		</p>
		<br>
	</div>
	<!-- End of footer div -->

	<div
		style="font-size: 0.8em; text-align: center; margin-top: 1.0em; margin-bottom: 1.0em;">
		<a href="">by Vano design</a>
	</div>
</body>
</html>