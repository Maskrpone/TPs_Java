// Author: Hippolyte DEPARIS

// Our exception class
public class InvalidSchedule extends Exception{
    public InvalidSchedule(){
        super("Invalid schedule");
    }
    public InvalidSchedule(String message){
        super(message);
    }
}
