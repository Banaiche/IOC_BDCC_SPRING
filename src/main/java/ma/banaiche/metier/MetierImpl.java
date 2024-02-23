package ma.banaiche.metier;

import ma.banaiche.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 23;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
