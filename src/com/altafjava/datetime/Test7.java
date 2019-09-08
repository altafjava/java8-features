package com.altafjava.datetime;

import java.time.ZoneId;

public class Test7 {

//	ZoneId object can be used to represent Zone
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("default zoneId= " + zoneId);

//		We can create ZoneId for a particular zone as follows
		ZoneId losAngelesZoneId = ZoneId.of("America/New_York");
		System.out.println("losAngelesZoneId= " + losAngelesZoneId);
	}

}
