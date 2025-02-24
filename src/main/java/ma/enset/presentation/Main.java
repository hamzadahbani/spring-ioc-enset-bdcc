package ma.enset.presentation;

import ma.enset.dao.IDaoImpl;
import ma.enset.metier.ImetierImpl;

public class Main {
    public static void main(String[] args) {
        IDaoImpl dao = new IDaoImpl();
        ImetierImpl metier = new ImetierImpl();
        metier.setDao(dao);
        System.out.println("calcul : "+ metier.calcul());
    }
}