class Solution {
    public int[] getConcatenation(int[] nums) {
        int num = nums.length;
        int[] arr = new int [2*num];
        for(int i = 0 ; i < num ; i++){
            arr[i] = nums[i];
            arr[i+num] = nums[i];
        }
        return arr;
    }
}
