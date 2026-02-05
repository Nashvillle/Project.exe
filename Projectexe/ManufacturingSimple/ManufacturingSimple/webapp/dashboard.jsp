
<%@ page import="java.util.*, Machine" %>
<html>
<body>

<h2>Plant Asset Dashboard</h2>

<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Location</th>
<th>Last Maintenance</th>
<th>Next Maintenance</th>
</tr>

<%
List<Machine> list = (List<Machine>) request.getAttribute("machines");

for(Machine m : list) {
%>
<tr>
<td><%= m.getId() %></td>
<td><%= m.getName() %></td>
<td><%= m.getLocation() %></td>
<td><%= m.getLastMaintenance() %></td>
<td><%= m.getNextMaintenance() %></td>
</tr>
<%
}
%>

</table>

</body>
</html>
