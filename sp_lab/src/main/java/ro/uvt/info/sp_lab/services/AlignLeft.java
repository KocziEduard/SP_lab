package ro.uvt.info.sp_lab.services;

public class AlignLeft implements AlignInterface {
    public String Render(String text, int lineLength){
        int length = text.length();
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (start < length) {
            int end = Math.min(start + lineLength, length);
            result.append(text, start, end).append('\n');
            start = end;
        }
        return result.toString();
    }
}
