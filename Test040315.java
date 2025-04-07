package kr.ac.kopo.test;

/*
15. 아래의 코드에서 컴파일 시 오류가 발생되는 라인을 모두 찾으시오.

1: class Shape {
2:     int x, y;
3:     Shape(int x, int y) {
4:         this.x = x;
5:         this.y = y;
6:     }
7:     void info() {
8:         System.out.println("x : " + x + " y : " + y);
9:     }
10: }

11: class Rectangle extends Shape {
12:     Rectangle() {}                    // 오류 발생
13:     Rectangle(int x, int y) {
14:         super(x, y);
15:     }
16:     void getArea() {
17:         return x * y;                 // 오류 발생: void → int
18:     }
19: }

20: public class Test24 {
21:     public void info(Shape s) {
22:         s.info();
23:         s.getArea();                  // 오류 발생: getArea는 Shape에 없음
24:     }

25:     public static void main(String[] args) {
26:         Rectangle rec = new Rectangle(3, 7);
27:     }
28: }

*/