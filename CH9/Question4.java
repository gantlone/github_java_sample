package 習題練習.CH9;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入實數部分: ");
        int inReal = sc.nextInt();
        System.out.print("請輸入虛數部分: ");
        int inImag = sc.nextInt();

        Complex c1 = new Complex(inReal,inImag);
        Complex c2 = new Complex(c1);
        Complex c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        System.out.println(c3 + " - " + c2 + " = " + c3.minus(c2));

        sc.close();
    }
    
}

class Complex{
    double real;
    double imaginal;

    public Complex(double real, double imag){
        this.real = real;
        this.imaginal = imag;
    }

    public Complex(Complex c){
        this.real = c.real;
        this.imaginal = c.imaginal;
    }

    public Complex add(Complex c){
        return new Complex(real + c.real, imaginal + c.imaginal);
    }

    public Complex minus(Complex c){
        return new Complex(real - c.real, imaginal - c.imaginal);
    }

    public String toString() {
		return "("+ real + " + " + imaginal + "i)";
	}
}
