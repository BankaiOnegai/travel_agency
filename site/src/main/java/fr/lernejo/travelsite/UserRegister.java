package fr.lernejo.travelsite;

public record UserRegister(String userEmail, String userName, String userCountry, WeatherExpectation weatherExpectation, int minimumTemperatureDistance){
}
