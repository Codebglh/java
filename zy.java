public class zy {
    public static void main(String[] arg) {
        int a1[] = {1, 3, 4, 5, 6, 0, 0, 0, 6, 5, 7, 4, 7, 6, 5};
        int b = l(a1);
        int c=0;
        int a2[]=new int[b];
         js(a1,a2,c);
        print1(a2);
    }
    public static void copy(int s[],int s1,int o[],int s2,int len){
        for(int i=0;i<len;i++){
            o[s2+i]=s[s1+i];
        }
    }
    public static void print(int a){
            System.out.print(a+"\n");
    }
    public static void print1(int temp[]){
        for (int i=0;i< temp.length;i++){
        System.out.print(temp[i]+"\t");
        }
    }
    public static int l(int s[]){
        int b=0;
        for (int i=0;i<s.length;i++){
            if (s[i]>0){
                b=b+1;

            }

        }
        return b;
    }
    public static int[] js(int s[],int s1[],int b){
        for (int i=0;i<s.length;i++){
            if (s[i]>0){
                s1[b]=s[i];
                b=b+1;
            }
        }
        return s1;
    }
}
//删除数组a1中的0并创建一个新数组a2
//分为两步1，先获得数组a1的不为零个数定义一个空数组的长度在进行替换