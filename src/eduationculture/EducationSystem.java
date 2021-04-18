package eduationculture;

public class EducationSystem {
	
	public static void main(String args[])
	{
		Graduation gd = new Graduation();	
		gd.streams();
		gd.ageCritera();
		gd.hscPercentage();
		
		Engineering eg = new Engineering();
		eg.streams();
		eg.typeOfEngineering();
		
		ComputerScienceEngg cse = new ComputerScienceEngg();
		cse.hscPercentage();
		cse.subjects();
	}
}


