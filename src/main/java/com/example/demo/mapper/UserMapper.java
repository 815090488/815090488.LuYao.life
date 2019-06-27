package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("insert into username(name,account_id,token,gmt_create,gmt_modified,avatar_url) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from username where token=#{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from username where id=#{id}")
    User findById(@Param("id") Integer id);

    @Select("select * from username where account_id=#{accountId}")
    User findByAccountId(@Param("accountId")String accountId);

    @Update("update username set name=#{name},token=#{token} ,avatar_url=#{avatarUrl},gmt_modified=#{gmtModified} where id = #{id}")
    void update(User dbUser);
}
