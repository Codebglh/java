public class work {
    public static void main(String[] arg){
        int a=30;
        a=suzu(a);
        print(a);
        int[]b={1,2,3,4,5,6,7,8,9,10};
        jo(b);



    }
    public static int add(int a){
        int b=0;
        for (int i=0;i<=a;i++){
            b=b+i;
        }
        return b;
    }
    public static int suzu(int a){
        int[] c=new int[a];

        for (int i=0;i<a;i++){
           int v=add(i+1);
            c[i]=v;
        }
        int b=0;
        for(int i=0;i<c.length;i++){
            b=c[i]+b;
        }
        return b;
    }
    public static void print(int a){
        System.out.print(a+"\t");
    }
    public static void print(String a,int b,String c){
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
    public static void jo(int b[]){
        int bc=0;
        int c=0;
        for (int i=0;i<b.length;i++){

            if (b[i]%2==1){
                bc=bc+1;
            }else {
                c=c+1;
            }
        }
        print("奇数个数为",bc,"个");
        print("偶数个数为",c,"个");
    }
}