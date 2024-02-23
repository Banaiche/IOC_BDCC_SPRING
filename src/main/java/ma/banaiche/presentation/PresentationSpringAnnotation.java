package ma.banaiche.presentation;

import ma.banaiche.dao.DaoImpl;
import ma.banaiche.metier.IMetier;
import ma.banaiche.metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ma.banaiche.metier", "ma.banaiche.daov2"})
public class PresentationSpringAnnotation {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PresentationSpringAnnotation.class);
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
