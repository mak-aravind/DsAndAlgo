package com.mak.LRU;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cache {
	
	int capacity;
	
	private DoublyLinkedList urlHistory;
	private Map<String, Node> urlLookupMap;
	private final int cacheSize;
	
	public Cache(int cacheSize){
		this.cacheSize = cacheSize;
		urlHistory = new DoublyLinkedList(cacheSize);
		urlLookupMap = new HashMap<String,Node>();
	}

	public void accessPage(String page){
		Node pageNode = null;
		if (urlLookupMap.containsKey(page)){
			pageNode = urlLookupMap.get(page);
			urlHistory.moveUrlToHead(pageNode);
		}else{
			if (urlHistory.getListSize() == urlHistory.getCapacity()){
				urlLookupMap.remove(urlHistory.getTail().getUrl());
			}
			pageNode = urlHistory.addUrlToHistory(page);
			urlLookupMap.put(page, pageNode);
		}
	}
	 public void listHistory() {
	 	urlHistory.printList();
	 	System.out.println();
	 	System.out.println("Cache Size:" + this.cacheSize);
    }
	public static void main(String[] args) {
		int cacheSize = 4;
		Cache browserAddressBar = new Cache(cacheSize);
		
		String[] address = new String[]{"www.google.com",
									"www.yahoo.com",
									"www.amazon.com",
									"www.amazon.com",
									"www.google.com",
									"www.flipkart.com",
									"www.snapdeal.com",
									"www.thoughworks.com",
									"www.flipkart.com"};
		
		Arrays.stream(address).forEach(url -> {browserAddressBar.accessPage(url);
												 browserAddressBar.listHistory();
												}
										   );
	}
}
