package com.study.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Map {


	public static void main(String[] args) {
		
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> mlist;
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

		Random num = new Random(100);
		for (int i = 0; i < 50; i++) {
			Integer e = num.nextInt(100);
			alist.add(e);
		}
		System.out.println("随机生成50个小于100的数，分别为：");
		for(Integer l:alist){
			System.out.print(l+",");
		}
		
		for(Integer l:alist){
			int key = l/10;
			if(!map.containsKey(key)){
				mlist = new ArrayList<>();
				mlist.add(l);
			}else{
				mlist = map.get(key);
				mlist.add(l);
			}
			map.put(key, mlist);
		}
		System.out.println();
		System.out.println("Map中的数据为：");
		System.out.println(map);
		System.out.println();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			mlist = map.get(it.next());
			Collections.sort(mlist);
		}
		System.out.println("排序后的Map为：");
		System.out.println(map);
	}
}
