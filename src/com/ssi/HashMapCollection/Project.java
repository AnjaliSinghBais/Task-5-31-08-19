package com.ssi.HashMapCollection;

public class Project {

	int pcode;
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", duration=" + duration + ", cname=" + cname + "]";
	}

	String ptitle;
	int duration;
	String cname;
	
	
	public Project(int pcode, String ptitle, int duration, String cname) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.duration = duration;
		this.cname = cname;
	}
	
static Project p1=new Project(12,"hotel Mangement",3,"atul");
static Project p2=new Project(13,"HOSPITAL PROJECT",2,"saurabh");
static Project p3=new Project(14,"SHOP SITE",4,"anjali");
static Project p4=new Project(15,"SHOPPING",1,"arti");
	
	
	
	
	
	
}
