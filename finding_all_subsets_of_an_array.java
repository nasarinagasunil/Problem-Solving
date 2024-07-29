class finding_all_subsets_of_an_array {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet= new ArrayList<>();
        backTracking(powerSet,new ArrayList<>(),nums,0);
        return powerSet;
    }
    private void backTracking(List<List<Integer>> powerSet,List<Integer> tempSet,
                              int nums[],int start){
        powerSet.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            backTracking(powerSet,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    
    }
}
