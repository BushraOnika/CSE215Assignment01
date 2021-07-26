package CSE215TheoryAssignment01;


import java.util.Scanner;

class Complex {

     double real;
     double imaginary;

     public void setReal(double real) {

         this.real = real;
     }
    public double getReal() {

        return this.real;
    }

     public void setImaginary(double imaginary) {

         this.imaginary = imaginary;
     }
    public double getImaginary() {

        return this.imaginary;
    }



    public Complex() {
        setReal(0);
        setImaginary(0);
    }

     public Complex(double real) {
         setReal(real);
     }

     public Complex(double real, double imaginary){
        setReal(real);
        setImaginary(imaginary);
    }

    public Complex add(Complex C){
        Complex result = new Complex();
        result.real = this.getReal() + C.getReal();
        result.imaginary = this.getImaginary() + C.getImaginary();
        return result;
    }

//    public Complex subtraction(Complex c){
//        Complex result = new Complex();
//        result.real = this.getReal() - c.getReal();
//        result.imaginary = this.getImaginary() - c.getImaginary();
//        return result;
//    }

    public Complex multiply(Complex c){
        Complex result = new Complex();
        result.real = ( this.getReal() * c.getReal() ) - ( this.getImaginary() * c.getImaginary());
        result.imaginary = ( this.getReal() * c.getImaginary() ) + ( this.getImaginary() * c.getReal());
        return result;
    }
     @Override
     public String toString() {

         return  real + " + " + imaginary +" i ";
     }
//    public Complex division(Complex temp){
//        Complex result = new Complex();
//        result.real = ((( this.getReal() * temp.getReal() ) + ( this.getImaginary() * temp.getImaginary())) / (Math.pow(temp.getReal(), 2) + Math.pow(temp.getImaginary(), 2)));
//        result.imaginary =((( this.getReal() * temp.getImaginary() ) - ( this.getImaginary() * temp.getReal() )) / (Math.pow(temp.getReal(), 2) + Math.pow(temp.getImaginary(), 2)));
//        return result;
//    }

}






