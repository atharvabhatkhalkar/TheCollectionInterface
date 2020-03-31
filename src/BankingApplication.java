
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*; 
import java.util.Random; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atharva
 */

class connectionDatabase{

    public void connectionToDatabase(){


  Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }

    }

}

class createAccount extends connectionDatabase{
public int AccountNumber;
public String Name;
public int Pin;
public int Money;

    public void createAccounts() throws SQLException {
      Random rand = new Random();    
    this.AccountNumber = rand.nextInt(1000000000);
      Set<Integer> objoflist = new TreeSet<Integer>();


      for(Integer i:objoflist){
          if(AccountNumber==i){
              new createAccount();
          }
      }
          if(objoflist.isEmpty()){
      objoflist.add(AccountNumber);


    Random rand2 = new Random();    
    this.Pin = rand.nextInt(9999);
     Set<Integer> objoflist2 = new TreeSet<Integer>();


      for(Integer j:objoflist2){
          if(Pin==j){
              new createAccount();
          }
      }
          if(objoflist.isEmpty()){
      objoflist.add(Pin);
      }
      System.out.println("Please enter your namen\n");
        Scanner sobj = new Scanner(System.in);
        Name = sobj.nextLine();
        System.out.println(Name);


  Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }

          Statement stmt = conn.createStatement();

          String sql="INSERT INTO ICICI_BANK values("+AccountNumber+ ", '"  +Name + "',"+Pin +",0)";

          /*String sql = "INSERT INTO ICICI_BANK(account_number,accountholdername,atm_pin,account_balance) "
                + "VALUES " + "(" + AccountNumber + ", " + Name + ", " + Pin + ", " + 0 + ")";*/
            stmt.executeUpdate(sql);

              System.out.println("Congratualtions your account has been created \n");
              System.out.println("Your Account Number is "+AccountNumber+"\n");
              System.out.println("Your Account PIN is "+Pin+"\n Please dont share this PIN with anybody!\n");
    }       
    }

    public void ministatement() throws SQLException{
    System.out.println("Please enter the Account Number & Pin");
        Scanner sobj = new Scanner(System.in);
        Scanner sobj2 = new Scanner(System.in);
       int checkAccountnumber= sobj.nextInt();
       int checkPin= sobj.nextInt();
      Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }

          Statement stmt = conn.createStatement();


        String sql="SELECT account_number,account_balance,atm_pin from ICICI_BANK WHERE account_number= "+checkAccountnumber+ "";
         ResultSet rs = stmt.executeQuery(sql);
         int accountNumber=0; 
         float accountBalance=0;
         int accountPin=0;
         while(rs.next()){
         //Retrieve by column name
         accountPin = rs.getInt("atm_pin");
         accountNumber  = rs.getInt("account_number");
         accountBalance = rs.getFloat("account_balance");
        }
         if(accountPin!=checkPin){
             System.out.println("You have entered wrong PIN for Account Number :"+accountNumber+" please try again later");
             return;
         }

           System.out.println("The Balance for Account Number "+accountNumber +" is $"+accountBalance + " ");
           System.out.println("\n\n");
    }

    public void depositMoney() throws SQLException{

        System.out.println("Please enter the Account Number & Pin");
        Scanner sobj = new Scanner(System.in);
        Scanner sobj2 = new Scanner(System.in);
       int checkAccountnumber= sobj.nextInt();
       int checkPin= sobj.nextInt();
      Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }

          Statement stmt = conn.createStatement();


        String sql="SELECT account_number,account_balance,atm_pin from ICICI_BANK WHERE account_number= "+checkAccountnumber+ "";
         ResultSet rs = stmt.executeQuery(sql);
         int accountNumber=0; 
         float accountBalance=0;
         int accountPin=0;
         float money=0;
         while(rs.next()){
         //Retrieve by column name
         accountPin = rs.getInt("atm_pin");
         accountNumber  = rs.getInt("account_number");
         accountBalance = rs.getInt("account_balance");
        }
         if(accountPin!=checkPin){
             System.out.println("You have entered wrong PIN for Account Number :"+accountNumber+"");
             return;
         }
         else
         {
             System.out.println("Please Enter the amount to Deposit less than 1Lac\n");
             Scanner sobj3 = new Scanner(System.in);
             money=sobj3.nextInt();
             if(money>100001||money<1){
                 System.out.println("Invalid Amount please try again later\n");
                 return;
             }
              stmt = conn.createStatement();

             String sqlt="UPDATE ICICI_BANK SET account_balance="+(money+accountBalance)+"";

              stmt.executeUpdate(sqlt);
              conn.close();
         }
        System.out.println("Amount Successfully Deposited\n");
    }

    public void withdrawMoney() throws SQLException{

          System.out.println("Please enter the Account Number & Pin");
        Scanner sobj = new Scanner(System.in);
        Scanner sobj2 = new Scanner(System.in);
       int checkAccountnumber= sobj.nextInt();
       int checkPin= sobj.nextInt();
      Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }

          Statement stmt = conn.createStatement();


        String sql="SELECT account_number,account_balance,atm_pin from ICICI_BANK WHERE account_number= "+checkAccountnumber+ "";
         ResultSet rs = stmt.executeQuery(sql);
         int accountNumber=0; 
         int accountBalance=0;
         int accountPin=0;
         int money=0;
         while(rs.next()){
         //Retrieve by column name
         accountPin = rs.getInt("atm_pin");
         accountNumber  = rs.getInt("account_number");
         accountBalance = rs.getInt("account_balance");
        }
         if(accountPin!=checkPin){
             System.out.println("You have entered wrong PIN for Account Number :"+accountNumber+"");
             return;
         }
         else
         {
             System.out.println("Please Enter the amount to withdraw less than 20 Thousands\n");
             Scanner sobj3 = new Scanner(System.in);
             money=sobj3.nextInt();
             if(money>20000||money<100){
                 System.out.println("Invalid Amount please try again later\n");
                 return;
             }
              stmt = conn.createStatement();
             if(accountBalance<money){
                 System.out.println("You do not have sufficient balance in your account please try again leter\n");
                 return;
             }
             String sqlt="UPDATE ICICI_BANK SET account_balance="+(accountBalance-money)+"";

              stmt.executeUpdate(sqlt);
              conn.close();
         }
        System.out.println("Amount Successfully Withdrawn\n");
        
    }

    public void accountBalance() throws SQLException {

        System.out.println("Please enter the pin");
        Scanner sobj = new Scanner(System.in);
       int checkPin= sobj.nextInt();
      Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }

          Statement stmt = conn.createStatement();


        String sql="SELECT account_number,account_balance from ICICI_BANK WHERE atm_pin= "+checkPin+ "";
         ResultSet rs = stmt.executeQuery(sql);
         int accountNumber=0;
         int accountBalance=0;
         while(rs.next()){
         //Retrieve by column name
         accountNumber  = rs.getInt("account_number");
         accountBalance = rs.getInt("account_balance");

        }

    }




    }


class Balance{

}

public class BankingApplication {
    private int accountNumber;
    private int pinNumber;
    public static void main(String[] args) throws SQLException{
        connectionDatabase objofcon = new connectionDatabase();
        objofcon.connectionToDatabase();
        boolean bool=true;
       while(bool){

           System.out.println("Please Enter from the Menu");
           System.out.printf("1.Create Account \t 2.Mini Statement \t 3.Withdraw Money \t 4.Deposit Money \t 5. Exit\n2");
           Scanner sobj = new Scanner(System.in);
           int ch=sobj.nextInt();

           switch(ch){

               case 1:createAccount cr = new createAccount();
                      cr.createAccounts();
                      break;
               case 2:createAccount cr2 = new createAccount();
                      cr2.ministatement();
                      break;
               case 3:createAccount cr3 = new createAccount();
                      cr3.withdrawMoney();
                      break;
               case 4:createAccount cr4 = new createAccount();
                      cr4.depositMoney();
                      break;
               case 5:bool=false;      
           }

       }

    }

}

