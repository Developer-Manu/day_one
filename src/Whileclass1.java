import java.util.Scanner;

public class Whileclass1 {
    public void class6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("The even numbers in between 0 to "+num+" are:");
        while(num > 0){
            if(num % 2 == 0){
                System.out.print(num+" ");
                }

                num = num - 1;
            }
        }


    public void class7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;

        System.out.println("The total number of prime numbers in between 0 to "+num+" are:");
        while(num >= 2)
        {
            for(int i=2;i<=num/2;i++)
            {

                if(num%i == 0)
                {
                   count = 0;
                   break;
                }
                else
                {
                    count = 1;
                }

            }
            sum = sum + count;
            num = num - 1;
        }
        System.out.println(sum);

    }

    public void class8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n = num;
        while(num > 0)
        {
            int i = 0;
            for( ; i<num; i++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
            num = num - 1;
        }
    }

    public void class9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n = num;

        System.out.println("The binary code for the given number is:");
        while(num > 0)
        {

            System.out.print("# ");
            for(int i=1;i<n;i++)
            {
                System.out.print(" ");
            }
            System.out.print(" #");
            System.out.println();
            num = num - 1;
        }
    }

    public void class10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in between 0 to 20:");
        int num = sc.nextInt();

        while(num > 0)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(num+" * "+i+" = "+num*i);
            }
            num = num - 1;
        }
    }

}
