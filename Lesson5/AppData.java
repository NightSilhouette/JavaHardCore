package JK.Lesson5;

public class AppData  {
    private String header;
    private int data;

    public AppData(String header, int data) {
        this.header = header;
        this.data = data;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header='" + header + '\'' +
                ", data=" + data +
                '}';
    }
}
