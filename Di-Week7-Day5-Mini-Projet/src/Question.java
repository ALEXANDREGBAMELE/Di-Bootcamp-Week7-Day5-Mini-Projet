import java.util.Scanner;

public class Question {
//	variables:
	private String prompt;
	private String answers;
	
//	constructor
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String prompt, String answers) {
		super();
		this.prompt = prompt;
		this.answers = answers;}
//	setters and getters
	public String getPrompt() {return prompt;}
	public void setPrompt(String prompt) {this.prompt = prompt;}
	
	public String getANswers() {return answers;}
	public void setAnswers(String answers) {this.answers = answers;}
	
//	Methodes
	public static String mPrompt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a answer : ");
		String prompt1 = sc.nextLine();
		
		return prompt1;
	}
	
	
}
