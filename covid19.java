
public class covid19 {

	public static void main(String[] args) {
		int tested=2000;
		  int [] county= new int [48];
		  int positive=tested*11/100;
		  System.out.println("The total nunber of people tested are "+ tested +" and thosed positive are "+ positive);
		  
		  county [1] = positive*12/100;
		  county[47]=positive*21/100;

		  System.out.println("The number of positive casses in County 001 is "+ county[1]);
		  System.out.println("The number of positive casses in County 047 is "+ county[47]);
		  
		  for (int age=0;age<=80; age++) {
			  
			  if (age<=5) {
				 int positives=positive*3/100;
				  System.out.println("The positive cases between the ages of 0-5 are " +positives);
			  }
			  
		  }
	}

}

