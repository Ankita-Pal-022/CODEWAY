package com.wipro.test;


import java.util.Scanner;

public class Average {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Grade Calculator");
	        while (true) {
	        	System.out.println("Enter Marks obtaied in Sub1 out of 100");
	            int Maths = sc.nextInt();
	            System.out.println("Enter Marks obtaied in Sub2 out of 100");
	            int Phy = sc.nextInt();
	            System.out.println("Enter Marks obtaied in Sub3 out of 100");
	            int Chem = sc.nextInt();
	            System.out.println("Enter Marks obtaied in Sub4 out of 100");
	            int Bio = sc.nextInt();	            int All=(Maths+Phy+Chem+Bio);
	            //Calculate Average Percentage:
	            int total=(All/4)%100;
	            if(total<=100 && total>=90) {
	            	System.out.println("You have  recieved O Grade");
	            }
	            else if(total<=90 && total>=80){
	            	System.out.println("You have  recieved E Grade");
	            }
	            else if(total<=80 && total>=70){
	            	System.out.println("You have  recieved A Grade");
	            }
	            else if(total<=70 && total>=60){
	            	System.out.println("You have recieved B Grade");
	            }
	            else if(total<=60 && total>=50){
	            	System.out.println("You have recieved C Grade");
	            }
	            else if(total<=50 && total>=40){
	            	System.out.println("You have recieved D Grade");
	            }
	            else {
	            	System.out.println("Try next Year!!");
	            	System.out.println("You Have Failed!!");
	            	
	            }
	           System.out.println("Your Total Marks obtained is "+All);
	           System.out.println("Your Avg percentage obtained is "+total);
	            System.out.print("\nDo you want to calculate again? (yes/no): ");
	            String playAgain = sc.next().toLowerCase();
	            if (!playAgain.equals("yes")) {
	                System.out.println("\nThanks for Calculating!");
	     
	                break;
	        }
     sc.close();
}

}
}