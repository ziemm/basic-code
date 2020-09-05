package cn.xie.leetcode;

import cn.xie.homework1.Main;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-18 15:45
 **/
public class IsUniqueChar {
    public boolean isUnique(char[] chars){
        for (int i = 0; i < chars.length; i++) {
            heapInsert(chars,i);
        }
        for (int i = chars.length-1; i !=0 ; i--) {
            swap(chars,0,i);
            heapModify(chars,0,i);
        }
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]==chars[i-1]){
                return false;
            }
        }
        return true;
    }

    private void heapModify(char[] chars, int index, int size) {
        int left = 2*index+1;
        int right =2*index+2;
        int largest = index;
        while (left<size){
            if(chars[left]<chars[index]){
                largest =left;
            }
            if(right<size && chars[right]<chars[left]){
                largest = right;
            }
            if(largest==index)
                break;
            swap(chars,index,largest);
            index = largest;
            left = 2*index+1;
            right = 2*index+2;
        }
    }

    private void swap(char[] chars, int a, int b) {
        char temp = chars[b];
        chars[b] = chars[a];
        chars[a] = temp;
    }

    private void heapInsert(char[] chars, int index) {
        int parent = 0;
        while (index>0){
            parent = (index-1)/2;
            if(chars[parent]<chars[index]){
                swap(chars,parent,index);
                index = parent;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
    }
}
