package odev;

public class Courses {
	
	public Courses() {
		System.out.println("Ben çalýþtým");
	}
	
	public Courses(int id,String name,String teacher,String detail ) {
		this();
		this.name = name;
		this.teacher= teacher;
		this.detail=detail;
	}
	
	
	int id;
	String name;
	String teacher;
    String detail;


}
