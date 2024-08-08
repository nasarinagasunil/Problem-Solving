class Solution {

    int Maximize(int arr[]) {
        int mod = (int)1e9 + 7;
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ((long)=arr[i]*i) % mod;
        }
        return (int)sum;
    }
}
