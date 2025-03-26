public class T1_Address {
    private String street, house,city;
    private int zip_code;

    public T1_Address(String street, String house, String city, int zip_code) {
        this.street = street;
        this.house = house;
        this.city = city;
        this.zip_code = zip_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }
    @Override
    public String toString() {
        return "Address: " + street + ", House#: " + house+ ", " + city + " - " + zip_code;
    }
}
