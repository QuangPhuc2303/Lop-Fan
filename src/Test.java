public class Test {
    public static void main(String[] args) {
        
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        final double DEFAULT_RADIUS = 5;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setStatus(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setStatus(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
