package Excercise.org;

public class Ballon {

    private String color;

    public Ballon() {}

    public Ballon(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Custom swap method for Balloon objects
    public static void swap(Ballon b1, Ballon b2) {
        String tempColor = b1.getColor();
        b1.setColor(b2.getColor());
        b2.setColor(tempColor);
    }
}