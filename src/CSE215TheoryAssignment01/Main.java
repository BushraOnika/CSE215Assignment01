package CSE215TheoryAssignment01;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        Complex complex = new Complex();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Real value: ");
        double real = sc.nextDouble();
        System.out.print("Enter the Imaginary number: ");
        double imaginary = sc.nextDouble();

        Complex complex1 = new Complex(real,imaginary);
        System.out.print("Enter the Real value: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter the Imaginary number: ");
        double imaginary2 = sc.nextDouble();


        Complex complex2 = new Complex(real2,imaginary2);
        System.out.println();
        System.out.println("Complex number 1:  " + complex1);
        System.out.println("Complex number 2:  " + complex2);
        System.out.println();
        System.out.println("\tAdd Of Two Complex Number is :  " + complex1.add(complex2));
        System.out.println("\tMultiply Of Two Complex Number is:  " + complex1.multiply(complex2));

    }

}
