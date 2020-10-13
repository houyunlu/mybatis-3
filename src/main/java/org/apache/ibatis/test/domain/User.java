package org.apache.ibatis.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: houyunlu
 * @date: 2020/10/13 11:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private Long id;
  private String name;
}
