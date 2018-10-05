import java.util.*;
public class Team {
	
	private String teamName;
	private int num;
	
	public Team(int num) {
		this.teamName = teamName;
		this.num = num;
	};
	
	public void setTeamName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Alright team " + this.num + " enter your name");
		String name = scanner.next();
		this.teamName = name;
	}
	
	public String getTeamName() {
		return teamName;
	}
}
