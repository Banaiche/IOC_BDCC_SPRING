package ma.banaiche.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {

        System.out.println("version base de données");
        double temp = 25;
        return temp;

    }
}
