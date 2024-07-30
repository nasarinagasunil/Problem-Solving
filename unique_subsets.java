class unique_subsets {
    private void findUniqueSubSets(int ind,int nums[],List<Integer> ds,
                                    List<List<Integer>> result){
                    
        result.add(new ArrayList(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            findUniqueSubSets(i+1,nums,ds,result);
            ds.remove(ds.size()-1);
        }
                                    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        findUniqueSubSets(0,nums,new ArrayList<>(),result);
        return result;

        
    }
}
