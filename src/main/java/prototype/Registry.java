package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<String,Item>();
	
	public Registry() {
		
		loadItems();
	}
	 
	private void loadItems() {
		
	Movie movie = new Movie();
	movie.setTitle("movie");
	movie.setPrice(24.99);
	movie.setRuntime("2h");
	items.put("Movie",movie);
	
	Book book = new Book();
	book.setTitle("book");
	book.setPrice(22.49);
	book.setNumberOfPages(234);
	items.put("Book",book);	
	}

	public Item createItem(String type) {
		Item item=null;
		
		try {
			item=(Item)(items.get(type).clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return item;
		
	}

}
