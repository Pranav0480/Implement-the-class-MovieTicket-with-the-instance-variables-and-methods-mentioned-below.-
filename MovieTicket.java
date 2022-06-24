class MovieTicket {
	    private int movieId;
	    private int noOfSeats;
	    private double costPerTicket;
	   
	    public MovieTicket(int movieId,int noOfSeats) 
	      {
	        this.movieId=movieId;
	        this.noOfSeats=noOfSeats;
		  }
	   
	    public int getMovieId()
	      {
	        return movieId;
	      }
	    public void setMovieId(int movieId)
	      {
	        this.movieId=movieId;
	      }
	    public int getNoOfSeats()
	      {
		    return noOfSeats;
		  }
		public void setNoOfSeats(int noOfSeats)
		  {
		    this.noOfSeats=noOfSeats;
		  }
		public double getCostPerTicket()
		  {
		    return costPerTicket;
		  }
		public void setCostPerTicket(double costPerTicket) 
		  {
		    this.costPerTicket=costPerTicket;
		  }  
		
public double calculateTotalAmount(){
	if(movieId==111) 
	{
		double a;
		a=7*noOfSeats;
		a+=((2*a)/100);
		return a;
	}
	else if(movieId==112)
	{
		double b;
		b=8*noOfSeats;
		b+=((2*b)/100);
		return b;
	}
	else if(movieId==113)
	{
		double c;
		c=8.5*noOfSeats;
		c+=((2*c)/100);
		return c;
	}
	else 
	{
		return 0;
	}

}
class Tester {
	    public static void main(String[] args) {
	        MovieTicket movieTicket = new MovieTicket(112, 3);
	        double amount = movieTicket.calculateTotalAmount();
	        if (amount==0)
	            System.out.println("Sorry! Please enter valid movie Id and number of seats");
	        else
	        	 System.out.println("Total amount for booking : $" +amount);
	    }
   }
}
