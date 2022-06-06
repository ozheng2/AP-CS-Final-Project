public class Pongballtest {
    public static void main(String[] args) {
        
	System.out.println("PongBall b1 = new PongBall(5,10,2,4);");
        PongBall b1 = new PongBall(5,10,2,4);

	System.out.println("PongBall b2 = new PongBall(0,0,1,2);");
        PongBall b2 = new PongBall(0,0,1,2);

        System.out.println();
        System.out.println("b1.getX() should be 5: " + b1.getX());
	System.out.println("b1.getY() should be 10: " + b1.getY());
        System.out.println("b2.getX() should be 0: " + b2.getX());
	System.out.println("b2.getY() should be 0: " + b2.getY());

        System.out.println();
	System.out.println("b1.move();");
        b1.move();
	System.out.println("b2.move();");
        b2.move();

        System.out.println();
        System.out.println("b1.getX() should be 7: " + b1.getX());
	System.out.println("b1.getY() should be 14: " + b1.getY());
        System.out.println("b2.getX() should be 1: " + b2.getX());
	System.out.println("b2.getY() should be 2: " + b2.getY());

        System.out.println();
	System.out.println("b1.move();");
        b1.move();
	System.out.println("b2.move();");
        b2.move();

        System.out.println();
        System.out.println("b1.getX() should be 9: " + b1.getX());
	System.out.println("b1.getY() should be 18: " + b1.getY());
        System.out.println("b2.getX() should be 2: " + b2.getX());
	System.out.println("b2.getY() should be 4: " + b2.getY());

        System.out.println();
	System.out.println("b1.bounceX();");
        b1.bounceX();
	System.out.println("b2.bounceX();");
        b2.bounceX();

        System.out.println();
	System.out.println("b1.move();");
        b1.move();
	System.out.println("b2.move();");
        b2.move();        

        System.out.println();
        System.out.println("b1.getX() should be 7: " + b1.getX());
	System.out.println("b1.getY() should be 22: " + b1.getY());
        System.out.println("b2.getX() should be 1: " + b2.getX());
	System.out.println("b2.getY() should be 6: " + b2.getY());

        System.out.println();
	System.out.println("b1.bounceY();");
        b1.bounceY();
	System.out.println("b2.bounceY();");
        b2.bounceY();

        System.out.println();
	System.out.println("b1.move();");
        b1.move();
	System.out.println("b2.move();");
        b2.move();

        System.out.println();
        System.out.println("b1.getX() should be 5: " + b1.getX());
	System.out.println("b1.getY() should be 18: " + b1.getY());
        System.out.println("b2.getX() should be 0: " + b2.getX());
	System.out.println("b2.getY() should be 4: " + b2.getY());
    }
}