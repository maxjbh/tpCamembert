
public class Controller implements IController{

	private boolean selected;
	private int selectedPie;
	//private CamembertView linkedView;
	private ICamembertModel linkedModel;
	
	public Controller(ICamembertModel model) {
		//linkedView = view;
		linkedModel = model;
		selected = false;
		selectedPie = 0;
	}
	
	@Override
	public void setSelected(boolean b) {
		selected = b;
	}

	@Override
	public int getSelectedPie() {
		return selectedPie;
	}

	@Override
	public void setSelectedPie(int i) {
		selectedPie = i;
		
	}

	@Override
	public boolean isSelected() {
		return selected;
	}

	@Override
	public void deSelect() {
		selected = false;
		
	}

	@Override
	public void selectPie(int i) {
		selected = true;
		selectedPie = i;
		
	}

	@Override
	public void nextPie() {
		selectedPie++;
		if(selectedPie>=linkedModel.size()) {
			selectedPie = 0;
		}
		
	}

	@Override
	public void previousPie() {
		selectedPie--;
		if(selectedPie<0) {
			selectedPie = linkedModel.size() - 1;
		}
		
	}

}
