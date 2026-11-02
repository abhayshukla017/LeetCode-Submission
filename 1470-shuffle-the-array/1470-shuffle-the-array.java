class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int i=0;
        int j=n;
        int count=0;
        int ans[]=new int[l];
        while(i<n){
            ans[count]=nums[i];
            ans[count+1]=nums[j];
            i++;
            j++;
            count=count+2;
        }
        return ans;
    }
}