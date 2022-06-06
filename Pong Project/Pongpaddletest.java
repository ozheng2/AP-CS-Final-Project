public class Pongpaddletest {
    public static void main(String[] args) {
        
	System.out.println("PongPaddle pp1 = new PongPaddle(10,20,15,20);");
        PongPaddle pp1 = new PongPaddle(10,20,15,20);
	System.out.println("PongPaddle pp2 = new PongPaddle(100,200,20,30);");
        PongPaddle pp2 = new PongPaddle(100,200,20,30);

	System.out.println();
	System.out.println("pp1.getTopY() should be 10: " + pp1.getTopY());
        System.out.println("pp1.getLeftX() should be 20: " + pp1.getLeftX());
	System.out.println("pp2.getTopY() should be 100: " + pp2.getTopY());
        System.out.println("pp2.getLeftX() should be 200: " + pp2.getLeftX());

        System.out.println();
	System.out.println("pp1.getBottomY() should be 29: " + pp1.getBottomY());
        System.out.println("pp1.getRightX() should be 34: " + pp1.getRightX());
	System.out.println("pp2.getBottomY() should be 129: " + pp2.getBottomY());
        System.out.println("pp2.getRightX() should be 219: " + pp2.getRightX());

        System.out.println();
	System.out.println("pp1.moveDown(5);");
        pp1.moveDown(5);
	System.out.println("pp2.moveDown(10);");
        pp2.moveDown(10);

	System.out.println();
	System.out.println("pp1.getTopY() should be 15: " + pp1.getTopY());
        System.out.println("pp1.getLeftX() should be 20: " + pp1.getLeftX());
	System.out.println("pp2.getTopY() should be 110: " + pp2.getTopY());
        System.out.println("pp2.getLeftX() should be 200: " + pp2.getLeftX());

        System.out.println();
	System.out.println("pp1.getBottomY() should be 34: " + pp1.getBottomY());
        System.out.println("pp1.getRightX() should be 34: " + pp1.getRightX());
	System.out.println("pp2.getBottomY() should be 139: " + pp2.getBottomY());
        System.out.println("pp2.getRightX() should be 219: " + pp2.getRightX());

        System.out.println();
	System.out.println("pp1.moveUp(10);");
        pp1.moveUp(10);
	System.out.println("pp2.moveUp(20);");
        pp2.moveUp(20);

	System.out.println();
	System.out.println("pp1.getTopY() should be 5: " + pp1.getTopY());
        System.out.println("pp1.getLeftX() should be 20: " + pp1.getLeftX());
	System.out.println("pp2.getTopY() should be 90: " + pp2.getTopY());
        System.out.println("pp2.getLeftX() should be 200: " + pp2.getLeftX());

        System.out.println();
	System.out.println("pp1.getBottomY() should be 24: " + pp1.getBottomY());
        System.out.println("pp1.getRightX() should be 34: " + pp1.getRightX());
	System.out.println("pp2.getBottomY() should be 119: " + pp2.getBottomY());
        System.out.println("pp2.getRightX() should be 219: " + pp2.getRightX());
    }
}