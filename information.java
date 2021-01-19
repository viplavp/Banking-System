import java.util.*;
class information
{
    static void information()
    {
        System.out.println("Enter your Name=>");
        String a=new Scanner(System.in).nextLine();
        System.out.println("Enter your Father's name=>");
        String b=new Scanner(System.in).nextLine();
        System.out.println("Enter your Mother's name=>");
        String c=new Scanner(System.in).nextLine();
        System.out.println("Enter your Alma mater=>");
        String u=new Scanner(System.in).nextLine();
        System.out.println("Enter your ADHAR id No.(12 digits)=>");
        String d=new Scanner(System.in).nextLine();
        while(d.length()!=12)
        {
            System.out.println("(Your adhar id is wrong)Re-enter your ADHAR id No.=>");
            d=new Scanner(System.in).nextLine();
        }
        System.out.println("Enter your Voter id No.=>");
        String e=new Scanner(System.in).nextLine();
        System.out.println("Enter your Mobile No.(10 digits)=>");
        String f=new Scanner(System.in).nextLine();
        while(f.length()!=10)
        {
            System.out.println("(Your mobile no. is wrong)Re-enter your mobile No.=>");
            f=new Scanner(System.in).nextLine();
        }
        System.out.println("Enter your Address");
        String g=new Scanner(System.in).nextLine();
        }
    }
        