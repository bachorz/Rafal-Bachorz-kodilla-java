package AviationCompany;

public class Application {

    public static void main(String[] args){

        Arrival theArrival = new Arrival();
        theArrival.arrivalPar();

        Departure theDeparture = new Departure();
        theDeparture.departurePar();

        Stopover theStopover = new Stopover();
        theStopover.stopoverPar();
    }
}
