package application;

import java.awt.Point;

import searches.BFS;
import searches.DFS;
import searches.Greedy;
import searches.Magic;
import searches.RandomWalk;
import searches.SearchAlgorithm;
import searches.SearchFactory;

public class MazeController {
	/* 
	 * Logic of the program
	 */
	// The search algorithms
	public Greedy greedy;				
	public BFS bfs;
	public DFS dfs;
	public RandomWalk rand;
	public Magic magic;
	public SearchAlgorithm search;		// This string tells which algorithm is currently chosen.  Anything other than 
	// the implemented search class names will result in no search happening.
	private MazeDisplay display;
	private Maze maze;
	public SearchFactory factory = new SearchFactory();
	Point start;
	Point goal;
	
	public MazeController(int rows, int col, MazeDisplay dis, Maze mazeDub) {
		maze = mazeDub;
		display = dis;
		start = new Point(1,1);
		goal = new Point(rows-2,col-2);
		
	}
	
	/*
	 * Does a step in the search regardless of pause status
	 */
	public void doOneStep(double elapsedTime){
		if(search != null) search.step();
		display.redraw();
	}
		

	public void startSearch(String searchType) {
		maze.reColorMaze();
		search = factory.makeSearch(searchType, maze, start, goal);	
		
		
		// Restart the search.  Since I don't know 
		// which one, I'll restart all of them.
//		search = new BFS(maze, start, goal);	// start in upper left and end in lower right corner
//		search = new DFS(maze, start, goal);
//		search = new Greedy(maze, start, goal);
//		search = new RandomWalk(maze, start, goal);
//		search = new Magic(maze, start, goal);
	}

	
	
}
