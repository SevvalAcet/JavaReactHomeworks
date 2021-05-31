package kodlamaio.hrms.core.utilities.result;

public class Result {
   private boolean success;
   private String message;
   
   public Result(boolean success) {
	   this.success=success;
   }
   
 public Result(boolean success,String messsage) {
	 this(success);  
	 this.message=message;
   }
 
 public boolean isSucces() {
	 return this.success;
 }
 
 
 public String getMessage() {
	 return this.message;
 }
 
 
}
