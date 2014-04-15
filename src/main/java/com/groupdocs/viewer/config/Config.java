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
    
    @Valid
    @NotNull
    @JsonProperty
    private int quality;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showThumbnails;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean openThumbnails;
    
    @Valid
    @NotNull
    @JsonProperty
    private int initialZoom;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean zoomToFitWidth;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean zoomToFitHeight;
    
    @Valid
    @NotNull
    @JsonProperty
    private int width;
    
    @Valid
    @NotNull
    @JsonProperty
    private int height;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showFolderBrowser;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showPrint;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showDownload;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showZoom;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showPaging;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showViewerStyleControl;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showSearch;
    
    @Valid
    @NotNull
    @JsonProperty
    private int preloadPagesCount;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean supportTextSelection;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean usePdfPrinting;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showHeader;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useHtmlBasedEngine;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useInnerThumbnails;

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

    public boolean isUseAuthorization() {
        return useAuthorization;
    }

    public boolean isUseCache() {
        return useCache;
    }

    public AssetsConfiguration getAssets() {
        return assets;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isShowThumbnails() {
        return showThumbnails;
    }

    public boolean isOpenThumbnails() {
        return openThumbnails;
    }

    public int getInitialZoom() {
        return initialZoom;
    }

    public boolean isZoomToFitWidth() {
        return zoomToFitWidth;
    }

    public boolean isZoomToFitHeight() {
        return zoomToFitHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isShowFolderBrowser() {
        return showFolderBrowser;
    }

    public boolean isShowPrint() {
        return showPrint;
    }

    public boolean isShowDownload() {
        return showDownload;
    }

    public boolean isShowZoom() {
        return showZoom;
    }

    public boolean isShowPaging() {
        return showPaging;
    }

    public boolean isShowViewerStyleControl() {
        return showViewerStyleControl;
    }

    public boolean isShowSearch() {
        return showSearch;
    }

    public int getPreloadPagesCount() {
        return preloadPagesCount;
    }

    public boolean isSupportTextSelection() {
        return supportTextSelection;
    }

    public boolean isUsePdfPrinting() {
        return usePdfPrinting;
    }

    public boolean isShowHeader() {
        return showHeader;
    }

    public boolean isUseHtmlBasedEngine() {
        return useHtmlBasedEngine;
    }

    public boolean isUseInnerThumbnails() {
        return useInnerThumbnails;
    }
    
}