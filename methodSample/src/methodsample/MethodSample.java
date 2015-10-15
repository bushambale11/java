 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodSample;

/**
 *
 * @author bushambale rusimbana
 */import java.util.Scanner;
public class MethodSample {

    /**
     * @param args the command line arguments
     */
   public static void PrintFormalName() {
      
       
       Scanner keyboard = new Scanner(System. in);
System. out.print("Input your name as, first last: ");
String firstName = keyboard.next();
String lastName = keyboard.next();
System. out.println("Hello " + firstName + " " + lastName);
System. out.println("Your formal name is " + lastName + ", " + firstName);
        // TODO code application logic here
    }
    public static void main(String[] args) {
     MethodSample object=new MethodSample();
     object.PrintFormalName();

//PrintFormalName(firstName, lastName);
}
}
