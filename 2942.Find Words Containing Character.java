class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> newArr=new ArrayList<Integer>();//Since we don't know how many matching indices we'll store-->Use an ArrayList instead of an array
        for(int i=0;i<words.length;i++){//Traverse each word in the array
            for(int j=0;j<words[i].length();j++){//Traverse each character of the current word
                if(words[i].charAt(j)==x){//Check if the curr char of the word matches the given char
                    newArr.add(i);
                    break;//Char found-->no need to check the remaining chars
                }
            }
        }
        return newArr;//Return the indices of the words that contain the given char
    }
}
/* Practical Approach:
    Traverse each word in the array
    Traverse each character of the current word
    If the character matches the given character,
    store the index of the current word in the ArrayList
    Stop checking the current word and move to the next word
    Return the ArrayList containing all the matching indices*/
