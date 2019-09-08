package com.altafjava.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

//Display All ZoneId and current Time
public class Test5 {

	public static final boolean SORT_BY_REGION = true;

	public static void main(String[] args) {
		Set<String> zoneIdSet = ZoneId.getAvailableZoneIds();
		Map<String, String> map = new LinkedHashMap<>();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		zoneIdSet.forEach(zoneIdString -> {
			ZoneId zoneId = ZoneId.of(zoneIdString);
			ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
			String offset = zonedDateTime.getOffset().getId().replaceAll("Z", "+00:00");
			map.put(zoneIdString, offset + "  " + zonedDateTime.format(dateTimeFormatter));
		});

		Map<String, String> sortedMap = new LinkedHashMap<>();
		if (SORT_BY_REGION) {
			Stream<Entry<String, String>> entryStream = map.entrySet().stream().sorted(Map.Entry.comparingByKey());
			entryStream.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));// Consumer
		} else {
			Stream<Entry<String, String>> entryStream = map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue().reversed());
			entryStream.forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
		}

		sortedMap.forEach((k, v) -> {
			String out = String.format("%32s (%s) %n", k, v);
			System.out.print(out);
		});
	}

}
