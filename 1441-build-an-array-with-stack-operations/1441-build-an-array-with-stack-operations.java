class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l=new ArrayList<String>();//List is an interface-->so it cannot be instantiated directly-->AL is a concrete class that implements List(interface)
        //So, we create an AL obj and store its reference in a List variable
        int j=0;//'j' points to the target element we are currently waiting for
        for(int curr=1;curr<=n && j<target.length;curr++){//The stream provides numbers from 1 to n-->We stop when all target elements have been found
            if(curr==target[j]){//curr is the target element we are waiting for-->So we keep it by performing Push
                l.add("Push");//We found target[j]-->so move to the next target element
                j++;
            }
            else{
                //curr is not the target element we are waiting for-->So we don't need this number in the final stack
                l.add("Push");//But curr came from the stream-->so we must Push it first
                l.add("Pop");//We don't need curr-->so immediately remove it
                //'j' is not incremented here because target[j] has not been found yet(from the stream)-->So, we continue waiting for the same target[j]
            }
        }
        return l;//Return the list containing all the Push and Pop operations
    }
}

/*Practical Approach:
    Process the numbers from 1 to n in the same order as the stream
    Compare each number with the next required element in target
    If it matches → Push it and move to the next target element
    If it does not match → Push it and immediately Pop it
    Do not increment j for an unwanted number because we are still waiting for the same target element
    Stop when all target elements are found*/