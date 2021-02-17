package Assignment1Q2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private String QuestionId;
	private String Question;
	public String getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(String questionId) {
		QuestionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	/*private Map<Integer,String> answers;
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}*/
	/*public List<String> answers;
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}*/
	private Set<String> answers;
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	public void print()

	{
		System.out.println("QuestionId : "  +QuestionId+  "Question :"+Question);
		for(String s: answers)
		{
			System.out.println(s);
		}
		/*for(Entry<Integer, String> s:answers.entrySet())
		{
			System.out.println(s);
		}*/
	}
}
