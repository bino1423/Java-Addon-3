import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 to 100");
        int start,end;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter starting Value: ");
        start=n.nextInt();
        System.out.println("Enter ending Value: ");
        end=n.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(i%2==0){
                System.out.println(i);
            }
            else
            {
                System.out.println("");
            }
        }
    }
}
