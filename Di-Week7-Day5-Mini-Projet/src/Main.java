
public class Main {
	public static void main(String[] args) {
		QCM qcm1 = new QCM();
		System.out.println(qcm1.q1);
		
		Question question1 = new Question();
		String recoit = (String) Question.mPrompt();
		System.out.println("le voici " + recoit);
	}
}
