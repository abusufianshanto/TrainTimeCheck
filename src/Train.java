import java.time.LocalTime;
import java.util.ArrayList;

public class Train {
    private String reTrain;
    private String trainDestination;
    private LocalTime departureTime;

    public Train(String reTrain, String trainDestination) {
        this.reTrain = reTrain;
        this.trainDestination = trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public void setReTrain(String reTrain) {
        this.reTrain = reTrain;
    }

    public String getReTrain() {
        return reTrain;
    }

    public void setDepartureTime(int hour, int minute) {
        this.departureTime = LocalTime.of(hour, minute);
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
