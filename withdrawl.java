import java.util.*;
class withdrawl
{
    static void withdrawl()
    {
        String c,d;
        System.out.println("\fPress 1 to see form");
        System.out.println("Press 2 for withdrawl of money online");
        System.out.print("Enter your choice=>");
        int a=new Scanner(System.in).nextInt();
        switch (a)
        {
            case 1:
            form.form();
            break;
            case 2:
            System.out.println("Press 1 for withdrawl by cheque online");
            System.out.println("Press 2 for withdrawl by form online");
            System.out.print("Enter your choice=>");
            int b=new Scanner(System.in).nextInt();
            switch (b)
            {
                case 1:
                information.information();
                System.out.println("Enter the cheque no.=>");
                c=new Scanner(System.in).nextLine();
                System.out.println("Enter the amount to be withdrawed=>");
                d=new Scanner(System.in).nextLine();
                System.out.println("Th@nk U for withdrawing money");
                break;
                case 2:
                information.information();
                System.out.println("Enter the amount to be withdrawed=>");
                d=new Scanner(System.in).nextLine();
                System.out.println("Th@nk U for withdrawing money");
                break;
                default:
                System.out.println("oops!wrong input....");
                loop2.loop2();
                withdrawl.withdrawl();
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
        withdrawl.withdrawl();
        else
        exit.continu(b);
    }
}