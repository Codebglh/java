public class zy {
    public static void main(String[] arg){
        int a[]={1,3,4,5,6,0,0,0,6,5,7,4,7,6,5};
//        System.out.print();
        shancu(a);
    }
    public static void shancu(int arg[]){
        for (int i=0;i< arg.length;i++){
            if (arg[i]==0){
                int s=arg[i];
//                System.out.print(s);
            }else {
                int b=arg[i];
                System.out.print(b);
            }
        }
    }
}