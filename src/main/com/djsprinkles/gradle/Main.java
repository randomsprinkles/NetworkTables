package main.com.djsprinkles.gradle;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Main {

	public static void main(String[] args) {
		NetworkTable.setClientMode();
		NetworkTable.setTeam(TEAM);
		NetworkTable.initialize();
		NetworkTable table = NetworkTable.getTable("Test");
		
		table.putNumber("X", 5);
		
	}

}
