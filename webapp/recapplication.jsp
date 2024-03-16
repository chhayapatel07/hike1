<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="includes/head.jsp" %>
<style type="text/css">

 .form-control {
       margin-top: -10px;
}
.form-group {
    margin-bottom: 12px;
}
  #abtn{
    font-size: 14px;
    padding: 4px;
    background-color: rgb(57, 117, 207);
   }
</style>
</head>
<body>
<%@ include file="includes/enavbar.jsp" %>
  <div class="container" style="margin-top: 5rem!important;">
  <span class="text-secondary"><h5>Total Application Received:3 </h5></span>
  <table class="table table-hover">
  <thead>
    <tr class="table-primary">
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Title</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Ankita</td>
      <td>ankita123@gmail.com</td>
      <td>Java Developer</td>
    </tr>
    <tr>
      <td>Chhaya Patel</td>
      <td>chhaya1232@gmail.com</td>
      <td>Web Designer</td>
    </tr>
    <tr>
      <td>Ruby</td>
      <td>rubypaswan123@gmail.com</td>
      <td>Data Analyst</td>
    </tr>
  </tbody>
</table>
  </div>
<%@ include file="includes/footer.jsp" %>
</body>
</html>