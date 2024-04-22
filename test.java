import javax.management.Query;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	


	@Transactional
	@Override
	public User loginUser(String email, String password) {
		
		//select * from user_registration_table where email =? and password =?; ->user object
		String sql = "from User where email=:eml and password=:pass";
		User user = (User) hibernateTemplate.execute( s ->{
			Query q = s.createQuery(sql);
			q.setParameter("eml", email);
			q.setParameter("pass", password);
			return q.uniqueResult();
		});
		return user;
	}

}
