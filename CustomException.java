package CSE215TheoryAssignment01;
class Bushra extends Exception{
    @Override
    public String toString() {
        return "Radius of a circle can not be negative," +
                "so we can't calculate area." +
                "Please enter positive radius.";
    }
}
public class CustomException {
    public static double circleArea(int r) throws Bushra {
        if (r<0){
            throw new Bushra();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        try {
            double area = circleArea(2);
            System.out.println("Area of the circle is : "+area);

            double area2 = circleArea(-2);
            System.out.println("Area of the circle is: "+area2);

        }

        catch (Bushra e){
            System.out.println(e);
        }

    }


    }

