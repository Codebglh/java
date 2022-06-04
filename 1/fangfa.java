public class fangfa {
    public static void main(String [] arg){
        int a=add(10,20);
        int b=add(10,20,30);
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        System.out.print("计算结果："+sum(100));
        sum(100,11,11,11,11,2,13);
        /*
        通过调用得到结果
        void 不返回参数
         */
    }
    public static int add(int x,int y){
        int a=0;
        a =x+y;
        return a;
    }

    public static int add(int x,int y,int z){
        int a=0;
        a =x+y+z;
        return a;
    }
    public static int sum(int x){
        if(x==1){
            return 1;
        }else{
            return x+sum(x-1);}
    }
    public static void sum(int... arg){
        for (int i=0;i< arg.length;i++){
            int a=arg[i];
            System.out.print(a+"\t");
        }
    }
















}