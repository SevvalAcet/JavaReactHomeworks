package odev;

public class Main {

	public static void main(String[] args) {
	  Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", "Engin demiroð" ,"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
	
	  Courses course2 = new Courses();
	  course2.id = 2; 
	  course2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)";
	  course2.teacher = "Engin demiroð";

	  
	  Courses course3 = new Courses();
	  course3.id = 3; 
	  course3.name = "Programlamaya Giriþ Temel Kurs";
	  course3.teacher = "Engin demiroð";
	  course3.detail ="PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.";
	  
	  
	  Courses[] kurslar = {course1,course2,course3};
	       for(Courses ders : kurslar) {
	    	   System.out.println(ders.name);
	       }
	  
	  
	 System.out.println("-------------------------------------");     
	 Category category1 = new Category();
	 category1.id =1;
	 category1.name="Kurslarým";
			 
	 Category category2 = new Category();
	 category2.id =2;
	 category2.name= "Tüm Kurslar";
	 
	 Category category3 = new Category();
	 category3.id =3;
	 category3.name="Kampa Hazýrlýk";
	 
	 Category category4 = new Category();
	 category4.id =4;
	 category4.name= "Sýk Sorulan Sorular";
	
	 
	 Category[] kategoriler = {category1,category2,category3,category4};
     for(Category kategori : kategoriler) {
  	   System.out.println(kategori.name);
     }	
     
     System.out.println("----------------------------------------");		      
     ProductManager productManager = new ProductManager();
     productManager.signUpForFree(course1);
     productManager.signUpForFree(course2);
     productManager.signUpForFree(course3);
     
     System.out.println("----------------------------------------");		      
     ProductManager2 productManager2 = new ProductManager2();
     productManager2.start(course1);
     productManager2.start(course2);
     productManager2.start(course3);
     
     
     
     
     
     
     
     
     
     
     
     
     
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	  
	  
	}

}
