package day05;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/24
 **/
public class Rectangle extends BaseGraph {
    private  final double length;
    private  final double width;
    public Rectangle(double length,double width){
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double getCrcumference() {
        return 2 * (length + width);
    }
}
