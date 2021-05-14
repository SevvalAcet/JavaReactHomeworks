package business.concretes;

import business.abstracts.AuthService;


public class AuthManager implements AuthService {

	@Override
	public void postVerificationCode(String mail) {
		// String code = "https://xasfdsafaf"; created code
		System.out.println("Verification code sent to: " + mail);
	}

	@Override
	public boolean verificationMailIsItClicked(String mail, String code) {
		String baseCode = "https://xasfdsafaf";
		if(baseCode==code) {
			System.out.println("Mail is verified : " + mail);
			return true;
		}else {
			System.out.println("Mail is not a verified");
		return false;
		}
		}

}