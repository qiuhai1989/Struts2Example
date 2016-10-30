package orm;

import com.topwqp.entity.Student;
import com.topwqp.orm.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by Administrator on 2016/10/30 0030.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Maven3 + Hibernate + Oracle10g");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Student student = new Student();
        student.setSno(13);
        student.setSdree("软通");
        student.setAge(20);
        student.setSname("韩立");
        student.setSsex("男");
        session.save(student);
        session.getTransaction().commit();
    }

}
