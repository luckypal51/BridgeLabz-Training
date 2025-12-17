import java.util.*;
public class Calculator{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       float first = input.nextFloat();
       float second = input.nextFloat();
       float add = first+second;
       float sub = first-second;
       double mul = first*second;
       double div = first/second;
       System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+first+" and "+second+" is "+add+", "+sub+", "+mul+", and "+div);
}}