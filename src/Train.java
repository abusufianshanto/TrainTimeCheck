import java.util.ArrayList;

public class Train extends DeutscheBahn {
    private String reTrain;
    private String trainDestination;
    private String departureTime;

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

    public void setDepartureTime(int departureHour, int departureMin) {
        departureTime = ""+departureHour+": "+departureMin;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
