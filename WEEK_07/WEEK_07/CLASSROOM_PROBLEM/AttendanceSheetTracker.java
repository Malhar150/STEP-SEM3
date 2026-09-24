package WEEK_07.CLASSROOM_PROBLEM;

public class AttendanceSheetTracker {

    static class AttendanceSheet {

        private final String[] presentStudents;   // never exposed
        private int count;

        AttendanceSheet(int maxClassSize) {
            this.presentStudents = new String[maxClassSize];
            this.count = 0;
        }

        public boolean markPresent(String name) {
            if (isPresent(name) || count >= presentStudents.length) {
                return false;      // duplicate or class full
            }
            presentStudents[count] = name;
            count++;
            return true;
        }

        public int getPresentCount() {
            return count;
        }

        public boolean isPresent(String name) {
            for (int i = 0; i < count; i++) {
                if (presentStudents[i].equals(name)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("isPresent(\"Ben\"): " + sheet.isPresent("Ben"));
        System.out.println("isPresent(\"Chen\"): " + sheet.isPresent("Chen"));
    }
}
