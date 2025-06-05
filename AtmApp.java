import java.util.*;
class AtmApp {
    public static void main(String[] args) {
        int pin=1234,bal=50000,pn,wd;
        Scanner n =new Scanner(System.in);
        System.out.println("Enter 4 digit pin number: ");
        pn=n.nextInt();
        if(pn==pin){
           
            System.out.println("Enter Withdrawal amt: ");
            wd=n.nextInt();
             if(bal>=wd){
            System.out.println("The amt is withdrawed"+"\nThe available balance is "+(bal-wd));
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Invalid Pinnumber ");
        }
    }
}