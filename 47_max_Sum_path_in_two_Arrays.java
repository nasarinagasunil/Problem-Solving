


class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int l=0,r=0,ls=0,rs=0,t=0;
        int m=arr1.size(),n=arr2.size();
        while(l<m && r<n){
            if(arr1.get(l) > arr2.get(r)){
                rs+=arr2.get(r);
                r++;
            }
            else if (arr1.get(l) < arr2.get(r)){
                ls+=arr1.get(l);
                l++;
            }
            else{
                t+=arr1.get(l)+Math.max(ls,rs);
                ls=0;
                rs=0;
                l++;
                r++;
            }
        }
        while(l<m){
            ls+=arr1.get(l++);
        }
        while(r<n){
            rs+=arr2.get(r++);
        }
        t+=Math.max(ls,rs);
        return t;
        
    }
}
