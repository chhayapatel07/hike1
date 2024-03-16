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

@WebServlet("/add-job")
public class AddVacancy extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		String cname=req.getParameter("cname");
		String title=req.getParameter("title");
		String place=req.getParameter("place");
		String desc=req.getParameter("desc");
		String sal=req.getParameter("sal");
		String sdate=req.getParameter("sdate");
		String edate=req.getParameter("edate");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","root");
			PreparedStatement ps=con.prepareStatement("insert into vacancy(cname,title,place,descri,sal,sdate,edate) values(?,?,?,?,?,?,?)");
			ps.setString(1,cname);
			ps.setString(2, title);
			ps.setString(3, place);
			ps.setString(4, desc);
			ps.setString(5, sal);
			ps.setString(6, sdate);
			ps.setString(7, edate);
			ps.executeUpdate();
		}
		catch (Exception ie) {
			System.out.println(ie);
		}
		RequestDispatcher rd=req.getRequestDispatcher("employer.jsp");
		rd.forward(req, res);
		pw.print("<h5 style='color:green'>You are successfully Registered....</h5>");
		

	}
	}