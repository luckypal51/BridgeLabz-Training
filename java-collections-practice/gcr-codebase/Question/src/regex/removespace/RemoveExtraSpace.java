package regex.removespace;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String text = "This   is   an   example   with   multiple   spaces.";
        text = text.trim();
        String result = text.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
