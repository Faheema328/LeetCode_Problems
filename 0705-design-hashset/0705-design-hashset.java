/* Practical Approach:
    Create a boolean array where each index represents a key
    false means the key is not present
    true means the key is present */
class MyHashSet {
    private boolean set[];//Each index represents a possible key-->true:key is present-->false:key is absent
    //private-->Prevents the internal array from being accessed or modified directly from outside the class
    public MyHashSet() {
        set=new boolean[1000001];//Keys can range from 0 to 10^6-->So we need indices from 0 to 1,000,000-->Initially, all values in the boolean array are false
    }
    
    public void add(int key) {//The index itself represents the key and the boolean value tells us whether that key is present or not
        set[key]=true;//Mark the key as present
    }
    
    public void remove(int key) {
        set[key]=false;//Mark the key as absent
    }
    
    public boolean contains(int key) {
        return set[key];//Return whether the key is present
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */