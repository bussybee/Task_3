package ru.vsu.cs.maslovaei;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new Line(0, -15.5, 0.5),
                new Parabola(-5, -5, 0.5),
                new HorizontalParabola(-2,4,-1));

        checkTests(picture);

        double x = readNum("Input x: ");
        double y = readNum("Input y: ");

        printColorForPoint(picture, x, y);
    }

    public static void printColorForPoint(Picture picture, double x, double y){
        System.out.println(picture.getColor(x, y));
    }

    private static double readNum(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void checkTests(Picture picture){
        Test test = new Test();

        if (test.programTest(picture)){
            System.out.println("All tests completed");
        } else {
            System.out.println("Error");
        }
    }

}
