import java.util.*;
class options
{
    static void options()
    {
        System.out.print("\nOptions  ");
        loop.loop();
        System.out.print("are  ");
        loop.loop();
        System.out.print("as  ");
        loop.loop();
        System.out.print("follows");
        loop.loop();
        System.out.print("=>");
        System.out.println("\nloading please wait");
        loop2.loop2();
        for(int i=1;i<=100;i++)
        {
            loop.loop();
            System.out.print("\f\t\t\tWAIT PLEASE:-\t\t\t"+i+"%");
        }
        System.out.println("\f");
        String a="\t\tPress 1 for opening or closing account";
        loop3.loop3(a);
        a="\t\tPress 2 for withdrawl of money";
        loop3.loop3(a);
        a="\t\tPress 3 for deposit of money";
        loop3.loop3(a);
        a="\t\tPress 4 for applying for cheque";
        loop3.loop3(a);
        a="\t\tPress 5 for applying for loan";
        loop3.loop3(a);
        a="\t\tPress 6 for applying for credit card";
        loop3.loop3(a);
        a="\t\tPress 7 for applying for ATM card";
        loop3.loop3(a);
        a="\t\tPress 8 for applying for debit card";
        loop3.loop3(a);
        a="\t\tPress 9 for applying for green card";
        loop3.loop3(a);
        a="\t\tPress 10 for applying for locker facility";
        loop3.loop3(a);
        a="\t\tPress 11 for applying for online service";
        loop3.loop3(a);
        a="Enter your choice=>";
        loop3.loop3(a);
        int n=new Scanner(System.in).nextInt();
        switch (n)
        {
            case 1:
            accounts.accounts();
            break;
            case 2:
            withdrawl.withdrawl();
            break;
            case 3:
            deposit.deposit();
            break;
            case 4:
            cheque.cheque();
            break;
            case 5:
            loan.loan();
            break;
            case 6:
            credit_card.credit_card();
            break;
            case 7:
            atm_card.atm_card();
            break;
            case 8:
            debit_card.debit_card();
            break;
            case 9:
            green_card.green_card();
            break;
            case 10:
            locker_facility.locker_facility();
            break;
            case 11:
            online_service.online_service();
            break;
            default:
            System.out.println("oops!wrong input...");
            break;
        }
        System.out.println("Enter 0 to exit , 1 to continue from start and 2 continue from same options");
        int b=new Scanner(System.in).nextInt();
        if(b==2)
        {
            options.options();
        }
        else
        {
            exit.continu(b);
        }
    }
}