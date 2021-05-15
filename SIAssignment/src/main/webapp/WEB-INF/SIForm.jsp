<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="/SIAssignment/page" method="post">
<center>
<h1>Simple Interest Form</h1>
<table>
<tr>
<td>Principal Amount</td>
<td><input type="text" name="Val"/>Enter less than 2000000</td>
</tr>
<tr>
<td>Rate in Percentage</td>
<td><input type="text" name="R"/></td>
</tr>
<tr>
<td>Time in Months</td>
<td><label for="time"></label>
<select name="T" id="T">
<option value="0">Select Months</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
</select>
</td>
</tr>
</table>
<br>
<input type="submit" value="Get Simple Interest"/>
</form>
</center>
</body>
</html>
