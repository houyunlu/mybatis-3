package org.apache.ibatis.test;

import java.io.InputStream;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.test.domain.User;
import org.apache.ibatis.test.mapper.UserMapper;

/**
 * @author: houyunlu
 * @date: 2020/10/13 11:21
 */
public class Main {

  @SneakyThrows
  public static void main(String[] args) {
    InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
    try (SqlSession sqlSession = sessionFactory.openSession()) {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      User user = userMapper.findById(1L);
      System.out.println(user);
    }
  }
}
