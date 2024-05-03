import java.util.Scanner;

public class Forclass1 {

    public void class1(){
        for(int i=0; i<10; i++ )
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
    }

    public void class2(){
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void class3(){
        for(int i=0; i<=10; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void class4(){
        for(int i=10; i>=0; i--)
        {
            for(int j=i; j>=0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void class5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++)
        {
            sum += i;
        }
        System.out.println("The sum of first " +num+ " numbers is: " +sum);
    }

    public void class11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for(int i=1; i<num;i++)
        {
            for(int j=1; j<num-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
