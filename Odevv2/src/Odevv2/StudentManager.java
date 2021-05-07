package Odevv2;

public class StudentManager extends UserManager{
      public void examWinners(Student student) {
    	  System.out.println("Sınavı kazanlar:"+ student.firstName +student.lastName);
      }
}
