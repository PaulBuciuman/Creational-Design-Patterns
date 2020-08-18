package factory;

import java.util.*;

public abstract class Website {

	protected List<Page> pages = new ArrayList<Page>();
	
	public Website() {
		
		this.createWebsite();
	}
	
	protected abstract void createWebsite();

	public List<Page> getPages() {
		return pages;
	}
	
	
}
