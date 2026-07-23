/* Practical Approach:
    Calculate the slopes of AB and BC using cross multiplication
    If both slopes are equal, the three points lie on the same straight line
    Otherwise, the points form a valid boomerang
    Return the result */

class Solution {
    public boolean isBoomerang(int[][] points) {

        boolean result=(points[1][1]-points[0][1]) * (points[2][0]-points[1][0]) != (points[2][1]-points[1][1]) * (points[1][0]-points[0][0]);
        //Returns true if the three points are not on the same straight line(Slope is not equal)

        //Return false if the three points lie on the same straight line
        return result;//'result' stores whether the three points form a valid boomerang
    }
}
//Valid boomerang -->Slopes are not equal-->The three points form a triangle

/* Compare the slopes using cross multiplication:
(y₂ - y₁) × (x₃ - x₂) != (y₃ - y₂) × (x₂ - x₁)
This avoids division by zero and decimal precision problems */

/* Golden Rule:
    points[0][0] → x₁
    points[0][1] → y₁

    points[1][0] → x₂
    points[1][1] → y₂

    points[2][0] → x₃
    points[2][1] → y₃ */
    
