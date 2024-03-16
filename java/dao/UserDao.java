package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connection.*;
import model.User;

public class UserDao {
     private Connection con;
     private String query;
     private PreparedStatement pst;
     private ResultSet rs;
     
     public UserDao(Connection con) {
		this.con=con;
	}
     public User userLogin(String username, String password) {
    	 User user=null;
    	 
    	 try {
			 query="select * from user where username=? and password=?";
			 pst=this.con.prepareStatement(query);
			 pst.setString(1, username);
			 pst.setString(2, password);
			 rs=pst.executeQuery();
			 if(rs.next()) {
				 user=new User();
				 user.setId(rs.getInt("id"));
				 user.setName(rs.getString("name"));
				 user.setUsername(rs.getString("username"));
				 user.setEmail(rs.getString("email"));
				 user.setPassword(rs.getString("password"));
				 user.setRole(rs.getString("role"));
			 }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	 return user;
     }
     public User userInfo() {
    	 User user=null;
    	 try {
			 query="select * from user";
			 pst=this.con.prepareStatement(query);
			 rs=pst.executeQuery();
			 if(rs.next()) {
				 user=new User();
				 user.setId(rs.getInt("id"));
				 user.setName(rs.getString("name"));
				 user.setUsername(rs.getString("username"));
				 user.setEmail(rs.getString("email"));
				 user.setPassword(rs.getString("password"));
				 user.setRole(rs.getString("role"));
			 }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	 
    	 return user;
     }

     
}
