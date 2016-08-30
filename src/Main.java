/**
 * Created by melaniejohnson on 8/18/16.
 */
public class Main {

    public static void main(String[] args) {

        Kata kata = new Kata();

        System.out.println(kata.exPlode("Example"));
        System.out.println(kata.exPlode("Cat"));
        System.out.println(kata.exPlode(""));
        System.out.println(kata.exPlode("C"));

        System.out.println(kata.notString("candy"));
        System.out.println(kata.notString("x"));
        System.out.println(kata.notString("not bad"));

        System.out.println(kata.missingChar("kitten", 1));
        System.out.println(kata.missingChar("kitten", 0));
        System.out.println(kata.missingChar("kitten", 4));
        System.out.println(kata.missingChar("melanie", 4));

        System.out.println(kata.frontBack("code"));
        System.out.println(kata.frontBack("a"));
        System.out.println(kata.frontBack("ab"));

        System.out.println(kata.front3("Java"));
        System.out.println(kata.front3("Chocolate"));
        System.out.println(kata.front3("abc"));


        System.out.println(kata.backAround("cat"));
        System.out.println(kata.backAround("Hello"));
        System.out.println(kata.backAround("a"));

        System.out.println(kata.front22("kitten"));
        System.out.println(kata.front22("HaHaHa"));
        System.out.println(kata.front22("abc"));

        System.out.println(kata.delDel("adelbc"));
        System.out.println(kata.delDel("adelHello"));
        System.out.println(kata.delDel("adedbc"));

        System.out.println(kata.startOz("ozymandias"));
        System.out.println(kata.startOz("bzoo"));
        System.out.println(kata.startOz("oxx"));

        System.out.println(kata.endUp("Hello"));
        System.out.println(kata.endUp("hi there"));
        System.out.println(kata.endUp("hi"));


    }
}
