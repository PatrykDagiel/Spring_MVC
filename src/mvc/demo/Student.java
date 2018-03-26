package mvc.demo;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguages;
    private String favoriteLanguage;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("PL", "Poland");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");

        favoriteLanguages = new LinkedHashMap<>();
        favoriteLanguages.put("Java", "Java");
        favoriteLanguages.put("C#", "C#");
        favoriteLanguages.put("Basic", "Basic");

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
