package com.groupdocs.viewer.config;

import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import java.util.Map;
import javax.validation.Valid;

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
    @JsonProperty
    private Boolean useAuthorization;
    
    @Valid
    @JsonProperty
    private Boolean useCache;
    
    @Valid
    @JsonProperty
    private Boolean useBrowserCache;
    
    @Valid
    @JsonProperty
    private Integer expirationDate;
    
    @Valid
    @JsonProperty
    private String encryptionKey;
    
    @Valid
    @JsonProperty
    private String localesPath;
    
    @Valid
    @JsonProperty
    private String uploadPath;
    
    @Valid
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();
    
    @Valid
    @JsonProperty
    private Integer quality;
    
    @Valid
    @JsonProperty
    private Boolean showThumbnails;
    
    @Valid
    @JsonProperty
    private Boolean openThumbnails;
    
    @Valid
    @JsonProperty
    private Integer initialZoom;
    
    @Valid
    @JsonProperty
    private Boolean zoomToFitWidth;
    
    @Valid
    @JsonProperty
    private Boolean zoomToFitHeight;
    
    @Valid
    @JsonProperty
    private Integer width;
    
    @Valid
    @JsonProperty
    private Integer height;
    
    @Valid
    @JsonProperty
    private String backgroundColor;
    
    @Valid
    @JsonProperty
    private Boolean showFolderBrowser;
    
    @Valid
    @JsonProperty
    private Boolean showPrint;
    
    @Valid
    @JsonProperty
    private Boolean showDownload;
    
    @Valid
    @JsonProperty
    private Boolean showZoom;
    
    @Valid
    @JsonProperty
    private Boolean showPaging;
    
    @Valid
    @JsonProperty
    private Boolean showViewerStyleControl;
    
    @Valid
    @JsonProperty
    private Boolean showSearch;
    
    @Valid
    @JsonProperty
    private Integer preloadPagesCount;
    
    @Valid
    @JsonProperty
    private Integer viewerStyle;
    
    @Valid
    @JsonProperty
    private Boolean supportTextSelection;
    
    @Valid
    @JsonProperty
    private Boolean usePdfPrinting;
    
    @Valid
    @JsonProperty
    private String toolbarButtonsBoxShadowStyle;
    
    @Valid
    @JsonProperty
    private String toolbarButtonsBoxShadowHoverStyle;
    
    @Valid
    @JsonProperty
    private String thumbnailsContainerBackgroundColor;
    
    @Valid
    @JsonProperty
    private String thumbnailsContainerBorderRightColor;
    
    @Valid
    @JsonProperty
    private String toolbarBorderBottomColor;
    
    @Valid
    @JsonProperty
    private String toolbarInputFieldBorderColor;
    
    @Valid
    @JsonProperty
    private String toolbarButtonBorderColor;
    
    @Valid
    @JsonProperty
    private String toolbarButtonBorderHoverColor;
     
    @Valid
    @JsonProperty
    private Integer thumbnailsContainerWidth;
    
    @Valid
    @JsonProperty
    private Boolean showDownloadErrorsInPopup;
    
    @Valid
    @JsonProperty
    private Boolean showImageWidth;
    
    @Valid
    @JsonProperty
    private Boolean showHeader;
    
    @Valid
    @JsonProperty
    private Integer minimumImageWidth;
    
    @Valid
    @JsonProperty
    private Boolean enableStandardErrorHandling;
    
    @Valid
    @JsonProperty
    private Boolean useHtmlBasedEngine;
    
    @Valid
    @JsonProperty
    private Boolean useImageBasedPrinting;
    
    @Valid
    @JsonProperty
    private Boolean downloadPdfFile;
    
    @Valid
    @JsonProperty
    private Boolean searchForSeparateWords;
    
    @Valid
    @JsonProperty
    private Boolean preventTouchEventsBubbling;
    
    @Valid
    @JsonProperty
    private Boolean useInnerThumbnails;
    
    @Valid
    @JsonProperty
    private String watermarkText;
    
    @Valid
    @JsonProperty
    private String watermarkColor;
    
    @Valid
    @JsonProperty
    private Boolean supportPageReordering;
    
    @Valid
    @JsonProperty
    private Boolean onlyShrinkLargePages;
    
    @Valid
    @JsonProperty
    private String searchHighlightColor;
    
    @Valid
    @JsonProperty
    private String currentSearchHighlightColor;
    
    @Valid
    @JsonProperty
    private Boolean treatPhrasesInDoubleQuotesAsExactPhrases;
    
    @Valid
    @JsonProperty
    private Boolean usePngImagesForHtmlBasedEngine;
    
    @Valid
    @JsonProperty
    private Boolean showOnePageInRow;
    
    @Valid
    @JsonProperty
    private Boolean loadAllPagesOnSearch;
    
    @Valid
    @JsonProperty
    private Boolean useEmScaling;
    
    @Valid
    @JsonProperty
    private Long maxCacheSize;
    
    @Valid
    @JsonProperty
    private String fileDisplayName;
    
    @Valid
    @JsonProperty
    private String jqueryFileDownloadCookieName;
    
    @Valid
    @JsonProperty
    private Integer watermarkFontSize;
    
    @Valid
    @JsonProperty
    private String watermarkPosition;
    
    @Valid
    @JsonProperty
    private Boolean convertWordDocumentsCompletely;
    
    @Valid
    @JsonProperty
    private Boolean ignoreDocumentAbsence;
    
    @Valid
    @JsonProperty
    private Boolean preloadPagesOnBrowserSide;
    
    @Valid
    @JsonProperty
    private Boolean printWithWatermark;
    
    @Valid
    @JsonProperty
    private Boolean supportPageRotation;
    
    public AssetsConfiguration getAssets() {
        return assets;
    }

    @Override
    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }

    @Override
    public String getFileDisplayName() {
        return fileDisplayName;
    }

    @Override
    public String getJqueryFileDownloadCookieName() {
        return jqueryFileDownloadCookieName;
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
    public Integer getWatermarkFontSize() {
        return watermarkFontSize;
    }

    @Override
    public String getWatermarkPosition() {
        return watermarkPosition;
    }

    @Override
    public Boolean isConvertWordDocumentsCompletely() {
        return convertWordDocumentsCompletely;
    }

    @Override
    public Boolean isIgnoreDocumentAbsence() {
        return ignoreDocumentAbsence;
    }

    @Override
    public Boolean isPreloadPagesOnBrowserSide() {
        return preloadPagesOnBrowserSide;
    }

    @Override
    public Boolean isPrintWithWatermark() {
        return printWithWatermark;
    }

    @Override
    public Boolean isSupportPageRotation() {
        return supportPageRotation;
    }

    @Override
    public Boolean isUseAuthorization() {
        return useAuthorization;
    }

    @Override
    public Boolean isUseCache() {
        return useCache;
    }
    
    @Override
    public Boolean isUseBrowserCache(){
        return useBrowserCache;
    }

    @Override
    public Integer getExpirationDate() {
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
    public String getUploadPath() {
        return uploadPath;
    }

    @Override
    public Integer getQuality() {
        return quality;
    }

    @Override
    public Boolean isShowThumbnails() {
        return showThumbnails;
    }

    @Override
    public Boolean isOpenThumbnails() {
        return openThumbnails;
    }

    @Override
    public Integer getInitialZoom() {
        return initialZoom;
    }

    @Override
    public Boolean isZoomToFitWidth() {
        return zoomToFitWidth;
    }

    @Override
    public Boolean isZoomToFitHeight() {
        return zoomToFitHeight;
    }

    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public Integer getHeight() {
        return height;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public Boolean isShowFolderBrowser() {
        return showFolderBrowser;
    }

    @Override
    public Boolean isShowPrint() {
        return showPrint;
    }

    @Override
    public Boolean isShowDownload() {
        return showDownload;
    }

    @Override
    public Boolean isShowZoom() {
        return showZoom;
    }

    @Override
    public Boolean isShowPaging() {
        return showPaging;
    }

    @Override
    public Boolean isShowViewerStyleControl() {
        return showViewerStyleControl;
    }

    @Override
    public Boolean isShowSearch() {
        return showSearch;
    }

    @Override
    public Integer getPreloadPagesCount() {
        return preloadPagesCount;
    }

    @Override
    public Integer getViewerStyle() {
        return viewerStyle;
    }

    @Override
    public Boolean isSupportTextSelection() {
        return supportTextSelection;
    }

    @Override
    public Boolean isUsePdfPrinting() {
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
    public Integer getThumbnailsContainerWidth() {
        return thumbnailsContainerWidth;
    }

    @Override
    public Boolean isShowDownloadErrorsInPopup() {
        return showDownloadErrorsInPopup;
    }

    @Override
    public Boolean isShowImageWidth() {
        return showImageWidth;
    }

    @Override
    public Boolean isShowHeader() {
        return showHeader;
    }

    @Override
    public Integer getMinimumImageWidth() {
        return minimumImageWidth;
    }

    @Override
    public Boolean isEnableStandardErrorHandling() {
        return enableStandardErrorHandling;
    }

    @Override
    public Boolean isUseHtmlBasedEngine() {
        return useHtmlBasedEngine;
    }

    @Override
    public Boolean isUseImageBasedPrinting() {
        return useImageBasedPrinting;
    }

    @Override
    public Boolean isDownloadPdfFile() {
        return downloadPdfFile;
    }

    @Override
    public Boolean isSearchForSeparateWords() {
        return searchForSeparateWords;
    }

    @Override
    public Boolean isPreventTouchEventsBubbling() {
        return preventTouchEventsBubbling;
    }

    @Override
    public Boolean isUseInnerThumbnails() {
        return useInnerThumbnails;
    }

    @Override
    public String getWatermarkText() {
        return watermarkText;
    }

    @Override
    public Boolean isSupportPageReordering() {
        return supportPageReordering;
    }

    @Override
    public String getWatermarkColor() {
        return watermarkColor;
    }

    @Override
    public Boolean isOnlyShrinkLargePages() {
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
    public Boolean isTreatPhrasesInDoubleQuotesAsExactPhrases() {
        return treatPhrasesInDoubleQuotesAsExactPhrases;
    }

    @Override
    public Boolean isUsePngImagesForHtmlBasedEngine() {
        return usePngImagesForHtmlBasedEngine;
    }

    @Override
    public Boolean isShowOnePageInRow() {
        return showOnePageInRow;
    }

    @Override
    public Boolean isLoadAllPagesOnSearch() {
        return loadAllPagesOnSearch;
    }

    @Override
    public Boolean isUseEmScaling() {
        return useEmScaling;
    }

    @Override
    public Long getMaxCacheSize() {
        return maxCacheSize;
    }

}