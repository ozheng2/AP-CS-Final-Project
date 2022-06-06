import java.awt.Rectangle;
public class PongPaddle extends Rectangle
{
    public PongPaddle(int top, int left, int w, int h){
        super(left, top, w, h);
    }
    public int getBottomY()
    {
        return getTopY() + (int)super.getHeight() - 1;
    }
    public int getLeftX()
    {
        return (int)super.getX();
    }
    public int getRightX()
    {
        return getLeftX() + (int)super.getWidth() - 1;
    }
    public int getTopY()
    {
        return (int)super.getY();
    }
    public void moveDown(int d)
    {
        super.translate(0, d);
    }
    public void moveUp(int d)
    {
        super.translate(0, -d);
    }
}