package CSE215TheoryAssignment01;

public class FurnitureBedDeskStudentDeskTest {

    public static void main(String[] args) {
        Bed b = new Bed("Yellow",2,5,7); //objects create
        System.out.println("Name of th bed: "+b.typeofBed("Bunk bed"));//method overloading caling
        System.out.println("Size of the bed is : "+b.size("King"));

        Desk d = new Desk("Coffee",2,6,4);
        System.out.println(d);
        Desk d1 = new Desk();
        System.out.println("Printing the method with object parameters: \n"+d1.printDesk(d));

        StudentDesk st = new StudentDesk(2,2,d);
        System.out.println(st);

    }
    }

