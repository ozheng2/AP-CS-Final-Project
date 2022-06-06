public class PongScore
{
    private int score;
    public PongScore(){
        score = 0;
    }
    public int getScore()
    {
        return score;
    }
    public void scorePoints(int points)
    {
        score += points;
    }
}