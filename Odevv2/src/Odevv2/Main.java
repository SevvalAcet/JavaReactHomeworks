package Odevv2;

public class Main {

	public static void main(String[] args) {
		Student student =new Student();
		student.id=1;
		student.firstName="Þevval";
		student.lastName="Acet";
		student.age=19;
		

		Student student2 =new Student();
		student2.id=2;
		student2.firstName="Berk";
		student2.lastName="Çakmak";
		student2.age=20;
		
		StudentManager studentManager = new StudentManager();
		studentManager.examWinners(student);
		
		
		 Instructor  ýnstructor = new  Instructor();
		 ýnstructor.firstName="Engin ";
		 ýnstructor.lastName="Demiroð";
		 ýnstructor.id=1;
		 ýnstructor.trainings="JAVA+REACT,Programlamaya Giriþ,C# +Angular";
		 ýnstructor.competencies="MCT,PMP,ITIL";
		 
	}

}
