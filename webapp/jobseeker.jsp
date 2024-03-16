<%@page import="connection.DbCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.*" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.*" %>

<% 
  
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
   #abtn{
    font-size: 14px;
    padding: 4px;
    background-color: rgb(57, 117, 207);
   }
  </style>
</head>
<body>
<%@ include file="includes/unavbar.jsp" %>
   <div class="container" style="margin-top: 6rem!important;">
     <div class="card w-50 mx-auto mt-3">
      <div class="card-header text-center text-primary"><h5>Available Vacancies</h5></div>
       <%
       if(!v.isEmpty()){
    	   for(Vacancy row:v){
       %>
               <div class="card-body">
           <div class="card" style="width: 32rem;">
           <div class="card-body">
           <b class="card-title" style="display: inline;">Company name: </b><span><%=row.getCname()%></span><br>
           <span class="card-text"><b>Place: </b><%=row.getPlace() %></span><br>
           <span class="card-text"><b>Title: </b><%=row.getTitle() %></span><br>
           <b>Description: </b><span><%=row.getDesc()%></span><br>
           <span><b>Stipend: Rs. </b><%=row.getSalary()%></span><br>
           <span><b>Start Date: </b><%=row.getSdate() %></span><br>
           <span><b>End Date: </b><%=row.getEdate() %></span><br>
           <a href="#" class="btn text-white btn-lg btn-block mt-3" id="abtn">Apply</a>
        </div>
       </div>
      </div>
      <%
    	}
    	}
       else{
		 out.print("There is no job available");   
	   }
       %>
        
     
     
     
     
     </div>
   </div>




<%@ include file="includes/footer.jsp" %>
</body>
</html>