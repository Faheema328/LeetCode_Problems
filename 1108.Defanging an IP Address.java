class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");//stringName.replace("old value","new value")
    }
}
//Defanging-->Converting an IP address into safe format by replacing "." with "[.]"
