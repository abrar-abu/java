package com.abu.customcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Cmap {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(1, "asmita");
		m1.put(2,"neha");
		m1.put(2, "sham");
		m1.put(3, "ram");
		//System.out.println(m1);
		Map m2=new HashMap();
		m2.putAll(m1);
	
		//System.out.println(m1);
		m1.remove(2,"neha");
		m2.put(4, "radha");
	//	System.out.println(m1);
		m2.get(m1);
		System.out.println(m1);
		System.out.println(m1.containsKey(4));
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.entrySet());
		
		/*Set set=m1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		System.out.println("using foreach loop");
		Set keyset=m1.keySet();
		Object[] arr=keyset.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+m1.get(arr[i]));
		}
		
		/*Set set = m1.entrySet();
        System.out.println(set);        
        for(Object object : set)
        {
            Entry e = (Entry) object;
            System.out.println(e.getKey() + " : " + e.getValue());
        }*/
        Set set1=m1.keySet();
		Iterator itr=set1.iterator();
		while(itr.hasNext())
		{
			
		}
      
        
	}

}
