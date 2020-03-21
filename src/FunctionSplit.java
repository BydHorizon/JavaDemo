public class FunctionSplit{
    //数组按最大值拆分
    public int[][] split(int[]x) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < x.length; i++) {  //找出最大元素索引位置
            if (max < x[i]) {
                max = x[i];
                index = i;
            }
        }
        int[] new1 = new int[index];
        int[] new2 = new int[x.length - index-1];
        for (int m = 0; m < new1.length; m++) {
            new1[m] = x[m];
        }
        for (int n = 0; n < new2.length; n++) {
            new2[n] = x[++index];
        }
        for (int some1:new2){
            System.out.println(some1);
        }

        int[][] y = new int[][]{new1, new2};
        /*for(int[] m:y){
            for (int h:m){
                System.out.println(h);
            }
        }*/
        return  y;
    }
    public static void main(String[] args ){
          int[]n={1,2,3,4,9,7,3,4,2};
          FunctionSplit one = new FunctionSplit();
          int[][]K=one.split(n);
          for(int[] m:K){
              for (int h:m){
                  System.out.println(h);
              }
          }

    }
}