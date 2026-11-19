class Solution {
    public boolean isAnagram(String s, String t) 
	{
        char[] s_charArray = s.toCharArray();
		char[] t_charArray = t.toCharArray();
		
		Arrays.sort(s_charArray);
		Arrays.sort(t_charArray);

        System.out.println(s_charArray);
        System.out.println(t_charArray);

        if (s_charArray.length == t_charArray.length)
        {
            for (int i = 0; i < s_charArray.length; i++)
            {
                if( s_charArray[i] != t_charArray[i])
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
