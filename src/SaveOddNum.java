public class SaveOddNum {
    public static void main(String[] args){
        //存取1-100的奇数
        int[] array = new int[50];
        int n=0;
        for(int i=1 ; i<=100;i++){
            if(i%2==1){
                array[n++]=i;
            }
        }
        for(int a:array){
            System.out.println(a);
        }
    }
}
