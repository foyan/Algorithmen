package ch.hszt.hs_2011.aud.exercise_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task2Impl_Luethi {
	
	/**
	 * Progrämmchen (sic!) zur Auffindung eines Flughafens für gegebene Koordinaten.
	 * Implementation mittels Hash-Suche. Dafür werden zuerst alle Airports aus dem
	 * File gelesen (Airports.load()) und in Buckets verpackt.
	 * 
	 * Die Implementation verwendet absichtlich weder equals() noch hashCode().
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Airports airports = new Task2Impl_Luethi().new Airports();
		airports.load("/home/florian/workspace/Algorithmen/src/ch/hszt/hs_2011/aud/exercise_09/Airports.txt");
	
		Airport airport = airports.findByCoordinates("46:50:36:N:130:27:55:E");
		if (airport != null) {
			System.out.println("Du warst in: " + airport.getName2());
		} else {
			System.out.println("Du warst nirgendwo.");
		}
	}
	
	private class Airports {
		
		private static final int NUMBER_OF_BUCKETS = 10000;
		
		private AirportList[] buckets = new AirportList[NUMBER_OF_BUCKETS];
				
		public void load(String filename) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			String line;
			while ((line = br.readLine()) != null) {
				Airport airport = new Airport(line);
				int bucket = getBucket(airport.coordinates);
				AirportList list = buckets[bucket];
				if (list == null) {
					list = new AirportList();
					buckets[bucket] = list;
				}
				buckets[bucket].getList().add(airport);
			}
			
			br.close();
		}
		
		public Airport findByCoordinates(String coordinates) {
			int bucket = getBucket(coordinates);
			for (Airport airport : buckets[bucket].getList()) {
				if (airport.getCoordinates().equals(coordinates)) {
					return airport;
				}
			}
			return null;
		}
		
		public int getBucket(String coordinates) {
			return Math.abs(coordinates.hashCode() % Airports.NUMBER_OF_BUCKETS);
		}

	}
	
	private class AirportList {
		
		private ArrayList<Airport> list = new ArrayList<Airport>();
		
		public ArrayList<Airport> getList() {
			return list;
		}
		
	}
	
	private class Airport {
		
		public Airport(String line) {
			String[] tokens = line.split(":");
			name2 = tokens[3];
			coordinates = tokens[5] 
					+ ":" + tokens[6] 
					+ ":" + tokens[7]
					+ ":" + tokens[8]
					+ ":" + tokens[9] 
					+ ":" + tokens[10] 
					+ ":" + tokens[11]
					+ ":" + tokens[12];
		}
		
		public String getName2() {
			return name2;
		}
		public String getCoordinates() {
			return coordinates;
		}
		
		private String name2;
		private String coordinates;
				
	}

}
