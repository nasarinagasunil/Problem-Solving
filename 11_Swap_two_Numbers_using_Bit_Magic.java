class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        b=a ^ b;
        a=a ^ b;
        b=a ^ b;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
}
