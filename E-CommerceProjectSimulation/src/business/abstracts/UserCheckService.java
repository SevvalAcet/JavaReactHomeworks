  
package business.abstracts;

public interface UserCheckService {
	boolean passwordController(String password);
	boolean mailController(String mail);
	boolean nameController(String firstName, String lastName);
}