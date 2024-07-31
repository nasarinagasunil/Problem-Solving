class reverse_integer {
    public int reverse(int x) {
        boolean isNegative=x<0;
        x=Math.abs(x);
        int reversed=0;
        while(x>0){
            int r=x%10;
            x=x/10;
            if(reversed>(Integer.MAX_VALUE - r)/10){
                return 0;
            }
            reversed=reversed*10+r;
        }
        return isNegative ? -reversed:reversed;

    }
}
