package CountryPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Map<String, Map<String, Map<String, String>>> worldData = new HashMap<>();
        
        Map<String, Map<String, String>> indiaData = new HashMap<>();  
        
        
        Map<String, String> maharashtraDistricts = new HashMap<>();
        maharashtraDistricts.put("Satara", "Wathar, Vikhale, Devur");
        maharashtraDistricts.put("Pune", "Pimpri, Chinchwad, Talegaon");
        indiaData.put("Maharashtra", maharashtraDistricts);
        
        Map<String, String> gujaratDistricts = new HashMap<>();
        gujaratDistricts.put("Ahmedabad", "Gota, Maninagar, Sabarmati");
        gujaratDistricts.put("Surat", "Adajan, Vesu, Katargam");
        indiaData.put("Gujarat", gujaratDistricts);
        
        worldData.put("India", indiaData);

        // Adding data for Pakistan
        Map<String, Map<String, String>> pakistanData = new HashMap<>();
        Map<String, String> sindhDistricts = new HashMap<>();
        sindhDistricts.put("Karachi", "Clifton, Gulshan, Korangi");
        sindhDistricts.put("Hyderabad", "Latifabad, Qasimabad, Paretabad");
        pakistanData.put("Sindh", sindhDistricts);
        
        Map<String, String> punjabDistrictsPak = new HashMap<>();
        punjabDistrictsPak.put("Lahore", "Model Town, Gulberg, Johar Town");
        punjabDistrictsPak.put("Faisalabad", "Jinnah Colony, Peoples Colony, Madina Town");
        pakistanData.put("Punjab", punjabDistrictsPak);
        
        worldData.put("Pakistan", pakistanData);

        // Adding data for China
        Map<String, Map<String, String>> chinaData = new HashMap<>();
        Map<String, String> guangdongDistricts = new HashMap<>();
        guangdongDistricts.put("Guangzhou", "Tianhe, Yuexiu, Haizhu");
        guangdongDistricts.put("Shenzhen", "Nanshan, Futian, Luohu");
        chinaData.put("Guangdong", guangdongDistricts);
        
        Map<String, String> shanghaiDistricts = new HashMap<>();
        shanghaiDistricts.put("Pudong", "Lujiazui, Zhangjiang, Jinqiao");
        shanghaiDistricts.put("Huangpu", "The Bund, Nanjing Road, Yu Garden");
        chinaData.put("Shanghai", shanghaiDistricts);
        
        worldData.put("China", chinaData);

        // Adding data for Japan
        Map<String, Map<String, String>> japanData = new HashMap<>();
        Map<String, String> tokyoDistricts = new HashMap<>();
        tokyoDistricts.put("Chiyoda", "Akihabara, Marunouchi, Otemachi");
        tokyoDistricts.put("Shibuya", "Harajuku, Ebisu, Daikanyama");
        japanData.put("Tokyo", tokyoDistricts);
        
        Map<String, String> osakaDistricts = new HashMap<>();
        osakaDistricts.put("Kita", "Umeda, Temmabashi, Nakazaki");
        osakaDistricts.put("Naniwa", "Namba, Shinsekai, Dotonbori");
        japanData.put("Osaka", osakaDistricts);
        
        worldData.put("Japan", japanData);

        // Adding data for America
        Map<String, Map<String, String>> americaData = new HashMap<>();
        Map<String, String> californiaDistricts = new HashMap<>();
        californiaDistricts.put("Los Angeles", "Hollywood, Venice, Beverly Hills");
        californiaDistricts.put("San Francisco", "Chinatown, Fisherman's Wharf, Mission District");
        americaData.put("California", californiaDistricts);
        
        Map<String, String> texasDistricts = new HashMap<>();
        texasDistricts.put("Houston", "Downtown, Midtown, Montrose");
        texasDistricts.put("Dallas", "Uptown, Oak Lawn, Deep Ellum");
        americaData.put("Texas", texasDistricts);
        
        worldData.put("America", americaData);
        


        // User interaction to select country, state, and district
        System.out.println("Please select the country number:");
        System.out.println("1. India\n2. Pakistan\n3. China\n4. Japan\n5. America");
        int countryChoice = sc.nextInt();
        sc.nextLine();  // consume newline left-over

        String selectedCountry = "";
        switch (countryChoice) {
            case 1:
                selectedCountry = "India";
                break;
            case 2:
                selectedCountry = "Pakistan";
                break;
            case 3:
                selectedCountry = "China";
                break;
            case 4:
                selectedCountry = "Japan";
                break;
            case 5:
                selectedCountry = "America";
                break;
            default:
                System.out.println("Invalid country choice.");
                System.exit(0);
        }

        Map<String, Map<String, String>> selectedCountryData = worldData.get(selectedCountry);
        System.out.println("These are the states of " + selectedCountry + ":");
        System.out.println(selectedCountryData.keySet());

        System.out.println("Select the state:");
        String stateChoice = sc.nextLine();

        if (selectedCountryData.containsKey(stateChoice)) {
            Map<String, String> selectedStateData = selectedCountryData.get(stateChoice);
            System.out.println("These are the districts of " + stateChoice + ":");
            System.out.println(selectedStateData.keySet());

            System.out.println("Select the district:");
            String districtChoice = sc.nextLine();

            if (selectedStateData.containsKey(districtChoice)) {
                System.out.println("These are the cities of " + districtChoice + ":");
                System.out.println(selectedStateData.get(districtChoice));
            } else {
                System.out.println("Invalid district choice.");
            }
        } else {
            System.out.println("Invalid state choice.");
        }

        sc.close();
    }
}
