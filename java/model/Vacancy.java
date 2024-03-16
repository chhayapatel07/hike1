package model;

public class Vacancy {
  private int vid;
  private String cname;
  private String title;
  private String place;
  private String descri;
  private int sal;
  private String sdate;
  private String edate;
  
  public Vacancy() {
	// TODO Auto-generated constructor stub
}

public Vacancy(int vid, String cname, String title, String place, String descri, int salary, String sdate,
		String edate) {
	super();
	this.vid = vid;
	this.cname = cname;
	this.title = title;
	this.place = place;
	this.descri = descri;
	this.sal = sal;
	this.sdate = sdate;
	this.edate = edate;
}

public int getVid() {
	return vid;
}

public void setVid(int vid) {
	this.vid = vid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public String getDesc() {
	return descri;
}

public void setDesc(String descri) {
	this.descri = descri;
}

public int getSalary() {
	return sal;
}

public void setSalary(int salary) {
	this.sal = salary;
}

public String getSdate() {
	return sdate;
}

public void setSdate(String sdate) {
	this.sdate = sdate;
}

public String getEdate() {
	return edate;
}

public void setEdate(String edate) {
	this.edate = edate;
}

@Override
public String toString() {
	return "Vacancy [vid=" + vid + ", cname=" + cname + ", title=" + title + ", place=" + place + ", desc=" + descri
			+ ", salary=" + sal + ", sdate=" + sdate + ", edate=" + edate + "]";
}

 
  
  
  
 
}
