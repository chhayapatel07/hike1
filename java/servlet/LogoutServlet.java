package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/log-out")
public class LogoutServlet extends HttpServlet{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	  try(PrintWriter pw=res.getWriter()){
		  if(req.getSession().getAttribute("user")!=null) {
			  req.getSession().removeAttribute("user");
			  res.sendRedirect("login.jsp");
		  }
		  else {
			  res.sendRedirect("index.jsp");
		  }
	  }
}
}
