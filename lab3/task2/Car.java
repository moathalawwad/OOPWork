class Car{
	double startMile;
	double endMile;
	double gallon;

	Car(double s, double e, double g)
		{
			startMile=s; endMile=e; gallon=g;
		}
	
	void printInfo()
		{
			System.out.println("Start Miles: "+startMile);
			System.out.println("End Miles: "+endMile);
			System.out.println("Gallon: "+gallon);
			System.out.println("MPG: "+getMPG());
		}
	
	double getMPG()
		{
			double mpg;
			mpg=(endMile-startMile)/gallon;
			return mpg;
		}
	
	boolean isEconomy()
		{
			if(getMPG()>=30)
				return true;
			else
				return false;
		}
}