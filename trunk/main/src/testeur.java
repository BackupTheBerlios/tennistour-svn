/*Classe de test*/
import tournament.tree.*;
import tournament.tree.visitor.*;
public class testeur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tournoi = TournamentTree.createTournament(8);
		// lecture de haut en bas
		System.out.println("Lecture de haut en bas (m?thode classique)");
		TreeVisitor sample = new SampleVisitorClassic();
		tournoi.accept(sample);
		// lecture de bas en haut
		System.out.println("Lecture de bas en haut (m?thode DepthFirst");
		sample = new SampleVisitorDepth();
		tournoi.accept(sample);
	}

}
