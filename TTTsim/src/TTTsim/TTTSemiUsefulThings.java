package TTTsim;

public class TTTSemiUsefulThings {

	public static void main(String[] args) {
		//lukes autism corner. 
		//COPY THIS FOR THE THING
		wait(1);
		
		//COPY THIS EXACTLY, JUST CHANGE THE ARRAY NAME
		int[] i=intCutter(32435234);
		
		//I DONT KNOW WHAT TO DO ANYMORE HELP
		reeBot(3);
		
		//I HATE QUADRATICS, THIS FIXES IT GOOD
		quadratic(1,7,12);
		
		
		
	}
	
	
	//puts the program in stasis for a specified amount of time
	public static void wait(int i) {
		i=i*1000;
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	//cuts an int into an array, with way too many steps, cause divison is too complicated for me
	public static int[] intCutter(int input) {
		String useful=(input+"");
		int length=useful.length();
		int[] array= new int[length];
		int counter=1;
		int util=0;
		
		for(int a=0; a<length-1; a++) {
			counter=counter*10;
		}
		int x=0;
		int y=1;
		String s;
		for(int a=0; a<length; a++) {
			s=useful.substring(x,y);
			x=x+1;
			y=y+1;
			int result = Integer.parseInt(s);	
			array[(a)]=result;
			//System.out.println("this one works maybe?: "+ array[a]);
			//System.out.println(" ");
		}
		
		return array; 
	}
	
	
	//important reebot. this is required for the program to function
	public static void reeBot(int length) {
		System.out.print("FUCKING NORMIES, R");
		for(int i=0; i<length; i++) {
			System.out.print("E");
		}
		System.out.println("");
	}
	
	//(x+4)(x+3)
	//x^2+7x+12
	//next method
	public static String quadratic(double a, double b, double c) {
		double num1=((-b+Math.sqrt(b*b-4*a*c))/2*a);
		double num2=((-b-Math.sqrt(b*b-4*a*c))/2*a);
		System.out.println("Answers are:"+num1+", "+num2);
		double discrim=b*b-4*a*c;
		System.out.println("Discriminant is: "+discrim);
		
		String p="ploxholder";
		return p;
	}
	

}
