package tranbinhtrong.question1;

public class Question1 {

    public static void main(String[] args) {
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(3, 2);
        c1.plus(c2).displayComplex();
        c1.minus(c2).displayComplex();
        c1.multiplyComplexes(c2).displayComplex();
        c1.division(c2).displayComplex();
    }
}
