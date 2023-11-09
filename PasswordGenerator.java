package task1.PackageGenerator;


import java.util.Scanner;
import java.security.SecureRandom;

public class PasswordGenerator {
	 
	public static final String UPPER = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
	public static final String LOWER = "abcdefghijkmnlopqrstuvwxyz";
	public static final String NUMBER = "0123456789";
	public static final String SPECIAL = "~!@#$%^&*()_+=-`,.<>?/[]|'";
	
	public static String generatePassword(int length) {
		
		StringBuilder password = new StringBuilder();
		SecureRandom random = new SecureRandom();
		
		String allPossible = UPPER + LOWER + NUMBER + SPECIAL;
		
		for(int i=0;i<length;i++) {
			int randomIndex = random.nextInt(allPossible.length());
			
			password.append(allPossible.charAt(randomIndex));
		}
		
		return password.toString();
		
		 
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length of your required password: ");
		int length = s.nextInt();
		
		String password = generatePassword(length);
		
		System.out.println("Your password is : "+password);
		System.out.println("Your password strength \"Very Strong\" ");

	}
	
	

}
