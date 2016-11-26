<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Word Search</title>
<link rel="stylesheet" href="Bootstrap\css\bootstrap.min.css"></link>
</head>
<body >
<fieldset>
<legend>Word Search</legend>
	<form  action="wordSearching" method="GET" >
	<div class="form-group">
				<label class="control-label col-sm-2" for="name">Word:</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="name" name="word[]"
						placeholder="Enter a Word" required/>
				</div>
			</div>
			<br><br>
				<div align="center">
					<input type="submit" value="SEARCH" class="btn btn-primary btn-lg">
					<input type="reset" value="RESET" class="btn btn-primary btn-lg">
				</div>
	
	</form>
</fieldset>
</body>
</html>