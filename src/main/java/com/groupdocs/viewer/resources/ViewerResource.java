package com.groupdocs.viewer.resources;

import com.groupdocs.viewer.config.Config;
import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.domain.Assets;
import com.groupdocs.viewer.views.ViewerView;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Alex Bobkov
 */

@Path(value = "/document-viewer")
public class ViewerResource extends GroupDocsViewer{
    private ViewerHandler viewerHandler = null;
    
    public ViewerResource(Config conf) throws Exception{
        String appPath = conf.getApplicationPath();
        String basePath = conf.getBasePath();
        String licensePath = conf.getLicensePath();
        Assets assets = new Assets(conf.getImagesPath(), "");
        Boolean hasAuthorization = conf.isAuth();
        ServiceConfiguration config = new ServiceConfiguration(appPath, basePath, licensePath, assets, hasAuthorization);
        viewerHandler = new ViewerHandler(config);
    }
    
    @GET
    public ViewerView getViewer(String filePath){
        try {
            return new ViewerView(viewerHandler.getHeader(), viewerHandler.getLocale(), filePath);
        } catch (IOException ex) {
            return null;
        }
    }
    
    @GET
    @Path(value = "/view")
    public ViewerView getView(@QueryParam("fileId") String fileId, @QueryParam("fileUrl") String fileUrl){
        String filePath = "";
        
            if(fileId != null && !fileId.isEmpty()){
                filePath = fileId;
            }else if(fileUrl != null && !fileUrl.isEmpty()){
                filePath = fileUrl;
            }
            return getViewer(filePath);
        
    }

    @GET
    @Path(value = GET_FILE_HANDLER)
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    @Override
    public Object getFileHandler(@QueryParam("path") String path, @Context HttpServletResponse response) {
        try {
            return viewerHandler.getFileHandler(path, response);
        } catch (Exception ex) {
            return null;
        }
    }

    @GET
    @Path(value=GET_DOCUMENT_PAGE_IMAGE_HANDLER)
    @Produces("image/jpeg")
    @Override
    public Object getDocumentPageImageHandler(@QueryParam("path") String guid, @QueryParam("width") String width, @QueryParam("quality") Integer quality, @QueryParam("usePdf") Boolean usePdf, @QueryParam("pageIndex") Integer pageIndex) throws Exception{
        return viewerHandler.getDocumentPageImageHandler(guid, width, quality, usePdf, pageIndex);
    }

    @POST
    @Path(value = VIEW_DOCUMENT_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object viewDocumentHandler(@Context HttpServletRequest request) {
        return viewerHandler.viewDocumentHandler(request);
    }

    @GET
    @Path(value = VIEW_DOCUMENT_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object viewDocumentHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletRequest request) {
        return viewerHandler.viewDocumentHandler(callback, data, request);
    }

    @POST
    @Path(value = LOAD_FILE_BROWSER_TREE_DATA_HANLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object loadFileBrowserTreeDataHandler(@Context HttpServletRequest request) {
        return viewerHandler.loadFileBrowserTreeDataHandler(request);
    }

    @GET
    @Path(value=LOAD_FILE_BROWSER_TREE_DATA_HANLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object loadFileBrowserTreeDataHandler(@QueryParam("callback") String callback, @QueryParam("data") String data) {
        return viewerHandler.loadFileBrowserTreeDataHandler(callback, data);
    }

    @POST
    @Path(value = GET_IMAGE_URL_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object getImageUrlsHandler(@Context HttpServletRequest request) {
        return viewerHandler.getImageUrlsHandler(request);
    }

    @GET
    @Path(value = GET_IMAGE_URL_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object getImageUrlsHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletRequest request) {
        return viewerHandler.getImageUrlsHandler(callback, data, request);
    }

    @POST
    @Path(value = GET_PDF_2_JAVA_SCRIPT_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object getPdf2JavaScriptHandler(@Context HttpServletRequest request) {
        return viewerHandler.getPdf2JavaScriptHandler(request);
    }

    @GET
    @Path(value = GET_PDF_2_JAVA_SCRIPT_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object getPdf2JavaScriptHandler(@QueryParam("callback") String callback, @QueryParam("data") String data) {
        return viewerHandler.getPdf2JavaScriptHandler(callback, data);
    }

    @POST
    @Path(value = GET_PRINTABLE_HTML_HANDLER)
    @Override
    public Object getPrintableHtmlHandler(@Context HttpServletRequest request) {
        return viewerHandler.getPrintableHtmlHandler(request);
    }

    @GET
    @Path(value = GET_PRINTABLE_HTML_HANDLER)
    @Override
    public Object getPrintableHtmlHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletRequest request) {
        return viewerHandler.getPrintableHtmlHandler(callback, data, request);
    }
    
}
