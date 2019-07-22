package com.regular.expression;

public class Regex {
	
	public static void main(String args[]){
		String input = "https://adtclmamr08803.accenture.com/ccm/oslc/types/_EDRAgEPMEemJQ-kl8Ek0Gg/com.ibm.team.workitem.workItemType.task";
		String[] output = input.split("/");
		System.out.println(output[output.length - 2]);
	}
}
