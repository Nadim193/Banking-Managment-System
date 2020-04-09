
import java.util.InputMismatchException;
import java.util.Scanner;


public class Current extends Created_Account {
        
    public Current(String n, int acc_num, double balance, String acc_type) {
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
            double current_balance = 0;
            double deposit_balance = 0;
            int aNumber = 0; 
            double wbalance = 0;

            double interset = 0;

            aNumber = (int)(Math.random()*100+100);
            Created_Account user = new Created_Account("USER",0,0,"SAVING");
        
            Scanner input = new Scanner(System.in);
            
                do{
                        type="Current";
                        int user_choose;
                        user.Display_Choose();
                        System.out.println("0. TO QUIT\n");
                        System.out.print("ENTER YOUR CHOOSE : ");
                        user_choose = input.nextInt();
                        System.out.println("");
                        switch(user_choose){
                            
                            case 1:
                                System.out.print("ENTER YOUR NAME : ");
                                user_name=input.next();
                                System.out.print("ENTER YOUR AMOUNT : $");
                                balances = input.nextInt();
                                user.insert(user_name,aNumber,balances);
                                System.out.println("");
                                System.out.println("YOUR ACCOUNT DETAILS...\n");
                                user.display_details();
                                System.out.println("ACCOUNT TYPE : "+type+"\n");
                                System.out.println("DON'T FORGET YOUR ACCOUNT NUMBER");
                                System.out.println("");
                                break;
                                
                            case 2:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                        System.out.print("ENTER YOUR INTEREST % : ");
                                        interset=input.nextDouble();
                                        System.out.println("SUCCESSFULLY CHANGE...\n");
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
                                    current_balance=(deposit_balance+balances);
                                    System.out.println("SUCCESSFULLY DEPOSITED.\n");
                                    System.out.println("YOUR ACCOUNT BALANCE IS : $"+(current_balance*(1+interset))+"\n");
                                }
                                else
                                    System.out.println("WRONG ACCOUNT NUMBER.");
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
                                    if(current_balance<100||withdrow>current_balance){
                                                System.out.println("INSUFFICIENT BALANCE....");
                                                System.out.println("DEPOSIT SOME MONEY\n");
                                    }
                                    else{
                                        
                                        wbalance=((current_balance*(1+interset))-withdrow);
                                        System.out.println("SUCCESSFULLY WITHDRAW..\n");
                                        System.out.println("YOUR CURRENT BALANCE IS : $"+wbalance+"\n");
                                    }
                                }
                                else{
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                }
                                break;
                                
                            case 5:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                if(account_number==aNumber){
                                    System.out.println("YOUR CURRENT BALANCE IS : $"+wbalance);
                                }
                                else{
                                    System.out.println("WRONG ACCOUNT NUMBER.");
                                }
                                System.out.println("");
                                break;
                            case 6:
                                
                                System.out.print("ENTER YOUR ACCOUNT NUMBER : ");
                                account_number=input.nextInt();
                                System.out.println("");
                                if(account_number==aNumber){
                                    user.account_Balance=wbalance;
                                    user.display_details();
                                    System.out.println("ACCOUNT TYPE : "+type+"\n");
                                }
                                else
                                    System.out.println("WRONG ACCOUNT NUMBER.");
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
