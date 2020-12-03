package cn.xie.leetcode;

/**
 * leetcode680：删除一个字符后判断是不是回文串
 * @author: xie
 * @create: 2020-12-03 21:30
 **/
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        char[] sArr = s.toCharArray();
        int left = 0;
        int right = sArr.length-1;
        while (left<right){
            if(sArr[left]!=sArr[right]){
                return validHelper(sArr,left+1,right)||validHelper(sArr,left,right-1);
            }
            //如果不走if，就直接使用原始的判断是不是回文数来判断
            left++;
            right--;
        }
        return true;
    }

    public boolean validHelper(char[] arr,int left,int right){
        while (left<right){
            if(arr[left]!=arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
