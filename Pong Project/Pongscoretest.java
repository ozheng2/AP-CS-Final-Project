public class Pongscoretest {
    public static void main(String[] args) {
        
	System.out.println("PongScore ps1 = new PongScore();");
        PongScore ps1 = new PongScore();
	System.out.println("PongScore ps2 = new PongScore();");
        PongScore ps2 = new PongScore();
	System.out.println("PongScore ps3 = new PongScore();");
        PongScore ps3 = new PongScore();

	System.out.println();
        System.out.println("ps1.getScore() should be 0: " + ps1.getScore());
        System.out.println("ps2.getScore() should be 0: " + ps2.getScore());
        System.out.println("ps3.getScore() should be 0: " + ps3.getScore());

	System.out.println();
	System.out.println("ps1.scorePoints(1);");
        ps1.scorePoints(1);
	System.out.println("ps2.scorePoints(2);");
        ps2.scorePoints(2);
	System.out.println("ps3.scorePoints(3);");
        ps3.scorePoints(3);
        
        System.out.println();
        System.out.println("ps1.getScore() should be 1: " + ps1.getScore());
        System.out.println("ps2.getScore() should be 2: " + ps2.getScore());
        System.out.println("ps3.getScore() should be 3: " + ps3.getScore());

	System.out.println();
	System.out.println("ps1.scorePoints(4);");
        ps1.scorePoints(4);
	System.out.println("ps2.scorePoints(5);");
        ps2.scorePoints(5);
	System.out.println("ps3.scorePoints(6);");
        ps3.scorePoints(6);

        System.out.println();
        System.out.println("ps1.getScore() should be 5: " + ps1.getScore());
        System.out.println("ps2.getScore() should be 7: " + ps2.getScore());
        System.out.println("ps3.getScore() should be 9: " + ps3.getScore());
    }
}