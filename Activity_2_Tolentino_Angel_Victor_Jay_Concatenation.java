package Tolentino_Angel_Victor_Jay_CompProg;

import java.util.Scanner;

public class Activity_2_Tolentino_Angel_Victor_Jay_Concatenation {
    
    public static void main (String[] args){
        
        Scanner names = new Scanner (System.in);
        
        String FirstName;
        String MiddleInitial;
        String LastName;
        int age;
        String result;
        
        System.out.print("First Name: ");
        FirstName = names.nextLine();
        
        System.out.print("Middle Initial: ");
        MiddleInitial = names.nextLine();
        
        System.out.print("Last Name: ");
        LastName = names.nextLine();
        
        System.out.print("Age: ");
        age = names.nextInt();
        
        result = FirstName + " " + MiddleInitial + " " + LastName + " " +age + ".";
        
        System.out.println();
        
         System.out.println("You Are: " +result);
        
        
    }
    
}
