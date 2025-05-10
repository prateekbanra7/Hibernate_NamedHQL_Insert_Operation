package in.abc.main;

import in.abc.dao.InsurancePolicyDao;
import in.abc.dao.InsurancePolicyDaoImpl;
import in.abc.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {
		
		InsurancePolicyDao dao = null;
		dao = new InsurancePolicyDaoImpl();
		String result = dao.transferPremiumPolicies(25);
		System.out.println(result);
		HibernateUtil.closeSessionFactory();

	}

}
