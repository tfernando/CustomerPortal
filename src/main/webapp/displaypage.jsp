<%@ page import="java.util.*" import="java.io.*"%>
<HTML>
<HEAD>
<TITLE>Customer Summary</TITLE>

<link rel="stylesheet" href="displaystyles.css" type="text/css">
</HEAD>
<body>
	<div>
		<h1 align="center">Customer Information</h1>
		<table align="center">
			<tr>
				<th scope="row" align="left">First Name:</th>
				<td><%=request.getAttribute("fname")%></td>
			</tr>

			<tr>
				<th scope="row" align="left">Last Name:</th>
				<td><%=request.getAttribute("lname")%></td>
			</tr>

			<tr>
				<th scope="row" align="left">Date of Birth:</th>
				<td><%=request.getAttribute("bdate")%></td>
			</tr>

			<tr>
				<th scope="row" align="left">Country:</th>
				<td><%=request.getAttribute("cont")%></td>
			</tr>

			<tr>
				<th scope="row" align="left">Age:</th>
				<td><%=request.getAttribute("age")%></td>
			</tr>
		</table>
	</div>

</BODY>
</HTML>