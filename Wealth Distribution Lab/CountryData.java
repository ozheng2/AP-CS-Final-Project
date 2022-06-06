public class CountryData
{
    private String name;
    private int yearVar;
    private int population;
    private int[] incomeDeciles;
    public CountryData(StudentData incomeData, String country, String year) {
        int row = incomeData.getRow(country, year);
        if(row != -1)
        {
            name = incomeData.getFormattedData()[row][0];
            yearVar = Integer.parseInt(incomeData.getFormattedData()[row][1]);
            population = Integer.parseInt(incomeData.getFormattedData()[row][13]);
            incomeDeciles = new int[10];
            for(int i = 0; i < incomeDeciles.length; i++){
                String element = incomeData.getFormattedData()[row][2 + i];
                incomeDeciles[i] = Integer.parseInt(element);
            }
        }
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return yearVar;
    }
    public int getPopulation(){
        return population;
    }
    public int[] getIncomeDeciles(){
        return incomeDeciles;
    }
    public void setName(String n){
        name = n;
    }
    public void setYear(int y){
        yearVar = y;
    }public void setPopulation(int p){
        population = p;
    }
    public void setIncomeDeciles(int[] i){
        incomeDeciles = i;
    }
    public int totalIncome(){
        int sum = 0;
        for(int s : incomeDeciles) // $$$
            sum += s;
        return sum;
    }
    public double giniIndex(){
        double gini = 0.0;
        int total = totalIncome();
        int deciles = 0;
        for(int i = 0; i < incomeDeciles.length; i++){
            int d = 0;
            for(int j = 0; j <= i; j++){
                d += incomeDeciles[j];
            }
            if(i != 0 && i != incomeDeciles.length-1)
                deciles += 2 * d;
            else
                deciles += d;
        }
        gini = 1 - 0.1/total * deciles;
        return gini;
    }
}
