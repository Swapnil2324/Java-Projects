import java.util.*;
class Bank
{
    static String username;
    static long mobile;
    static String pan;
    static long adhar;
    static String address;
    static int pin ;
    static double bal;
    final static long accountNumber=1234567890876l;
    final static String ifscCode="LCF1234";
    static ArrayList<String> statement =new ArrayList<>();
    public static void main(String[] args)
    {
        welcome();
    }
    public static void welcome()
    {
        for( ; ;)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println();
            System.out.println("         ***** WELCOME ***** ");
            System.out.println();
            System.out.println("         LAXMI CHIT FUND  ");
            System.out.println();
            System.out.println("1. Exsisting User ");
            System.out.println("2. Create Bank Account ");
            System.out.println();
            System.out.print("Enter a option : ");
            int opt=sc.nextInt();
            switch(opt)
            {
                case 1: login(sc);break;
                case 2: createAccount(sc);break;
                default:System.out.println("Wrong Option Entered ");
            }
        }
    }
    public static void login(Scanner sc)
    {
        if(username!=null)
        {
           for(int i=1;i<=3;i++)
           {
                System.out.println();
                System.out.println("     ***** Login Module *****");
                System.out.println();
                System.out.print("Enter Mobile Number : ");
                long mobile1=sc.nextLong();
                System.out.print("Pin : ");
                int pin1 =sc.nextInt();
                if((mobile==mobile1)&&(pin==pin1))
                {
                    homePage(sc);
                }else{
                    System.out.println();
                    System.out.println("Wrong Credentials Entered");
                    System.out.println();
                }
           }
           System.exit(0);

        }else{
            System.out.println();
            System.out.println("Create Your Account First ");
            System.out.println();
        }
    }
    public static void createAccount(Scanner sc)
    {
        System.out.println();
        System.out.println("     ***** Account Creation Module *****");
        System.out.println();
        System.out.print("Username : ");
        sc.nextLine();
        username=sc.nextLine();
        System.out.print("Mobile : ");
        mobile=sc.nextLong();
        System.out.print("Adhar : ");
        adhar=sc.nextLong();
        System.out.print("Pancard : ");
        pan=sc.next();
        System.out.print("Address : ");
        sc.nextLine();
        address=sc.nextLine();
        System.out.print("Pin : ");
        pin=sc.nextInt();
        System.out.print("Enter the amount to deposit : ");
        bal=sc.nextDouble();
        statement.add("Deposit : "+bal+"rs");

        System.out.println();
        System.out.println("Account Created Successfully. ");
        System.out.println();
    }
    public static void homePage(Scanner sc)
    {
        for( ; ;)
        {
            System.out.println();
            System.out.println("       ***** Home Page Module *****");
            System.out.println();
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Statement");
            System.out.println("5. Edit Profile");
            System.out.println("6. Logout");
            System.out.println();
            System.out.print("Enter an option : ");
            int option=sc.nextInt();
            System.out.println();

            switch(option)
            {
                case 1:deposit(sc);break;
                case 2:withdraw(sc);break;
                case 3:checkBalance(sc);break;
                case 4:statement();break;
                case 5:editProfile(sc);break;
                case 6:System.exit(0);
                default:System.out.println("Wrong Option Entered");break;
            }
        }
    }
    public static void deposit(Scanner sc)
    {
        System.out.println("    ***** Deposit Amount *****");
        System.out.println();
        System.out.print("Enter the amount : ");
        double depositAmount=sc.nextDouble();
        bal+=depositAmount;
        statement.add("Deposit : "+depositAmount);
        System.out.println();
        System.out.println("Amount Deposited Successfully ");
    }

    public static void withdraw(Scanner sc)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("    ***** Withdraw Amount *****");
            System.out.println();
            System.out.print("Enter the amount : ");
            double withdrawAmount=sc.nextDouble();
            System.out.print("Enter Your Pin : ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                if(withdrawAmount<=bal)
                {
                    bal-=withdrawAmount;
                    statement.add("Withdraw : "+withdrawAmount+"rs");
                    System.out.println("Amount debited Successfully");

                }else{
                    System.out.println("Insufficient Funds");
                }
                return;

            }else
            {
                System.out.println();
                System.out.println("Wrong Pin Entered ");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
    public static void checkBalance(Scanner sc)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("    ***** Check Balance *****");
            System.out.println();
            System.out.print("Enter Your Pin : ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                System.out.println();
                System.out.println("Account Balance is "+bal+"rs");
                return;

            }else
            {
                System.out.println();
                System.out.println("Wrong Pin Entered ");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
    public static void statement()
    {
        System.out.println("       ***** Statement *****");
        System.out.println();
        for(String tran: statement)
        {
            System.out.println(tran);
        }

        System.out.println("Current Balance : "+bal+"rs");
    }
    public static void editProfile(Scanner sc)
    {
        for( ; ;)
        {
            System.out.println();
            System.out.println("       ***** Edit Profile Module *****");
            System.out.println();
            System.out.println("1. Edit Username");
            System.out.println("2. Edit Mobile Number");
            System.out.println("3. Edit Address");
            System.out.println("4. Edit Pin");
            System.out.println("5. Logout");
            System.out.println();
            System.out.print("Enter an option : ");
            int option=sc.nextInt();
            System.out.println();

            switch(option)
            {
                case 1:UpdateUsername(sc);break;
                case 2:UpdateMobile(sc);break;
                case 3:UpdateAddress(sc);break;
                case 4:UpdatePin(sc);break;
                case 5:return;
                default:System.out.println("Wrong Option Entered");break;
            }
        }
    }
    public static void UpdateUsername(Scanner sc)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter pin : ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                System.out.print("Enter a Name : ");
                sc.nextLine();
                username=sc.nextLine();
                System.out.println();
                System.out.println("Username Updated Successfully.");
                System.out.println();
                System.out.println("Updated username : "+username);
                return;
            }else{
                System.out.println("Wrong pin entered");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
    public static void UpdateMobile(Scanner sc)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter pin : ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                System.out.print("Enter New Mobile Number : ");
                mobile=sc.nextLong();
                System.out.println();
                System.out.println("Mobile Number Updated Successfully.");
                System.out.println();
                System.out.println("Updated Mobile Number : "+mobile);
                return;
            }else{
                System.out.println("Wrong pin entered");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
    public static void UpdateAddress(Scanner sc)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter pin : ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                System.out.print("Enter New Address : ");
                sc.nextLine();
                address=sc.nextLine();
                System.out.println();
                System.out.println("Address Updated Successfully.");
                System.out.println();
                System.out.println("Updated Address : "+address);
                return;
            }else{
                System.out.println("Wrong pin entered");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
    public static void UpdatePin(Scanner sc)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter Mobile Number : ");
            long pin1=sc.nextLong();
            if(pin1==mobile)
            {
                System.out.print("Enter New Pin : ");
                pin=sc.nextInt();
                System.out.println();
                System.out.println("Pin Updated Successfully.");
                System.out.println();
                System.out.println("Updated Pin : "+pin);
                return;
            }else{
                System.out.println("Wrong Mobile Number Entered");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
}