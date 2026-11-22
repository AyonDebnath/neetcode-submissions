class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while(i < s.length() && i < j)
        {
            while (!Character.isLetterOrDigit(str[i]) && i < j)
            {
                i++;
            }
            while (!Character.isLetterOrDigit(str[j]) && j>i)
            {
                j--;

            }

            if(j<i)
            {
                return true;
            }

            if(Character.toLowerCase(str[i]) != Character.toLowerCase(str[j]))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
