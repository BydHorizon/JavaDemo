public class Average{
    public static void main(String[] args){
        //给定一个数组a{1,2,3,4,5,6} 计算数组所有元素的平均值
        int[] a ={1,2,3,4,5,6} ;
        int sum=0;
        double average = 0.0;             //计算平均值涉及数据转换 平均值double型
        for(int i=0;i<a.length;i++){
           sum +=a[i];
           average = (double)sum/a.length;
        }
        System.out.println("数组的和为"+sum+"平均值为"+average);
    }
}