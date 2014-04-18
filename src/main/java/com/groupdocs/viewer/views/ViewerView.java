package com.groupdocs.viewer.views;

import com.groupdocs.viewer.config.Config;
import com.yammer.dropwizard.views.View;

/**
 *
 * @author Alex Bobkov
 */
public class ViewerView extends View{
    private String headerElems;
    private String locale;
    private String filePath;
    private int quality;
    private String showThumbnails;
    private String openThumbnails;
    private int initialZoom;
    private String zoomToFitWidth;
    private String zoomToFitHeight;
    private String width;
    private String height;
    private String showFolderBrowser;
    private String showPrint;
    private String showDownload;
    private String showZoom;
    private String showPaging;
    private String showViewerStyleControl;
    private String showSearch;
    private int preloadPagesCount;
    private String supportTextSelection;
    private String usePdfPrinting;
    private String showHeader;
    private String useHtmlBasedEngine;
    private String useInnerThumbnails;
    
    public ViewerView(String headerElems, String locale, String filePath, Config config){
        super("viewer.ftl");
        this.headerElems = headerElems;
        this.locale = locale;
        this.filePath = filePath;
        quality = config.getQuality();
        showThumbnails = String.valueOf(config.isShowThumbnails());
        openThumbnails = String.valueOf(config.isOpenThumbnails());
        initialZoom = config.getInitialZoom();
        zoomToFitWidth = String.valueOf(config.isZoomToFitWidth());
        zoomToFitHeight = String.valueOf(config.isZoomToFitHeight());
        width = String.valueOf(config.getWidth());
        height = String.valueOf(config.getHeight());
        showFolderBrowser = String.valueOf(config.isShowFolderBrowser());
        showPrint = String.valueOf(config.isShowPrint());
        showDownload = String.valueOf(config.isShowDownload());
        showZoom = String.valueOf(config.isShowZoom());
        showPaging = String.valueOf(config.isShowPaging());
        showViewerStyleControl = String.valueOf(config.isShowViewerStyleControl());
        showSearch = String.valueOf(config.isShowSearch());
        preloadPagesCount = config.getPreloadPagesCount();
        supportTextSelection = String.valueOf(config.isSupportTextSelection());
        usePdfPrinting = String.valueOf(config.isUsePdfPrinting());
        showHeader = String.valueOf(config.isShowHeader());
        useHtmlBasedEngine = String.valueOf(config.isUseHtmlBasedEngine());
        useInnerThumbnails = String.valueOf(config.isUseInnerThumbnails());
    }

    public String getHeaderElems() {
        return headerElems;
    }

    public void setHeaderElems(String headerElems) {
        this.headerElems = headerElems;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getShowThumbnails() {
        return showThumbnails;
    }

    public void setShowThumbnails(String showThumbnails) {
        this.showThumbnails = showThumbnails;
    }

    public String getOpenThumbnails() {
        return openThumbnails;
    }

    public void setOpenThumbnails(String openThumbnails) {
        this.openThumbnails = openThumbnails;
    }

    public int getInitialZoom() {
        return initialZoom;
    }

    public void setInitialZoom(int initialZoom) {
        this.initialZoom = initialZoom;
    }

    public String getZoomToFitWidth() {
        return zoomToFitWidth;
    }

    public void setZoomToFitWidth(String zoomToFitWidth) {
        this.zoomToFitWidth = zoomToFitWidth;
    }

    public String getZoomToFitHeight() {
        return zoomToFitHeight;
    }

    public void setZoomToFitHeight(String zoomToFitHeight) {
        this.zoomToFitHeight = zoomToFitHeight;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getShowFolderBrowser() {
        return showFolderBrowser;
    }

    public void setShowFolderBrowser(String showFolderBrowser) {
        this.showFolderBrowser = showFolderBrowser;
    }

    public String getShowPrint() {
        return showPrint;
    }

    public void setShowPrint(String showPrint) {
        this.showPrint = showPrint;
    }

    public String getShowDownload() {
        return showDownload;
    }

    public void setShowDownload(String showDownload) {
        this.showDownload = showDownload;
    }

    public String getShowZoom() {
        return showZoom;
    }

    public void setShowZoom(String showZoom) {
        this.showZoom = showZoom;
    }

    public String getShowPaging() {
        return showPaging;
    }

    public void setShowPaging(String showPaging) {
        this.showPaging = showPaging;
    }

    public String getShowViewerStyleControl() {
        return showViewerStyleControl;
    }

    public void setShowViewerStyleControl(String showViewerStyleControl) {
        this.showViewerStyleControl = showViewerStyleControl;
    }

    public String getShowSearch() {
        return showSearch;
    }

    public void setShowSearch(String showSearch) {
        this.showSearch = showSearch;
    }

    public int getPreloadPagesCount() {
        return preloadPagesCount;
    }

    public void setPreloadPagesCount(int preloadPagesCount) {
        this.preloadPagesCount = preloadPagesCount;
    }

    public String getSupportTextSelection() {
        return supportTextSelection;
    }

    public void setSupportTextSelection(String supportTextSelection) {
        this.supportTextSelection = supportTextSelection;
    }

    public String getUsePdfPrinting() {
        return usePdfPrinting;
    }

    public void setUsePdfPrinting(String usePdfPrinting) {
        this.usePdfPrinting = usePdfPrinting;
    }

    public String getShowHeader() {
        return showHeader;
    }

    public void setShowHeader(String showHeader) {
        this.showHeader = showHeader;
    }

    public String getUseHtmlBasedEngine() {
        return useHtmlBasedEngine;
    }

    public void setUseHtmlBasedEngine(String useHtmlBasedEngine) {
        this.useHtmlBasedEngine = useHtmlBasedEngine;
    }

    public String getUseInnerThumbnails() {
        return useInnerThumbnails;
    }

    public void setUseInnerThumbnails(String useInnerThumbnails) {
        this.useInnerThumbnails = useInnerThumbnails;
    }

}
