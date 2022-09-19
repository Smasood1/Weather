import java.util.Scanner;

public class weather {

//Prompt a user to enter if they think the temperature is High, Low or Humid
//Based on the user's input print out one of these
//High: print out " sunblock may be needed"
//Low : print out " a coat may be needed"
//Humid: print out " it's muggy!"

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String weather;
        System.out.println("Do you think the temperature is High, Low, or Humid?");
        weather = in.next();

        System.out.println(checkWeather(weather));


    }

    public static String checkWeather(String temp){
        if(temp.equalsIgnoreCase("High")){
            return ("Sunblock may be needed");

        }
        else if (temp.equalsIgnoreCase("Low")){
            return ("A coat may be needed");
        }
        else if(temp.equalsIgnoreCase("Humid")){
            return ("its muggy");
        }
        else{
            return "n/a";
        }


    }






}
