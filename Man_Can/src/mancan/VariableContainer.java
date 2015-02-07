package mancan;

public class VariableContainer {
    public static int screendx;
    public static int screendy;
    
    public void updatex(int x) {
        screendx = x;
    }
    public void updatey(int y) {
        screendy = y;
    }
    public static int receivex() {
        return screendx;
    }
    public static int receivey() {
        return screendy;
    }
}