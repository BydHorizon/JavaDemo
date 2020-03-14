public class BubbleSort{
    public static void main(String[] args){
        //冒泡算法
        int[] a = {6,7,8,1,4,2,11,91};
        for (int i=0;i<a.length-1;i++)
            for (int j=0;j<a.length-1;j++){   //循环从0开始数组长度length-1
                if(a[j]<a[j+1]){  //大于小于号控制升降序
                    int temp=a[j];          //交换元素
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        for (int x:a){
            System.out.println(x);
        }

    }
}