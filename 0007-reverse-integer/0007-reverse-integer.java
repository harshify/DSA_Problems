class Solution {
    public int reverse(int x) {
        long rev=0; 
        while(x!=0)
        {
            int rem=  x % 10; // Get the last digit of x (Remainder)
            rev = rev *10 + rem; // Append the last digit to the reversed number
            x = x/10; // Remove the last digit from x
        }
         if (rev < Math.pow(-2, 31) || rev > Math.pow(2, 31)) 
            return 0;  
        else
            return (int) rev;  // Convert the reversed long value to int and return
    }
}