import java.util.ArrayList;
import java.util.List;

public class efwefwef {
    public static void main(String[] args) {
        List<String> listSmells =new ArrayList<>();
        listSmells.add("вася");
        listSmells.add("петя");
        listSmells.add("коля");
        StringBuilder sm = new StringBuilder();
        for (int i = 0; i < listSmells.size(); i++ ) {
            sm.append(listSmells.get(i));
            sm.reverse();
            listSmells.set(i, sm.toString());
            sm.delete(0,listSmells.get(i).length());
        }
        System.out.println(listSmells);
    }
}
