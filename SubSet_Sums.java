class SubSet_Sums {
    private void findingSubSetSums(int ind,int sum,ArrayList<Integer> arr,int n,
                                    ArrayList<Integer> sumSubSet){
        if(ind==n){
            sumSubSet.add(sum);
            return;
        }
        //pick the element
        findingSubSetSums(ind+1,sum+arr.get(ind),arr,n,sumSubSet);
        
        //not picking the element
        findingSubSetSums(ind+1,sum,arr,n,sumSubSet);
                                        
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> sumSubSet=new ArrayList<>();
        findingSubSetSums(0,0,arr,n,sumSubSet);
        Collections.sort(sumSubSet);
        return sumSubSet;
    }
}
