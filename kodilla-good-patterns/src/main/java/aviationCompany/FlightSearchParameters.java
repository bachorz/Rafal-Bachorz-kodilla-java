package aviationCompany;

public class FlightSearchParameters {

    private String departure;
    private String arrival;

    public FlightSearchParameters(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
