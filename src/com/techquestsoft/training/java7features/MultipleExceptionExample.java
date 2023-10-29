package com.techquestsoft.training.java7features;

public class MultipleExceptionExample {
    public static void main(String args[]) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException::"+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
