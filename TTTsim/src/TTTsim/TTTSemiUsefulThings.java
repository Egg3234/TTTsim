package TTTsim;

public class TTTSemiUsefulThings {

	public static void main(String[] args) {
		//COPY THIS FOR THE THING
		wait(2);
		
		//COPY THIS EXACTLY, JUST CHANGE THE ARRAY NAME
		int[] i=intCutter(32435234);
		
		
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
	
	
	//next method
	
	
	

}
