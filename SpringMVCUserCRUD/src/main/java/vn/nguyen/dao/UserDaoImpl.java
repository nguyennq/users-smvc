package vn.nguyen.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import vn.nguyen.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by nals on 11/10/17.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    public void add(User user) {
        entityManager.persist(user);
        logger.info("User saved successfully, User Details="+user);
    }
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        javax.persistence.criteria.CriteriaQuery<User> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(User.class);
        Root<User> userRoot = criteriaQuery.from(User.class);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
