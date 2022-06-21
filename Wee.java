import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Wee{

   public static void main (String [] args){
   LocalDateTime myDateObj = LocalDateTime.now();
   DateTimeFormatter myFormatObj =DateTimeFormatter.ofPattern("MMM-dd-yyyy HH:mm:ss");//This codes is for putting present time
   String formattedDate = myDateObj.format(myFormatObj);
   System.out.println(formattedDate);
   
   Scanner s = new Scanner(System.in);
   String username,password,age;
   int birthday;
   
   /*System.out.println("Enter your username: "); //This codes is asking your username
   username = s.nextLine ();
   */
   System.out.println("Enter your password: ");
   password = s.nextLine() ;
   System.out.println("Enter your age: ");
   age = s.nextLine() ;
   System.out.println("Enter your birthday: ");
   birthday = s.nextInt ();
   System.out.println("WELCOME TO HELLO WORLD");
   
   
   
   }																	


}