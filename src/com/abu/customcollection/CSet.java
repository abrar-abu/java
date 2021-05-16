package com.abu.customcollection;

public class CSet {
	private CArrayList buckets = new CArrayList();

	boolean add(Object data) {
		int id = data.hashCode();
		for (int i = 0; i < buckets.size(); i++) {
			Bucket currentBucket = (Bucket) buckets.get(i);
			if (currentBucket.getId() == id) {
				return currentBucket.add(data);
			}
		}
		// If bucket is not present then create and add the bucket in arraylist
		Bucket newBucket = new Bucket(data.hashCode());
		buckets.add(newBucket);// adding items int the new bucket
		return newBucket.add(data);
	}

	public int size(){
		return buckets.size();
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < buckets.size(); i++) {
			sb.append(buckets.get(i)+"\n");
		}
		return sb.toString();
	}

}
