package be.intecbrussel;

import java.util.Scanner;

public class BasicProgrammingApp {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        //Get 4 integers from user
        System.out.println("Enter 4 numbers");
        System.out.println("Enter first number");
        int firstNumber = objScanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = objScanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = objScanner.nextInt();
        System.out.println("Enter forth number");
        int forthNumber = objScanner.nextInt();
        // print greater number among 4 integers......
        if (firstNumber >= secondNumber && firstNumber > thirdNumber) {
            if (firstNumber > forthNumber) {
                System.out.println(firstNumber + " is greater number");
            } else {
                System.out.println(forthNumber + " is greater number");

            }

        } else if (secondNumber >firstNumber && secondNumber > thirdNumber) {
            if (secondNumber > forthNumber) {
                System.out.println(secondNumber + " is greater number");
            } else {
                System.out.println(forthNumber + " is greater number");

            }
        }
        else {
            System.out.println(thirdNumber + " is greater number");

        }
        // Print smallest integer among 4 integers ......
        int smallestNumber = 0;
        if (firstNumber <= secondNumber && firstNumber < thirdNumber) {
            if (firstNumber < forthNumber) {
                smallestNumber = firstNumber;
                System.out.println(smallestNumber + " is smallest number");
            } else {
                smallestNumber = forthNumber;

                System.out.println(smallestNumber + " is smallest number");

            }

        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            if (secondNumber < forthNumber) {
                smallestNumber = secondNumber;
                System.out.println(smallestNumber + " is smallest number");
            } else {
                smallestNumber = forthNumber;

                System.out.println(smallestNumber + " is smallest number");

            }
        }

        else {
            smallestNumber = thirdNumber;
            System.out.println(smallestNumber + " is smallest number");

    }

    // print all small numbers to the average of four
        int averageOfFour = (firstNumber+secondNumber+thirdNumber+forthNumber)/4;
        System.out.println("Average of four is " + averageOfFour );
       for(int i = smallestNumber;i<=averageOfFour;i++){
           System.out.println("all numbers from smallest to average are " + i);
       }

 //print all numbers from o to 2000 but when you meet a  number among four numbers, stop loop
        for(int i = 0; i<2000; i++){
            System.out.println("Numbers 0 to 2000 ,stop at any number in that four number " +i);
            if(i == firstNumber||i==secondNumber){
                break;
            }
            else if(i==thirdNumber||i==forthNumber){
                break;
            }
        }
//print all numbers from o to 100; from greatest to smallest AND smallest to greater like : 99-0,.....0-99
        int greaterInSequence = 100;
       int smallerInSequence = 0;
       for(int i = smallerInSequence; i<=greaterInSequence; smallerInSequence++){
           System.out.println(greaterInSequence + " _ " + smallerInSequence);
           greaterInSequence--;
       }

}}
