class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> anagrams = new HashMap<>();
		
		for (int i = 0; i < strs.length; i++)
		{   
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
			String anagram = new String(charArray);
			ArrayList<String> lst = anagrams.getOrDefault(anagram, new ArrayList<String>());
            lst.add(strs[i]);

            anagrams.put(anagram, lst);
            
		}
		
		List<List<String>> anagrams_list = new ArrayList<>();
		Set<String> keys = anagrams.keySet();
		for (String key : keys)
		{
			anagrams_list.add(anagrams.get(key));
		}
		return anagrams_list;
    }
}
