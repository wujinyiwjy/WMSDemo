package mapper;

import domain.Administator;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
    public void adminLogin(Administator administator);
}
