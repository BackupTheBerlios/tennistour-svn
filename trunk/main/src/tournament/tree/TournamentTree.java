package tournament.tree;

import java.util.ArrayList;

import tournament.match.Matche;

public class TournamentTree {
	static public Branch createTournament(int numberofcandidate){
		
		// determine the number of matches for the first step
		int numberoffirstmatch = numberofcandidate/2;
		ArrayList temp = new ArrayList(numberoffirstmatch);
		// determine if there is a player which arrives on the second step
		numberofcandidate %= 2;
		// create one match for 2 candidates (all the matches of the first step)
		for (int i = 0;i < numberoffirstmatch; i++){
			temp.add(new Branch(new Matche(1),new Leaf(),new Leaf()));
		}
		System.out.println("Création d'un tournoi de "+new Integer(numberoffirstmatch).toString()+ " matches");
		// create the matches of the next steps
		int step=2;
		while (temp.size()>1){
			System.out.println("Etape : "+ new Integer(step).toString());
			int nombre = temp.size();
			for (int i=0;i < nombre;i+=2){
				temp.add(new Branch(new Matche(step),(Branch)temp.get(i),(Branch)temp.get(i+1)));
			}
			
			for (int i=0;i < nombre;i++){
				temp.remove(0);
			}
			step++;
		}
		return (Branch)temp.get(0);
	}
}
