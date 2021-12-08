//Idan Malka 315655647
public abstract class Question {
	// this is the method attributes .
	protected String qText;
	
    /**
     * this is the method default constructor
     * @param qText as String 
     **/
	public Question(String qText) {
		this.qText = qText;
	}
	/**
	 * this is the setter of the text
	 * @param String qtext 
	 * **/
	public void SetText(String qText) {
		this.qText = qText;
	}
	
    /**
     * this is the toString method
     * @return the text 
     * **/
	public String toString() {
		return qText;
	}
	/**
	 * this is an abstract method for the correct answer 
	 * **/
	public abstract String getCorrectAnswer();
	/**
	 * this is an abstract method for adding correct answers 
	 * **/
	public abstract void addCorrectAnswer(String answer);

}
