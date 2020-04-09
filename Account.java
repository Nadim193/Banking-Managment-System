
public class Account {
            String name,account_type;
            int account_number;
            double account_Balance;
            
        Account(){
            
        }
            
        Account(String n,int acc_num,double balance,String acc_type){
            
                            name = n;
                            account_number = acc_num;
                            account_Balance = balance;
                            account_type = acc_type;
                            
        }
        void Display_Choose(){
                  System.out.println("1. CREATE ACCOUNT");
                  System.out.println("2. CHANGE YOUR INTEREST");
                  System.out.println("3. DEPOSIT MONEY");
                  System.out.println("4. WITHDRAW MONEY");
                  System.out.println("5. CHECK BALANCE");
                  System.out.println("6. ACCOUNT DETAILS");
        }
}
