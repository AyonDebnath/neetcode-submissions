class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> s_collection = new ArrayList(List.of(s.split("")));
        ArrayList<Character> t_collection = new ArrayList(List.of(t.split("")));

        Collections.sort(s_collection);
        Collections.sort(t_collection);

        return s_collection.equals(t_collection);
    }
}
