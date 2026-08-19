/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowershop;

import java.util.Scanner;

/**
 *
 * @author siphoesihle
 */
public class FlowerShop {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[]days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        
        
           String[] Flowers = {"Roses","Tulips","Liles"} ;
           
           
           
             int[][] sales = new int[7][3];
             
             
             
             System.out.println("The Flower Shop");
             System.out.println("--------------------");
             
             
             
             
             for (int i = 0; i < 7; i++){
                 System.out.println("Enter sales for " + days[i]);
                 
             for (int j = 0; j < 3; j++){
                 System.out.print("Enter " + Flowers[j] +  "sales:");
                 sales[i][j] = input.nextInt();
                 
               }
             
             }
           
   
             
             System.out.println("               Flower Shop Weekly Sales Report");
             System.out.println("==============================================");
             
             System.out.printf("%-12s %-10s %-10s %-10s %-10s%n","Days","Roses", "Tulips", "Lilies", "Total");
             System.out.println("-------------------------------------------");
             
             int RosesTotal = 158;
             int TulipsTotal = 112;
             int LiliesTotal = 80;
             
            
             int OverallTotal = 350;
              
             
             for (int i = 0; i < 7; i++){  
                 
                 int dailyTotal = 0;
                 
             for (int j = 0; j < 3; j++){
                 
                 dailyTotal = dailyTotal + sales[i][j];
                 
                 if (j==0){
                     
                 RosesTotal = RosesTotal + sales[i][j];
                 }
                 else if (j==1){
                 
                 TulipsTotal = TulipsTotal + sales[i][j];  
                  }
                 else if (j==2){
                   
                  LiliesTotal = LiliesTotal + sales[i][j];
                         
                 }
             }
              
                  OverallTotal = OverallTotal + dailyTotal;
             
                  System.out.printf("%-12s %-10d %-10d %-10d %-10d%n",days[i], sales[i][0], sales[i][1],sales[i][2],dailyTotal);
                  
             }
                  
                  System.out.println("---------------------------------------------------------");
                          
                  System.out.printf("%-12s %-10d %-10d %-10d %-10d%n","Total",RosesTotal,TulipsTotal,LiliesTotal,OverallTotal);
                  
                  System.out.println("Total of sales for Roses: " + RosesTotal);
                  System.out.println("Total of sales for Tulips: " + TulipsTotal);
                  System.out.println("Total of sales for Lilies: " + LiliesTotal);
                  
                  System.out.println("Overall total sales for the week: R" + OverallTotal);
                  
             
                  input.close();
                  
                 }
                 
             }
     
             
             
    
