package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.*;


@WebServlet("/sign-up")
public class RegisterServlet extends HttpServlet {
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	
	PrintWriter pw=res.getWriter();
	String name=req.getParameter("name1");
	String uname=req.getParameter("uname");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String role=req.getParameter("gridRadios");

	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","root");
		PreparedStatement ps=con.prepareStatement("insert into user(name,username,email,password,role) values(?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2, uname);
		ps.setString(3, email);
		ps.setString(4, password);
		ps.setString(5, role);
		ps.executeUpdate();
		
	}
	catch (Exception ie) {
		System.out.println(ie);
	}
	  if(true)
	  {
		 HttpSession session=req.getSession();
		 session.setAttribute("reg-msg", "Registration Successfully..");
		 res.sendRedirect("register.jsp");
	  }
	  else
	  {
		HttpSession session=req.getSession();
		session.setAttribute("error-msg", "Something Went Wrong Server");
		res.sendRedirect("register.jsp");
	  }
	  
	

}
}
