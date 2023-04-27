import java.util.ArrayList;

/**
 Klasa RownanieKwadratowe
 a: int, pole statyczne
 b: int, pole statyczne
 c: int, pole statyczne
 wynikDelty: int, pole statyczne które posiada w sobie wynik działania na oblicznei delty
 ac: int, jest to wartość a + c
 ac4: int, jest to wartość ac * 4
 @author: Szymon Michna

 **/

public class RownanieKwadratowe {

    private final RownanieKwadratowe <Delta> list =  new ArrayList<>;
    private static int a;
    private static int b;
    private static int c;
    private static int wynikDelty;

    public static void delta(int a,int b,int c, int wynikDelty){
        int ac;
        int ac4;
        ac = a + c;
        ac4 = ac * 4;

        wynikDelty = b * b - ac4;
    }

    public RownanieKwadratowe() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static int getC() {
        return c;
    }

    public static int getWynikDelty() {
        return wynikDelty;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
        System.out.println(a+"x^2"+" + "+b+"x"+c);
    }


}
