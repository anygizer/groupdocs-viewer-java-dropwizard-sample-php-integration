package com.groupdocs.viewer;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import com.groupdocs.viewer.config.Config;
import com.groupdocs.viewer.resources.ViewerResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.config.FilterBuilder;
import com.yammer.dropwizard.views.ViewBundle;
import org.eclipse.jetty.servlets.CrossOriginFilter;

/**
 *
 * @author Alex Bobkov
 */

public class MainService extends Service<Config>{
    
    public static void main( String[] args ) throws Exception{
        new MainService().run(args);
    }

    @Override
    public void initialize(Bootstrap<Config> bootstrap) {
        bootstrap.setName("GroupDocs Viewer");
        bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/assets/"));
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(Config config, Environment enviroment) throws Exception {
        FilterBuilder filterConfig = enviroment.addFilter(CrossOriginFilter.class, "/*");
        filterConfig.setInitParam(CrossOriginFilter.ACCESS_CONTROL_ALLOW_ORIGIN_HEADER, "*");
        enviroment.addResource(new ViewerResource(config));
    }
}
