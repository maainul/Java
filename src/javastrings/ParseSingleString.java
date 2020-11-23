/*
package javastrings;


import java.io.IOException;



public class ParseSingleString {
	public static void main(String[] args) throws IOException {

		String sampleResponse = "Date,Open,High,Low,Close,Adj Close,Volume"
				+"2017-05-01,160.050003,160.419998,158.699997,158.839996,139.246414,4935300"
				+ "2017-05-02,159.440002,159.490005,158.639999,159.100006,139.474350,3208200"
				+ "2017-05-03,158.740005,159.449997,158.520004,158.630005,139.062317,3993300"
				+ "2017-05-04,158.889999,159.139999,158.360001,159.050003,139.430511,4280600"
				+ "2017-05-05,153.520004,155.779999,153.000000,155.050003,135.923920,12521300";
				
		//String[] newarray = new String[1000];
	
		String[] splitStrings = sampleResponse.split("2017");
		 
		for (int i = 1; i < splitStrings.length; i++) {
			System.out.println(("2017").trim()+splitStrings[i]);
		}
		
		
		System.out.println(splitStrings);
		String sampleResponseSplit = "Date,Open,High,Low,Close,Adj Close,Volume"
				+ "\n2017-05-01,160.050003,160.419998,158.699997,158.839996,139.246414,4935300"
				+ "\n2017-05-02,159.440002,159.490005,158.639999,159.100006,139.474350,3208200"
				+ "\n2017-05-03,158.740005,159.449997,158.520004,158.630005,139.062317,3993300"
				+ "\n2017-05-04,158.889999,159.139999,158.360001,159.050003,139.430511,4280600";
	
	}
}
*/