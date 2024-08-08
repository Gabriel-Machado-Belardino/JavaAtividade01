public class Object {
    private String name;
    private float height;
    private float width;

    public Object(String name, float height, float width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    @Override
    public String toString(){
        return "Nome: " + this.name + " | Altura: " + this.height + " | Largura: " + this.width;
    }
}
