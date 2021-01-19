//welcome page
import java.util.Calendar;
class welcome
{
     static void welcome()
    {
        
        Calendar c=Calendar.getInstance();
        System.out.println("\fdate:"+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR)+"                                                                 time:"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        char a[]={' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W','E','L','C','O','M','E',' ','T','O',' ','R','B','I',' ','B','A','N','K'};
        for(int i=0;i<a.length;i++)
        {
            loop.loop();
            System.out.print(a[i]);
        }
        System.out.println();
        char ch[]={' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','=','=','=','=','=','=','=',' ','=','=',' ','=','=','=',' ','=','=','=','=','.','.','.'};
        for(int i=0;i<ch.length;i++)
        {
            loop.loop();
            System.out.print(ch[i]);
        }
    }
}