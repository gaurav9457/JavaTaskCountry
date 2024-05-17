package Country;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
     static String cities;
	 public static void main(String[] args) {
	        Map<Integer, String> countryMap = new HashMap<>();
	        Map<String, Integer> stateMap = new HashMap<>();
	        Map<String, String> cityMap = new HashMap<>();

	        countryMap.put(1, "India");
	        countryMap.put(2, "USA");
	        countryMap.put(3, "Pakistan");
	        countryMap.put(4, "China");
	        countryMap.put(5, "Japan");

	        stateMap.put("MAHARASHTRA", 1);
	        stateMap.put("GUJARAT", 1);
	        stateMap.put("GOA", 1);
	        stateMap.put("RAJASTAN", 1);
	        

	        stateMap.put("NEWYORK", 2);
	        stateMap.put("ALASKA", 2);
	        stateMap.put("FLORIDA", 2);
	        stateMap.put("CALIFORNIA", 2);

	        stateMap.put("SINDH", 3);
	        stateMap.put("BALOCHISTAN", 3);
	        stateMap.put("PAKHTUNKHWA", 3);
	        stateMap.put("PUNJAB", 3);
	        
	        stateMap.put("FUJIAN", 4);
	        stateMap.put("HUNAN", 4);
	        stateMap.put("YUNAN", 4);
	        stateMap.put("SICHUAN", 4);
	        
	        stateMap.put("TOKYO", 5);
	        stateMap.put("OSAKA", 5);
	        

	        cityMap.put("MAHARASHTRA", "Pune, Mumbai, Jalgaon , Nashik");
	        cityMap.put("GUJARAT", "Gota, Maninagar, Sabarmati");
	        cityMap.put("GOA", "Panji , Madgaon , Mapusa, Canacona");
	        cityMap.put("RAJASTAN", "Jaipur , Ajmer , Udaipur , Pali");

	        cityMap.put("NEWYORK", "Newyorkcity , Buffalo ,Yonkers");
	        cityMap.put("ALASKA", "Juneau , Nome , Kenia");
	        cityMap.put("FLORIDA", "Tampa , Orlando , Petersburg ,Miami");
	        cityMap.put("CALIFORNIA", "Nevada , Sanjose , Sanfrancisco ,Losangeles");

	        cityMap.put("SINDH", "Karachi, Jacobabad");
	        cityMap.put("BALOCHISTAN", "Quetta, Gwadar");
	        cityMap.put("PAKHTUNKHWA", "Swabi , Kohat ,Mingora");
	        cityMap.put("PUNJAB", "Thatta, Moro");
	        
	        cityMap.put("FUJIAN", "Nanping ,Putian ,Sanming ,Longyan");
	        cityMap.put("HUNAN", "Changde ,Shaoyang ,Changsha ,Yueyang");
	        cityMap.put("YUNAN", "Kunming ,Lijiang , Yuxi ,Dali");
	        cityMap.put("SICHUAN", "Chengdu ,Leshan ,Zigong ,Yibin");
	        
	        cityMap.put("TOKYO", "Nanping ,Putian");
	        cityMap.put("OSAKA", "Changde ,Shaoyang");
	        
	        
	        System.out.println("==============Please select the country :===================");
	        System.out.println("1. India\n2. USA\n3. Pakistan\n4. China\n5. Japan");

	        Scanner scanner = new Scanner(System.in);
	        int countryChoice = scanner.nextInt();

	        String selectedCountry = countryMap.get(countryChoice);
	        if (selectedCountry == null) {
	            System.out.println("Invalid country choice.");
	            System.exit(0);
	        }
             String displayState="";
	        boolean flag=false;
	        System.out.println("States in " + selectedCountry + ":");
	        for (Map.Entry<String, Integer> entry : stateMap.entrySet()) {
	            if (entry.getValue() == countryChoice) {
	                System.out.println(entry.getKey());
	                flag=true;
	                displayState +=entry.getKey()+ " ,";
	            }
	        }
	       // System.out.println(displayState+" jhdjhdjd");
	        if (!flag) {
	            System.out.println("State not listed.");
	            System.exit(0);
	        }


	        scanner.nextLine(); 
	        System.out.print("Enter state: ");
	        String stateChoice = scanner.nextLine().toUpperCase();
	       
	        if (displayState.contains(stateChoice)) {
	        	
	        	 cities = cityMap.get(stateChoice);
			}
	        else {
				System.out.println("State Not listed");
				System.exit(0);
			}
	       
	        if ( stateChoice.equals(" ")) {
	            System.out.println("Invalid state choice.");
	            
	        }
	        

	        System.out.println("Cities in " + stateChoice + ": " + cities);
	        System.out.print("Enter City: ");	        
	        String cityChoice = scanner.nextLine();
	        String lower= cityChoice.toLowerCase();
	             if (cityChoice.equals("")) {
	 	        	System.out.println("Please enter correct city");
	 	            System.exit(0);
	 	            
	 			}
	             String finalCityChoice=(""+lower.charAt(0)).toUpperCase()+lower.substring(1);
	              
	        if (!cities.contains(finalCityChoice)) {
	        	System.out.println("Invalid city choice.City not listed");
	        	
	            System.exit(0);
			}
	        else if (finalCityChoice.equals("")) {
	        	System.out.println("Invalid city choice.");
	            System.exit(0);
			}
	        else {
	        	System.out.println("User selected Country : "+selectedCountry+" , State : "
	        	        +stateChoice+" , City : "+finalCityChoice);
			}
	        
	        
	    }

}
