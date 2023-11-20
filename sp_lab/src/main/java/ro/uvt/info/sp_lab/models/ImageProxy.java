package ro.uvt.info.sp_lab.models;

public class ImageProxy implements Element, Picture {
    private final String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public void add(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    public void remove(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    public Element get(int id) {
        System.out.println("Images cannot contain other elements.");
        return null;
    }

    @Override
    public String url() {
        System.out.println("Images cannot contain url.");
        return null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }
}
