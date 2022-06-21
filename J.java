
package j;




import javax.swing.JOptionPane;
public class J {
	
     public static void main(String[] args) {
        main2();
    }

            
        static  int balance = 0;
        static int accountID;
      static String User; 
  public static void main2(){
      
 JOptionPane.showMessageDialog(null,"ANNYEONGHASEYO HWAN-YEONG AWTSS GEGE BANK" );
  User = JOptionPane.showInputDialog(null,"Create a username:");
 accountID = Integer.parseInt(JOptionPane.showInputDialog("create your account ID:"));
    main3(); 

  }
  

       public static void main3(){         
int panel = Integer.parseInt(JOptionPane.showInputDialog(" ANNYEONGHASEYO HWAN-YEONG AWTSS GEGE BANK \n\n"+ "1. Deposit\n"+ "2. Withdraw\n"+"3. Check Balance\n "));
 switch (panel) {                  
case 1:

                  int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Insert Value:"));
                        if (amount <= 0) {
                            JOptionPane.showMessageDialog(null,"Atleast Deposit 5000, to Continue" );

                        } else {
                             balance += amount;
                            JOptionPane.showMessageDialog(null,"You have added Money to your bank!" );
                        }
                        main3();
                        break;

                  case 2:

                     int amount2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Insert Value:"));
                        if (amount2 <= 0 || amount2 > balance){

                              JOptionPane.showMessageDialog(null,"Can't take action!" );

                        } else {

                             balance -= amount2;

                             JOptionPane.showMessageDialog(null,"You have successfuly withdraw!" );

                        }
  main3();
                        break;

                  case 3:

                        JOptionPane.showMessageDialog(null,"Your Remaining Balance is:"+balance+"\nUser:"+User+"\n AccountID:"+accountID+""); 
  main3();
                        break;

                  default:

                          JOptionPane.showMessageDialog(null,"You have successfuly withdraw!" );
  main3();
                        break;

                  }
}
}

               

            
