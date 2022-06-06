import java.util.*;
public class driver
{
    public static void main(String[]args)
    {
        StudentData file = new StudentData("RawIncomeData.csv");
        
        Scanner input = new Scanner(System.in);
        String name = "";
        String year = "";
        CountryData country;

        System.out.println("Greetings! Welcome to the Gini Index calculator!");
        
        while(!name.equals("q") && !year.equals("q")){
            System.out.println("Which country would you like to know about "
            + "(type q to quit)?  >>");
            name = input.nextLine().toLowerCase();
            if(!name.equals("q")){
                System.out.println("Which year?  >>");
                year = input.nextLine();
                if(!year.equals("q")){
                    if(!name.equals(" "))
                        while(name.substring(0,1).equals(" ") 
                        || name.substring(name.length()-1).equals(" ")){
                            if(name.substring(0,1).equals(" "))
                                name = name.substring(1);
                            if(name.substring(name.length() - 1).equals(" "))
                                name = name.substring(0,name.length()-1);
                        }
                    for(int i = 0; i < name.length(); i++)
                    {
                        if(name.substring(i,i+1).equals(" ")){
                            name = name.substring(0, i+1)
                            + name.substring(i+1, i+2).toUpperCase() 
                            + name.substring(i+2);
                        }
                    }
                    if(!year.equals(" "))
                        while(year.substring(0,1).equals(" ") 
                        || year.substring(year.length()-1).equals(" ")){
                            if(year.substring(0,1).equals(" "))
                                year = year.substring(1);
                            if(year.substring(year.length() - 1).equals(" "))
                                year = year.substring(0,year.length()-1);
                        }
                    name = name.substring(0,1).toUpperCase() + name.substring(1);
                    country = new CountryData(file, name, year);
                    if(country.getName() == null){
                        System.out.println("Sorry, the data is not available for this"
                        + " country and/or year. \n");
                    }
                    else{
                        System.out.println("What would you like to know (Population / "
                        + "Income Deciles / Total Income / Gini Index)?  >>");
                        String answer = input.nextLine().toLowerCase();
                        if(answer.equals("population"))
                            System.out.println(country.getName() + "'s population in " 
                            + country.getYear() + " was " + country.getPopulation() + "\n");
                        else if(answer.equals("income deciles"))
                            System.out.println(country.getName() + "'s income deciles in " 
                            + country.getYear() + " were \n" 
                            + Arrays.toString(country.getIncomeDeciles()) + "\n");
                        else if(answer.equals("total income"))
                            System.out.println(country.getName() + "'s total income in " 
                            + country.getYear() + " was " + country.totalIncome() + "\n");
                        else if(answer.equals("gini index"))
                            System.out.println(country.getName() + "'s Gini Index in " 
                            + country.getYear() + " was " + country.giniIndex() + "\n");
                        else
                            System.out.println("Sorry, the data for " + answer
                            + " is not available\n");
                    }
                }
            }
        }
        System.out.println("Thank you for using the Gini Index Calculator!");
        input.close();
        
        /*CountryData Japan = new CountryData(file, "Japan", "2014");
        CountryData US = new CountryData(file, "United States", "2000");
        CountryData Norway = new CountryData(file, "Norway", "2010");

        System.out.println("Name: " + Japan.getName());
        System.out.println("Year: " + Japan.getYear());
        System.out.println("Population: " + Japan.getPopulation());
        System.out.println("Japan's total income " + Japan.totalIncome());
        System.out.println("Japan’s Gini index in 2014 was " + Japan.giniIndex());
        System.out.println();
        
        System.out.println("Name: " + US.getName());
        System.out.println("Year: " + US.getYear());
        System.out.println("Population: " + US.getPopulation());
        System.out.println("US' total income " + Japan.totalIncome());
        System.out.println("United States’s Gini index in 2000 was " + US.giniIndex());
        System.out.println();
        
        System.out.println("Name: " + Norway.getName());
        System.out.println("Year: " + Norway.getYear());
        System.out.println("Population: " + Norway.getPopulation());
        System.out.println("Norway's total income " + Japan.totalIncome());
        System.out.println("Norway’s Gini index in 2010 was " + Norway.giniIndex());
        System.out.println();*/
    }
}
