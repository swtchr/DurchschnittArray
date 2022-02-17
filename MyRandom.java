public class MyRandom{
	
	private int random[];
	private int minimum=0;
	private int maximum=0;
	private int untereGrenze=0;
	private int obereGrenze=0;
	
	public MyRandom(int laenge){
	
		random= new int[laenge];
		
		for(int i=0; i<random.length; i++)
		{
			random[i]=0;
		}
	}
	
	public void minimum(){
		
		minimum=random[0];
		
		for(int i=0; i<random.length; i++)
		{
			if(minimum>random[i])
			{
				minimum=random[i];
			}
		}
	}
	
	public void maximum(){
		
		maximum=random[0];
		
		for(int i=0; i<random.length; i++)
		{
			if(maximum<random[i])
			{
				maximum=random[i];
			}
		}
	}
	
	public void randomize(){
		
		int randomnumber=0;
		boolean vorhanden=true;
	
		random[0]=(int)(Math.random()*(obereGrenze-untereGrenze)+untereGrenze);	

		for(int j=1;j<random.length;j++)
		{
			do{
				randomnumber=(int)(Math.random()*(obereGrenze-untereGrenze)+untereGrenze);
				vorhanden=false;
				for(int i=0; i<j; i++)
				{
					if(random[i]==randomnumber)
					{
						vorhanden=true;
					}
				}		
			}while(vorhanden==true);
			
			random[j]=randomnumber;
		}
	}
	
	public void setRandom(int[] random){
			
		this.random=random;
	}
	
	public int[] getRandom(){
		
		return random;
	}
	
	public void setMinimum(int minimum){
			
		this.minimum=minimum;
	}
	
	public int getMinimum(){
		
		return minimum;
	}
	
	public void setMaximum(int maximum){
			
		this.maximum=maximum;
	}
	
	public int getMaximum(){
		
		return maximum;
	}
	
	public void setUntereGrenze(int untereGrenze){
			
		this.untereGrenze=untereGrenze;
	}
	
	public int getUntereGrenze(){
		
		return untereGrenze;
	}
	
	public void setObereGrenze(int obereGrenze){
			
		this.obereGrenze=obereGrenze;
	}
	
	public int getObereGrenze(){
		
		return obereGrenze;
	}
}