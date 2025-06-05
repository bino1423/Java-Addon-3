import java.util.*;
class Interest {
    public static void main(String[] args) {
        int p,r,t,si;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        p=n.nextInt();
        System.out.println("Enter Rate of Interest: ");
        r=n.nextInt();
        System.out.println("Enter Time in years: ");
        t=n.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple Interest is :"+si);
    }
}