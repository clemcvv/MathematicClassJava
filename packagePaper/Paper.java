package packagePaper;

public class Paper {
	
	/* ATTRIBUT */
	private String front;
	private String back;
	private boolean faceShown; // true = front; false = back
	
	/* GETTERS */
	public boolean getFaceShown() {
		return this.faceShown;
	}
	
	public String getFront() {
		return this.front;
	}
	
	public String getBack() {
		return this.back;
	}
	
	/* SETTERS */
	public void setFaceShown(boolean faceShown) {
		this.faceShown = faceShown;
	}
	
	/* CONSTRUCTOR */
	public Paper(String front, String back) {
		this.front = front;
		this.back = back;
		this.faceShown = true;
	}
	
	/* PRINT */
	public String toString() {
		return getFaceShown() ? getFront() : getBack();
	}
	
	public void returnPaper() {
		setFaceShown(!getFaceShown());
	}
	
}
