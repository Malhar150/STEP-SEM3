package WEEK_07.HOME_PROBLEM;

public class PasswordStrengthChecker {

    static class PasswordChecker {

        private final String password;   // no getter, never changes

        PasswordChecker(String password) {
            this.password = password;
        }

        public String getStrength() {
            int length = password.length();

            if (length < 6) {
                return "Weak";
            } else if (length < 10) {
                return "Medium";
            } else {
                return "Strong";
            }
        }
    }

    public static void main(String[] args) {

        PasswordChecker pc1 = new PasswordChecker("abcd");
        PasswordChecker pc2 = new PasswordChecker("abcdefgh");
        PasswordChecker pc3 = new PasswordChecker("abcdefghijkl");

        System.out.println("4 chars  -> " + pc1.getStrength());
        System.out.println("8 chars  -> " + pc2.getStrength());
        System.out.println("12 chars -> " + pc3.getStrength());
    }
}
