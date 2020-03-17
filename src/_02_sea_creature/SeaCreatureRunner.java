package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature SpongeBob = new SeaCreature("SpongeBob");
		SpongeBob.eat();
		SpongeBob.laugh();
		
		SeaCreature Squidward = new SeaCreature("Squidward");
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
		
		SeaCreature Patrick = new SeaCreature("Patrick");
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
	}
}
