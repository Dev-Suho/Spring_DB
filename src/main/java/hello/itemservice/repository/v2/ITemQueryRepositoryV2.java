package hello.itemservice.repository.v2;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ITemQueryRepositoryV2 {

    private final JPAQueryFactory query;

    public ITemQueryRepositoryV2(EntityManager em) {
        this.query = new JPAQueryFactory(em);
    }

}
