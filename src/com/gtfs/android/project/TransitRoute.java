package com.gtfs.android.project;

public class TransitRoute {

	public String route_id;
	public String agency_id;
	public String route_short_name;
	public String route_long_name;
	public String route_desc;
	public String route_type;
	public String route_url;
	public String route_color;
	public String route_text_color;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.route_id = temp[0];
        this.agency_id = temp[1];
        this.route_short_name = temp[2];
        this.route_long_name = temp[3];
        this.route_desc = temp[4];
        this.route_type = temp[5];
        this.route_url = temp[6];
        this.route_color = temp[7];
        this.route_text_color = temp[8];
		
	}

}
