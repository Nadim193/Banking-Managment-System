
import java.util.InputMismatchException;

import java.util.Scanner;


public class Main {
    
        public static void main(String[] args) {
            boolean flag = false;
            
          while(flag==false){
              
                try{    

                  boolean full_quit = false;

                  int type_choose;

                  Scanner input = new Scanner(System.in);

                  do{
                      System.out.println("\n\n**........WELCOME TO BANK MANAGEMENT SYSTEM.........**\n\n");
                      System.out.println("WHAT TYPE OF ACCOUNT DO YOU WANT TO CREATED....\n\n");
                      System.out.println("1.CURRENT");
                      System.out.println("2.SAVING");
                      System.out.println("0.TO QUIT\n");
                      System.out.print("ENTER YOUR CHOOSE : ");
                      type_choose=input.nextInt();
                      System.out.println("");

                      switch (type_choose) {
                          case 1:

                              Current cu = new Current("USER",0,0,"SAVING");

                              break;
                          case 2:

                              Saving sav = new Saving("USER",0,0,"SAVING");

                              break;
                          case 0:

                              full_quit=true;

                              break;
                          default:

                              System.out.println("WRONG CHOOSE.");

                              break;
                      }
                  }
                  while(!full_quit);
                      System.out.println("\n\nTHANK YOU.....\n");
               }
               catch(InputMismatchException ex){
                         System.out.println(ex);
                         continue;
              }
               flag=true;
       }
    }
}
