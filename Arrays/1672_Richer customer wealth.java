class Solution {
    public int maximumWealth(int[][] accounts) {
        int greaterWealth = 0;
        for(int[] arr : accounts){
            if(greaterWealth < sumOfArray(arr)) greaterWealth = sumOfArray(arr);
        }
        return greaterWealth;
    }
    public static int sumOfArray(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
}
