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
    private boolean showThumbnails;
    private boolean openThumbnails;
    private int initialZoom;
    private boolean zoomToFitWidth;
    private boolean zoomToFitHeight;
    private String width;
    private String height;
    private boolean showFolderBrowser;
    private boolean showPrint;
    private boolean showDownload;
    private boolean showZoom;
    private boolean showPaging;
    private boolean showViewerStyleControl;
    private boolean showSearch;
    private int preloadPagesCount;
    private boolean supportTextSelection;
    private boolean usePdfPrinting;
    private boolean showHeader;
    private boolean useHtmlBasedEngine;
    private boolean useInnerThumbnails;
    
    public ViewerView(String headerElems, String locale, String filePath, Config config){
        super("viewer.ftl");
        this.headerElems = headerElems;
        this.locale = locale;
        this.filePath = filePath;
        quality = config.getQuality();
        showThumbnails = config.isShowThumbnails();
        openThumbnails = config.isOpenThumbnails();
        initialZoom = config.getInitialZoom();
        zoomToFitWidth = config.isZoomToFitWidth();
        zoomToFitHeight = config.isZoomToFitHeight();
        width = String.valueOf(config.getWidth());
        height = String.valueOf(config.getHeight());
        showFolderBrowser = config.isShowFolderBrowser();
        showPrint = config.isShowPrint();
        showDownload = config.isShowDownload();
        showZoom = config.isShowZoom();
        showPaging = config.isShowPaging();
        showViewerStyleControl = config.isShowViewerStyleControl();
        showSearch = config.isShowSearch();
        preloadPagesCount = config.getPreloadPagesCount();
        supportTextSelection = config.isSupportTextSelection();
        usePdfPrinting = config.isUsePdfPrinting();
        showHeader = config.isShowHeader();
        useHtmlBasedEngine = config.isUseHtmlBasedEngine();
        useInnerThumbnails = config.isUseInnerThumbnails();
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

    public boolean isShowThumbnails() {
        return showThumbnails;
    }

    public void setShowThumbnails(boolean showThumbnails) {
        this.showThumbnails = showThumbnails;
    }

    public boolean isOpenThumbnails() {
        return openThumbnails;
    }

    public void setOpenThumbnails(boolean openThumbnails) {
        this.openThumbnails = openThumbnails;
    }

    public int getInitialZoom() {
        return initialZoom;
    }

    public void setInitialZoom(int initialZoom) {
        this.initialZoom = initialZoom;
    }

    public boolean isZoomToFitWidth() {
        return zoomToFitWidth;
    }

    public void setZoomToFitWidth(boolean zoomToFitWidth) {
        this.zoomToFitWidth = zoomToFitWidth;
    }

    public boolean isZoomToFitHeight() {
        return zoomToFitHeight;
    }

    public void setZoomToFitHeight(boolean zoomToFitHeight) {
        this.zoomToFitHeight = zoomToFitHeight;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = String.valueOf(width);
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = String.valueOf(height);
    }

    public boolean isShowFolderBrowser() {
        return showFolderBrowser;
    }

    public void setShowFolderBrowser(boolean showFolderBrowser) {
        this.showFolderBrowser = showFolderBrowser;
    }

    public boolean isShowPrint() {
        return showPrint;
    }

    public void setShowPrint(boolean showPrint) {
        this.showPrint = showPrint;
    }

    public boolean isShowDownload() {
        return showDownload;
    }

    public void setShowDownload(boolean showDownload) {
        this.showDownload = showDownload;
    }

    public boolean isShowZoom() {
        return showZoom;
    }

    public void setShowZoom(boolean showZoom) {
        this.showZoom = showZoom;
    }

    public boolean isShowPaging() {
        return showPaging;
    }

    public void setShowPaging(boolean showPaging) {
        this.showPaging = showPaging;
    }

    public boolean isShowViewerStyleControl() {
        return showViewerStyleControl;
    }

    public void setShowViewerStyleControl(boolean showViewerStyleControl) {
        this.showViewerStyleControl = showViewerStyleControl;
    }

    public boolean isShowSearch() {
        return showSearch;
    }

    public void setShowSearch(boolean showSearch) {
        this.showSearch = showSearch;
    }

    public int getPreloadPagesCount() {
        return preloadPagesCount;
    }

    public void setPreloadPagesCount(int preloadPagesCount) {
        this.preloadPagesCount = preloadPagesCount;
    }

    public boolean isSupportTextSelection() {
        return supportTextSelection;
    }

    public void setSupportTextSelection(boolean supportTextSelection) {
        this.supportTextSelection = supportTextSelection;
    }

    public boolean isUsePdfPrinting() {
        return usePdfPrinting;
    }

    public void setUsePdfPrinting(boolean usePdfPrinting) {
        this.usePdfPrinting = usePdfPrinting;
    }

    public boolean isShowHeader() {
        return showHeader;
    }

    public void setShowHeader(boolean showHeader) {
        this.showHeader = showHeader;
    }

    public boolean isUseHtmlBasedEngine() {
        return useHtmlBasedEngine;
    }

    public void setUseHtmlBasedEngine(boolean useHtmlBasedEngine) {
        this.useHtmlBasedEngine = useHtmlBasedEngine;
    }

    public boolean isUseInnerThumbnails() {
        return useInnerThumbnails;
    }

    public void setUseInnerThumbnails(boolean useInnerThumbnails) {
        this.useInnerThumbnails = useInnerThumbnails;
    }
    
    
}
