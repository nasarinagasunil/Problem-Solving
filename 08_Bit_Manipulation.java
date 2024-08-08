class Solution {
    static void bitManipulation(int num, int i) {
        int ith_bit=(num>>i-1)&1;
        int set_ith=num|(1<<i-1);
        int clear_ith=num&~(1<<(i-1));
        // code here
        System.out.print(ith_bit + " "+ set_ith +" "+clear_ith);
    }
}
