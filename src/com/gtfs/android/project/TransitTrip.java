package com.gtfs.android.project;

public class TransitTrip {

	public String route_id;
	public String service_id;
	public String trip_id;
	public String trip_headsign;
	public String direction_id;
	public String block_id;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.route_id = temp[0];
        this.service_id = temp[1];
        this.trip_id = temp[2];
        this.trip_headsign = temp[3];
        this.direction_id = temp[4];
        //this.block_id = temp[5];
		
	}
}
