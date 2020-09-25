
public interface IController {

	void setSelected(boolean b);

	//Selected Piece** of pie, badly named function
	int getSelectedPie();

	void setSelectedPie(int i);

	boolean isSelected();

	void deSelect();

	void selectPie(int i);

	void nextPie();

	void previousPie();

}
