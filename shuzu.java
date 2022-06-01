public class shuzu {
    public static void main(String[] args){
        int a[]={12,12,11,13,15,14,16,18};
        for(int i =1; i<a.length;i++){
            for(int j= 0;j <a.length;j++){
                if(a[i]<a[j]){
                    //if语句判断数组中数值大小进行比较如果满足接着运行不瞒足继续循环
                    /*a.length表示a数组的长度及数组中数值的个数
                     *
                     */
                int c= a[i];
                a[i]= a[j];
                a[j]=c;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
            //输出数组中的值由大到小
        }
    }
}