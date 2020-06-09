package ru.progwards.java1.lessons.basics;



public class ReverseDigits {
    public static int reverseDigits(int number){
        int number1 = number % 10;
        int number2 = (number / 10)%10;
        int number3 = number / 100;

        return number = (number1 * 100) + (number2 * 10) + (number3);

    }

    public static void main(String[] args) {

        System.out.println(reverseDigits(257));
    }
}

