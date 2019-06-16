package com.hunau.dao;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/5/18 17:05
 * @开发版本：综合练习V0.1
 */
 import com.hunau.entity.User;
 import java.util.List;
 import java.util.ArrayList;
public interface IUserDao {
    abstract List<User> SearchAllUsers();
    abstract User SearchUserById(int id);
    abstract int InseartUser(User user);

}
