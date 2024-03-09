public class Main {
    public static void main(String[] args) {
        DeutscheBahn db = new DeutscheBahn();
        Train re3 = new Train("RE3", "Landshut");
        db.addTrain(re3);
        db.setDepartureTime(23, 12);
        System.out.println(""+re3.getReTrain()+" departuring at "+db.getDepartureTime()+" to "+re3.getTrainDestination());

    }
}
