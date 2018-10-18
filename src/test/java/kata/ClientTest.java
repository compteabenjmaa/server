package kata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.softeam.dao.AccountDAO;
import com.softeam.dao.ClientDAO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:context.xml")
public class ClientTest {
	@Test
	public void test(){
	}

}
