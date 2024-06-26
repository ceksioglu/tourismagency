package entity;

import java.util.List;

/**
 * Represents a hotel with various attributes such as name, city, region, address, email, phone, stars, facilities, and pension types.
 */

public class Hotel {
    private int id;
    private String name;
    private String city;
    private String region;
    private String address;
    private String email;
    private String phone;
    private int stars;
    private List<Facility> facilities;
    private List<PensionType> pensionTypes;

    public enum Facility {
        FREE_PARKING,
        FREE_WIFI,
        SWIMMING_POOL,
        FITNESS_CENTER,
        HOTEL_CONCIERGE,
        SPA,
        ROOM_SERVICE
    }

    public enum PensionType {
        ULTRA_ALL_INCLUSIVE,
        ALL_INCLUSIVE,
        ROOM_BREAKFAST,
        FULL_BOARD,
        HALF_BOARD,
        BED_ONLY,
        NO_ALCOHOL_FULL_CREDIT
    }

    /**
     * Constructs a new Hotel object.
     *
     * @param id The unique identifier for the hotel.
     * @param name The name of the hotel.
     * @param city The city where the hotel is located.
     * @param region The region where the hotel is located.
     * @param address The address of the hotel.
     * @param email The email contact of the hotel.
     * @param phone The phone contact of the hotel.
     * @param stars The star rating of the hotel.
     * @param facilities The list of facilities offered by the hotel.
     * @param pensionTypes The list of pension types offered by the hotel.
     */

    public Hotel(int id, String name, String city, String region, String address, String email, String phone, int stars, List<Facility> facilities, List<PensionType> pensionTypes) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.region = region;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.stars = stars;
        this.facilities = facilities;
        this.pensionTypes = pensionTypes;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public List<PensionType> getPensionTypes() {
        return pensionTypes;
    }

    public void setPensionTypes(List<PensionType> pensionTypes) {
        this.pensionTypes = pensionTypes;
    }
}
