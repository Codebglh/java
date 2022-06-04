//import java.util.Scanner;
public class study {
    public static void main(String [] arg){
        System.out.println("hello world!");
        int s=1;
        int a=0;
        while(s<=10){
            a+=s;
            s++;
        }
        System.out.println(a);
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");

            }
            System.out.print("\n");
        }
        for (int ax=100;ax<=999;ax++){
            int a1=ax%10;
            int b1=(ax/10)%10;
            int c1=ax/100;
                    if(a1*a1*a1+b1*b1*b1+c1*c1*c1==ax){
                    System.out.print(ax+"\t");}


        }
        int as=1321;
        int ass,axx,azz,acc;
        axx=as%10;
         ass=(as/10)%10;
        azz=(as/100)%10;acc=(as/1000)%10;

        System.out.println(axx+"\t"+ass+"\t"+azz+"\t"+acc+"\n");
        int j=10,k=12,l=13;
        if (j>k&&j>l){System.out.print(j);}
        else if(k>j&&k>l){System.out.print(k);}
        else if(l>k&&l>j){System.out.print(l);}
    }
}