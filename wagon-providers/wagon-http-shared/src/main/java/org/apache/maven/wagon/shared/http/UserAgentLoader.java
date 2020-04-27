package org.apache.maven.wagon.shared.http;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author lidelin
 */
public class UserAgentLoader
{

    private static final String MAVEN_HOME_ENV_NAME = "MAVEN_HOME";

    private static Properties headers = new Properties();

    static
    {
        initHeadersProperties();
    }

    private static void initHeadersProperties()
    {
        String mavenHome = System.getenv( MAVEN_HOME_ENV_NAME );

        if ( mavenHome != null )
        {
            try ( InputStream in = new BufferedInputStream( Files.newInputStream( Paths.get( mavenHome, "conf/headers.properties" ) ) ) ) {
                headers.load( in );
            } catch ( IOException ignore )
            {
            }
        }
    }

    public static Properties getHeaders()
    {
        return headers;
    }

}
