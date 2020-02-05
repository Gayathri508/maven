package com.epamwork.maven_demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Chocolates c1 = new Chocolates(60,100,"DairyMilk");
        Chocolates c2 = new Chocolates(25, 15,"kitkat");
        Chocolates c3 = new Chocolates(10,10, "perk");
        Chocolates c4 = new Chocolates(50,25, "5star");
        Sweets s1 = new Sweets(20, 80);
        Sweets s2 = new Sweets(70, 100);
        Sweets s3 = new Sweets(30, 50);
        Sweets s4 = new Sweets(60, 40);
        Class1 g = new Class1();
        System.out.println("Total Weight:"+g.getWeight());
        System.out.println("Sorting chocolates based on price: ");
        Chocolates c = new Chocolates();
        c.sortChocolates();
        c.getChocolatesInRange(1, 100); 
    }
}
