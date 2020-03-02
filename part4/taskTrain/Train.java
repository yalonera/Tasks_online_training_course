package by.training.part4.taskTrain;

import java.util.Objects;

public class Train implements Comparable<Train> {

    private String destination;
    private int trainNumber;
    private double time;

    public Train(String destination, int trainNumber, double time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Поезд {" +
                "место прибытия = '" + destination + '\'' +
                "; номер поезда = " + trainNumber +
                "; время прибытия = " + time +
                "}" + "\t";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                Double.compare(train.time, time) == 0 &&
                destination.equals(train.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, trainNumber, time);
    }

    @Override
    public int compareTo(Train train) {
        int result = destination.compareTo(train.getDestination());
        if (result != 0) {
            return result;
        }
        result = (int) (time - train.time);
        return result;

    }
}
