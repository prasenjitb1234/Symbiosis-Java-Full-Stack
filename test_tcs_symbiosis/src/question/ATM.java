package question;

public class ATM {
    public static boolean validatePIN(String pin) {
        // Checks if the length is 4 or 6
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }

        // checks all characters are digits or NOT
        for (int i = 0; i < pin.length(); i++) {
            char c = pin.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validatePIN("1234")); // true
        System.out.println(validatePIN("12345")); // false
        System.out.println(validatePIN("a234")); // false
        System.out.println(validatePIN("123456")); // true
    }
}
