<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α��� ������</title>
</head>
<body>
<center>
		<h1>�α��� �������Դϴ�.</h1>
		<hr>
		<form action="login.ku" method="post">
			<table border="2" cellpadding="10" align="left">
				<tr>
					<td>���̵�</td>
					<td><input type="text" name="id" value="${userVO.id}"></td>
				</tr>
				<tr>
					<td>�н�����</td>
					<td><input type="password" name="password" value="${userVO.password}"></td>
				</tr>
				<tr>
					<td><input type="submit" value="�α���"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>