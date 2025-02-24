package ma.enset.dao;

public class IDaoImpl implements IDao {

    @Override
    public double getdata() {
        System.out.println("Version 1");
        return 9.11;
    }
}
