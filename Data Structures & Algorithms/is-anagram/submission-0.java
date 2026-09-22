class Solution {
    public boolean isAnagram(String s, String t) {
        int[] manage = new int[26];

        if(s.length()!=t.length()) return false;
        for(Character c : s.toUpperCase().toCharArray()){
            manage[90-c]++;

        }
        for(Character c: t.toUpperCase().toCharArray()){
            manage[90-c]--;

        }
        for(int i:manage){
            if(i != 0)
            return false;
        }
        return true;
    }
}
