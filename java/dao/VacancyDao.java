package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Vacancy;

public class VacancyDao {
    private Connection con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public VacancyDao(Connection con) {
		this.con=con;
	}
    public List<Vacancy> getAllVacancy(){ 
    	List<Vacancy> v=new ArrayList<>();
    	try {
    	query ="select * from  vacancy";
    	ps=this.con.prepareStatement(query);
    	rs=ps.executeQuery();
    	while (rs.next()) {
			Vacancy vadd=new Vacancy();
			vadd.setVid(rs.getInt("vid"));
			vadd.setCname(rs.getString("cname"));
			vadd.setTitle(rs.getString("title"));
			vadd.setPlace(rs.getString("place"));
			vadd.setDesc(rs.getString("descri"));
			vadd.setSalary(rs.getInt("sal"));
			vadd.setSdate(rs.getString("sdate"));
			vadd.setEdate(rs.getString("edate"));
			v.add(vadd);
		}
    	}
    	catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
    	return v;
    }
}
