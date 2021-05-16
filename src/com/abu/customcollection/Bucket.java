package com.abu.customcollection;

public class Bucket {

	private int id;
	private CArrayList items = new CArrayList();//newbucket is created and items are added.

	public Bucket(int id) {
		this.id = id;
	}

	public boolean add(Object data) {
		// if data exists then it will not add otherwise data is added
		if (items.contains(data)) {
			return false;
		}
		items.add(data);
		return true;
	}

	public int getId() {
		return id;
	}

	/*public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|-----"+getId()+"----"+items.get(0));
		for (int i = 1; i < items.size(); i++) {
			sb.append(","+items.get(i));
		}
		return sb.toString();
	}*/
	 public String toString() {
	        String t = "[ ";
	        for (int i = 0; i < items.size(); i++) {
	            //t += item[i] + ", ";
	        	t=t+items.get(i)+",";
	        }
	        t += "]";       
	        return t;
	    }
}
