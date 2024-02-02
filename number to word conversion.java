import java.util.*;
public class Main
{
    public static String inttoword(long n){
        long lval=1000000000000L,currval,t=0;
        if(n==0) return "zero";
        String multiplier[]={ "", "Trillion", "Billion","Million", "Thousand" };
       
        String once[]={ "",        "One",       "Two",      "Three",
        "Four",    "Five",      "Six",      "Seven",
        "Eight",   "Nine",      "Ten",      "Eleven",
        "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
       
        String tens[]={"","Twenty",  "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"};
        if(n<20L) return (once[(int)n]);
        String res="";
        for(long i=n;i>0;i%=lval,lval/=1000){
            currval=i/lval;
            while(currval==0){
                i%=lval;
                lval/=1000;
                currval=i/lval;
                ++t;
            }
       
        if(currval>99) res+=(once[(int)currval/100]+" Hundred ");
        currval=currval%100;
        if(currval>0&&currval<20) res+=(once[(int)currval]+" ");
        else if(currval%10==0&&currval!=0) res+=(tens[(int)currval/10-1]+" ");
        else if(currval>20&&currval<100) res+=(tens[(int)currval/10-1]+" "+once[(int)currval%10]+" ");
        if(t<4) res+=multiplier[(int)++t]+" ";
        }
        return (res);
    }
   

public static void main(String[] args) {
   long n=17655L;
System.out.println(inttoword(n));
}
}
