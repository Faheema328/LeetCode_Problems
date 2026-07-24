class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;//Stores the max number of words in a string found so far
        for(int i=0;i<sentences.length;i++){//Traverse each sentence(Each element of the array)
            int wordCount=1;
            /*Initialize count to 1 because Total Words = Number of Spaces + 1
            This ensures we get the correct word count after counting all the spaces*/
            for(int j=0;j<sentences[i].length();j++){//Traverse every char of the curr sentence
                if(sentences[i].charAt(j)==' '){//Every space indicates the start of a new word
                    wordCount++;
                }
            }
            if(wordCount>maxWords){//Update the maxWord count if the curr sentence has more words
                maxWords=wordCount;
            }
        }
        return maxWords;
    }
}
/* Practical Approach:
    Traverse each sentence one by one
    Count the number of spaces in the current sentence
    Since Total Words = Number of Spaces + 1,
    initialize the word count to 1 before counting the spaces
    Update the maximum word count if needed
    Return the maximum number of words */
