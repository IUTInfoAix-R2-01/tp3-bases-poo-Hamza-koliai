package exo_3;

import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;


public class exo3
{
        public static void  main (String [] args) {
            TestDate();
        }
        public static void test () {
            MyComplex myComplex = new MyComplex(1.0,2.0);
            MyComplex myComplex3 = new MyComplex();
            System.out.println(myComplex.toString());
            System.out.println(myComplex3.toString());
            myComplex3.add(myComplex);
            System.out.println(myComplex3.getImag() +" "+myComplex3.getReal());
            myComplex3.setReal(20.0);
            System.out.println(myComplex3.getImag() +" "+myComplex3.getReal());
            myComplex.setValue(14,10);
            System.out.println(myComplex.getImag() +" "+myComplex.getReal());
            System.out.println(myComplex.magnitude());
        }
        public static void MyComplexApp () {
            MyComplex complex1 = new MyComplex();
            MyComplex complex2 = new MyComplex();
            Scanner input = new Scanner(System.in);
            System.out.println("saisir un nombre complexe : ");
            complex1.setReal(input.nextDouble());
            complex1.setImag(input.nextDouble());
            System.out.println("saisir un autre nombre complexe: ");
            complex2.setValue(input.nextDouble(),input.nextDouble());
            System.out.println("Number 1 is : " +complex1.toString());
            if (complex1.isReal()){
                System.out.println(complex1.toString() +" est un réel");
            }else {
                System.out.println(complex1.toString() +" n'est pas un réel");
            }
            if(complex1.isImaginary()){
                System.out.println(complex1.toString() +" est un imaginaire");
            }
            else {
                System.out.println(complex1.toString() +" n'est pas un imaginaire");
            }
            System.out.println(" ");

            //complex 2
            System.out.println("Number 2 is : " +complex2.toString());
            if (complex2.isReal()){
                System.out.println(complex2.toString() +" est un réel");
            }else {
                System.out.println(complex2.toString() +" n'est pas un réel");
            }
            if(complex2.isImaginary()){
                System.out.println(complex2.toString() +" est un imaginaire");
            }
            else {
                System.out.println(complex2.toString() +" n'est pas un imaginaire");
            }
            System.out.println(" ");
            if(complex1.equals(complex2)){
                System.out.println(complex1.toString() +" est égal à "+complex2.toString());
            }
            else {
                System.out.println(complex1.toString() +" n'est pas égal à "+complex2.toString());
            }

            System.out.println(complex1.toString() +" + " + complex2.toString() + " = " + complex1.add(complex2).toString());


        }
        public static void MyPolynomial () {
            Scanner input = new Scanner(System.in);
            MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
            System.out.println("saisir un polynome : ");
            MyPolynomial p2 = new MyPolynomial(input.nextDouble(),input.nextDouble(),input.nextDouble());

            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);

            System.out.println("degré de p1: " + p1.getDegree());
            System.out.println("degré de p2: " + p2.getDegree());

            System.out.println("p1 évalué à 2 : " + p1.evaluate(2));
            System.out.println("p2 évalué à 3 : " + p2.evaluate(3));

            MyPolynomial p3 = p1.add(p2);
            System.out.println("p1 + p2: " + p3);

            MyPolynomial p4 = p1.multiply(p2);
            System.out.println("p1 * p2: " + p4);

        }

    public static void TestBigInteger() {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(i1.add(i2));
        System.out.println(i1.multiply(i2));

    }
    public static void TestTime() {
            MyTime myTime = new MyTime();
            System.out.println(myTime.toString());
            myTime.setTime(24,5,40);
            System.out.println(myTime.toString());
            myTime.nexSecond();
            System.out.println(myTime.toString());
            myTime.previousSecond();
            System.out.println(myTime.toString());
    }
    public static void TestDate() {
            Date date;
        date = new Date(2000,0,15);

        System.out.println(date.toString());
    }
}