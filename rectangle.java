public class rectangle {
    int area;
    int perimeter;
    int width;
    int length;

    public void areaOfRectangle(int length, int width) {
        area = length * width;
        System.out.println("Area of the rectangle is: " + area);
    }

    public void perimeterOfRectangle(int length, int width) {
        perimeter = 2 * (length * area);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea(int area) {
        return this.area;
    }

    public int getPerimeter(int perimeter) {
        return this.perimeter;
    }
}
