package searches;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import application.Maze;

public abstract class SearchAlgorithm {
	
	protected Maze maze;					// The maze being solved
	protected Point goal;					// The goal Point - will let us know when search is successful
	protected Collection<Point> data;		// Data structure used to keep "fringe" points
	protected boolean searchOver = false;	// Is search done?
	protected boolean searchResult = false;	// Was it successful?
	protected Point current;				// Current point being explored
	
	public SearchAlgorithm (Maze mazeBlocks, Point startPoint, Point goalPoint) {
		maze = mazeBlocks;
		goal = goalPoint;
		current = startPoint;
		maze.markPath(current);
		
		
	}
	
	 abstract public boolean step();

}
