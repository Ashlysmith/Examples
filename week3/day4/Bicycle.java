package week3.day4.appcode;
public class Bicycle {
	//Member variables...
	    int cadence = 0;   ///state
	    int speed = 0;     //state
	    int gear = 1;     //state.
	    static int direction = 10;

	    //Member Methods..
	    //The fields cadence, speed, and gear represent the object's state. They are Member variables. 
	    //Methods (changeCadence, changeGear, speedUp etc.) define its interaction with the outside world.
	  
	    //behaviour..
	    public Bicycle(){
	 	   
	    }
	      public Bicycle(int startCadence, int startSpeed, int startGear) {
	      	
	  	// TODO Auto-generated constructor stub
	      	this.cadence=startCadence;
	      	this.speed=startSpeed;
	      	this.gear=startGear;
	  }
	    public void changeCadence(int newValue) {
	     //int x=10;
	         cadence = newValue;
	    }

	    public void changeGear(int newValue) {
	         gear = newValue;
	    }
	    
	    public static void changeDirection(int newValue) {
	         direction = direction + newValue;   
	    }

	    public void speedUp(int increment) {
	         speed = speed + increment;   
	    }

	    public void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	    public void printStates() {
	         System.out.println("cadence:" +
	             cadence + " speed:" + 
	             speed + " gear:" + gear + " direction: " + direction);
	    }
	    
	    public int getCadence () {
	    	return this.cadence;
	    }
	    
	    public int getSpeed () {
	    	return this.speed;
	    }
	    
	    public int getGear () {
	    	return this.gear;
	    }
	    public int getDirection () {
	    	return this.direction;
	    }
	}
