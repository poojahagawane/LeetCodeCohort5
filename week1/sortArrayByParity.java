class Solution {
    public int[] sortArrayByParity(int[] A) {
        int temp;
        int j = A.length - 1;
        int i = 0;
        while( i < j)   {
            if(A[i]%2 != 0) {
                if(A[j]%2 == 0) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    i++;
                }
                j--;
            }
            else    {
                i++;
            }
        }
        return A;
    }
}
