class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();//Stores the unique elements of arr1 for fast searching
        HashSet<Integer> common=new HashSet<>();//Stores the unique elements common to both arrays
        for(int i=0;i<nums1.length;i++){//Add all elements of arr1 to the Set
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){//Check each element of arr2 against the elements of arr1
            if(set.contains(nums2[j])){//If the element exists in arr1-->it is common to both arrays
                common.add(nums2[j]);//Add the common element to the common Set
                set.remove(nums2[j]);//Remove it from set-->so that duplicate elements in arr2 are not counted more than once(double 9)
            }
        }
        int intersection[]=new int[common.size()];//Create an integer array with the same size as the common Set to store the common elements
        int i=0;//Start from index 0 to store common elements in the array
        for(int num : common){//Traverse each element present in the common Set
            intersection[i]=num;//Store the curr common element in the intersection array
            i++;
        }
        return intersection;//Return the final array containing all common elements
    }
    }
