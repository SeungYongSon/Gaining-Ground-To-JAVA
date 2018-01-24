package C4060210;

public class ScheduleOfPerformances {

    String name;
    int seatNum;
    char seat;

    public ScheduleOfPerformances(){
        this.name = "___";
        this.seatNum = 0;
        this.seat = 0;
    }

    public void valueSet(String name, int seatNum, char seat) {
        this.name = name;
        this.seatNum = seatNum;
        this.seat = seat;
    }

    public String getName(){
        return this.name;
    }
}