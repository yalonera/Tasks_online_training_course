package by.training.part4.taskAirline;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public class Airline implements Comparable<Airline> {

    private String destinations;
    private int flightNumber;
    private String typeOfAircraft;
    private LocalDateTime departureTime;

    public Airline(String destinations, int flightNumber, String typeOfAircraft, LocalDateTime departureTime) {
        this.destinations = destinations;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departureTime = departureTime;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Airline {" +
                "пункт назначения : '" + destinations + '\'' +
                "; номер рейса : " + flightNumber +
                "; тип самолета : '" + typeOfAircraft + '\'' +
                "; день и время прибытия : " + departureTime.format(DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy, HH:mm")) +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                destinations.equals(airline.destinations) &&
                typeOfAircraft.equals(airline.typeOfAircraft) &&
                departureTime.equals(airline.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinations, flightNumber, typeOfAircraft, departureTime);
    }

    @Override
    public int compareTo(Airline airline) {
        return Comparator.comparing(Airline::getDestinations)
                .thenComparing(Airline::getDepartureTime)
                .compare(this, airline);
    }
}
