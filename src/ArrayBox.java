import javax.swing.*;
import java.util.Scanner;

public class ArrayBox {
    //设计 一个ArrayBox(数组容器工作)
    //设计一个属性 真实的数组
    //设计一个属性 int size
    //设计 方法  add() remove() 获取get() 获取有效元素个数
      private int[] data;
      private int   size;

      //构造函数  传入数组容量capacity 构造ArrayBox
    public ArrayBox(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 在末尾添加元素
    public void add(int e) {
        if (data.length == size) {
            System.out.println("ArrayBox is full");
        } else {
            data[size] = e;
            size++;
        }
    }

    //重载add 在任何位置插入新的元素
    public void add(int e,int index){
        if (data.length == size){
            System.out.println("ArrayBox is full");
        }
        if(index < 0 || index > size){
            System.out.println("Add elements location out of bounds");
        }
        for(int i = size ;i >=index; i--){
                 data[i+1] = data[i];
        }
                 data[index] = e;
                  size++;
        }

    //删除元素  按位置删除
    public void remove( int index){
        if(index < 0 || index >size ){
            System.out.println("Remove elements location out of bounds");
        }
        for(int i = index+1; i <=size;i++){
            data[i-1]=data[i];
        }
           size--;
    }
    //获取数组元素个数
    public int get (){
       return size;
    }


    //主函数
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组容量：10以上");
        int capacity = input.nextInt();
        ArrayBox array = new ArrayBox(capacity);
        for(int i=0;i<10;i++){         //数组赋10个初值
            array.add(i);
        }
        array.add(3,2);      //在第二个位置插入一个元素3
        array.remove(1);        //删除第一个位置的元素
        System.out.println("当前size的长度"+array.get());
        array.toString()
    }

}
