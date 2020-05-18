package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-05-14 17:49
 **/
public class Exchange {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3,5};

        Exchange exchange = new Exchange();
        int[] exchange1 = exchange.exchange(nums);

        for (int i = 0; i < exchange1.length; i++) {
            System.out.println(exchange1[i]);
        }

    }

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int temp = 0;
        while (left < right) {

            while (nums[left] % 2 == 1 && left<right) left++;//需要继续往下走
            while (nums[right] % 2 == 0 && left<right) right--;

            if(left<right){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

        }
        return nums;
    }

}
