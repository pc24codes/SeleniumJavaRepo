package com.seleniumjava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        try{
            System.out.println("Inside the try block");
            int result = 10/0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Inside the catch block");
            System.out.println("Catch block code: "+e.getMessage());
            //throw new RuntimeException("Run time exception");
        }
        finally {
            System.out.println("this is finally block");
        }




    }
}