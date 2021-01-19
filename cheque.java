import java.util.*;
class cheque
{
    static void cheque()
    {
        System.out.println("\fPress 1 to see form");
        System.out.println("Press 2 for applying for crossed cheque ONLINE");
        System.out.println("Press 3 for applying for simple cheque ONLINE");
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
            String adf=new Scanner(System.in).nextLine();
            System.out.println("Th@nk U for applying for cheque");
            System.out.println("Your crossed cheque no. i$=>1234567890");
            break;
            case 3:
            information.information();
            System.out.println("Enter your account no.=>");
            String adf1=new Scanner(System.in).nextLine();
            System.out.println("Th@nk U for applying for cheque");
            System.out.println("Your simple cheque no. i$=>1234567890");
            break;
            default:
            System.out.println("oops!wrong input...");loop2.loop2();
            break;
            }
        System.out.println("Enter 0 to exit and 1 to continue from beginning OR 2 to continue from previous page");
        int b=new Scanner(System.in).nextInt();
        if(b==2)
        cheque.cheque();
        else
        exit.continu(b);
    }
}