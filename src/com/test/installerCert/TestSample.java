package com.test.installerCert;

import java.util.*;

public class TestSample {

	public static void main(String[] args) {
		
		List li = new ArrayList();
		
		li.add("Hello");
		li.add("Hello12");
		li.add("Hello23");
		li.add("Hello43");
		
		List mkLi = new ArrayList();
		
		mkLi.add(231);
		mkLi.add(2);
		mkLi.add(543);
		mkLi.add(123);
		Map map= new HashMap();
		Map map1= new HashMap();
		map.put("sampleList",li);
		map.put("li", null);
		map.put("mkLi",mkLi);
		System.out.println(li);
		System.out.println(map.get("li"));
		System.out.println(map1.get("li"));
	}

}
