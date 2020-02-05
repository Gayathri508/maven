package com.epamwork.maven_demo;

import java.util.ArrayList;

public class Class1 {
		public int weight;
		public int cost;
		public static ArrayList<Integer> wt = new ArrayList<Integer>();
		public int getWeight(){
			int totalWeight = 0;
			for(int i = 0; i < wt.size(); i++){
				totalWeight += wt.get(i);
			}
			return totalWeight;
		

	}

}
