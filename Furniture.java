package CSE215TheoryAssignment01;

public class Furniture {
    private String color;  //Encapsulation
    private int warranty;//Encapsulation
    public Furniture(){
        color = "Yellow";
        warranty = 2;

    }

    public Furniture(String color, int warranty) {
        this.color = color;
        this.warranty = warranty;
    }

    public String getColor() { //Accessors

        return color;
    }

    public void setColor(String color) { // mutators

        this.color = color;
    }

    public int getWarranty() { //Accessors

        return warranty;
    }

    public void setWarranty(int warranty) { // mutators

        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Color: " + color +
                "\nwarranty: " + warranty ;
    }
}
