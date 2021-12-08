
public class QuestionsCatalog {
	//this is the method attributes.
	protected Question[] question = new Question[20];
	protected int howMuchTaken;

	// final attributes.
	public static final int SHORT = 1 , MULTIPLE = 2 , BOTH = 3 ;

	//this method configure the array and the number of taken places in the array
	public QuestionsCatalog() {
		question = new Question[20];
		howMuchTaken = 0;
	}
	/**
	 * this method adds questions to the array
	 **/
	public void addQuestion(Question q) {
		question[howMuchTaken] = q;
		howMuchTaken++;

	}
	/**
	 * this method is a private method that checks if the index is taken by 1
	 * @return true / false if 1 is implemented.**/
	private boolean check(int[] arr) {
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] == 1) {
				return true;
			}
		}
		return false;
	}
	/***
	 * this method returns a generated questionnare 
	 * @param int i ,int j , a new array after taking from the Question array
	 * @return the new array with the questions .
	 * **/
	public Question[] generateQuestionnaire(int num , int type) {
		Question[] outpot = new Question[num];
		int[] arr = new int[question.length];
		int i = 0;
		int save = 0 ;
		int Q;
		for(i = 0 ; i < arr.length ; i++) {
			if(question[i] != null) {
				arr[i] = 1;
			}

		}
		if(type == SHORT) {
			for(i = 0 ; i <= outpot.length - 1 ; i++) {
				if(check(arr) == false ) {
					break;
				}while(outpot[i] == null) {
					Q = (int)(Math.random() * question.length - 1);
					if(arr[Q] == 0) {
						continue;
					}

					if(outpot[save] == null) {
						if(question[Q] instanceof ShortAnswerQuestion) {
							outpot[save] = question[Q];
							howMuchTaken ++;
							save++;
							arr[Q] = 0;
						}
						break;
					}
				}
			}
		} 
		if(type == MULTIPLE) {
			for(i = 0 ; i <= outpot.length - 1 ; i++) {
				if(check(arr) == false ) {
					break;
				}while(outpot[i] == null) {
					Q = (int)(Math.random() * question.length - 1);
					if(arr[Q] == 0) {
						continue;
					}

					if(outpot[save] == null) {
						if(question[Q] instanceof MultipleChoiceQuestion) {
							outpot[save] = question[Q];
							howMuchTaken ++;
							save++;
							arr[Q] = 0;
						}
						break;
					}
				}
			}
		} 

		if(type == BOTH) {
			for(i = 0 ; i <= outpot.length - 1 ; i++) {
				if(check(arr) == false ) {
					break;
				}while(outpot[i] == null) {
					Q = (int)(Math.random() * question.length - 1);
					if(arr[Q] == 0) {
						continue;
					}

					if(outpot[save] == null){
						outpot[save] = question[Q];
						howMuchTaken ++;
						save++;
						arr[Q] = 0;
					}
				}
			}
		} 
		int j = 0; 

		for(j = 0 ; j <= outpot.length - 1 ; j++ ) {
			if(outpot[j] == null) {
				break;
			}
		}
		if(j == outpot.length) {
			return outpot;
		}else {
			Question[] ifDone = new Question[j];
			for(i = 0 ; i < ifDone.length ; i++) {
				ifDone[i] = outpot[i];
			}
			if(type > 3 ) {
				System.out.println("the type can only be 1,2,3 please re-enter.");
			}return ifDone;
		}
	}
}



