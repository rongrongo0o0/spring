package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.spring.pojo.User;
import com.study.spring.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMybatis {
	@Resource
	private UserService userService;

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println("姓名:" + user.getUserName());
		System.out.println("年龄:" + user.getAge());
	}
}
