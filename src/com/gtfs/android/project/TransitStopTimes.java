package com.gtfs.android.project;

public class TransitStopTimes {

	public String trip_id;
	public String arrival_time;
	public String departure_time;
	public String stop_id;
	public String stop_sequence;
	public String pickup_type;
	public String stop_headsign;
	public String drop_off_type;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.trip_id = temp[0];
        this.arrival_time = temp[1];
        this.departure_time = temp[2];
        this.stop_id = temp[3];
        this.stop_sequence = temp[4];
        //this.pickup_type = temp[5];
        //this.stop_headsign = temp[6];
        //this.drop_off_type = temp[7];
		
	}
}
