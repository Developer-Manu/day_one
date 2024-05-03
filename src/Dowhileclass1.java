
import java.util.Scanner;

public class Dowhileclass1 {
    public void dowhile1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The Even numbers from "+n+" to 1 are:");

        do
        {
            int num = n%2;
            if(num==0)
             System.out.print(n+" ");
            n = n-1;
        }while(n>1);
    }

    public void dowhile2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        do
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            n = n-1;
        }while(n>=1);
    }

    public void dowhile3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


    }

    public void dowhile4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int num = n;
        for(int i=0;i<n+2;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        while(num>0) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n / 2 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            num = num - 1;
        }
    }

    public void dowhile5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("The prime numbers from 2 to "+n+" are:");

        do{
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    count = 0;
                    break;
                }
                else {
                    count = 1;
                }
            }
            if(count==1)
            {
                System.out.print(n+" ");
            }
            n =  n - 1;
        }while(n>0);
    }
}
