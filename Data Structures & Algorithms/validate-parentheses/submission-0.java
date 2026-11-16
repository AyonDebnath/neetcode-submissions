class Solution {
    public boolean isValid(String s) {
        Deque<Character> brackets = new ArrayDeque<>();

        ArrayList<Character> openingBrackets = new ArrayList<>(List.of('(', '{', '['));
        ArrayList<Character> closingBrackets = new ArrayList<>(List.of(')', '}', ']'));
            

        for (int i = 0; i < s.length(); i ++)
        {
            if (openingBrackets.contains(s.charAt(i)))
            {
                brackets.push(s.charAt(i));
            }
            else if (closingBrackets.contains(s.charAt(i)) && brackets.isEmpty())
            {
                return false;
            }
            else if (s.charAt(i) == ')')
            {
                Character lastBracket = brackets.pop();
                if(lastBracket !=  '(')
                {
                    return false;
                }
            }
            else if (s.charAt(i) == ('}'))
            {
                Character lastBracket = brackets.pop();
                if(lastBracket !='{')
                {
                    System.out.println(lastBracket.toString());
                    return false;
                }
            }
            else if (s.charAt(i) == ']')
            {
                Character lastBracket = brackets.pop();
                if(lastBracket != '[')
                {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
