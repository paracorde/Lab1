package lab1;

public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        int c = 3;
        int m = 10;

        System.out.println("Welcome to Scientific Calculator!");
        System.out.println("Program started ...");
        System.out.println(b + " to power " + n + " = " + myLibrary.Power(c, m));
        System.out.println(n + "! = " + myLibrary.factorial(n));

        System.out.println(c + " to power " + m + " = " + myLibrary.Power(c, m));
        System.out.println(m + "! = " + myLibrary.factorial(m));

        System.out.println("Program ..Ended ...");
    }
}