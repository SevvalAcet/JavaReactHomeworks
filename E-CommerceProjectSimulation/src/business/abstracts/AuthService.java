package business.abstracts;

public interface AuthService {
	void postVerificationCode(String mail);
	boolean verificationMailIsItClicked(String mail, String code);
}
