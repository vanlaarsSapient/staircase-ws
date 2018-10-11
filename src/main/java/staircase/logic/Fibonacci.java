package staircase.logic;

public class Fibonacci {


    // Clearly we have performance issue due to : recursion

    public Integer numWays(int height){
        if (height == 0 || height ==1){
            return 1;
        } else {
            return numWays(height -1 ) + numWays(height - 2);
        }
    }


}
