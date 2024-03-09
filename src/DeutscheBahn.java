import java.time.LocalTime;
import java.util.ArrayList;

public class DeutscheBahn {
    private ArrayList<Train> db;
    private String departureTime;

    public DeutscheBahn() {
        db = new ArrayList<>();
    }

    public void addTrain(Train train) {
        db.add(train);
    }

    public void removeTrain(Train train) {
        db.remove(train);
    }

    public void setDepartureTime( int departureHour, int departureMin) {
        departureTime = ""+departureHour+": "+departureMin;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
