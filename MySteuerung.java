public class MySteuerung{
	
	public static void main(String[] args)
    {
		int laenge=0;
		MyGui gui= new MyGui();
		
		laenge=gui.eingabeLaenge();
		MyRandom random=new MyRandom(laenge);
		
		do{
			random.setUntereGrenze(gui.eingabeUntereGrenze());
			random.setObereGrenze(gui.eingabeObereGrenze());			
		}while((random.getObereGrenze()-random.getUntereGrenze())<laenge);
		
		random.randomize();
		random.minimum();
		random.maximum();
		gui.ausgabeRandom(random.getRandom());
		gui.ausgabeMinimum(random.getMinimum());
		gui.ausgabeMaximum(random.getMaximum());
	}
}