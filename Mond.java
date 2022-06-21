import java.time.LocalTime;

class Mond extends Weekday {
	 
	 String time;

    public void setAlarm(String time) {
        this.time = time;
    }
	
	 public void showAlarm() {
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();
       
        if(alarm.isAfter(now)){     
          System.out.println("I'll wake you up later!");
        }
            
        else if(alarm.isBefore(now)){
          System.out.print("Alarm is set for tomorrow!");
        }
		
		
    }
    
	
	
}

    

