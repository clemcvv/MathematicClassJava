package packagePaper;

public class Envelope {
	
	/* ATTRIBUT */
	private boolean openOrClose; // true = open; false = close
	private Paper[] paperInContentArray;
	private int maxPaper;
	private int nbPaper;
	
	/* CONSTRUCTEUR */
	public Envelope(int maxPaper) {
		this.openOrClose = false;  
		this.maxPaper = maxPaper;   
		this.paperInContentArray = new Paper[maxPaper]; 
		this.nbPaper = 0; 
	}
	
	/* SETTEURS */
	public void setmaxPaper(int maxPaper) {
		this.maxPaper = maxPaper;
	}
	public void setOpenOrClose(boolean openOrClose) {
		this.openOrClose = openOrClose;
	}
	public void setPaperInContentArray(Paper[] paperInContentArray) {
		this.paperInContentArray = paperInContentArray;
	}
	
	/* GETTERS */
	public boolean getOpenOrClose() {
		return this.openOrClose;
	}
	public int getMaxPaper() {
		return this.maxPaper;
	}
	public int getNbPaper() {
		return this.nbPaper;
	}
	public Paper[] getPaperInContentArray() {
		return this.paperInContentArray;
	}
	
	/* METHODE */
	public void open() {
		setOpenOrClose(true);
	}
	public void close() {
		setOpenOrClose(false);
	}
	
	public void addPaper(Paper p) {
		if (getNbPaper() < getMaxPaper()) {
			paperInContentArray[getNbPaper()] = p; 
			nbPaper++; 
		} else {
			System.out.println("The envelope is full, impossible to add more sheets.");
		}
	}
	
	public void read() {
		if (getOpenOrClose()) {
			for (int i = 0; i < nbPaper; i++) {
		        System.out.println("Face visible actuelle : " + paperInContentArray[i].toString());
		        paperInContentArray[i].returnPaper();
		        System.out.println("Face après retournement : " + paperInContentArray[i].toString());
		    }
		} else {
			System.out.println("Envelope is closed, impossible to read sheets");
		}
	    
	}

	
	
}
