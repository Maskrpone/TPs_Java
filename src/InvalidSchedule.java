// Author: Hippolyte DEPARIS
public class InvalidSchedule extends Exception{
    public InvalidSchedule(){
        super("Invalid schedule");
    }
    public InvalidSchedule(String message){
        super(message);
    }
}
