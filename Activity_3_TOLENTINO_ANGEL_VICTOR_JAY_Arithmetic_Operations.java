package Tolentino_Angel_Victor_Jay_CompProg;

import java.util.Scanner;

public class Activity_3_TOLENTINO_ANGEL_VICTOR_JAY_Arithmetic_Operations {
    
    public static void main (String[] args){
        
        float x;
        float y;
        float result;
        
        Scanner opt = new Scanner (System.in);
        
        System.out.print("Enter Number To Add: ");
        x = opt.nextFloat();
        
        System.out.print("Enter Another Number To Add: ");
        y = opt.nextFloat();
        
        result = x + y;
        
        System.out.println(x + " + " +y + " = " +result);
        
        System.out.print("Enter Number To Subtract: ");
        x = opt.nextFloat();
        
        System.out.print("Enter Another Number To Subtract: ");
        y = opt.nextFloat();
        
        result = x - y;
        
        System.out.println(x + " - " +y + " = " +result);
        
        System.out.print("Enter Number To Multiply: ");
        x = opt.nextFloat();
        
        System.out.print("Enter Another Number To Multiply: ");
        y = opt.nextFloat();
        
        result = x * y;
        System.out.println(x + " x " +y + " = " +result);
        
        System.out.print("Enter Number To Divide: ");
        x = opt.nextFloat();
        
        System.out.print("Enter Another Number To Divide: ");
        y = opt.nextFloat();
        
        result = x/y;
        System.out.println(x + " / " +y + " = " +result);
        
        
        
        
        
        
        
        
        
        
    }
    
}
