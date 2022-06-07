/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp4_main;

/**
 *
 * @author Admin
 */
public class List {

    private int index, MaxSize;
    private int[] Data = new int[MaxSize];

    public List() {
        MaxSize = 10;
        index = -1;
    }

    public List(int MaxSize) {
        this.index = -1;
        this.MaxSize = MaxSize;
    }

    public int[] getData() {
        return Data;
    }

    public void setData(int[] Data) {
        this.Data = Data;
    }
    
    public void push(int data) {
        int num =0;
        Data[num] = data;
        num++;
//            MaxSize= MaxSize+1;
//            index = MaxSize;
//            Data[MaxSize] = data;
            
    }

    public void pop() {
        MaxSize-=1;
        for (int i = 0; i < MaxSize; i++) {
            
        Data[MaxSize] = Data[i];
        }
    }

    public void display() {
        for (int i = 0; i < MaxSize; i++) {
            System.out.print(Data[i]+" ");
        }
    }

    public int top() {
        return Data[MaxSize];
    }
}
