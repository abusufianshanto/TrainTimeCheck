public class Main {
    public static void main(String[] args) {
        DeutscheBahn db = new DeutscheBahn();
        Train re3 = new Train("RE3", "Landshut");
        Train re55 = new Train("RE55", "Tegernsee");
        db.addTrain(re3);
        db.addTrain(re55);
        re3.setDepartureTime(23, 12);
        re55.setDepartureTime(12, 43);
        System.out.println(""+re3.getReTrain()+" departuring at "+re3.getDepartureTime()+" to "+re3.getTrainDestination());
        System.out.println(""+re55.getReTrain()+" departuring at "+re55.getDepartureTime()+" to "+re55.getTrainDestination());


    }
}
