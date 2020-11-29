class Point {
int x, y;
public Point(int xx, int yy) { x = xx; y = yy; }
public void change(Point p) { p.x += x; p.y += y; }
public static void main(String[] args) {
Point a = new Point(2, 3), b = new Point(5, 10);
a.change(b);
}
}