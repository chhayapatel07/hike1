package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.DbCon;
import dao.UserDao;
import model.*;

@WebServlet("/user-login")
public class LoginServlet extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	try(PrintWriter pw=res.getWriter()){
		String username=req.getParameter("uname");
		String password=req.getParameter("pass");
		UserDao udao=new UserDao(DbCon.getConnection());
		User user=udao.userLogin(username, password);
		if(user!=null) {
			String role = user.getRole(); 
            if (role.equals("Student")) {
                req.getSession().setAttribute("user", user);
                res.sendRedirect("jobseeker.jsp");
            } else {
                req.getSession().setAttribute("user", user);
                res.sendRedirect("employer.jsp");
            }
		}
		else {
			pw.println("there is no user");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
