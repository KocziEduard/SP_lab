package ro.uvt.info.sp_lab;

public class Image implements Element{
    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
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
