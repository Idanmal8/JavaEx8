
public class ShortAnswerQuestion extends Question {
	// this is the method attributes .
	protected String answer;
	
	/**
	 * this is the method that consume the answer and the quiestion 
	 * @param strings , answer and qText as 
     **/
	public ShortAnswerQuestion(String qText, String answer) {
		super(qText);
		this.answer = answer;
		
	}
	
    /**
     * this is an override method that gives the correct answer
     * **/
	@Override
	public String getCorrectAnswer() {
		return this.answer;
	}
    /**
     * this is the override of the adding of the the correct answer
     * **/
	@Override
	public void addCorrectAnswer(String answer) {
		this.answer = answer;
	}
	

}
