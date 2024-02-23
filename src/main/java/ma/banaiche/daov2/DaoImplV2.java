package ma.banaiche.daov2;

import ma.banaiche.dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double t = 77;
        return t;
    }
}
