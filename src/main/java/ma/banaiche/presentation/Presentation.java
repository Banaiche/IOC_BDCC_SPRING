package ma.banaiche.presentation;

import ma.banaiche.dao.DaoImpl;
import ma.banaiche.metier.MetierImpl;

public class Presentation {

    public static void main(String[] args) {

        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());
    }
}
