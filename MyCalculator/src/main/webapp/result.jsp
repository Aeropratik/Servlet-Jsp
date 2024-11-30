<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyJspPage</title>

<style>
	body{
	 font-size: 30px;
	text-align:center;
	background:linear-gradient(to right,#191970,#07121a );
	 }
	h1,h3{
	color: Tomato;
	margin:15px;
	}
	input, button {
	  font-size:40px;
	  color: white;
	  border-radius: 5%;
	  background-color: black;
	  border: 2px solid white;
	}	
	
	img{
	width: 18%;
	height:18%;
	margin-top: 15px;
	}
	img:hover{
	  -ms-transform: scale(1.1); /* IE 9 */
	  -webkit-transform: scale(1.1); /* Safari 3-8 */
	   transform: scale(1.1); 
	}
</style>

</head>


<body> 
<img src="images\innocent.jpg">
<h1>" Quote Of The Day " ! </h1>
<h3>✨<%=request.getParameter("quotes")%></h3>

<form action="MyServlet">
	<input name="number1" placeholder="1st Number"></input>
	<input name="number2" placeholder="2nd Number"></input>
	
	<button name="btn1" value="1">Add +</button>
	<button name="btn1" value="2">Sub -</button>
	<button name="btn1" value="3">Mul *</button>
	<button name="btn1" value="4">Div /</button>
</form>
<h1>Ans = <%=request.getParameter("ans")%></h1>

</body>
</html>