package BridgePattern;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Drawing Circle [Color: red, radius: " + radius + ", X: " + x + ", Y: " + y + "]");
    }
}
