package org.apache.ibatis.test.mapper;

import org.apache.ibatis.test.domain.User;

/**
 * @author: houyunlu
 * @date: 2020/10/13 11:17
 */
public interface UserMapper {

  User findById(Long id);
}
