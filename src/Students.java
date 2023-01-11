public class Students {
    private String name;
    private String classes = "C02";

    public Students() {
    }

    public Students(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Tên='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
