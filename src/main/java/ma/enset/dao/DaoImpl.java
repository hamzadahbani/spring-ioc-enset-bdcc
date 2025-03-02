package ma.enset.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getdata() {
        System.out.println("Version 1");
        return 9.11;
    }
}
