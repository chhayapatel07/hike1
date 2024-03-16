<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.*" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.*" %>
<%@page import="connection.DbCon"%>

<% 
  User user=(User)request.getSession().getAttribute("auth");
  if(user!=null){
	  request.setAttribute("user", user);
	  String username=(String)session.getAttribute("user");

  }
  VacancyDao vd=new VacancyDao(DbCon.getConnection());
  List<Vacancy> v=vd.getAllVacancy();

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="includes/head.jsp" %>
<style type="text/css">
 body
   {
     background-color:#827b7b4f;
   }
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
 <div class="container mt-3" style="margin-top: 4rem!important;position:sticky">
 <div class="row">

  <div class="col-6 ps-5">
  <h4 class="text-center">Add another vancany</h4>
  <form action="add-job" method="post">
  <div class="form-group">
    <label for="exampleInputName">Company Name:</label>
    <input type="text" class="form-control" name="cname" id="exampleInputName">
  </div>
  <div class="form-group">
    <label for="exampleInputTitle">Title:</label>
    <input type="text" class="form-control" name="title" id="exampleInputTitle">
  </div>
   <div class="form-group">
    <label for="exampleInputPlace">Place:</label>
    <input type="text" class="form-control" name="place" id="exampleInputPlace">
  </div>
  <div class="form-group">
    <label for="exampleInputDesc">Description:</label>
    <input type="text" class="form-control" name="desc" id="exampleInputDesc">
  </div>
  <div class="form-group">
    <label for="exampleInputStip">Stipend:</label>
    <input type="text" class="form-control" name="sal" id="exampleInputStip">
  </div>
  <div class="form-group">
    <label for="exampleInputSDate">Start Date:</label>
    <input type="date" class="form-control" name="sdate" id="exampleInputSDate">
  </div>
  <div class="form-group">
    <label for="exampleInputEDate">End Date:</label>
    <input type="date" class="form-control" name="edate" id="exampleInputEDate">
  </div>
  <button type="submit" class="btn text-white btn-lg btn-block" id="logbtn">Add Job</button>
</form>
  </div>
  <div class="col-6 ps-5">
  <h4 class="text-center">Vacancy Posted</h4>
       <%
       if(!v.isEmpty()){
    	   for(Vacancy row:v){
       %>
   
     <div class="card mb-2" style="width: 32rem;">
        <div class="card-body">
           <b class="card-title" style="display: inline;">Company name: </b><span><%=row.getCname()%></span><br>
           <span class="card-text"><b>Place: </b><%=row.getPlace() %></span><br>
           <span class="card-text"><b>Title: </b><%=row.getTitle() %></span><br>
           <b>Description:</b><span><%=row.getDesc()%></span><br>
           <span><b>Stipend: Rs.</b><%=row.getSalary()%></span><br>
           <span><b>Start Date: </b><%=row.getSdate() %></span><br>
           <span><b>End Date: </b><%=row.getEdate() %></span><br>
        </div>
       </div>
       <%
    	   }
    	   }
       %>
  </div>
 </div>


</div>
</div>
<%@ include file="includes/footer.jsp" %>
</body>
</html>