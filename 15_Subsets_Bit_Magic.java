class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
        /**List<List<Integer>> powerSet= new ArrayList<>();
        backTracking(powerSet,new ArrayList<>(),nums,0);
        return powerSet;

    private void backTracking(List<List<Integer>> powerSet,List<Integer> tempSet,
                              int nums[],int start){
        powerSet.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            backTracking(powerSet,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
    **/

