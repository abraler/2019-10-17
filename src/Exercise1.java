import java.util.List;

public class Exercise1 {
    //   StringBuffer    线程安全
    //   StringBuffer    速度更快
    public static void throwExceptionMethod(boolean Isthrow) {
        System.out.println("输出异常之前");
        if (Isthrow) {
            throw new NullPointerException();
        }
        System.out.println("输出异常之后");
    }

    public static void main(String[] args) {
        try {
            throwExceptionMethod(true);
        }catch (NullPointerException e){
            System.out.println("catch");
        }
        catch (AbstractMethodError a){
            System.out.println("haidelai");
        }finally {
            System.out.println("dddwdefe");
        }
    }
}
