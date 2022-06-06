import java.util.*;

public class PongBallTimer 
    extends TimerTask {

    private PongBall ball;
    private PongCanvas canvas;
    private PongScore p1;
    private PongScore p2;
    private PongPaddle paddle1;
    private PongPaddle paddle2;

    public PongBallTimer(PongBall ball, 
                         PongCanvas canvas,
                         PongPaddle paddle1,
                         PongPaddle paddle2,
                         PongScore player1,
                         PongScore player2) {
        this.ball = ball;
        this.canvas = canvas;
        p1 = player1;
        p2 = player2;

        this.paddle1 = paddle1;
        this.paddle2 = paddle2;
    }

    public void run() {

        // There is some bad hard coding here that should be
        // replaced with calls the the PongCanvas to determine
        // when the ball hits the borders!

        // Also there are thread synchronization issues with the
        // paddle motion and the ball motion that lead to the ball
        // occasionally getting stuck to the paddle.  Right now
        // it seems that the ball will always disloge itself, 
        // particuarly if the paddle is moved.

        // Walls...
        if (ball.getX() <= 9 ||
            ball.getX() >= canvas.getBounds().getWidth() - 5 - 4) {
            ball.bounceX();

            if (ball.getX() <= 9) {
                if (ball.getY() <= (canvas.getBounds().getHeight() - 30)/2 - 45 ||
                    ball.getY() >= (canvas.getBounds().getHeight() - 30)/2 + 45) {
                    p2.scorePoints(1);
                }
                else if (ball.getY() >= (canvas.getBounds().getHeight() - 30)/2 - 15 &&
                         ball.getY() <= (canvas.getBounds().getHeight() - 30)/2 + 15) {
                    p2.scorePoints(5);
                }
                else {
                    p2.scorePoints(3);
                }
            }
            else {
                if (ball.getY() <= (canvas.getBounds().getHeight() - 30)/2 - 45 ||
                    ball.getY() >= (canvas.getBounds().getHeight() - 30)/2 + 45) {
                    p1.scorePoints(1);
                }
                else if (ball.getY() >= (canvas.getBounds().getHeight() - 30)/2 - 15 &&
                         ball.getY() <= (canvas.getBounds().getHeight() - 30)/2 + 15) {
                    p1.scorePoints(5);
                }
                else {
                    p1.scorePoints(3);
                }
            }
            
            ball.move();
        }

        if (ball.getY() <= 9 ||
            ball.getY() >= canvas.getBounds().getHeight() - 32 - 4) {
            ball.bounceY();
        }
       
        // Paddles...
        if (ball.getY() >= paddle1.getTopY() &&
            ball.getY() <= paddle1.getBottomY() &&
            ball.getX() >= paddle1.getLeftX() - 4 &&
            ball.getX() <= paddle1.getRightX() + 4) {
            ball.bounceX();
            ball.move();
        }
        else if (ball.getY() >= paddle1.getTopY() - 4 &&
                 ball.getY() <= paddle1.getBottomY() + 4 &&
                 ball.getX() >= paddle1.getLeftX() &&
                 ball.getX() <= paddle1.getRightX()) {
            ball.bounceY();
            ball.move();
        }
        else if (ball.getY() >= paddle1.getTopY() - 4 &&
                 ball.getY() <= paddle1.getBottomY() + 4 &&
                 ball.getX() >= paddle1.getLeftX() - 4 &&
                 ball.getX() <= paddle1.getRightX() + 4) {
            ball.bounceY();
            ball.bounceX();
            ball.move();
        }


        if (ball.getY() >= paddle2.getTopY() &&
            ball.getY() <= paddle2.getBottomY() &&
            ball.getX() >= paddle2.getLeftX() - 4 &&
            ball.getX() <= paddle2.getRightX() + 4) {
            ball.bounceX();
            ball.move();
        }
        else if (ball.getY() >= paddle2.getTopY() - 4 &&
                 ball.getY() <= paddle2.getBottomY() + 4 &&
                 ball.getX() >= paddle2.getLeftX() &&
                 ball.getX() <= paddle2.getRightX()) {
            ball.bounceY();
            ball.move();
        }
        else if (ball.getY() >= paddle2.getTopY() - 4 &&
                 ball.getY() <= paddle2.getBottomY() + 4 &&
                 ball.getX() >= paddle2.getLeftX() - 4 &&
                 ball.getX() <= paddle2.getRightX() + 4) {
            ball.bounceY();
            ball.bounceX();
            ball.move();
        }

        ball.move();
        canvas.repaint();
    }
}
