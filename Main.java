class Solution {
    public boolean containsDuplicate(int[] nums) {
        int ans=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num:nums){
            int sameNumCount=hm.getOrDefault(num,0);
            int numCount=sameNumCount+1;
            ans+=sameNumCount;
            hm.put(num, numCount);           
        }
        if(ans>0) return true;
        else return false;
    }
}
