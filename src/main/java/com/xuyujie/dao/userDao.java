package com.xuyujie.dao;

import com.xuyujie.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public interface userDao {
    //增加用户
    @Insert("insert into x_user (u_id,u_name,u_balance) values (#{uid},#{uname},#{ubalance})")
    public int addUser(User user);
    //删除用户
    @Delete("delete from x_user where u_id=#{id}")
    public int deleteUser(int id);
    //修改用户
    @Update("update x_user set u_name=#{uname},u_balance=#{ubalance} where u_id=#{uid}")
    public int updateUser(User user);
    @Select("select * from x_user where u_id=#{id}")
    //查找用户
    public User queryUser(int id);
}
