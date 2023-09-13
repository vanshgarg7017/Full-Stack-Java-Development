package Excercise.org;

public class Test {

    public static void main(String[] args) {

        Ballon red = new Ballon("Red");
        Ballon blue = new Ballon("Blue");

        System.out.println("Before the swap method executes:");
        System.out.println("red color value = " + red.getColor());
        System.out.println("blue color value = " + blue.getColor());

        Ballon.swap(red, blue);

        System.out.println("After the swap method executes:");
        System.out.println("red color value = " + red.getColor());
        System.out.println("blue color value = " + blue.getColor());

        changeValue(blue);

        System.out.println("After the changeValue method executes:");
        System.out.println("blue color value = " + blue.getColor());
    }

    private static void changeValue(Ballon balloon) {
        balloon.setColor("Red");
    }
}

