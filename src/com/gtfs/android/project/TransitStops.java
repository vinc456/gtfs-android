package com.gtfs.android.project;

public class TransitStops {

	public String stop_id;
	public String stop_name;
	public String stop_code;
	public String stop_desc;
	public String stop_lat;
	public String stop_lon;
	public String zone_id;
	public String stop_url;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.stop_id = temp[0];
        this.stop_name = temp[1];
        this.stop_code = temp[2];
        this.stop_desc = temp[3];
        this.stop_lat = temp[4];
        this.stop_lon = temp[5];
        this.zone_id = temp[6];
        //this.stop_url = temp[7];
		
	}
}
