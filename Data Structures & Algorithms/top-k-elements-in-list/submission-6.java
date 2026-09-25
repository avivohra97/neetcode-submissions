class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];
        Map<Integer,Integer> m = new HashMap();
        
        for(int num:nums){
           m.put(num,m.getOrDefault(num,0)+1);
        }
        List<Integer>[] freq = new List[nums.length+1];

        for(int i =0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            freq[e.getValue()].add(e.getKey());
        }
        int index=0;
        for(int i =freq.length-1;i>0&&index<k;i--
        ){
            for (int n : freq[i]) {
                res[index++]=n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
