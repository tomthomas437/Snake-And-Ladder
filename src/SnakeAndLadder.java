
public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println(" Welcome to the Snake And Ladder Game");
		
		int player_pos = 0;
		final int ladder = 1;
		final int snake = 2;
		int option;

		System.out.println("Player starting position is: " + player_pos);
		
		while (player_pos < 100) {
		int dice = (int)Math.floor( (Math.random()*7 ));
		System.out.println("Dice Value is : " + dice);
		
		option = (int)Math.floor( (Math.random()*3 ));
		
		  switch(option){
		  
			case ladder: 
				System.out.println(" Current position has ladder H");
				System.out.println("                             H");
				player_pos = player_pos + dice;
				if (player_pos > 100) {
					player_pos = player_pos - dice;
					System.out.println(" NOT VALID. Please continue to play as current position greater that 100.");
				}
				break;
			case snake: 
				  System.out.println(" Current position had snake ~~~~~~~~>>");
					player_pos = player_pos - dice;
					player_pos = player_pos < 0 ? 0 : player_pos;
					break;
			 default :
		            System.out.println(" No play.");
	   }
		  System.out.println(" Current position is: " + player_pos);
}
		System.out.println(" Congratulations. You have won the game..");
}
}


