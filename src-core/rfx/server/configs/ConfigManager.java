package rfx.server.configs;

import java.io.IOException;

import rfx.server.util.FileUtils;

public abstract class ConfigManager {
	public static final String HTTP_SERVER_CONFIG_FILE = "configs/http-server-configs.json";
	public static final String LOG_SERVER_CONFIG_FILE = "configs/log-server-configs.json";
    public static final String REDIS_CONFIG_FILE = "configs/redis-pool-configs.json";    
    public static final String HTTP_FILTERS_CONFIG_FILE = "configs/log-filters.json";
    
    public static final String HOST_PORT_CONFIG_FILE = "configs/host-port-configs.properties";
    public static final String SQL_STRING_TEMPLATE_FILE = "configs/sql-string-template.txt";
    
    public static final String SQL_DB_CONFIG_FILE = "configs/sql-host-configs.properties";
    
    
    
    public static String getConfigAsText(String name) throws IOException{
    	return FileUtils.readFileAsString(name);
    }
}
