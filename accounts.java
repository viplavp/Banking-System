import java.util.*;
class accounts
{
    static void accounts()
    {
        String a,b;int d;
        System.out.println("\fThese are the options=>");
        System.out.println("Press 1 for opening a bank account");
        System.out.println("Press 2 for closing a bank account");
        System.out.print("Enter your choice=>");
        int n=new Scanner(System.in).nextInt();
        switch (n)
        {
            case 1:
            System.out.println("\fFor opening an account you need passport size photo ,adhar id and voter id");
            System.out.println("Press 1 to see form");
            System.out.println("Press 2 for opening a saving bank account ONLINE");
            System.out.println("Press 3 for opening a reoccuring bank account ONLINE");
            System.out.println("Press 4 for opening a deposit bank account ONLINE");
            System.out.print("Enter your choice=>");
            d=new Scanner(System.in).nextInt();
            switch(d)
            {
                case 1:
                System.out.println("         ********************************************************************** ");
                System.out.println("        !                              R.B.I.BANK                              !");
                System.out.println("        !                   WELC0ME TO ACCOUNT OPENING FORM                    !");
                System.out.println("        !NAME:-..........................  ADDRESS:-.........................  !");
                System.out.println("        !                                                         -----------  !");
                System.out.println("        !MOBLE NO.:-............... FATHER'S NAME:-..............|           | !");
                System.out.println("        !                                                        |           | !");
                System.out.println("        !MOTHER'S NAME:-............... AADHAR ID:-..............|   PHOTO   | !");
                System.out.println("        !                                                        |           | !");
                System.out.println("        !VOTER'S ID:-...................  DATE:-................ |           | !");
                System.out.println("        !                                                         -----------  !");
                System.out.println("        !PHONE NO:-......................    SIGNATURE:-...................... !");
                System.out.println("        !                                                                      !");
                System.out.println("        !                             TH@NK U!                                 !");
                System.out.println("        !                                                                      !");
                System.out.println("         ********************************************************************** ");
                break;
                case 2:
                information.information();
                System.out.println("Enter amount to be deposited=>");
                a=new Scanner(System.in).nextLine();
                System.out.println("Rate of interest=>8%");
                System.out.println("TH@NK YOU");
                System.out.println("Your account i$ opened.Your account no. i$=>1234567890\nU will be sent a cheque book after some days");
                break;
                case 3:
                information.information();
                System.out.println("Enter the time period=>");
                b=new Scanner(System.in).nextLine();
                System.out.println("Enter amount to be deposited=>");
                a=new Scanner(System.in).nextLine();
                System.out.println("Rate of interest=>8%");
                System.out.println("TH@NK YOU");
                System.out.println("Your account i$ opened.Your account no. i$=>1234567890\nU will be sent a cheque book after some days");
                break;
                case 4:
                information.information();
                System.out.println("Enter the time period=>");
                a=new Scanner(System.in).nextLine();
                System.out.println("Enter amount to be deposited=>");
                a=new Scanner(System.in).nextLine();
                System.out.println("Rate of interest=>8%");
                System.out.println("TH@NK YOU");
                System.out.println("Your account i$ opened.Your account no. i$=>1234567890\nU will be sent a cheque book after some days");
                break;
                default:
                System.out.println("oops!wrong input...");
                loop2.loop2();
                accounts.accounts();
                break;
            }
            break;
            case 2:
            System.out.println("\fFor closing an account you need passport size photo ,adhar id and voter id");
            System.out.println("These are the options=>");
            System.out.println("Press 1 to see form");
            System.out.println("Press 2 for closing bank account ONLINE");
            System.out.print("Enter your choice=>");
            d=new Scanner(System.in).nextInt();
            switch(d)
            {
                case 1:
                System.out.println("         ********************************************************************** ");
                System.out.println("        !                              R.B.I.BANK                              !");
                System.out.println("        !                   WELC0ME TO ACCOUNT CLOSING FORM                    !");
                System.out.println("        !NAME:-..........................  ADDRESS:-.........................  !");
                System.out.println("        !                                                         -----------  !");
                System.out.println("        !MOBLE NO.:-............... FATHER'S NAME:-..............|           | !");
                System.out.println("        !                                                        |           | !");
                System.out.println("        !MOTHER'S NAME:-............... AADHAR ID:-..............|   PHOTO   | !");
                System.out.println("        !                                                        |           | !");
                System.out.println("        !VOTER'S ID:-...................  DATE:-................ |           | !");
                System.out.println("        !                                                         -----------  !");
                System.out.println("        !ACCOUNT NO:-......................    SIGNATURE:-.................... !");
                System.out.println("        !                                                                      !");
                System.out.println("        !                             TH@NK U!                                 !");
                System.out.println("        !                                                                      !");
                System.out.println("         ********************************************************************** ");
                break;
                case 2:
                information.information();
                System.out.println("Enter your account no.=>");
                a=new Scanner(System.in).nextLine();
                System.out.println("Your account-numbered=>"+a+",i$ closed.");
                System.out.println("TH@NK YOU For Visiting Please Visit Again");
                break;
                default:
                System.out.println("oops!wrong input...");
                loop2.loop2();
                accounts.accounts();
                break;
            }
            break;
            default:
            System.out.println("oops!wrong input...");
            break;
        }
        System.out.println("Enter 0 to exit and 1 to continue from beginning OR 2 to continue from previous page");
        int c=new Scanner(System.in).nextInt();
        if(c==2)
        accounts.accounts();
        else
        exit.continu(c);
        
    }
}