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

    public String drawRect(int width, int height, char c) {
        String charLine = "";

        while (height > 0) {
            int w = width;
            while (w > 0) {
                charLine += c;
                w--;
            }
            charLine += "\n";
            height--;
        }
        return charLine;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));

        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}