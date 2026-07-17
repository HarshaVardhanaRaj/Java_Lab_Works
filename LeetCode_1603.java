class ParkingSystem
{
	int big, medium, small;
	
	//constructor
    public ParkingSystem(int big, int medium, int small)
	{
        this.big = big;
		this.medium = medium;
		this.small = small;
    }
    
    public boolean addCar(int carType)
	{
        boolean space=false;
		int car = carType;
		
		if(car==1 && big!=0)
		{
			space = true;
			big--;
		}
		if(car==2 && medium!=0)
		{
			space = true;
			medium--;
		}
		if(car==3 && small!=0)
		{
			space = true;
			small--;
		}
		
		return space;
    }
}