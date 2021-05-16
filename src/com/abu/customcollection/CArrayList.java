package com.abu.customcollection;

import java.util.Arrays;

public class CArrayList {

	private Object[] items = new Object[2];
	private int index = 0;

	public void add(Object obj) {
		// if array if full grow size by 3
		// set data to d[index]
		// index++

		if (this.index == items.length) {
			// we need to increase the size of data[]
			grow();
		}
		items[this.index] = obj;
		this.index++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		result = prime * result + Arrays.hashCode(items);
		return result;
	}

	private void grow() {
		// if array size is equal to index
		// change array size

		Object newArr[] = new Object[items.length + 1];
		for (int i = 0; i < items.length; i++) {
			newArr[i] = items[i];
		}
		this.items = newArr;
	}

	public int size() {
		return index;
	}

	public Object get(int i) {
		// check for valid index
		return items[i];
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(items[0]);

		for (int i = 1; i < size(); i++) {
			sb.append(","+items[i] );
		}
		return sb.toString();
	}

	public boolean isEmpty() {
		if (index == 0)
			return true;

		return false;

		// OR
		// return index == 0
	}

	public boolean contains(Object data) {
		for (int i = 0; i < size(); i++) { // here null pointer exception occurs if size is not given
			if (items[i].equals(data)) {
				return true;
			}
		}
		return false;
	}

}