package TreeAlgo;

public class TreeAlgoIsland {

	 public static int numIslands(char[][] grid) {
		 if (grid==null || grid.length==0) return 0;
		 boolean[][] visited=new boolean[grid.length][grid[0].length];
		 int totalIsland=0;
	     for (int x=0 ;x<grid.length;x++)
	     {
	    	 for (int y=0;y<grid[0].length;y++)
	    	 {
	    		 System.out.println("reached item-"+ x+"-"+y );
	    		 if (visited[x][y]) 
	    		 {
	    			 System.out.println("already visited item-"+ x+"-"+y );
		    		 
	    			 continue;
	    		 }
	    			 //mark current visited
	    		 //visited[x][y]=true;
	    		 // continue if current value is not 1
	    		 if (Character.valueOf(grid[x][y])!= '1') 
	    			 {
	    			 System.out.println("item not land -"+ x+"-"+y );
	    			 continue;
	    			 
	    			 }
	    		 // if 1 then find all neighbor recursively 
	    		 //increment island counter
	    		 if (visited[x][y]) continue;
	    		 System.out.println("Island fount at -"+ x+"-"+y );
		    		 
	    		totalIsland++;
	    		 visitNeighbor(grid,visited,x,y);
	    		 
	    		 // left,right.up.down
	    		 
	    	 }
	     }
		 return totalIsland;
	    }
	 private static void visitNeighbor(char[][] grid, boolean[][] visited,int x,int y)
	 {
		 // visit left neighbors
		 //mark current visited
		 if (x<0 || y<0 || x>grid.length-1 || y>grid[0].length-1) return;
		 if (visited[x][y]==true) {
			 System.out.println("Neighbor already visited-"+ x+"-"+y );
    		 
			 return;}
		 
		 visited[x][y]=true;
		 if (Character.valueOf(grid[x][y])!= '1')  return ;
		 if (y>0)
		 {
			 visitNeighbor(grid, visited, x, y-1);
		 }
		 // visit right neighbor
		 if (y<grid[0].length-1)
		 {
			 visitNeighbor(grid, visited, x, y+1);
		 }
		// visit top 
		 
		 if (x>0)
		 {
			 visitNeighbor(grid, visited, x-1, y);
		 }
		// visit bottom 
		 
		 if (x<grid.length-1)
		 {
			 visitNeighbor(grid, visited, x+1, y);
		 }
		 
		 
	 }
}
