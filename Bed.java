package CSE215TheoryAssignment01;

public class Bed extends Furniture implements Details{ //Interface implementation
    private int width;
    private int length;

    public Bed(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Bed(String color, int warranty, int width, int length) {
        super(color, warranty);
        this.width = width;
        this.length = length;
    }

    @Override
    public String size() {

        return "double";
    }
    public String size(String a){ //method overloading
        return a;
    }

    @Override
    public String typeofBed() {
        return null;
    }
    public String typeofBed(String name){ //method overloading
        return name;
    }

    @Override
    public String toString() {
        return "For Bed\n"+ super.toString()+
                "\nwidth: " + width +
                "\nlength: " + length;

    }
}
