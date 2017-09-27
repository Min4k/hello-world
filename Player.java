package Builders;
import java.io.*;
import java.util.ArrayList;

    public class Player{
	
    	//ID and age
	private String Name;
	private String Date;
	
	//Counting Stats for players and all subclasses
	private int Minutes;
	private int Points;
	private int ORebounds;
	private int DRebounds;
	private int Rebounds;
	private int Assists;
	private int Blocks;
	private int Steals;
	private int TotAttempt;
	private int ThreeAttempt;
	private int TotMake;
	private int ThreeMake;
	private int Turnovers;
	private int GamesPlayed;
	private int FreeThrowAttempts;
	private int FreeThrowMade;
	private int Wins;
	private int Losses;
	private int Fouls;
	
	/*Counting Stats for Teams and Coaches. Could be for players later to use in stat
	 * calculations. Could be useful for coming up with better defensive Efficiency stat.
	 */
	private int PointsAllowed;
	private int AttemptsAllowed;
	private int ThreePointersAllowed;
	private int ThreeAttemptsAllowed;
	private int AssistsAllowed;
	private int OReboundsAllowed;
	private int DReboundsAllowed;
	private int ReboundsAllowed;
	private int TurnoversAllowed;
	private int BlocksAllowed;
	private int StealsAllowed;
	
	/*Does not have corresponding method in SimpleStats Interface
	 * Used for Player object only
	 */
	private boolean Starter = false;
	//Used for all subclass to track Home and Away stats
	private boolean Home = false;
	//Tracks game by game stats
	//For tracking in Game Stats and total games played
	private ArrayList<Game> Games = new ArrayList<Game>(82);
	//Tracks all teams played for and stats during those years
	private ArrayList<Team> Teams = new ArrayList<Team>(10);
	
	//constructors
	Player(){
		
	}

	
 }