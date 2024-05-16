# JavaTaskCountry
package Country;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountryTask {
	
	 public static void main(String[] args) {

	        Map<String, Map<String, Set<String>>> country = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        
	        Map<String, Set<String>> usaMap = new HashMap<>();
	        usaMap.put("New York", Set.of("New York City", "Buffalo"));
	        usaMap.put("California", Set.of("Los Angeles", "San Francisco"));
	        usaMap.put("Texas", Set.of("Houston", "Austin"));
	        country.put("USA", usaMap);

	        
	        Map<String, Set<String>> indMap = new HashMap<>();
	        indMap.put("Maharashtra", Set.of("Mumbai", "Pune"));
	        indMap.put("Gujarat", Set.of("Ahmedabad", "Surat"));
	        indMap.put("Goa", Set.of("Panaji", "Margao"));
	        country.put("India", indMap);

	       
	        System.out.println("Select a country:");
	        for (String countryName : country.keySet()) {
	            System.out.println(countryName);
	        }

	        String selectedCountry = scanner.next();

	       
	        System.out.println("Select a state in " + selectedCountry + ":");
	        Map<String, Set<String>> stateCityMap = country.get(selectedCountry);
	        for (String state : stateCityMap.keySet()) {
	            System.out.println(state);
	        }

	        String selectedState = scanner.next();

	        
	        Set<String> cities = stateCityMap.get(selectedState);
	        System.out.println("Cities in " + selectedState + ": " + cities);
	    }

}


