class Solution {
    public boolean isPalindrome(String s) {
        int count = 0;
        for(int i=0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if((c <= 90 && c >= 65) || (c <= 122 && c >= 97) || (c <= 57 && c >= 48))
            {
                count++;
            }
        }
        if(count == 0 || count == 1)
        {
            return true;
        }
        char[] arr = new char[count];
        int j = 0;
        for(int i=0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if((c <= 90 && c >= 65) || (c <= 122 && c >= 97))
            {
                c = Character.toLowerCase(s.charAt(i));
                arr[j] = c;
                j++;
            }
            else if(c <= 57 && c >= 48)
            {
                arr[j] = c;
                j++;
            }
        }
        
        int i = 0;
        j = arr.length-1;
        while(i < j && i != j)
        {
            if(arr[i] != arr[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}