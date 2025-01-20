//Mariah Dungey 01/19/25
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        String city = "Columbus";
        int zip = 43228;
        double[] temps = {32,25,27,40,45};
        double totaltemp = 0;

        for(int i = 0; i< temps.length; i++){
            System.out.println(temps[i]);
            totaltemp += temps[i];
        }

        double avg = totaltemp/5;
        System.out.println("The City: " + city + ", Zip code " + zip + ", The average high temperature: " + avg);



    }
}
