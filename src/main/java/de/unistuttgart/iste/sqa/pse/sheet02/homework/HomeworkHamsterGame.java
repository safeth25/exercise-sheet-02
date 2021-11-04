package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 * Paule walks through the territory and picks up all grains. Then he brings all his
 * grains in his cave and deposits them there. Everytime Paule picks up or puts down a grain
 * the amount of grains in his mouth are being printed out. 
 * 
 * @author Mete Karakaya, Linda Riekers, Safet Hayrula
 * @version 04.11.2021
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

		// Paule starts with 0 grains in his mouth. 
		int grainsInMouth = 0;

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth. Paule has 1  grain now
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in Paules mouth
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

		// Pick up the second grain.
		paule.pickGrain();
		
		// Adds 1 grain to Paules mouth. Paule has 2 grains now
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in Paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");	
		
		// Turn in opposite direction
		paule.turnLeft();
		paule.turnLeft();

		// Move til horizontally to third grain
		paule.move();
		paule.move();
		paule.move();

		// Turn and move to the third grain
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the third grain
		paule.pickGrain();

		// Adds 1 grain to Paules mouth. Paule has 3 grains now
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in Paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Turn Left and move once
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

		// Adds 1 grain to Paules mouth. Paule has 4  grains now
		grainsInMouth = grainsInMouth + 1;

		// Prints out the amount of grains in paules mouth
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Turn in opposite direction
		paule.turnLeft();
		paule.turnLeft();

		// Move in cave direction
		paule.move();
		paule.move();
		paule.move();

		// Turn right in cave direction
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// Move to cave direction
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

		// Each time Paule picks up a grain, print the amout of grains in Paules mouth
		paule.pickGrain();

		// Paule has 5  grains now
		grainsInMouth = grainsInMouth + 1; 
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Pick up  a grain
		paule.pickGrain();
		// Paule has 6  grains now
		grainsInMouth = grainsInMouth + 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");	

		// Pick up a grain
		paule.pickGrain();
		// Paule has 7  grains now
		grainsInMouth = grainsInMouth + 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Each time Paule puts down a grain, print the amout of grains left in Paules mouth
		paule.putGrain();

		// Paule has 6 grains now
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Paule has 5 grains now
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Paule has 4 grains now
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Paule has 3 grains now
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Now Paule has 2 grains now
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");

		// Put down a grain
		paule.putGrain();

		// Now Paule has 1 grain
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grain in mouth.");

		// Put down a grain
		paule.putGrain();

		// Now Paule has 0 grains
		grainsInMouth = grainsInMouth - 1;
		paule.write("Paule has now " + grainsInMouth + " grains in mouth.");
		
	}
}
