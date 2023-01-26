package HaldimannJoël;
import robocode.*;



public class Hans extends JuniorRobot
{
	int otherRobot = others;

	public void run() {
	
							setColors(orange, blue, white, yellow, black);

								

							while(true) {
										checkEnemyCount();
									}
						}

	
	public void onScannedRobot() 
	{
	bearGunTo(scannedBearing);	
	
	smartFire();
	}

	
	public void onHitByBullet() 
	{
		otherRobot = otherRobot + 17;	
	}
		
		


	public void onHitWall() {

		turnLeft(180);
		ahead(30);
	}
	
		public void smartFire()
	{
		
		if(scannedDistance<=50)
		{
		fire(3);
		}
		else if(scannedDistance<=200)
		{
			fire(1);
		}

	}
	
//Checks the number of enemies left and behaves differently

	public void checkEnemyCount()
	{
			
			
			if(otherRobot>17)
				{
         			turnAheadRight(100, 90);
		 			turnRight(180);
				}
			else{
					turnGunLeft(360);
					ahead(8);
				}

	}	
}


	






