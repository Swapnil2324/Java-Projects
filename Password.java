import java.util.Scanner;
class Password
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        int pin1=1234;
        int duration=2000;
        outerloop:
        for(;;)
        {
            int attemp=3;
            do{
                System.out.println();
                System.out.print("Enter Your Pin : ");
                int pin2=sc.nextInt();
                System.out.println();

                if(pin1==pin2)
                {
                    System.out.println("Phone Unloked");
                    break outerloop;
                }
                System.out.println("Wrong pin enter ");
                System.out.println("you have "+(attemp-1)+" attemp left");
                attemp--;
            }while(attemp>0);
            System.out.println("Your Phone has been locked for "+ (duration)/1000);
            Thread.sleep(duration);
            duration*=2;
        }
    }
}