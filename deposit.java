import java.util.*;
class deposit
{
    static void deposit()
    {
        String c,d;
        System.out.println("\fPress 1 to see form");
        System.out.println("Press 2 for deposit of money ONLINE");
        System.out.print("Enter your choice=>");
        int a=new Scanner(System.in).nextInt();
        switch (a)
        {
            case 1:
            form.form();
            break;
            case 2:
            System.out.println("Press 1 for deposit by cheque online");
            System.out.println("Press 2 for deposit by form online");
            System.out.print("Enter your choice=>");
            int b=new Scanner(System.in).nextInt();
            switch (b)
            {
                case 1:
                information.information();
                System.out.println("Enter the cheque no.=>");
                c=new Scanner(System.in).nextLine();
                System.out.println("Enter the amount to be deposited=>");
                d=new Scanner(System.in).nextLine();
                System.out.println("Th@nk U for depositing money");
                break;
                case 2:
                information.information();
                System.out.println("Enter the amount to be deposited=>");
                d=new Scanner(System.in).nextLine();
                System.out.println("Th@nk U for depositing money");
                break;
                default:
                System.out.println("oops!wrong input...");
                loop2.loop2();
                deposit.deposit();
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
        deposit.deposit();
        else
        exit.continu(b);
    }
}