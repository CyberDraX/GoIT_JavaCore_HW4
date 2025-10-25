public class ArlanHelper {

    public String drawQuad(int n) {

        String starLine = "";
        int lineCount = 0;

        while (lineCount < n) {
            int secondLine = 0;
            while (secondLine < n) {
                starLine += "*";
                secondLine++;
            }
            starLine += "\n";
            lineCount++;
        }
        return starLine;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}