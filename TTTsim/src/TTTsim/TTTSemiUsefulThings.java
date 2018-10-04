package TTTsim;

public class TTTSemiUsefulThings {

	public static void main(String[] args) {
		System.out.println("1");
		wait(2);
		System.out.println("2");
		System.out.println("");
		intCutter(123456);
	}
	
	public static void wait(int i) {
		i=i*1000;
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static int[] intCutter(int input) {
		String useful=(input+"");
		System.out.println(useful);
		int length=useful.length();
		System.out.println(length);
		int[] array= new int[length];
		int counter=1;
		int util=0;
		
		for(int a=0; a<length-1; a++) {
			counter=counter*10;
		}
		System.out.println("imp"+counter);
		//fixthisshitAAAQAAAA
		for(int a=0; a<length; a++) {
			array[a]=input%counter;
			counter=counter/10;
			input=input/10;
			System.out.println(counter);
			System.out.println(input);
			System.out.println("thisone"+array[a]);
		}
		
		System.out.println(counter);
		return array; 
	}

}
