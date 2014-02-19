package com.groupdocs.viewer.resources;

import com.groupdocs.viewer.config.Config;
import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.domain.GroupDocsFilePath;
import com.groupdocs.viewer.handlers.ViewerHandler;
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

@Path(value = "")
public class ViewerResource extends GroupDocsViewer{
    private ViewerHandler viewerHandler = null;
    
    public ViewerResource(Config configuration) throws Exception{
        String appPath = configuration.getApplicationPath();
        String basePath = configuration.getBasePath();
        String licensePath = configuration.getLicensePath();
        boolean auth = configuration.useAuthorization();
        boolean useCache = configuration.useCache();
        ServiceConfiguration config = new ServiceConfiguration(appPath, basePath, licensePath, auth, useCache);
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
        GroupDocsFilePath filePath = new GroupDocsFilePath("");
        
            if(fileId != null && !fileId.isEmpty()){
                filePath.setPath(fileId);
            }else if(fileUrl != null && !fileUrl.isEmpty()){
                filePath.setPath(fileUrl);
            }
            return getViewer(filePath.getPath());
        
    }
    
    @GET
    @Path(value = GET_JS_HANDLER)
    @Override
    public void getJsHandler(@QueryParam("script") String scriptName, @Context HttpServletResponse response) throws IOException {
        viewerHandler.getJsHandler(scriptName, response);
    }

    @GET
    @Path(value = GET_CSS_HANDLER)
    @Override
    public void getCssHandler(@QueryParam("script") String cssName, @Context HttpServletResponse response) throws IOException {
        viewerHandler.getCssHandler(cssName, response);
    }

    @GET
    @Path(value = GET_IMAGE_HANDLER)
    @Override
    public void getImageHandler(@PathParam("name") String imageName, @Context HttpServletResponse response) throws IOException {
        viewerHandler.getImageHandler(imageName, response);
    }

    @GET
    @Path(value = GET_FILE_HANDLER)
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    @Override
    public void getFileHandler(@QueryParam("path") String path, @Context HttpServletResponse response) throws Exception{
        viewerHandler.getFileHandler(path, response);
    }

    @GET
    @Path(value=GET_DOCUMENT_PAGE_IMAGE_HANDLER)
    @Produces("image/jpeg")
    @Override
    public void getDocumentPageImageHandler(@QueryParam("path") String guid, @QueryParam("width") String width, @QueryParam("quality") Integer quality, @QueryParam("usePdf") Boolean usePdf, @QueryParam("pageIndex") Integer pageIndex, @Context HttpServletResponse response) throws Exception{
        viewerHandler.getDocumentPageImageHandler(guid, width, quality, usePdf, pageIndex, response);
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
