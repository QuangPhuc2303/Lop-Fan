public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    final double DEFAULT_RADIUS = 5;

    private int speed = SLOW;
    private boolean status = false;
    private double radius = DEFAULT_RADIUS;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String info;
        if (status) {
            info = "Fan is on" + ", speed is " + speed + ", color is " + color;
        } else {
            info = "Fan is off" + ", radius is " + radius + ", color is " + color;
        }
        return info;
    }
}
