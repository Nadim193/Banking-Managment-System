
import static java.lang.Math.pow;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Saving extends Created_Account {
    
    public Saving(String n, int acc_num, double balance, String acc_type) {
        super(n, acc_num, balance, acc_type);
        
      boolean flag = false;
      
      while(flag==false){
          
          try{
            boolean manu_quit = false;
       
            String user_name;
            String type = null;

            double balances = 0;
            int account_number;
            double withdrow = 0;
            int type_choose;
            double current_balance = 0;
            double deposit_balance = 0;
            int aNumber = 0; 
            double wbalance = 0;
            int year=0;

            double interset = 0;

            aNumber = (int)(Math.random()*100+100);
            Created_Account user = new Created_Account("USER",0,0,"SAVING");
        
            Scanner input = new Scanner(System.in);
          
                do{
                        type="Saving";
                        int user_choose;
                        user.Display_Choose();
                        System.out.println("7. CHECK YOUR FUTURE BALANCE");
                        System.out.println("0. TO QUIT\n");
                        System.out.print("ENTER YOUR CHOOSE : ");
                        user_choose = input.nextInt();
                        System.out.println("");
                        switch(user_choose){
                            
                            case 1:
                                        System.out.print("ENTER YOUR NAME : ");
                                        user_name=input.next();
                                        System.out.print("ENTER YOUR AMOUNT : $");
                                        balance = input.nextInt();
                                        user.insert(user_name,aNumber,balance);
                                        System.out.println("");
                                        System.out.println("YOUR ACCOUNT DETAILS...\n");
                                        user.display_details();
                                        System.out.println("ACCOUNT TYPE : "+type+"\n");
                                        System.out.println("DON'T FORGET YOUR ACCOUNT NUMBER\n");
                                break;
                                
                            case 2:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                    try{
                                        System.out.print("ENTER YOUR INTEREST % : ");
                                        interset=input.nextDouble();
                                        System.out.println("SUCCESSFULLY CHANGE...\n");
                                    }
                                     catch(InputMismatchException e){
                                             System.out.println(e);
                                             continue;
                                    }
                                }
                                else
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                break;
                                
                            case 3:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                    System.out.print("ENTER AMOUNT OF MONEY : "+"$");
                                    deposit_balance=input.nextInt();
                                    user.account_Balance=deposit_balance;
                                    current_balance=(deposit_balance+balance);
                                    System.out.println("SUCCESSFULLY DEPOSITED.\n");
                                    System.out.println("YOUR ACCOUNT BALANCE IS : $"+(current_balance*(1+interset)));
                                }
                                else
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                System.out.println("");
                                break;
                                
                            case 4:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                    
                                    if(current_balance==0){
                                        System.out.print("YOUR ACCOUNT BALANCE IS EMPTY.");
                                    }
                                    else{
                                        
                                        System.out.print("ENTER AMOUNT OF MONEY : "+"$");
                                        withdrow=input.nextInt();
                                    }
                                    if(withdrow<current_balance){
                                        wbalance=((current_balance*(1+interset))-withdrow);
                                        System.out.println("SUCCESSFULLY WITHDRAW..");
                                        System.out.println("YOUR CURRENT BALANCE IS : "+wbalance);
                                    }
                                    else
                                        System.out.println("INSUFFICIENT BALANCE....");
                                }
                                else{
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                }
                                System.out.println("");
                                break;
                                
                            case 5:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                    System.out.println("YOUR CURRENT BALANCE : $"+wbalance);
                                }
                                else
                                    System.out.println("WRONG ACCOUNT NUMBER.");   
                                System.out.println("");
                                break;
                            case 6:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                System.out.println("");
                                if(account_number==aNumber){
                                    user.account_Balance=wbalance;
                                    user.display_details();
                                    System.out.println("ACCOUNT TYPE : "+type);
                                }
                                else
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                System.out.println("");
                                break;
                                
                            case 7:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                    System.out.println("YOUR CURRENT BALANCE IS : $"+wbalance+"\n");
                                    System.out.print("INPUT YEAR : ");
                                    year=input.nextInt();
                                    System.out.println("AFTER "+year+" YEAR");
                                    System.out.println("YOUR BALANCE WILL BE : $"+(wbalance*pow((1+interset),year)));
                                }
                                else    
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                System.out.println("");
                                break;
                            case 0:
                                manu_quit = true;
                                break;
                            default:
                                System.out.println("WRONG CHOOSE.");
                                break;
                        }
                }
                 while(!manu_quit);
         }
         catch(InputMismatchException e){
                      System.out.println(e);
                      continue;
        }
           flag=true;
       }
    }  
}
