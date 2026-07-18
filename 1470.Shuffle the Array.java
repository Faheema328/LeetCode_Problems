class Solution {
    public int[] shuffle(int[] nums, int n) {
        int newArr[]=new int[nums.length];
        for(int i=0;i<n;i++){//Run till n because both halves are processed together
            newArr[2*i]=nums[i];//Place the current element from the first half at the even index
            newArr[2*i+1]=nums[i+n];// Place the corresponding element from the second half at the odd index
        }
        return newArr;
    }
}

/* Practical Approach:
    The array is divided into two equal halves: x1,x2,...,xn and y1,y2,...,yn
    Create a new array to store the shuffled elements
    Place the elements from the first half at the even indices of the new array
    Place the corresponding elements from the second half at the odd indices of the new array
    Return the shuffled array */
