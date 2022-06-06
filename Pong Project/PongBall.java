public class PongBall
{
    private int x;
    private int y;
    private int xVelocity;
    private int yVelocity;
    public PongBall(int initX, int initY, int initXVel, int initYVel){
        x = initX;
        y = initY;
        xVelocity = initXVel;
        yVelocity = initYVel;
    }
    public void bounceX()
    {
        xVelocity = -xVelocity;
    }
    public void bounceY()
    {
        yVelocity = -yVelocity;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void move()
    {
        x += xVelocity;
        y += yVelocity;
    }
}
