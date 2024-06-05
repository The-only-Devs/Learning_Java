package com.sai.oop.genericsExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private final int DEFAULTSIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULTSIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[size * 2]; //Making a double size temp Array, to store elements in data temporarily

        for(int i=0; i<size; i++){
            temp[i] = data[i];
        }

        data = temp;// data and temp have reference
    }

    public void remove(){
        size--;
    }

    public void set(int index, int element){
        if(index>=0 && index < data.length){
            data[index] = element;
        }else{
            System.out.println("element: " + element + "not added at " + "index: " + index);
        }
    }

    public int get(int index){
        int n = 0;
        if(index < data.length){
            n =  data[index];
        }else{
            System.out.println("No element present at index: " + index);
        }
        return n;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return data.length;
    }

    @Override
    public String toString(){
        return "CustomArrayList: " + Arrays.toString(data) + ", size: " + size + ", capacity: " + data.length;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(5);
        list.add(8);
        list.add(3);

        System.out.println(list.size());
        System.out.println(list.capacity());

        list.remove();

        System.out.println(list.size());
        System.out.println(list.capacity());

        System.out.println(list.get(2));
        System.out.println(list.get(50));

        list.set(5, 25);

        System.out.println(list);
    }
}
