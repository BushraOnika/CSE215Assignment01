package CSE215TheoryAssignment01;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box() {
        width = 1.0;
        height=1.0;
        depth=1.0;
    }
    //cube
    public Box(double len){
        width=len;
        height=len;
        depth=len;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(Box box){
        width= box.width;
        height= box.height;
        depth= box.depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

   public void setDim(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
   }
   public boolean equalTo(Box o){
      if(  width==o.width && height==o.height && depth==o.depth){
          return true;
      }
       return false;
   }
   public double volume(){
        return width*depth*height;
   }
   @Override
   public String toString(){
        return "Box[ width= " +width+", height= "+height+" , depth= "+depth+"]";
   }
}
