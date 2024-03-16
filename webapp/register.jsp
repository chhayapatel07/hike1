<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="includes/head.jsp" %>
</head>
<body>
<%@ include file="includes/navbar.jsp" %>
<div class="container" style="margin-top: 4rem!important;">
  <div class="col-3 float-left my-5 mt-5 pt-5 ">
  <img alt="" src="images/res2.png" class="img-fluid" width=300px>
   <div class="text-center">
     <small>By signing up, you agree to our Terms, Privacy Policy and Cookies Policy.</small>
   </div>
  </div>
  <div class="card float-right my-5 bg-light p-4 "  id="rescard1">
  <h4 class="text-center text-primary pb-3">Sign Up</h4>
  <%
   String regMsg=(String)session.getAttribute("reg-msg");
   if(regMsg!=null)
   {
   %>
	  
	   
   <%}
   %>
  <form action="sign-up" method="post">
   <div class="form-group row ps-5">
    <label for="inputName" class="col-sm-2 col-form-label">Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="name1" id="inputName" placeholder="Your Name Here...">
    </div>
   </div>
   <div class="form-group row ps-5">
    <label for="inputUName" class="col-sm-2 col-form-label">Username:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="uname" id="inputUName" placeholder="Choose a username">
    </div>
   </div>
    <div class="form-group row ps-5">
    <label for="inputEmail" class="col-sm-2 col-form-label">Email:</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" name="email" id="inputEmail" placeholder="Email">
    </div>
   </div>
   <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword" name="password" placeholder="Password">
    </div>
  </div>
  <fieldset class="form-group">
    <div class="row">
      <div class="col-form-label col-sm-2 pt-0"></div>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="Student">
          <label class="form-check-label" for="gridRadios1">
            Jobseeker
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="Employer">
          <label class="form-check-label" for="gridRadios2">
            Employer
          </label>
        </div>
      </div>
    </div>
  </fieldset>
  <div class="form-group row">
   <div class="col-form-label col-sm-2 pt-0"></div>
      <div class="col-sm-10">
      <button type="submit" class="btn btn-primary btn-lg btn-block" id="resbtn">Register</button>
      </div>
      
   </div>
  </form>
  
  
  </div>
 </div>
 
 
 <%@ include file="includes/footer.jsp" %>
</body>
</html>