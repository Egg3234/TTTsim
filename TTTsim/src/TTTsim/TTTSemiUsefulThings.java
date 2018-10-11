package TTTsim;
import java.util.Scanner;
import java.util.Random;
public class TTTSemiUsefulThings {
	


	public static void main(String[] args) {
		//lukes autism corner. 
		//COPY THIS FOR THE THING
		//wait(1);
		
		//COPY THIS EXACTLY, JUST CHANGE THE ARRAY NAME
		//int[] i=intCutter(32435234);
		
		//I DONT KNOW WHAT TO DO ANYMORE HELP
		//reeBot(3);
		
		//I HATE QUADRATICS, THIS FIXES IT GOOD, DOUBLE IS IMPORTANT
		//0 is answer 1, 1 is answer 2 and 2 is the discriminant
		//double[] i2=quadratic(1,7,12);
		//System.out.println(i2[0]);
		//System.out.println(i2[1]);
		//System.out.println(i2[2]);

		rPSSimulator();
		
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
	public static double[] quadratic(double a, double b, double c) {
		double num1=((-b+Math.sqrt(b*b-4*a*c))/2*a);
		double num2=((-b-Math.sqrt(b*b-4*a*c))/2*a);
		double discrim=b*b-4*a*c;
		double array[]= {num1,num2,discrim};
		return array;
	}
	
	
	//
	public static void rPSSimulator() {
		int win=0;
		Scanner i=new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("###   It's A Rock Paper Scissors Simulator!  ###");
		System.out.println("### Now Rng Makes Important 2 Option Choices ###");
		while(win==0) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("###    Enter Rock, Paper, Or Scissors Now!   ###");
			System.out.print("###} "); 
			String choice=i.nextLine();
			
			String pLine1=null;
			String pLine2=null;
			String pLine3=null;
			String pLine4=null;
			String pLine5=null;
			
			String vs1=" #       #    ##### ";
			String vs2="  #     #    #      ";
			String vs3="   #   #      ####  ";
			String vs4="    # #           # ";
			String vs5="     #       #####  ";
			
			String cLine1=null;
			String cLine2=null;
			String cLine3=null;
			String cLine4=null;
			String cLine5=null;
			
			String pc=null;
			String cc=null;
			
			
			switch(choice) {
			case "Rock": 
				System.out.println("You chose: Rock!");
				pLine1=("       _^---\\       ");
				pLine2=("      |      \\      ");
				pLine3=("     /        \\     ");
				pLine4=("    \\  ^_^    /     ");
				pLine5=("     \\___,.__/      ");
				System.out.println(pLine1);
				System.out.println(pLine2);
				System.out.println(pLine3);
				System.out.println(pLine4);
				System.out.println(pLine5);
				pc="rock";
				break;
			case "rock":
				System.out.println("You chose: Rock!");
				pLine1=("       _^---\\       ");
				pLine2=("      |      \\      ");
				pLine3=("     /        \\     ");
				pLine4=("    \\  ^_^    /     ");
				pLine5=("     \\___,.__/      ");
				System.out.println(pLine1);
				System.out.println(pLine2);
				System.out.println(pLine3);
				System.out.println(pLine4);
				System.out.println(pLine5);
				pc="rock";
				break;
				
				
			case "Paper":
				System.out.println("You chose: Paper!");
				pLine1=("     _______      ");
				pLine2=("    |_______|     ");
				pLine3=("    |       |     ");
				pLine4=("    | o w o |     ");
				pLine5=("    |_______|     ");
				System.out.println(pLine1);
				System.out.println(pLine2);
				System.out.println(pLine3);
				System.out.println(pLine4);
				System.out.println(pLine5);
				pc="paper";
				break;
			case "paper":
				System.out.println("You chose: Paper!");
				pLine1=("     _______      ");
				pLine2=("    |_______|     ");
				pLine3=("    |       |     ");
				pLine4=("    | o w o |     ");
				pLine5=("    |_______|     ");
				System.out.println(pLine1);
				System.out.println(pLine2);
				System.out.println(pLine3);
				System.out.println(pLine4);
				System.out.println(pLine5);
				pc="paper";
				break;
				
				
			case "Scissors":
				System.out.println("You chose: Scissors!");
				pLine1=("       _       ,/'   ");
				pLine2=("      (_). ,/'       ");
				pLine3=("    ___  ::          ");
				pLine4=("   (uwu)'  `\\.       ");
				pLine5=("              `\\.    ");
				System.out.println(pLine1);
				System.out.println(pLine2);
				System.out.println(pLine3);
				System.out.println(pLine4);
				System.out.println(pLine5);
				pc="scissors";
				break; 
			case "scissors":
				System.out.println("You chose: Scissors!");
				pLine1=("       _       ,/'   ");
				pLine2=("      (_). ,/'       ");
				pLine3=("    ___  ::          ");
				pLine4=("   (uwu)'  `\\.       ");
				pLine5=("              `\\.    ");
				System.out.println(pLine1);
				System.out.println(pLine2);
				System.out.println(pLine3);
				System.out.println(pLine4);
				System.out.println(pLine5);
				pc="scissors";
				break;							
			}
			Random r=new Random();

			int  c=r.nextInt(3)+1;	
			switch(c) {
			case 1:
				cLine1=("       _^---\\       ");
				cLine2=("      |      \\      ");
				cLine3=("     /        \\     ");
				cLine4=("    \\  ^_^    /     ");
				cLine5=("     \\___,.__/      ");
				cc="rock";
				break;
			case 2:
				cLine1=("     _______      ");
				cLine2=("    |_______|     ");
				cLine3=("    |       |     ");
				cLine4=("    | o w o |     ");
				cLine5=("    |_______|     ");

				cc="paper";

				break;
			case 3:
				cLine1=("       _       ,/'   ");
				cLine2=("      (_). ,/'       ");
				cLine3=("    ___  ::          ");
				cLine4=("   (uwu)'  `\\.       ");
				cLine5=("              `\\.    ");
				cc="scissors";
				break;

			}
			wait(1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(pLine1+vs1+cLine1);
			System.out.println(pLine2+vs2+cLine2);
			System.out.println(pLine3+vs3+cLine3);
			System.out.println(pLine4+vs4+cLine4);
			System.out.println(pLine5+vs5+cLine5);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			if(pc=="rock"&&cc=="rock" || pc=="paper"&&cc=="paper" || pc=="scissors"&&cc=="scissors") {
				System.out.println("###> Draw, try again!");
			}else if(pc=="rock"&&cc=="scissors" || pc=="paper"&&cc=="rock" || pc=="scissors"&&cc=="paper") {
				System.out.println("###> You win!");
				win=1;
			}else if(pc=="rock"&&cc=="paper" || pc=="paper"&&cc=="scissors" || pc=="scissors"&&cc=="rock") {
				System.out.println("###> You lose, try again!");
			}else{
				System.out.println("###> How'd you do that? Try again.");
			}
			wait(1);

		}
	}

}
