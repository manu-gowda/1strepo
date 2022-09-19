class SportsRunner{
	public static void main(String[] cricket)
	{
		System.out.println("entered cricketersNames");
		String[] PlayerNames={"MS Dhoni","Rohitman","Rishabh Pant",
		"Hardik Pandya","Klassy Rahul","Sanju Samson","Vk","DK",
		"Rockstar Jaddu","Yuzvendra Chahal","Kuldeep Yadav"};
		Sports.cricketTeamMembers(PlayerNames);
	
		System.out.println("entered jerseyNumbers");
		int[] JerseyNos={3,7,29,49,6,22,18,16,22,26};
		Sports.kabbadiTeamMembersJerseyNos(JerseyNos);
		
		System.out.println("entered footballSalaries perYear");
		double[] salary={4346,32356,13457,1465,8779,3452,65764,86546,54632,654734};
		Sports.FootBallTeamMembersSalary(salary);
	
		System.out.println("entered LudoMobilenNumber");
		long[] MobileNos={9845306163L,6547382910L,8098997654L,8897676898L,8789989896L,
		8976897654L,9846554353L,9876540899L,8762674711L,7896754369L};
		Sports.LudoTeamMobileNumber(MobileNos);
		
		System.out.println("entered NumberOfMatchesPlayed from 2003 to 2015 yearwise");
		int[] MatchNos={1,14,12,11,2,4,3,9,8,6,7,5,14};
		Sports.HockeyTeamMembersNoOfMatches(MatchNos);
		
		System.out.println("enter country code of koko players");
		long[] CountryCode={65,245,765,684,987,264,850,1,86,809,2243,91};
		Sports.KokoTeamMembersCountryCode(CountryCode);
		
		System.out.println("entered status of lagori players");
		boolean[] Alive={true,true,false,false,true,true,false,true,false,true};
		Sports.LagoriTeamMembersAlive(Alive);
		
	}
}