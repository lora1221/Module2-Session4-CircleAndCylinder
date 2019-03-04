public class Cylinder extends Circle{
    private int height;

    public Cylinder() {
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(){
        return this.getArea() * this.height;
    }

    public String toString(){
        return "I am a cylinder";
    }
}
