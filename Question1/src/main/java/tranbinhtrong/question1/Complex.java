package tranbinhtrong.question1;

import java.util.Scanner;

public class Complex {

    private double re;
    private double im;

    public Complex(double re, double im) {
        this.im = im;
        this.re = re;
    }

    public Complex() {
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void inputComplex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a complex number under the state a+bi \nFirst input a then b: ");
        re = sc.nextDouble();
        im = sc.nextDouble();
    }

    public void displayComplex() {
        System.out.print(re + "+" + im + "i\n");
    }

    public Complex plus(Complex c1) {
        double resultRe = this.re + c1.getRe();
        double resultIm = this.im + c1.getIm();
        return new Complex(resultRe, resultIm);
    }

    public Complex minus(Complex c1) {
        double resultRe = this.re - c1.getRe();
        double resultIm = this.im - c1.getIm();
        return new Complex(resultRe, resultIm);
    }

    public Complex multiplyComplexes(Complex c1) {
        double resultRe = this.re * c1.getRe() - this.im * c1.getIm();
        double resultIm = this.re * c1.getRe() + this.im * c1.getIm();
        return new Complex(resultRe, resultIm);
    }

    public Complex division(Complex c1) {
        double resultRe = (this.re * c1.getRe() + this.im * c1.getIm()) / (c1.getIm() * c1.getIm() + c1.getRe() * c1.getRe());
        double resultIm = (this.im * c1.getRe() - this.re * c1.getIm()) / (c1.getIm() * c1.getIm() + c1.getRe() * c1.getRe());
        return new Complex(resultRe, resultIm);
    }
}
