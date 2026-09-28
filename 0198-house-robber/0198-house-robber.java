class Solution {
    int[] nums;
    Map<Integer,Integer> m=new HashMap<>();
    public int rob(int[] nums) {
        this.nums=nums;
        return recur(0);
    }
    public int recur (int i) {
        if(i>=nums.length) return 0;
        if(m.containsKey(i)) return m.get(i);
        int pick=nums[i] + recur(i+2);
        int not_pick = recur(i+1);
       int tmp  = Math.max(pick,not_pick);
       m.put(i,tmp);
       return tmp;
    }
}