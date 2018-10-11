package staircase.model;

public class Staircase {

    private int height;
    private int numberOfPaths;


    public Staircase(int height, int numberOfPaths) {
        this.height = height;
        this.numberOfPaths = numberOfPaths;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberOfPaths() {
        return numberOfPaths;
    }
}
