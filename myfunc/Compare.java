package LogicalIndexing;

public class Compare {	
	// ----- integer ----- //
	public static void idxGreater(int[] array, int value, boolean[] idx) {
		
		for (int i=0; i<array.length; i++) {
			if(array[i]>value) {
				idx[i] = true;
			}
		}
	}
	
	public static void idxGreater(int[][] array, int value, boolean[][] idx) {
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j]>value) {
					idx[i][j] = true;
				}
			}			
		}
	}
	
	public static void idxEquals(int[] array, int value, boolean[] idx) {
		
		for (int i=0; i<array.length; i++) {
			if(array[i] == value) {
				idx[i] = true;
			}
		}
	}
	
	
	
	public static void idxLess(int[] array, int value, boolean[] idx) {
		
		for (int i=0; i<array.length; i++) {
			if(array[i]<value) {
				idx[i] = true;
			}
		}
	}
	
	public static void idxLess(int[][] array, int value, boolean[][] idx) {
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j]<value) {
					idx[i][j] = true;
				}
			}			
		}
	}
	// ----- String ----- //
	public static void idxEquals(String[] array, String value, boolean[] idx) {
		
		for (int i=0; i<array.length; i++) {
			if(array[i].equals(value)) {
				idx[i] = true;
			}
		}
	}
	
	public static void idxEquals(String[][] array, String value, boolean[][] idx) {
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				if(array[i][j].equals(value)) {
					idx[i][j] = true;
				}
			}			
		}
	}
	
	// ----- logical compare ------ //
	public static void idxOr(boolean[] idx1, boolean[] idx2, boolean[] resultIdx) {
		for(int i=0; i< idx1.length; i++) {
			resultIdx[i] = idx1[i] | idx2[i];
		}
	}
	
	public static void idxOr(boolean[][] idx1, boolean[][] idx2, boolean[][] resultIdx) {
		for(int i=0; i< idx1.length; i++) {
			for(int j=0; j<idx1[i].length; j++) {
				resultIdx[i][j] = idx1[i][j] | idx2[i][j];
			}
		}
	}
	
	public static void idxAnd(boolean[] idx1, boolean[] idx2, boolean[] resultIdx) {
		for(int i=0; i< idx1.length; i++) {
			resultIdx[i] = idx1[i] & idx2[i];
		}
	}
	
	public static void idxAnd(boolean[][] idx1, boolean[][] idx2, boolean[][] resultIdx) {
		for(int i=0; i< idx1.length; i++) {
			for(int j=0; j<idx1[i].length; j++) {
				resultIdx[i][j] = idx1[i][j] & idx2[i][j];
			}
		}
	}

}
