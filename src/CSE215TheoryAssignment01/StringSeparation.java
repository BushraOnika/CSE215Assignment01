package CSE215TheoryAssignment01;

import java.util.Scanner;

public class StringSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st name: ");
        String s1= sc.nextLine();
        System.out.println("Enter the last name: ");
        String s2 = sc.nextLine();
        String lastName = null;
        String name = s1.concat(";").concat(s2);
        System.out.println(name);
        //The string split() method breaks a given string around matches of the given regular expression.
        String[] arr = name.split(";");//Calling a split() method on String Object – Splitting by multiple delimiters
        for(String nam:arr)
        {
            lastName=nam;// Here we separate lastname from the whole String.
        }
        System.out.println("Last name is : "+lastName); // Print the last name
    }
}
