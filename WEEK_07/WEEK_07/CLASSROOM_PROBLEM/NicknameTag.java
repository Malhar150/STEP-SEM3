package WEEK_07.CLASSROOM_PROBLEM;

public class NicknameTag {

    static final class NameTag {

        private final String firstName;
        private final String lastName;

        NameTag(String fullName) {
            String[] parts = fullName.split(" ");   // split once, here
            this.firstName = parts[0];
            this.lastName = parts[1];
        }

        public String getNickname() {
            return firstName + " " + lastName.charAt(0) + ".";
        }
    }

    public static void main(String[] args) {

        NameTag tag = new NameTag("Maria Gomez");
        NameTag sameName = new NameTag("Maria Gomez");

        System.out.println("Nickname: " + tag.getNickname());
        System.out.println(
                "Same nickname: "
                + tag.getNickname().equals(sameName.getNickname())
        );
        System.out.println("Same object: " + (tag == sameName));
    }
}
