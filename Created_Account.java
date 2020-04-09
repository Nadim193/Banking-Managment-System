
public class Created_Account extends Account{
            
            Created_Account(String n, int acc_num, double balance,String acc_type){
                            name=n;
                            account_number=acc_num;
                            account_Balance=balance;
                            account_type=acc_type;
            }

            void insert(String n, int acc_num, double balance){
                            name=n;
                            account_number=acc_num;
                            account_Balance=balance;
            }

            void display_details(){
                            System.out.println("DEPOSITOR NAME :" +name);
                            System.out.println("ACCOUNT NUMBER : "+account_number);
                            System.out.println("ACCOUNT BALANCE : "+account_Balance+"$");
            }
}
