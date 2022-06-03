public class zy {
    public static void main(String[] arg) {
        int a1[] = {1, 3, 4, 5, 6, 0, 0, 0, 6, 5, 7, 4, 7, 6, 5};
        int a2[]={2,3,4,6,11,12,13,14};
//        copy(a1,2,a2,1,3);
//        print(a2);
        int b=0;
        jisuan(a1,b);
//        System.out.print();
    }
    public static void copy(int s[],int s1,int o[],int s2,int len){
        for(int i=0;i<len;i++){
            o[s2+i]=s[s1+i];

        }
    }
    public static void print(int a){
//        for (int i=0;i< temp.length;i++){
            System.out.print(a);
//        }
    }
    public static int jisuan(int s[],int a){
        for(int i=0;i<s.length;i++){
            if (s[i]>0){
                a=a+1;
            }
        }
        print(a);
        return a;
    }

}