class Solution {
    //When x is 0 or 1, return x.
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        // Initialize the search range for the square root.
        long start = 1;
        long end = x;
        long result = 0;
        
        // Perform binary search to find the square root of x.
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        
        return (int) result;
    }
}
