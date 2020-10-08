package exception;

public class CountryNotFoundException extends Exception {
    private long country_id;
    public CountryNotFoundException(long country_id){
        super(String.format("Country is not found with id:'%s'",country_id));
    }
}
