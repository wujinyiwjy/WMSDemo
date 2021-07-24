package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

public class DruidDataSourceFactory implements DataSourceFactory {
    
    private Properties properties;
    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    
    @Override
    public DataSource getDataSource() {
        DruidDataSource druidDataSource= new DruidDataSource();
        druidDataSource.setUrl(this.properties.getProperty("url"));
        druidDataSource.setUsername(this.properties.getProperty("username"));
        druidDataSource.setPassword(this.properties.getProperty("password"));
        
        try{
            druidDataSource.init();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return druidDataSource;
    }
}
