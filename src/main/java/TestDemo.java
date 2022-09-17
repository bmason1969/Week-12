import java.util.Random;

public class TestDemo {
	private static final int Max_Random = 10;
	private Random random = new Random();
	public int addPositive(int a, int b) {
		
		if(a > 0 && b > 0) { // if both integers are positive return the sum
			
		int sum =  a + b;
		
		System.out.println(sum);
			
		return sum;	
			
			}else {		//if integers are zero and/or negative then throw IllegalArgumentException
				
				throw new IllegalArgumentException("Both parameters must be positive!");
			}
			
	}
	//This method obtains random integer between 1 and 10	

	  int getRandomInt ()  {
		Random random = new Random();
				
		return random.nextInt(Max_Random);		
		
		
		
		
	}
	//This method squares the random integer obtained from above method	
	@packageScopeForTesting  
	

	public int randomNumberSquared() {
		int randomNumber = getRandomInt();
		int randomNumberSquared = randomNumber * randomNumber;
		
		return randomNumberSquared;
	}
}
