package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxRepeatingIP {
	public static void main(String[] a) {
		
		List<String> ips = List.of("10-a","10-b","11-a","11-b");
		
		Map<String, Integer> ipCount = new HashMap<String, Integer>();
		for(String ip: ips) {
			String singleIp = ip.substring(0, ip.indexOf("-"));
			Integer count = ipCount.getOrDefault(singleIp, 0);
			ipCount.put(singleIp, ++count);
			
		}
		
		int max =0;
		String key = "";
		
		for(Map.Entry<String, Integer> e : ipCount.entrySet()) {
			
			if(e.getValue()>max) {
				max = e.getValue();
				key = e.getKey();
			}
		}
		System.out.println(key+"   "+max);
	}

}
