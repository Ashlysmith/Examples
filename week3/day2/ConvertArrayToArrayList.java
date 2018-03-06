package week3.day2.appcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "Ajeet", "Ahmed", "Ali", "Tom" };

		String[] strArray = convertArrayToArrayList1();
		System.out.println(Arrays.toString(strArray));
		
		ArrayList<String> result2 = convertArrayToArrayList2(array);
		System.out.println(result2);
		
		ArrayList<String> result3 = convertArrayToArrayList3(array);
		System.out.println(result3);

	}

	public static String[] convertArrayToArrayList1() {
		ArrayList<String> assetTradingList = new ArrayList<String>();
		assetTradingList.add("Stock trading");
		assetTradingList.add("Futures and option trading");
		assetTradingList.add("electronic trading");
		assetTradingList.add("gold trading");
		assetTradingList.add("fixed incom bond trading");
		String[] assetTradingArray = new String[assetTradingList.size()];
		String[] strArray = assetTradingList.toArray(assetTradingArray);

		return strArray;
	}
	
	public static ArrayList<String> convertArrayToArrayList2(String[] asset) {
		
		ArrayList<String> newAssetList = new ArrayList<String>();
		Arrays.asList(asset);
		newAssetList.addAll(Arrays.asList(asset));
		
		return newAssetList;
	}
	
	public static ArrayList<String> convertArrayToArrayList3(String[] asset) {
		
		ArrayList<String> newAssetList = new ArrayList<String>();
		
		for (String s : asset) {
			newAssetList.add(s);
		}
		
		return newAssetList;
	}

}
