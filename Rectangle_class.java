class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return length * breadth;
    }
}

class Rectangle_class {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10, 5);
        Rectangle rec2;
        rec2 = new Rectangle(20, 10);
        System.out.println(rec1.area());
        System.out.println(rec2.area());
    }
}

// 50
// 200