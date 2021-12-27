package com.almocode;

import java.util.Scanner;
public class MyClass {

    public static void main(String[] args){
        /* attempting to make a program get into from the user for a list of employee names
            and there rate and there shows all the names and rate together and also which one
            of them who got the top rate and the last one on the list too
        */
        Scanner scan = new Scanner(System.in);
        String[] empNames = new String[6];
        double[] grades = new double[6];
        double topResult = grades[0];
        double minResult = grades[0];
        String topEmp = empNames[0];
        String minEmp = empNames[0];

        for (int x = 0; x < empNames.length; x++){
            System.out.println("Enter name of empolyee number: " + (x + 1));
            empNames[x] = scan.next();
            System.out.println("what is rate did " + empNames[x] + " got?");
            grades[x] = scan.nextInt();
        }
        /*
        System.out.println("Do you like to show the results now?\n" + "Y or N");
        showResults = scan.next();
        if (showResults == "yes"){
            */
      
        System.out.println("The result -----------------");
        for (int y = 0; y < empNames.length; y++){
            System.out.println("Name: " + empNames[y] + " got rate " + grades[y]);
            if (grades[y] > topResult){
                topResult = grades[y];
                topEmp = empNames[y];
            }
            if (grades[y] < minResult){
                minResult = grades[y];
                minEmp = empNames[y];
            }
         }

        System.out.println("and the top performance award goes to Mr: " + topEmp + " for rate " + topResult);
        System.out.println("the minimum points was : " + minResult + " it was for " + minEmp);

        // show the top result


    }
}
