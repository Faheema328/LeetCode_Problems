class Solution {
    public String destCity(List<List<String>> paths) {//'paths' is an array of type List<List<String>> contains multiple List<String> objects-->So the enhanced for loop takes one inner path(List<String>) at a time
        HashMap<String,String> map=new HashMap<>();//'map' stores each path as 'fromCity → toCity'
        for(List<String> path : paths){//'path' is a ref var of type List<String>-->List<String> means a List that stores String objects
        
        
            map.put(path.get(0),path.get(1));//Store the starting city as the key and its destination city as the value
        }
        for(String city : map.values()){//Check every destination city stored as a value
            if(! map.containsKey(city)){//If city is not present as a key-->It means no path starts from this city-->So this city has no outgoing path-->So, it is the required final destination
                return city;
            }
        }
        return "";//This line is only required bcoz the method must return a String-->The problem guarantees that a destination city exists
    }
}
/* Practical Approach:
    Store each starting city and its destination in a HashMap
    Check every destination city
    If a destination city is not present as a starting city it has no outgoing path
    So it is the final destination city */