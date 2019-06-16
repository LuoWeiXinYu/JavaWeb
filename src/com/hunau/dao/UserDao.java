package com.hunau.dao;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/5/18 17:13
 * @开发版本：综合练习V0.1
 */

import com.hunau.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {
    public List<User> SearchAllUsers(){
        List<User> users = new ArrayList<User>();
        return users;
    }
    public User SearchUserById(int id){
        User user = new User();
        return user;
    }
    public int InseartUser(User user){
        int res=0;
        return res;
    }
}
