package skilltesting.fr;

import java.util.ArrayList;
import java.util.List;

public final class Partition  {

	private final List<Integer> list;
	private final int partitionSize;

	public Partition(List<Integer> list, int partitionSize) {
		this.list = new ArrayList<Integer>(list);
		this.partitionSize = partitionSize;
	}

/**
 * 
 * @param list
 * @param size
 * @return
 */
	public static  Partition ofSize(List<Integer> list, int size) {
		return new Partition(list, size);
	}
/*
 * 
 */
	public List<Integer> get(int index) {
		
		try
		{		
	
		int start = index * partitionSize;
		int end = Math.min(start + partitionSize, list.size());
		return new ArrayList<Integer>(list.subList(start, end));
		
		}catch (Exception e) {
		e.getMessage();
		}
		return null;
	
	}

/**
 * 
 * @return
 */
	public int size() {
		return (int) Math.ceil((double) list.size() / (double) partitionSize);
	}
}