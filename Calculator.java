import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int flag=1;
        do{
            System.out.println("------Calculator----");
            System.out.println("1 : ADDITION ");
            System.out.println("2 : SUBSTRACTION ");
            System.out.println("3 : MULTIPLICATION ");
            System.out.println("4 : DIVISION ");
            System.out.println("5 : MODULES ");
            System.out.print("ENTER YOUR OPTION : ");
            int num=sc.nextInt();
            System.out.print("ENTER FIRST NUMBER : ");
            int num1=sc.nextInt();
            System.out.print("ENTER SECOND NUMBER : ");
            int num2=sc.nextInt();

            switch(num)
            {
                case  1:
                    ADDITION(num1,num2);
                    break;
                case 2:
                    SUBSTRACTION(num1,num2);
                    break;
                case 3:
                    MULTIPLICATION(num1,num2);
                    break;
                case 4:
                    DIVISION(num1,num2);
                    break;
                case 5:
                    MODULES(num1,num2);
                    break;
                default:
                    System.out.println(" WRONG INPUT ");
                    break;
            }

            System.out.print("DO YOU WANT TO CONTINUE(0/1) : ");
            flag=sc.nextInt();
        
        }while(flag==1);
    }
    public static void ADDITION(int num1,int num2)
    {
        int op=num1+num2;
        System.out.println("ADDITION OF "+num1+" AND "+num2+" IS "+op);
    }
    public static void SUBSTRACTION(int num1,int num2)
    {
        int op=num1-num2;
        System.out.println("SUBSTRACTION OF "+num1+" AND "+num2+" IS "+op);
    }
    public static void MULTIPLICATION(int num1,int num2)
    {
        int op=num1*num2;
        System.out.println("MULTIPLICATION OF "+num1+" AND "+num2+" IS "+op);
    }
    public static void DIVISION(int num1,int num2)
    {
        int op=num1/num2;
        System.out.println("DIVISION OF "+num1+" AND "+num2+" IS "+op);
    }
    public static void MODULES(int num1,int num2)
    {
        int op=num1%num2;
        System.out.println("MODULES OF "+num1+" AND "+num2+" IS "+op);
    }
}