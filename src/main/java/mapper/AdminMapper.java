package mapper;

import domain.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from user where adminname=#{administrator}.adminname and password=#{administrator}.password")
    Administrator adminLogin(Administrator administrator);
}
