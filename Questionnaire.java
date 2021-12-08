//Idan Malka 315655647
public class Questionnaire {
	protected int numOfQuestions;
	protected Question[] Questions;
	private int corrAnswer;
	private int countQ;
	private int indexQ;
	
	/**
	 * this method is generating a new questioner .
	 * @param  Quiestions as a new array , corrAnswer , countQ , indexQ 
	 * @return the questioner that generated with null in them.
	 *  **/
	public Questionnaire(int type , int num , QuestionsCatalog cat) {
		this.Questions = cat.generateQuestionnaire(num, type);
		this.corrAnswer = 0;
		numOfQuestions = Questions.length;
		countQ = 0;
		indexQ = -1;

	}
    /**
     * this method is checks if there is another question.
     * @return true if countQ(the number of questions of the new array) compared to the number of questions in the question array **/
	public boolean hasNext() {
		if(countQ < numOfQuestions) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * this method goes into the hasNext() and go to the next qustion.
	 * **/
	public Question getNext() {
		if(hasNext()) {
			countQ++;
			indexQ++;
			return this.Questions[indexQ];
		}
		return null;
	}
	/**
	 * this method checks the answer and compare it to the String that inputed .
	 **/
	public void checkAnswer(String answer) {
		if (answer.equals(this.Questions[indexQ].getCorrectAnswer())) { 
		corrAnswer++;
		}
		
	}
	/**
	 * this method gets the total of questions that is asked.
	 * @return the  number of questions. **/
	public int getTotalQuestions() {
		System.out.print("this number of questions: " + numOfQuestions + "\n");
		return numOfQuestions;
	}/**
	* this method returns the correct answer.**/
	public int getCorrectAnswers()	{
		return corrAnswer;
	}

}
