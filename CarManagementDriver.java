import java.util.*;
class Car
{
    String brand;
    String model;
    String type;
    String color;
    String engineType;
    String transType;
    String fuelType;
    String milage;
    int noPassenger;
    double price;
    static User obj;
    static ArrayList<Car> cars=new ArrayList<>();

    Car()
    {

    }

    Car(String brand,String model,String type,String color,String engineType,
    String transType,String fuelType,String milage,int noPassenger,double price)
    {
        this.brand=brand;
        this.model=model;
        this.type=type;
        this.color=color;
        this.engineType=engineType;
        this.transType=transType;
        this.fuelType=fuelType;
        this.milage=milage;
        this.noPassenger=noPassenger;
        this.price=price;
    }

    public void addCar(Scanner sc)
    {
        System.out.println();
        System.out.print("Brand : ");
        String brand=sc.next();
        System.out.print("Model : ");
        String model=sc.next();
        System.out.print("Type : ");
        String type=sc.next();
        System.out.print("Color : ");
        String color=sc.next();
        System.out.print("Engine Type : ");
        String engineType=sc.next();
        System.out.print("Transmission Type : ");
        String transType=sc.next();
        System.out.print("Fuel Type : ");
        String fuelType=sc.next();
        System.out.print("Milage : ");
        sc.nextLine();
        String milage=sc.nextLine();
        System.out.print("Number of passengers : ");
        int noPassenger=sc.nextInt();
        System.out.print("Price : ");
        double price=sc.nextDouble();

        Car c1=new Car(brand,model,type,color,engineType,transType,fuelType,milage,noPassenger,price);
        cars.add(c1);

        System.out.println();
        System.out.println("Car added Successfully....");
        
    }
    public void searchCar(Scanner sc)
    {
        System.out.println("");
        System.out.print("Enter Brand : ");
        String brand=sc.next();

        for(Car i:cars)
        {
            if(brand.equals(i.brand))
            {
                i.displayCar();
                System.out.println();
            }
        }

    }
    public void editCar(Scanner sc)
    {
        System.out.println("");
        System.out.print("Enter Brand : ");
        String brand=sc.next();
        System.out.print("Enter Model : ");
        String model=sc.next();


        for(Car i:cars)
        {
            if(brand.equals(i.brand) && model.equals(i.model))
            {
                System.out.println("Edit Window");
                System.out.println("1.Edit Brand");
                System.out.println("2.Edit Model");
                System.out.println("3.Edit Type");
                System.out.println("4.Edit Color");
                System.out.println("5.Edit Engine Type");
                System.out.println("6.Edit Transmission Type");
                System.out.println("7.Edit Fuel Type");
                System.out.println("8.Edit Milage");
                System.out.println("9.Edit Number of Passengers");
                System.out.println("10.Edit Price");
                System.out.print("Enter an Option : ");

                int op=sc.nextInt();
                switch(op)
                {
                    case 1:{
                        System.out.print("Enter a new Brand : ");
                        String newbrand=sc.next();
                        i.brand=newbrand;break;
                    }
                    case 2:{
                        System.out.print("Enter a new Model : ");
                        String newmodel=sc.next();
                        i.model=newmodel;break;
                    }
                    case 3:{
                        System.out.print("Enter a new Type : ");
                        String newtype=sc.next();
                        i.type=newtype;break;
                    }
                    case 4:{
                        System.out.print("Enter a new Color : ");
                        String newcolor=sc.next();
                        i.color=newcolor;break;
                    }
                    case 5:{
                        System.out.print("Enter a new Engine Type : ");
                        String newengineType=sc.next();
                        i.engineType=newengineType;break;
                    }
                    case 6:{
                        System.out.print("Enter a new Transmission Type : ");
                        String newTranstype=sc.next();
                        i.transType=newTranstype;break;
                    }
                    case 7:{
                        System.out.print("Enter a new Fuel Type : ");
                        String newFuelType=sc.next();
                        i.fuelType=newFuelType;break;
                    }
                    case 8:{
                        System.out.print("Enter a new Milage : ");
                        String newMilage=sc.next();
                        i.milage=newMilage;break;
                    }
                    case 9:{
                        System.out.print("Enter a new Number of Passenger : ");
                        int newNoPass=sc.nextInt();
                        i.noPassenger=newNoPass;break;
                    }
                    case 10:{
                        System.out.print("Enter a new Price : ");
                        double newPrice=sc.nextDouble();
                        i.price=newPrice;break;
                    }
                    default:System.out.println("Wrong Option Entered...");
                }
            }
        }
    }
    public void deleteCar(Scanner sc)
    {
        System.out.println("");
        System.out.print("Enter Brand : ");
        String brand=sc.next();
        System.out.print("Enter Model : ");
        String model=sc.next();


        for(Car i:cars)
        {
            if(brand.equals(i.brand) && model.equals(i.model))
            {
                System.out.print("Are u sure(YES/NO) : ");
                String resp=sc.next();
                if(resp.equalsIgnoreCase("YES"))
                {
                    cars.remove(i);
                    System.out.println("Car Deleted Successfully....");
                }
            }
        }
    }
    public static void showAllCars()
    {
        if(true)
        {
            System.out.println("-----**** Cars ****-----");
            for(Car i:cars)
            {
                System.out.println("<<<<<---------------------------------->>>>>");
                System.out.println();
                i.displayCar();
                System.out.println();
            }
        }else{
            System.out.println("No Cars To Display.....");
        }
    }

    public void displayCar()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Type : "+type);
        System.out.println("Color : "+color);
        System.out.println("Engine Type : "+engineType);
        System.out.println("Transmission Type : "+transType);
        System.out.println("Fuel Type : "+fuelType);
        System.out.println("Milage : "+milage);
        System.out.println("Passenger Capacity : "+noPassenger);
        System.out.println("Price : "+price);
    }
    public void login(Scanner sc)
    {
        System.out.println();
        System.out.print("Enter a Username : ");
        String username=sc.next();
        System.out.print("Enter a Password : ");
        String pass=sc.next();

        if(obj!=null)
        {
            if(username.equals(obj.getUsernname())&& pass.equals(obj.getPassword()))
            {
                System.out.println();
                System.out.println("Login successfull...");
                for(;;)
                {
                    System.out.println();
                    System.out.println("1. Add Car");
                    System.out.println("2. Edit Car ");
                    System.out.println("3. Delete Car ");
                    System.out.println("4. Search Car ");
                    System.out.println("5. Display Cars");
                    System.out.println("6. Exit.");

                    System.out.print("Enter a Option : ");
                    int opt=sc.nextInt();
                    System.out.println();
                    switch(opt)
                    {
                        case 1:addCar(sc);break;
                        case 2:editCar(sc);break;
                        case 3:deleteCar(sc);break;
                        case 4:searchCar(sc);break;
                        case 5:showAllCars();break;
                        case 6:System.exit(0);

                        default:System.out.println("Wrong Option Entered...");
                    }
                }
            }
            else{
                System.out.println("Wrong username password entered.");
            }
        }else{
            System.out.println("Register First...");
        }
    }

    public void signUp(Scanner sc)
    {
        System.out.println(" New User ");
        System.out.print("Enter Name : ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.print("Enter Contact Number : ");
        long contact=sc.nextLong();
        System.out.print("Enter Username : ");
        String username=sc.next();
        System.out.print("Enter Password : ");
        String pass=sc.next();
        System.out.println();

        obj=new User(name,contact,username,pass);
        System.out.print("Do you want to login(YES/NO) : ");
        String res=sc.next();

        if(res.equalsIgnoreCase("yes"))
        {
            login(sc);
        }
    }
    
}
class User
{
    String name;
    long contact;
    String username;
    String password;

    User(String name,long contact,String username,String password)
    {
        this.name=name;
        this.contact=contact;
        this.username=username;
        this.password=password;
    }

    public void displayUser()
    {
        System.out.println("Name : "+name);
        System.out.println("Contact : "+contact);
        System.out.println("Usrname : "+username);
        System.out.println("Password : "+password);
        System.out.println();
    }

    public String getUsernname()
    {
        return username;
    }
    public void setUsername(String newUsername)
    {
        this.username=newUsername;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String newPassword)
    {
        this.password=newPassword;
    }
    public long getContact()
    {
        return contact;
    }
    public void setContact(long newContact)
    {
        this.contact=newContact;
    }
}
class CarManagementDriver
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Car obj1=new Car();
        for(;;)
        {
            System.out.println();
            System.out.println("Car Management System");
            System.out.println();
            System.out.println("1.Login");
            System.out.println("2.Sign Up");
            System.out.println("3.Show Cars");
            System.out.println("4.Exit");
            System.out.println();
            System.out.print("Enter a option : ");

            int op=sc.nextInt();
            switch(op)
            {
                case 1:obj1.login(sc);break;
                case 2:obj1.signUp(sc);break;
                case 3:obj1.showAllCars();break;
                case 4:System.exit(0);

                default:System.out.println("Wrong Input Entered.");
            }
        }    
    }
}