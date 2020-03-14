public class MaxOrMin{
    public static void main(String[] args){
         //给定一个数组a{1,3,5,7,9,0,2,4,6,8}找寻数组中的最大值和最小值（极值问题）
        int[] a ={1,3,5,7,9,0,2,4,6,8};
        int min=a[0];
        int max=0;
        for(int i=0;i<a.length;i++){
            if (a[i]< min){
                min= a[i];
            }
            else if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("最大值为"+max);
        System.out.println("最小值为"+min);
    }
}