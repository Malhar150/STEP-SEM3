package WEEK_07.HOME_PROBLEM;

public class TrafficLightCycle {

    static class TrafficLight {

        private static final String[] COLORS = {"RED", "GREEN", "YELLOW"};

        private final String id;
        private int colorIndex;          // only next() changes this

        TrafficLight(String id) {
            this.id = id;
            this.colorIndex = 0;         // starts on RED
        }

        public String next() {
            colorIndex = (colorIndex + 1) % COLORS.length;
            return COLORS[colorIndex];
        }

        public String getColor() {
            return COLORS[colorIndex];
        }

        public String getId() {
            return id;
        }
    }

    public static void main(String[] args) {

        TrafficLight t = new TrafficLight("TL-9");

        System.out.println("Start: " + t.getColor());
        System.out.println("next() -> " + t.next());
        System.out.println("next() -> " + t.next());
        System.out.println("next() -> " + t.next());
    }
}
