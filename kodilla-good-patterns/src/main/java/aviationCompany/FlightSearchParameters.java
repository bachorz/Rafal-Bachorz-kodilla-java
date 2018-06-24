package aviationCompany;

public class FlightSearchParameters {

    private String departure;
    private String arrival;
    private String stopover;

    public FlightSearchParameters(String departure, String arrival, String stopover) {
        this.departure = departure;
        this.arrival = arrival;
        this.stopover = stopover;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getStopover() {
        return stopover;
    }
}
