package action;

import javax.persistence.EntityManager;

import DBUtil.DBUtil;
import entity.City;

public class MainHibernate {

	public static void main(String[] args) {
		EntityManager em = DBUtil.createEntityMnager();

		City city = em.find(City.class, 1);
		System.out.println(city.getName());

		em.close();
	}

}
