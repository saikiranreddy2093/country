package com.iss.country.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class LocationController
{
    private static final Map<String, List<String>> countryStates=new HashMap<>();
    private static final Map<String, List<String>> stateCities=new HashMap<>();

    static {
        countryStates.put("India",
                Arrays.asList(
                        "Andhra Pradesh",
                        "Telangana",
                        "Karnataka",
                        "Tamil Nadu",
                        "Maharashtra",
                        "Kerala",
                        "Delhi",
                        "Uttar Pradesh",
                        "Gujarat",
                        "Rajasthan",
                        "Madhya Pradesh",
                        "Punjab",
                        "Haryana",
                        "West Bengal",
                        "Odisha"
                ));

        countryStates.put("USA",
                Arrays.asList(
                        "California",
                        "Texas",
                        "Florida",
                        "New York",
                        "Illinois",
                        "Pennsylvania",
                        "Ohio",
                        "Georgia",
                        "North Carolina",
                        "Michigan",
                        "Washington",
                        "Arizona",
                        "Virginia",
                        "New Jersey",
                        "Massachusetts"
                ));

        //==========================
// California
        stateCities.put("California",
                Arrays.asList(
                        "Los Angeles",
                        "San Diego",
                        "San Jose",
                        "San Francisco",
                        "Sacramento"
                ));

// Texas
        stateCities.put("Texas",
                Arrays.asList(
                        "Houston",
                        "Dallas",
                        "Austin",
                        "San Antonio",
                        "Fort Worth"
                ));

// Florida
        stateCities.put("Florida",
                Arrays.asList(
                        "Miami",
                        "Orlando",
                        "Tampa",
                        "Jacksonville",
                        "Tallahassee"
                ));

// New York
        stateCities.put("New York",
                Arrays.asList(
                        "New York City",
                        "Buffalo",
                        "Albany",
                        "Rochester",
                        "Syracuse"
                ));

// Illinois
        stateCities.put("Illinois",
                Arrays.asList(
                        "Chicago",
                        "Springfield",
                        "Naperville",
                        "Peoria",
                        "Rockford"
                ));

// Pennsylvania
        stateCities.put("Pennsylvania",
                Arrays.asList(
                        "Philadelphia",
                        "Pittsburgh",
                        "Harrisburg",
                        "Allentown",
                        "Erie"
                ));

// Ohio
        stateCities.put("Ohio",
                Arrays.asList(
                        "Columbus",
                        "Cleveland",
                        "Cincinnati",
                        "Toledo",
                        "Akron"
                ));

// Georgia
        stateCities.put("Georgia",
                Arrays.asList(
                        "Atlanta",
                        "Savannah",
                        "Augusta",
                        "Athens",
                        "Macon"
                ));

// North Carolina
        stateCities.put("North Carolina",
                Arrays.asList(
                        "Charlotte",
                        "Raleigh",
                        "Greensboro",
                        "Durham",
                        "Wilmington"
                ));

// Michigan
        stateCities.put("Michigan",
                Arrays.asList(
                        "Detroit",
                        "Grand Rapids",
                        "Lansing",
                        "Ann Arbor",
                        "Flint"
                ));

// Washington
        stateCities.put("Washington",
                Arrays.asList(
                        "Seattle",
                        "Spokane",
                        "Tacoma",
                        "Olympia",
                        "Bellevue"
                ));

// Arizona
        stateCities.put("Arizona",
                Arrays.asList(
                        "Phoenix",
                        "Tucson",
                        "Mesa",
                        "Scottsdale",
                        "Tempe"
                ));

// Virginia
        stateCities.put("Virginia",
                Arrays.asList(
                        "Virginia Beach",
                        "Richmond",
                        "Norfolk",
                        "Alexandria",
                        "Roanoke"
                ));

// New Jersey
        stateCities.put("New Jersey",
                Arrays.asList(
                        "Newark",
                        "Jersey City",
                        "Paterson",
                        "Trenton",
                        "Atlantic City"
                ));

// Massachusetts
        stateCities.put("Massachusetts",
                Arrays.asList(
                        "Boston",
                        "Worcester",
                        "Springfield",
                        "Cambridge",
                        "Lowell"
                ));

//=======================



// Andhra Pradesh
        stateCities.put("Andhra Pradesh",
                Arrays.asList(
                        "Visakhapatnam",
                        "Vijayawada",
                        "Guntur",
                        "Tirupati",
                        "Kurnool"
                ));

// Telangana
        stateCities.put("Telangana",
                Arrays.asList(
                        "Hyderabad",
                        "Warangal",
                        "Karimnagar",
                        "Nizamabad",
                        "Khammam"
                ));

// Karnataka
        stateCities.put("Karnataka",
                Arrays.asList(
                        "Bangalore",
                        "Mysore",
                        "Mangalore",
                        "Hubli",
                        "Belgaum"
                ));

// Tamil Nadu
        stateCities.put("Tamil Nadu",
                Arrays.asList(
                        "Chennai",
                        "Coimbatore",
                        "Madurai",
                        "Salem",
                        "Tiruchirappalli"
                ));

// Maharashtra
        stateCities.put("Maharashtra",
                Arrays.asList(
                        "Mumbai",
                        "Pune",
                        "Nagpur",
                        "Nashik",
                        "Aurangabad"
                ));

// Kerala
        stateCities.put("Kerala",
                Arrays.asList(
                        "Kochi",
                        "Thiruvananthapuram",
                        "Kozhikode",
                        "Thrissur",
                        "Kannur"
                ));

// Delhi
        stateCities.put("Delhi",
                Arrays.asList(
                        "New Delhi",
                        "Dwarka",
                        "Rohini",
                        "Saket",
                        "Karol Bagh"
                ));

// Uttar Pradesh
        stateCities.put("Uttar Pradesh",
                Arrays.asList(
                        "Lucknow",
                        "Kanpur",
                        "Agra",
                        "Varanasi",
                        "Noida"
                ));

// Gujarat
        stateCities.put("Gujarat",
                Arrays.asList(
                        "Ahmedabad",
                        "Surat",
                        "Vadodara",
                        "Rajkot",
                        "Gandhinagar"
                ));

// Rajasthan
        stateCities.put("Rajasthan",
                Arrays.asList(
                        "Jaipur",
                        "Jodhpur",
                        "Udaipur",
                        "Ajmer",
                        "Kota"
                ));

// Madhya Pradesh
        stateCities.put("Madhya Pradesh",
                Arrays.asList(
                        "Bhopal",
                        "Indore",
                        "Gwalior",
                        "Jabalpur",
                        "Ujjain"
                ));

// Punjab
        stateCities.put("Punjab",
                Arrays.asList(
                        "Ludhiana",
                        "Amritsar",
                        "Jalandhar",
                        "Patiala",
                        "Bathinda"
                ));

// Haryana
        stateCities.put("Haryana",
                Arrays.asList(
                        "Gurgaon",
                        "Faridabad",
                        "Panipat",
                        "Ambala",
                        "Hisar"
                ));

// West Bengal
        stateCities.put("West Bengal",
                Arrays.asList(
                        "Kolkata",
                        "Howrah",
                        "Durgapur",
                        "Siliguri",
                        "Asansol"
                ));

// Odisha
        stateCities.put("Odisha",
                Arrays.asList(
                        "Bhubaneswar",
                        "Cuttack",
                        "Rourkela",
                        "Puri",
                        "Sambalpur"
                ));



    }

    @GetMapping("/getCountries")
    public List<String> getCountries()
    {
        return new ArrayList<>(countryStates.keySet());
    }

    @GetMapping("/getStates")
    public List<String> getStates(@RequestParam String country)
    {
        return countryStates.getOrDefault(country,new ArrayList<>());
    }

    @GetMapping("/getCities")
    public List<String> getCities(@RequestParam String state)
    {
        return stateCities.getOrDefault(state,new ArrayList<>());
    }


}
