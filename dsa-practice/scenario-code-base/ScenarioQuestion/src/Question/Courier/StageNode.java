package Question.Courier;

public class StageNode {
    public String stageName;
    public StageNode next;

    public StageNode(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}
