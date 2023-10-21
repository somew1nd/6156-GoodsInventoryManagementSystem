package top.faquan.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.faquan.domainORpojo.client;

import java.util.List;

public interface clientDao {
    @Insert("insert into sql_hr.tb_user (username,password,ip_address,port_number) values (#{username}, #{password}, #{ip_address}, #{port_number})")
    public int saveAll(client client);

    @Insert("insert into sql_hr.tb_user values (null, #{username}, #{password},null,null)")
    public int save(client client);

    @Delete("delete from sql_hr.tb_user where username = #{username}")
    public int delete(String username);

    @Select("select * from sql_hr.tb_user where username = #{username}")
    public client selectByUsername(String username);

    @Select("select * from sql_hr.tb_user")
    public List<client> selectAll();

    public client getByNameAndPassword(@Param("username") String username, @Param("password") String password);
}
