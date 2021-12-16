package com.design.behavioral.iterator;

import com.design.behavioral.iterator.use.Client;
import com.design.behavioral.iterator.use.FantasyBookShelf;
import com.design.behavioral.iterator.use.HistoryBookShelf;

public class IteratorMain {
	
	public static void main(String[] args) {
		
		HistoryBookShelf history = new HistoryBookShelf();
		FantasyBookShelf fantasy = new FantasyBookShelf();
		
		Client cli = new Client(history, fantasy);
		
		cli.printBook();
		
	}

}
