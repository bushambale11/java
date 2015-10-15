/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author Musafiri_J
 */
import java.util.Scanner;
public class Method {
public static void loop()
{

 double number;  
 double sum;     
int count;      
sum = 0;
count = 0;
try 
{
Scanner input=new Scanner(System.in);
while (count<99) { 
number = input.nextDouble();
count++;  
sum += number;
}
catch ( IllegalArgumentException e ) 
 {
		
System.out.println();
System.out.println("Number of data values read: " + count);
		    System.out.println("The sum of the data values: " + sum);
		    if ( count == 0 )
		       System.out.println("Can't compute an average of 0 values.");
		    else
		       System.out.println("The average of the values:  " + (sum/count));
		 }	


    
 public static void main(String[] args) {
        
 Method kol=new Method();
 Method.loop();
 
 
}
}