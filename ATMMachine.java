package ATMMachine;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN  = 1221;

    public void checkpin(){
        System.out.println("Enter Your PIN:");
        Scanner sc = new Scanner(System.in);
        int enter_PIN = sc.nextInt();
        if(enter_PIN==PIN){
            Menu();
        }
        else{
            System.out.println("Enter a valid PIN");
            Menu();
        }
    }
        public void Menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1.Check Account Balance");
        System.out.println("2.Widthdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            WidthdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
        }
     
        public void checkBalance(){
            System.out.println("Balance:"+Balance);
            Menu();
        }
        public void WidthdrawMoney(){
            System.out.println("Enter Amount to withdrw:");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount>Balance){
                System.out.println("Insufficient Balance");
            }
            else{
                Balance=Balance-amount;
                System.out.println("Money Withdraw Successfully");
            }
           Menu();
        }

        public void depositMoney(){
            System.out.println("Enter the Amount:");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance=Balance+amount;
            System.out.println("Money Deposited Successfully");
            Menu();

        }
        
}


public class ATMMachine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}