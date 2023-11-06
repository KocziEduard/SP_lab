package ro.uvt.info.sp_lab;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String url;

    public Image(String imageName) {
        this.url = imageName;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String url() {
        System.out.println("Images cannot contain url.");
        return null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String imageName) {
        this.url = imageName;
    }

    public void print() {
        System.out.println("Image: " + url);
    }

    @Override
    public void add(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    @Override
    public void remove(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    @Override
    public Element get(int nr) {
        System.out.println("Images cannot contain other elements.");
        return null;
    }
}
