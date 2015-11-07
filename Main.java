package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c;
        double delta;
        a=2;
        b=-3;
        c=-8;
        delta=b*b-4*a*c;
        double odelta,x1,x2,x;
        odelta=Math.sqrt(delta);
        if(odelta<0) {
                        System.out.print("równanie nie ma pierwiastków");}

               if(odelta==0){
                   x=(-b/2*a);
                   System.out.print("rówananie ma jeden pierwiastek x="+x) ;
               }
                if(odelta>0){
                    x1=((-b-odelta)/2*a);
                    x2=((-b+odelta)/2*a);
                    System.out.print("równanie ma dwa pierwiastki x1="+x1+ " x2="+x2);
                }

    }
}
