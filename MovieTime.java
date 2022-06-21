import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class MovieTime{

 public static void main(String [] args){
 
  Scanner scan = new Scanner(System.in);
  
 Queue movies = new LinkedList();
 Queue snacks = new LinkedList();
 
 
 System.out.print("Enter movie 1 of 3: ");
 movies.offer(scan.nextLine());
 
 System.out.print("Enter movie 2 of 3: ");
 movies.offer(scan.nextLine());
 
 System.out.print("Enter movie 3 of 3: ");
 movies.offer(scan.nextLine());
 
 System.out.print("Enter snacks 1 of 3: ");
 snacks.offer(scan.nextLine());
 
 System.out.print("Enter snacks 2 of 3: ");
 snacks.offer(scan.nextLine());
 
 System.out.print("Enter snacks 3 of 3: ");
 snacks.offer(scan.nextLine());
 
 
 System.out.println("Movies to watch are :  deque" + " ( "  + movies + " ) ");
 System.out.println("Snacks available are : deque" + " ( "  + snacks + " ) ");
 System.out.println("Press S each time you finish a snack. ");
 
 
     
     int op = 3;
     
     for (int b = 1; b <= op; b--)
     {
         
         char ekis = scan.next().charAt(0);
         
         if ( ekis == 'S' || ekis == 's')
         {
                 snacks.poll ();
                 if(snacks.isEmpty())
             {
                 System.out.println("No more snacks");
                 break;
             }
                  else
				  {
                         System.out.println(" deque " + " ( " + snacks + " ) ");
                     }
                 
             
         }     
     }     
 }     

}        


