package deepmehtait.com.mycloudhomemusic.utils;

/**
 * Created by deepmetha on 6/15/17.
 */

public class Validator {
    // Email Checker
    public final static boolean isValidEmail(CharSequence target) {
        if (target == null)
            return false;

        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
    // Password Checker
    public final static boolean isValidPassword(CharSequence target) {
        if (target == null)
            return false;

        return (target.length()>=6);
    }
}
