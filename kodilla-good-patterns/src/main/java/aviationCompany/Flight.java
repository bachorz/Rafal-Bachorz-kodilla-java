package aviationCompany;

import java.util.Objects;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    private String departureDay;

    public Flight(String departureAirport, String arrivalAirport, String departureDay) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDay = departureDay;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(arrivalAirport, flight.arrivalAirport) && Objects.equals(departureDay, flight.departureDay);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport, arrivalAirport, departureDay);
    }

    @Override
    public String toString() {
        return "Flight: " + "departureAirport ='" + departureAirport + '\'' + ", arrivalAirport='" + arrivalAirport + '\'' + ", departureDay='" + departureDay + '\'' + '}';
    }
}
