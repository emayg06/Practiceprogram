import java.util.Scanner;

public class Monday {
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        Mond m = new Mond();
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        m.setAlarm(scan.nextLine());        
        m.showAlarm();
        
    }
    
    
}

   

