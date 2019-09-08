package com.altafjava.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

//Display All ZoneId and Offset
public class Test4 {

	public static final boolean SORT_BY_REGION = false;

	public static void main(String[] args) {
		Set<String> zoneIdSet = ZoneId.getAvailableZoneIds();
		LocalDateTime localDateTime = LocalDateTime.now();
		Map<String, String> map = new LinkedHashMap<>();
		// Either this forEach
		zoneIdSet.forEach(zoneIdString -> {
			ZoneId zoneId = ZoneId.of(zoneIdString);
			ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
			String offset = zonedDateTime.getOffset().getId().replaceAll("Z", "+00:00");
			map.put(zoneIdString, offset);
		});
		// or this enhanced for loop
//		for (String zoneIdString : zoneIdSet) {
//			ZoneId zoneId = ZoneId.of(zoneIdString);
//			ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
//			String offset = zonedDateTime.getOffset().getId().replaceAll("Z", "+00:00");
//			map.put(zoneIdString, offset);
//		}

		Map<String, String> sortedMap = new LinkedHashMap<>();
		if (SORT_BY_REGION) {
			Stream<Entry<String, String>> entryStream = map.entrySet().stream().sorted(Map.Entry.comparingByKey());
//			Stream forEach
			entryStream.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));// Consumer
		} else {
			// Either these 3 lines
			Comparator<Entry<String, String>> comparator = (e1, e2) -> e2.getValue().compareTo(e1.getValue());
			Stream<Entry<String, String>> entryStream = map.entrySet().stream().sorted(comparator);
			entryStream.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
			// or these 2 line, both works same
//			Stream<Entry<String, String>> entryStream = map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue().reversed());
//			entryStream.forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
		}

//		Map forEach
		sortedMap.forEach((k, v) -> {// forEach default method inside Map.class
			String out = String.format("%30s (UTC%s) %n", k, v);
			System.out.print(out);
		});
	}

}
