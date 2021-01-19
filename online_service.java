import java.util.*;
class online_service
{
    static void online_service()
    {
        String c,d,e;
        System.out.println("\fPress 1 to see form");
        System.out.println("Press 2 for applying for online service ONLINE");
        System.out.print("Enter your choice=>");
        int a=new Scanner(System.in).nextInt();
        switch (a)
        {
            case 1:
            form.form();
            break;
            case 2:
            information.information();
            System.out.println("Enter your account no.=>");
            c=new Scanner(System.in).nextLine();
            System.out.println("Enter your cheque no.=>");
            d=new Scanner(System.in).nextLine();
            System.out.println("Enter your e-mail id=>");
            e=new Scanner(System.in).nextLine();
            System.out.println("Select type of online service=>");
            System.out.println("Press 1 for online banking(any computer)");
            System.out.println("Press 2 for e-banking(personel computer)");
            System.out.print("Enter your choice=>");
            int f=new Scanner(System.in).nextInt();
            switch(f)
            {
                case 1:
                System.out.println("Th@nk u for applying for online banking");
                System.out.println("Your password is :-1234567890");
                break;
                case 2:
                System.out.println("Th@nk u for applying for e-banking");
                System.out.println("Your password is :-1234567890");
                break;
                default:
                System.out.println("oops!wrong input...");
                loop2.loop2();
                online_service.online_service();
                break;
            }
            break;
            default:
            System.out.println("oops!wrong input...");
            break;
        }
        System.out.println("Enter 0 to exit and 1 to continue from beginning OR 2 to continue from previous page");
        int b=new Scanner(System.in).nextInt();
        if(b==2)
        online_service.online_service();
        else
        exit.continu(b);
    }
}
