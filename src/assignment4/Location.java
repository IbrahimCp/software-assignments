package assignment4;

public record Location(String country, String city) {

    public String country() {
        return this.country;
    }

    public String city() {
        return this.city;
    }
}