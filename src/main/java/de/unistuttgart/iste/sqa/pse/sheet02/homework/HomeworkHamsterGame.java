package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 * 
 * @author (Your name)
 * @version (a version number or a date)
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave (lower left corner - row 6 * column 2 and
	 * indexing starts with 0).
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.
		int grainsInMouth = 0;
		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grain in mouth.");
		
		

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();


		// Move to the second grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the second grain
		paule.pickGrain();
		
		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");	

		// Add further steps (comment + code) to collect all grains!
		
		// Turn in opposite direction
		paule.turnLeft();
		paule.turnLeft();

		// Move till horizontally to third grain
		paule.move();
		paule.move();
		paule.move();
		// Turn left in third grain direction
		paule.turnLeft();

		// Move to the third grain
		paule.move();
		paule.move();
		paule.move();

		// Pick up the third grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Turn Left and move
		paule.turnLeft();
		paule.move();
		
		// Turn in fourth grain direction
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// Move to the fourth grain
		paule.move();
		paule.move();
		
		// Pick up the fourth grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Turn in opposite direction
		paule.turnLeft();
		paule.turnLeft();

		// Move 
		paule.move();
		paule.move();
		paule.move();

		// Turn right in cave direction
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		// Move
		paule.move();
		paule.move();

		// Turn right in cave direction
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// Move to the cave
		paule.move();
		paule.move();
		paule.move();

		// Pick up grains in the cave and print out the amount of grains in paules mouth
		paule.pickGrain();

		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Pick up  a grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");	

		// Pick up a grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down all grains in the cave and print out the amount of grains in paules mouth
		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");
		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grain in mouth.");

		// Put down a grain
		paule.putGrain();

		// Removes 1 grain from Paules mouth
		grainsInMouth = grainsInMouth - 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");
		
	}
}
