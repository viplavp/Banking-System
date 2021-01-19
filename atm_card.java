import java.util.*;
class atm_card
{
    static void atm_card()
    {
        String c,d;
        System.out.println("\fPress 1 to see form");
        System.out.println("Press 2 for applying for atm card ONLINE");
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
            System.out.println("Th@nk u for applying for atm card");
            System.out.println("Your atm card no i$:-1234567890");
            break;
            default:
            System.out.println("oops!wrong input...");
            loop2.loop2();
            break;
        }
        System.out.println("Enter 0 to exit and 1 to continue from beginning OR 2 to continue from previous page");
        int b=new Scanner(System.in).nextInt();
        if(b==2)
        atm_card.atm_card();
        else
        exit.continu(b);
    }
}