import java.util.ArrayList;

public class CamembertModel implements ICamembertModel{

	private String title;
	
	public CamembertModel(String title) {
		this.title = title;
	}
	
	@Override
	public void addObserver(CamembertView camembertView) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		return items.size();
	}

	/*
	 * gets the Value! of item at index i, not values, badly named!!
	 */
	@Override
	public double getValues(int i) {
		/*
		double subTotal = 0;
		for(int index =0; index<=i; index++) {
			Item current = items.get(index);
			subTotal += current.value;
		}
		return subTotal;
		*/
		return items.get(i).value;
	}

	@Override
	public double total() {
		double total = 0;
		for(Item i:items) {
			total += i.value;
		}
		return total;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getUnit() {
		return "€";
	}

	@Override
	public String getTitle(int i) {
		return items.get(i).title;
	}

	@Override
	public String getDescription(int i) {
		return items.get(i).description;
	}
	
	//List holding items of the pie chart
	private ArrayList<Item> items = new ArrayList<>();
	
	//Functions to add and remove items
	public void addItem(String title, String description, double value) {
		items.add(new Item(title, description, value));
	}
	public void removeItemByTitle(String title) {
		for(int i =0; i<items.size(); i++) {
			Item current = items.get(i);
			if(current.title.equals(title)) {
				items.remove(current);
			}
		}
	}
	
	private class Item{
		String title;
		String description;
		double value;
		public Item(String title, String description, double value) {
			this.title = title;
			this.description = description;
			this.value = value;
		}
	}
	
	

}
