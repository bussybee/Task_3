package ru.vsu.cs.maslovaei;

public class Test {

    public boolean programTest(Picture picture) {
        if (picture.getColor(3, 2) == SimpleColor.BLUE) {
            System.out.println("Test 1 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-1, 1) == SimpleColor.BLUE) {
            System.out.println("Test 2 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-5, 5) == SimpleColor.GRAY) {
            System.out.println("Test 3 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-10, 4) == SimpleColor.YELLOW) {
            System.out.println("Test 4 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(10, 2) == SimpleColor.BLUE) {
            System.out.println("Test 5 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-6, 9) == SimpleColor.GRAY) {
            System.out.println("Test 6 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-7, 3) == SimpleColor.GRAY) {
            System.out.println("Test 7 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-15, 10) == SimpleColor.WHITE) {
            System.out.println("Test 8 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(1, 1) == SimpleColor.BLUE) {
            System.out.println("Test 9 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-20, 0) == SimpleColor.YELLOW) {
            System.out.println("Test 10 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}
