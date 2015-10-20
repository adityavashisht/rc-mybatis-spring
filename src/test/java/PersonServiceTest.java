import com.indasil.rc.mybatis.mapper.PersonMapper;
import com.indasil.rc.mybatis.spring.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by vashishta on 10/20/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:rc-mybatis-spring.xml"})
public class PersonServiceTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testPerson() {
        Person p = personMapper.read(6L, null);
        Assert.notNull(p);
    }
}
