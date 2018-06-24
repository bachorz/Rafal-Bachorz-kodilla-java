package aviationCompany;

import java.util.Objects;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    private String stopover;
    private String departureDay;

    public Flight(String departureAirport, String arrivalAirport, String stopover, String departureDay) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.stopover = stopover;
        this.departureDay = departureDay;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getStopover() {
        return stopover;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(arrivalAirport, flight.arrivalAirport)
                && Objects.equals(stopover, flight.stopover);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport, arrivalAirport, stopover);
    }

    @Override
    public String toString() {
        return "Flight{" + "departureAirport = '" + departureAirport + '\'' + ", arrivalAirport = '" + arrivalAirport
                + '\'' + ", stopover = '" + stopover + '\'' + ", departureDay = '" + departureDay + '\'' + "."+'}';
    }
}
