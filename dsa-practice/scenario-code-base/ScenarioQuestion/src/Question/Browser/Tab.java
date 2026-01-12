package Question.Browser;

public class Tab {
	String text;
	Tab next;
	Tab pre;
	public Tab(String text) {
		this.text = text;
		this.next = null;
		this.pre = null;
	}
}