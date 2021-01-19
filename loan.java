import java.util.*;
class loan
{
    static void loan()
    {
        System.out.println("\fPress 1 to see form");
        System.out.println("Press 2 for applying for loan ONLINE");
        System.out.print("Enter your choice=>");
        int a=new Scanner(System.in).nextInt();
        switch (a)
        {
            case 1:
            System.out.println("         ********************************************************************** ");
            System.out.println("        !                           R.B.I. BANK                                !");
            System.out.println("        !                      WELC0ME TO LOAN FORM                            !");
            System.out.println("        !NAME:-..........................  ADDRESS:-.........................  !");
            System.out.println("        !                                                         -----------  !");
            System.out.println("        !MOBLE NO.:-............... FATHER'S NAME:-..............|           | !");
            System.out.println("        !                                                        |           | !");
            System.out.println("        !MOTHER'S NAME:-............... AADHAR ID:-..............|   PHOTO   | !");
            System.out.println("        !                                                        |           | !");
            System.out.println("        !LOAN AMOUNT:-..................  DATE:-................ |           | !");
            System.out.println("        !                                                         -----------  !");
            System.out.println("        !ACCOUNT NO:-......................    SIGNATURE:-.................... !");
            System.out.println("        !                                                                      !");
            System.out.println("        !                             TH@NK U!                                 !");
            System.out.println("        !                                                                      !");
            System.out.println("         ********************************************************************** ");
            break;
            case 2:
            information.information();
            System.out.println("Enter your monthly income=>");
            long b=new Scanner(System.in).nextLong();
            System.out.println("Enter amount of loan=>:");
            long d=new Scanner(System.in).nextLong();
            System.out.println("Choose type of loan:-");
            System.out.println("Press 1 for home loan(Your monthly income should be more than your loan applied)");
            System.out.println("Press 2 for vehicle loan(Your monthly income should be more than your loan applied)");
            System.out.println("Press 3 for education loan(Your monthly income should be less than 50000)");
            System.out.println("Press 4 for business loan(Your monthly income should be more than your loan applied)");
            System.out.print("Enter your choice=>");
            a=new Scanner(System.in).nextInt();
            switch (a)
            {
                case 1:
                if (b<d)
                {
                    System.out.println("Your loan can't passed");
                    loop2.loop2();
                    loan.loan();  
                }
                else
                {
                    System.out.println("Th@nk U for applying for loan");
                    System.out.println("Your  loan i$ home loan passed");
                }
                break; 
                case 2:
                if (b<d)
                {
                   System.out.println("Your loan can't passed");
                   loop2.loop2();
                   loan.loan();
                }
                else
                {
                    System.out.println("Th@nk U for applying for loan");
                    System.out.println("Your  loan i$ vehicle loan passed");
                }
                break;
                case 3:
                if (b>50000)
                {
                    System.out.println("Your loan can't passed");
                    loop2.loop2();
                    loan.loan();
                }
                else
                {
                    System.out.println("Th@nk U for applying for loan");
                    System.out.println("Your  loan i$ education loan passed");
                }
                break;
                case 4:
                if (b<d)
                {
                   System.out.println("Your loan can't passed");
                   loop2.loop2();
                   loan.loan();
                }
                else
                {
                    System.out.println("Th@nk U for applying for loan");
                    System.out.println("Your  loan i$ business loan passed");
                }
                break;
                default:
                System.out.println("oops!wrong input...");
                loop2.loop2();
                loan.loan();
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
        loan.loan();
        else
        exit.continu(b);
    }
}