package com.gtfs.android.project;

public class TransitFareRules {

	public String fare_id;
	public String route_id;
	public String orgin_id;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.fare_id = temp[0];
        this.route_id = temp[1];
        //this.orgin_id = temp[2];
		
	}
}
