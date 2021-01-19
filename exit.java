class exit
{
    static void continu(int c)
    {
        switch (c)
        {
            case 0:
            System.out.println("\f\n\n\n\t\t\t\t$$$$$$$$$$\t$$$$$$$$$$\t$$$$$$$$$$$");
            System.out.println("\t\t\t\t$        $\t$        $\t     $     ");
            System.out.println("\t\t\t\t$        $\t$        $\t     $     ");
            System.out.println("\t\t\t\t$        $\t$        $\t     $     ");
            System.out.println("\t\t\t\t$        $\t$       $ \t     $     ");
            System.out.println("\t\t\t\t$$$$$$$$$$\t$$$$$$$$  \t     $     ");
            System.out.println("\t\t\t\t$$        \t$       $ \t     $     ");
            System.out.println("\t\t\t\t$  $      \t$        $\t     $     ");
            System.out.println("\t\t\t\t$    $    \t$        $\t     $     ");
            System.out.println("\t\t\t\t$      $  \t$        $\t     $     ");
            System.out.println("\t\t\t\t$        $\t$$$$$$$$$$\t$$$$$$$$$$$");
            System.out.println("\n\n\n\t\t\t\t\t    THANK YOU\n\n\t\t\t\t\t   VISIT AGAIN\n\n\n\n\n\n");
            System.out.println("\t\t\t\t\t\t\t\t\t\tDEVELOPED BY - ");
            System.out.println("\t\t\t\t\t\t\t\t\t\tVIPLAV PATEL");
            System.out.println("\t\t\t\t\t\t\t\t\t\tCLASS 10-B");
            System.out.println("\t\t\t\t\t\t\t\t\t\tAND HIS TEAM");
            loop2.loop2();
            loop2.loop2();
            loop2.loop2();
            System.exit(0);
            break;
            case 1:
            System.out.print("\f");
            Banking.bank();
            break;
            default:
            System.out.println("oops!wrong input (now software will be terminated)");
            loop2.loop2();
            System.exit(0);
        }
    }
}