package principle;

import javafx.scene.shape.Circle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-16 22:19
 * 开闭原则
 */
public class OpenClosePrinciple {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle1());
        graphicEditor.drawShape(new Triangle());
    }
}

// 开闭原则
class GraphicEditor {
    // 接收shape方法，调用draw方法
    public void drawShape(Shape s) {
        s.draw();
    }
}
abstract class Shape {
    int m_type;
    public abstract void draw(); // 抽象方法
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle1 extends Shape {
    Circle1() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}


//// 传统方法缺点，违反设计的ocp的原则，即对扩展开放(提供方)，对修改关闭(使用方)。
//// 比如我们这要新增加一个图像类型 三角形，需要修改的地方比较多
//// 这是一个用于绘图的类
//class GraphicEditor {
//    // 接收Shape对象，然后根据type，来绘制不同的图形
//    public void drawShape(Shape s) {
//        if (s.m_type == 1) {
//            drawRectangle(s);
//        } else if (s.m_type == 2) {
//            drawCircle(s);
//        } else if (s.m_type == 3) {
//            drawTriangle(s);
//        }
//    }
//
//    // 绘制矩形
//    public void drawRectangle (Shape r){
//        System.out.println("绘制矩形");
//    }
//
//    // 绘制圆形
//    public void drawCircle(Shape r) {
//        System.out.println("绘制圆形");
//    }
//
//    // 绘制三角形
//    public void drawTriangle(Shape r) {
//        System.out.println("绘制三角形");
//    }
//}
//
//// Shape类，基类
//class Shape {
//    int m_type;
//}
//
//class Rectangle extends Shape {
//    Rectangle() {
//        super.m_type = 1;
//    }
//}
//class Circle extends Shape {
//    Circle() {
//        super.m_type = 2;
//    }
//}
//class Triangle extends Shape {
//    Triangle() {
//        super.m_type = 3;
//    }
//}