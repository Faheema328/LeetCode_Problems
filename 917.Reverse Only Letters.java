class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();//A String in Java is immutable-->So,we first convert the string to a mutable char[] and modify its chars by swapping them
        int left=0;
        int right=s.length()-1;

        /* The invalid chars are not removed from the string-->the pointers simply skip over them so that only the valid letters are swapped */
        while(left<right){//Keep swapping letters until the pointers meet or cross

            while(left<right && !Character.isLetter(arr[left])){
                /* As long as the left pointer has not crossed the right pointer and the current left char is not a letter-->keep moving the left pointer forward */
                left++;
            }
        while(left<right && !Character.isLetter(arr[right])){
            /* left < right is a safety check because the pointers are moving inside the inner loops-->Without it,the code can access invalid indices */
            right--;
        }
        char temp=arr[left];//Swap the letters
        arr[left]=arr[right];
        arr[right]=temp;

        left++;//Move both pointers toward the center
        right--;
        }
        String str=new String(arr);//Create a new String obj to return the modified characters as a String
        return str;
    }
}
/* Practical Approach:
    Convert the string into a character array
    Use two pointers one from the beginning and one from the end
    Skip the current character if the left pointer is not pointing to a letter
    Skip the current character if the right pointer is not pointing to a letter
    If both pointers point to letters, swap them
    Move both pointers toward the center
    Convert the character array back to a string and return it */
