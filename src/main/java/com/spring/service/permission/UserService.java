package com.spring.service.permission;

import com.github.pagehelper.Page;
import com.spring.model.permission.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @Author 施成
 * @Date 2018/2/17
 * @time 9:52
 * @Describe:
 */
public interface UserService {
    Page<User> getAllUserMessage(RowBounds rowBounds);

    User getUserMessageById(String userId);

    void insert(User user);

    void update(User user);

    void delete(String userId);

    List<User> getAllUsers();

    User getUserByName(String username);

    Integer getCountByUserName(String userName);
}