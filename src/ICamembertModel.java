
public interface ICamembertModel {

	void addObserver(CamembertView camembertView);

	int size();

	double getValues(int i);

	double total();

	String getTitle();

	String getUnit();

	String getTitle(int i);

	String getDescription(int i);
	

}
