class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList();
        HashMap<String,ArrayList<String>> m = new HashMap();
        for( String word: strs){
            char[] chars = word.toCharArray();
        
            // 2. Sort the char array
            Arrays.sort(chars);
            String sortedW = new String(chars);
                if(m.containsKey(sortedW)){
                    ArrayList<String> val;
                    val = m.get(sortedW);
                    val.add(word);
                    m.put(sortedW,val);
                }else{
                    ArrayList<String> val = new ArrayList();
                    val.add(word);
                    m.put(sortedW,val);
                }
        }
        for (Map.Entry<String, ArrayList<String>> entry : m.entrySet()) {
            ls.add(entry.getValue());
        }
        return ls;
    }
}
