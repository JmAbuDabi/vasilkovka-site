package validation;

import java.util.regex.*;

public class RegistrationValidator
{
	private static Matcher matcher;
	private static final Pattern LOGIN=Pattern.compile("[a-zA-Z]");
    private static final int PASSWORD_LENTH=7;
    private static final Pattern PASSWORD=
    	Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
    
    public static boolean validate(String login, String password){
    	if(password.length()<PASSWORD_LENTH){
    		return false;
    	}
    	matcher = LOGIN.matcher(login);
    	boolean log=matcher.matches();
    	matcher = PASSWORD.matcher(password);
    	boolean pass=matcher.matches();
    	return log&&pass;
    	
    }
}
