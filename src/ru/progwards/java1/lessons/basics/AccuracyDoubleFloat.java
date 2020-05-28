package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double pi = 3.14;
        double v = 4 / (3 * pi * radius * radius * radius);
        return v;
    }
    public static float volumeBallFloat(float radius){
        float pi = 3.14f;
        float v = 4 / (3 * pi * radius * radius * radius);
        return v;
    }
    public static double calculateAccuracy(double radius){
        double calculateAccuracy = volumeBallDouble(6371.2) - volumeBallFloat(6371.2f);
        return calculateAccuracy;
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy(6371.2));
    }

}
