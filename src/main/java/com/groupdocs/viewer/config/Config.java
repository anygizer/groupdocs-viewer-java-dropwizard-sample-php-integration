package com.groupdocs.viewer.config;

import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alex Bobkov
 */
public class Config extends Configuration implements AssetsBundleConfiguration{
    @Valid
    @JsonProperty
    private String licensePath;
    
    @Valid
    @NotNull
    @JsonProperty
    private String applicationPath;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useAuthorization;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useCache;
    
    @Valid
    @NotNull
    @JsonProperty
    private int expirationDate;
    
    @Valid
    @NotNull
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();

    @Override
    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }

    public String getLicensePath() {
        return licensePath;
    }
    
    public String getBasePath(){
        Iterable<Map.Entry<String,String>> elem = assets.getOverrides();
        String path = elem.iterator().next().getValue();
        if(!path.endsWith("/") && !path.endsWith("\\")){
            path += "/";
        }
        return path;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public boolean useAuthorization() {
        return useAuthorization;
    }

    public boolean useCache() {
        return useCache;
    }
    
    public int getExpirationDate(){
        return expirationDate;
    }
}