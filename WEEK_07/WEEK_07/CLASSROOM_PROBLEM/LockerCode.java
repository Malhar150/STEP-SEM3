package WEEK_07.CLASSROOM_PROBLEM;

public class LockerCode {

    static class Locker {

        private final int lockerNumber;
        private String code;               // write-only: no getter

        Locker(int lockerNumber, String code) {
            this.lockerNumber = lockerNumber;
            this.code = code;
        }

        public boolean changeCode(String currentCode, String newCode) {
            if (!code.equals(currentCode)) {
                return false;      // wrong code, nothing changes
            }
            code = newCode;
            return true;
        }

        public int getLockerNumber() {
            return lockerNumber;
        }
    }

    public static void main(String[] args) {

        Locker l = new Locker(101, "1234");

        System.out.println(
                "changeCode(\"1234\", \"5678\"): "
                + (l.changeCode("1234", "5678") ? "success" : "rejected")
        );

        System.out.println(
                "changeCode(\"0000\", \"9999\"): "
                + (l.changeCode("0000", "9999") ? "success" : "rejected")
        );

        // proves the code is still 5678 without reading it
        System.out.println(
                "changeCode(\"5678\", \"1111\"): "
                + (l.changeCode("5678", "1111") ? "success" : "rejected")
        );
    }
}
