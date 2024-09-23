class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int res[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                res[0]=arr[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res[1]=i;
            }
        }
        return res;
        
    }
}
