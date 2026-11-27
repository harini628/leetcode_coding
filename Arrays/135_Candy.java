class Solution {
    public int candy(int[] ratings) {
        int i=1;int sum = 1;
        while(i<ratings.length){
            if(ratings[i] == ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }
            int peak = 1;
            while(i < ratings.length && ratings[i] > ratings[i-1]){
                peak++;
                sum += peak;
                i++;
                
            }
            int down=0;
            while(i < ratings.length && ratings[i] < ratings[i-1]){
                down++;
                sum += down;
                i++;
                
            }
            if(peak <= down)sum += down + 1 - peak;
            
        }
        return sum;

        /*

        int[] left = new int[ratings.length];
        left[0] = 1;int right = 1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i] > ratings[i-1] )left[i] = left[i-1]+1;
            else left[i] = 1;
        }
        int sum = Math.max(1,left[ratings.length-1]);
        for(int j=ratings.length-2;j>=0;j--){
            if(ratings[j] > ratings[j+1])right++;
            else right = 1;
            sum += Math.max(right,left[j]);
        }
        return sum;
        

        /*
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        left[0] = 1;right[ratings.length-1]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i] > ratings[i-1] )left[i] = left[i-1]+1;
            else left[i] = 1;
            
            if(ratings[ratings.length-1-i] > ratings[ratings.length-i])right[ratings.length-1-i] = right[ratings.length-i] + 1;
            else right[ratings.length-1-i] = 1;
            
        }
        int sum = 0;
        for(int j=0;j<ratings.length;j++){
            sum += Math.max(left[j],right[j]);
        }
        return sum;
        */
    }
}
