public class Calculator{
	public static void main(String[] args){
		
		
		
		double result = 0;
		switch(Integer.parseInt(args[0])){

			case 1:
				result = add(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			    break;
			default:
				break;	

        }
		
		System.out.println("Your result is " + result);

	}

	public static double add(double a, double b){

		return a + b;
	}

}
