package ma.enset.metier;

import ma.enset.dao.IDao;

public class ImetierImpl implements IMetier{
    private IDao dao;

    public ImetierImpl() {
    }

    public ImetierImpl(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getdata();
        return temp*21;
    }
}
