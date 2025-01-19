<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table border="1px">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Password</th>
		<th>Code</th>
		<th>Phone</th>
		<th>Action</th>
	</tr>
	<c:forEach items="${temp}" var="e">
	<tr>
		<td>${e.id}</td>
		<td>${e.name}</td>
		<td>${e.email}</td>
		<td>${e.pass}</td>
		<td>${e.code}</td>
		<td>${e.phone}</td>
	    <td><a href="delete/${e.id}">Delete</a>|
			<a href="edit/${e.id}">Edit</a>
		</td>
		
		
		</tr>
	</c:forEach>
	
	</table>