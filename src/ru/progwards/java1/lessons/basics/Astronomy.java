package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r){
        double pi = 3.14;
        double s = 4 * pi * r * r;
        return s;
    }
    public static Double earthSquare(){
        double earthSquare = sphereSquare(6371.2);
        return earthSquare;
    };
    public static Double mercurySquare(){
        double mercurySquare = sphereSquare(2439.7);
        return mercurySquare;
    }
    public static Double jupiterSquare(){
        double jupiterSquare = sphereSquare(71492.0);
        return jupiterSquare;
    }
    public static Double earthVsMercury(){
        double earthVsMercury = earthSquare() / mercurySquare();
        return earthVsMercury;
    }
    public static Double earthVsJupiter(){
        double earthVsJupiter = earthSquare() / jupiterSquare();
        return earthVsJupiter;
    }

    public static void main(String[] args) {
        System.out.println(sphereSquare(6371.2));
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}
