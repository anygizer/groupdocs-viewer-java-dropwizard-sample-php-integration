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
public class Config extends Configuration implements AssetsBundleConfiguration, ServiceConfigurationBase{
    @Valid
    @JsonProperty
    private String licensePath;
    
    @Valid
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
    private boolean useBrowserCache;
    
    @Valid
    @NotNull
    @JsonProperty
    private int expirationDate;
    
    @Valid
    @NotNull
    @JsonProperty
    private String encryptionKey;
    
    @Valid
    @JsonProperty
    private String localesPath;
    
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
    private String backgroundColor;
    
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
    private int viewerStyle;
    
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
    private String toolbarButtonsBoxShadowStyle;
    
    @Valid
    @NotNull
    @JsonProperty
    private String toolbarButtonsBoxShadowHoverStyle;
    
    @Valid
    @NotNull
    @JsonProperty
    private String thumbnailsContainerBackgroundColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private String thumbnailsContainerBorderRightColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private String toolbarBorderBottomColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private String toolbarInputFieldBorderColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private String toolbarButtonBorderColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private String toolbarButtonBorderHoverColor;
     
    @Valid
    @NotNull
    @JsonProperty
    private int thumbnailsContainerWidth;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showDownloadErrorsInPopup;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showImageWidth;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showHeader;
    
    @Valid
    @NotNull
    @JsonProperty
    private int minimumImageWidth;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean enableStandardErrorHandling;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useHtmlBasedEngine;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useImageBasedPrinting;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean downloadPdfFile;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean searchForSeparateWords;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean preventTouchEventsBubbling;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useInnerThumbnails;
    
    @Valid
    @NotNull
    @JsonProperty
    private String watermarkText;
    
    @Valid
    @NotNull
    @JsonProperty
    private String watermarkColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean supportPageReordering;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean onlyShrinkLargePages;
    
    @Valid
    @NotNull
    @JsonProperty
    private String searchHighlightColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private String currentSearchHighlightColor;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean treatPhrasesInDoubleQuotesAsExactPhrases;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean usePngImagesForHtmlBasedEngine;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean showOnePageInRow;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean loadAllPagesOnSearch;
    
    @Valid
    @NotNull
    @JsonProperty
    private boolean useEmScaling;
    
    public AssetsConfiguration getAssets() {
        return assets;
    }

    @Override
    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }

    @Override
    public String getLicensePath() {
        return licensePath;
    }
    
    @Override
    public String getBasePath() {
        Iterable<Map.Entry<String,String>> elem = assets.getOverrides();
        String path = elem.iterator().next().getValue();
        return path;
    }

    @Override
    public String getApplicationPath() {
        return applicationPath;
    }

    @Override
    public boolean isUseAuthorization() {
        return useAuthorization;
    }

    @Override
    public boolean isUseCache() {
        return useCache;
    }
    
    @Override
    public boolean isUseBrowserCache(){
        return useBrowserCache;
    }

    @Override
    public int getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getEncryptionKey() {
        return encryptionKey;
    }

    @Override
    public String getLocalesPath() {
        return localesPath;
    }

    @Override
    public int getQuality() {
        return quality;
    }

    @Override
    public boolean isShowThumbnails() {
        return showThumbnails;
    }

    @Override
    public boolean isOpenThumbnails() {
        return openThumbnails;
    }

    @Override
    public int getInitialZoom() {
        return initialZoom;
    }

    @Override
    public boolean isZoomToFitWidth() {
        return zoomToFitWidth;
    }

    @Override
    public boolean isZoomToFitHeight() {
        return zoomToFitHeight;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public boolean isShowFolderBrowser() {
        return showFolderBrowser;
    }

    @Override
    public boolean isShowPrint() {
        return showPrint;
    }

    @Override
    public boolean isShowDownload() {
        return showDownload;
    }

    @Override
    public boolean isShowZoom() {
        return showZoom;
    }

    @Override
    public boolean isShowPaging() {
        return showPaging;
    }

    @Override
    public boolean isShowViewerStyleControl() {
        return showViewerStyleControl;
    }

    @Override
    public boolean isShowSearch() {
        return showSearch;
    }

    @Override
    public int getPreloadPagesCount() {
        return preloadPagesCount;
    }

    @Override
    public int getViewerStyle() {
        return viewerStyle;
    }

    @Override
    public boolean isSupportTextSelection() {
        return supportTextSelection;
    }

    @Override
    public boolean isUsePdfPrinting() {
        return usePdfPrinting;
    }

    @Override
    public String getToolbarButtonsBoxShadowStyle() {
        return toolbarButtonsBoxShadowStyle;
    }

    @Override
    public String getToolbarButtonsBoxShadowHoverStyle() {
        return toolbarButtonsBoxShadowHoverStyle;
    }

    @Override
    public String getThumbnailsContainerBackgroundColor() {
        return thumbnailsContainerBackgroundColor;
    }

    @Override
    public String getThumbnailsContainerBorderRightColor() {
        return thumbnailsContainerBorderRightColor;
    }

    @Override
    public String getToolbarBorderBottomColor() {
        return toolbarBorderBottomColor;
    }

    @Override
    public String getToolbarInputFieldBorderColor() {
        return toolbarInputFieldBorderColor;
    }

    @Override
    public String getToolbarButtonBorderColor() {
        return toolbarButtonBorderColor;
    }

    @Override
    public String getToolbarButtonBorderHoverColor() {
        return toolbarButtonBorderHoverColor;
    }

    @Override
    public int getThumbnailsContainerWidth() {
        return thumbnailsContainerWidth;
    }

    @Override
    public boolean isShowDownloadErrorsInPopup() {
        return showDownloadErrorsInPopup;
    }

    @Override
    public boolean isShowImageWidth() {
        return showImageWidth;
    }

    @Override
    public boolean isShowHeader() {
        return showHeader;
    }

    @Override
    public int getMinimumImageWidth() {
        return minimumImageWidth;
    }

    @Override
    public boolean isEnableStandardErrorHandling() {
        return enableStandardErrorHandling;
    }

    @Override
    public boolean isUseHtmlBasedEngine() {
        return useHtmlBasedEngine;
    }

    @Override
    public boolean isUseImageBasedPrinting() {
        return useImageBasedPrinting;
    }

    @Override
    public boolean isDownloadPdfFile() {
        return downloadPdfFile;
    }

    @Override
    public boolean isSearchForSeparateWords() {
        return searchForSeparateWords;
    }

    @Override
    public boolean isPreventTouchEventsBubbling() {
        return preventTouchEventsBubbling;
    }

    @Override
    public boolean isUseInnerThumbnails() {
        return useInnerThumbnails;
    }

    @Override
    public String getWatermarkText() {
        return watermarkText;
    }

    @Override
    public boolean isSupportPageReordering() {
        return supportPageReordering;
    }

    @Override
    public String getWatermarkColor() {
        return watermarkColor;
    }

    @Override
    public boolean isOnlyShrinkLargePages() {
        return onlyShrinkLargePages;
    }

    @Override
    public String getSearchHighlightColor() {
        return searchHighlightColor;
    }

    @Override
    public String getCurrentSearchHighlightColor() {
        return currentSearchHighlightColor;
    }

    @Override
    public boolean isTreatPhrasesInDoubleQuotesAsExactPhrases() {
        return treatPhrasesInDoubleQuotesAsExactPhrases;
    }

    @Override
    public boolean isUsePngImagesForHtmlBasedEngine() {
        return usePngImagesForHtmlBasedEngine;
    }

    @Override
    public boolean isShowOnePageInRow() {
        return showOnePageInRow;
    }

    @Override
    public boolean isLoadAllPagesOnSearch() {
        return loadAllPagesOnSearch;
    }

    @Override
    public boolean isUseEmScaling() {
        return useEmScaling;
    }

}