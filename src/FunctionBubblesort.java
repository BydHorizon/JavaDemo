import java.util.Scanner;

public class FunctionBubblesort {
    public void sort(int[] a,String b){
        if (b.equals("降序")){
            for(int i=0;i<a.length;i++)//1,2,3,4,5
                for (int j=a.length-1;j>0;j--){
                    if (a[j]>a[j-1]){
                        int temp=a[j];
                        a[j]=a[j-1];
                        a[j-1]=temp;
                    }
                }
        }
        if (b.equals("升序")){
            for(int i=0;i<a.length;i++)//1,2,3,4,5
                for (int j=a.length-1;j>0;j--){
                    if (a[j]<a[j-1]){
                        int temp=a[j];
                        a[j]=a[j-1];
                        a[j-1]=temp;
                    }
                }
        }
        for(int x:a){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        int[] m = {5,8,9,0,2};
        FunctionBubblesort diudiu =new FunctionBubblesort();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入升序或降序");
        String s = input.nextLine();
        diudiu.sort(m,s);
    }
}
