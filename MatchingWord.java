
public class MatchingWord {
	public static void main(String[] args) {
		String s1 = "Most paragraphs contain between three and five sentences, but there are plenty of exceptions. Different types of paragraphs have different numbers of sentences, like those in narrative writing, in particular, where single-sentence paragraphs are common.";
		String s2 = "the";
		String s3[] = s1.toLowerCase().split(s2);
		System.out.println("your word is :" + s2 + " " + "\n your word count is:" + " " + (s3.length - 1));

	}


}
