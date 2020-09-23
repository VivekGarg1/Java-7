package com.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInferenceGnericInstanceCreation {

	public static void main(String[] args) {
		//from 1.7 version no need declare diamond value in right side but till 1.6 here we have to declare
		Map<String,List<String>> map=new HashMap</*no need to declare here*/>();
		List<String> empList = new ArrayList<>();
		empList.add("Vivek Garg");
		empList.add("Paras");
		empList.add("Prabhat");
		empList.add("Shubham");
		map.put("GroupA", empList);
		System.out.println(map);
	}

}
