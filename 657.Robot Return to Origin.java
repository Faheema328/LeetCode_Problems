class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;//Tracks the robot's horizontal position
        int y=0;//Tracks the robot's vertical position
        for(int i=0;i<moves.length();i++){//Go through each move in the given string
            if(moves.charAt(i)=='U'){//Moves up
                y++;
            }
            else if(moves.charAt(i)=='D'){//Moves down
                y--;
            }
            else if(moves.charAt(i)=='L'){//Moves left
                x--;
            }
            else if(moves.charAt(i)=='R'){//Moves right
                x++;
            }
        }
        boolean result=(x==0 && y==0);
        return result;//Return true if the robot is back at the origin-->else return false
    }
}
/* Practical Approach:
    The robot starts at the origin (0,0)
    Keep track of its horizontal (x) and vertical (y) positions
    Update x and y based on each move
    After all the moves, check whether the robot is back at (0,0)
    If yes, return true; otherwise, return false */
