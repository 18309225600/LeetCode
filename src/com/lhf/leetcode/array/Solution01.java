package com.lhf.leetcode.array;

/**
 * 从排序数组中删除重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author lhf
 * @since v1.0
 */
public class Solution01 {
    public int removeDuplicates(int[] nums) {

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};
        int i = new Solution01().removeDuplicates(arr);
        System.out.println(i);
    }
}
