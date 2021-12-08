
public class MultipleChoiceQuestion extends Question {
	//this is the method attributes .
	protected String[] answers = new String[6];
	protected int numberOfAnswers;
	protected int correctAnswerIndex;
	private String ans;
	
	/**
	 * this is the method that gets the question and the answer.
	 * @param qText as question and answer (strings)
	 * **/
	public MultipleChoiceQuestion(String qText , String answer) {
		super(qText);
		this.answers[0] = answer;
		ans = answer;
	}
	/**
	 * this is a toString method 
	 * @return the answers as Text**/
	public String toString() {
		
		String res = "";
		for(int i = 0 ; i < this.numberOfAnswers ; i++) {
			res += (2+i) + ")" + answers[i] +"\n";
		}
		return super.qText + "\n" + "1)" + ans + "\n" + res;
				
	}
    /**
     * this is an override method that get the correct answer 
     * @return the right answer that is placed at the index 0
     * **/
	@Override
	public String getCorrectAnswer() {
		return ans;
	}
    /**
     *this is an override method that adds correct answers to the array of answers 
     *@param string answer 
     **/
	@Override
	public void addCorrectAnswer(String answer) {
		for(int i = 0 ; i <= answers.length - 1 ; i++ ) {
			if(answers[i] == null) {
				answers[i] = answer;
				correctAnswerIndex = i ;
			}else if(i == answers.length - 1) {
				
			}
		}
	}
	/**
	 * this method is adding wrong answers to the array of answers 
	 * @param string answer.**/
	public void addAnswer(String answer) {
		answers[numberOfAnswers] = answer;
		numberOfAnswers++;
		}
	}


