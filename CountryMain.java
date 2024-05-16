package CountryPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMain {
    public static void main(String[] args) {
        
        Map<String, Map<String, Map<String,String>>> country = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Information for USA
        Map<String, Map<String,String>> usaMap = new HashMap<>();
        Map<String,String> usaCity = new HashMap<>();
        usaCity.put("Alaska", "Juneau");
        usaCity.put("New York", "New York City");
        usaCity.put("New Jersey", "Trenton");
        usaMap.put("USA", usaCity);
        country.put("USA", usaMap);

        // Information for China
        Map<String, Map<String,String>> chinaMap = new HashMap<>();
        Map<String,String> chinaCity = new HashMap<>();
        chinaCity.put("Beijing", "Beijing");
        chinaCity.put("Shanghai", "Shanghai");
        chinaCity.put("Guangdong", "Guangzhou");
        chinaMap.put("China", chinaCity);
        country.put("China", chinaMap);

        // Information for Pakistan
        Map<String, Map<String,String>> pakistanMap = new HashMap<>();
        Map<String,String> pakistanCity = new HashMap<>();
        pakistanCity.put("Punjab", "Lahore");
        pakistanCity.put("Sindh", "Karachi");
        pakistanCity.put("Khyber Pakhtunkhwa", "Peshawar");
        pakistanMap.put("Pakistan", pakistanCity);
        country.put("Pakistan", pakistanMap);

        System.out.println("Select a country:");
        for (String countryName : country.keySet()) {
            System.out.println(countryName);
        }

        String selectedCountry = scanner.next();

        // Display states in the selected country
        System.out.println("Select a state in " + selectedCountry + ":");
        Map<String, Map<String,String>> stateCityMap = country.get(selectedCountry);
        
        // Check if stateCityMap is null (no such country found)
        if (stateCityMap == null) {
            System.out.println("No such country found.");
        } else {
            for (String state : stateCityMap.keySet()) {
                System.out.println(state);
            }

            String selectedState = scanner.next();

            // Retrieve cities associated with the selected state
            Map<String,String> cityMap = stateCityMap.get(selectedState);
            System.out.println("Cities in " + selectedState + ":");
            for (String city : cityMap.keySet()) {
                System.out.println(city);
            }
        }
    }
}
