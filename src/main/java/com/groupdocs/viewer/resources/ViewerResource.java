package com.groupdocs.viewer.resources;

import com.groupdocs.viewer.config.Config;
import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.domain.FileId;
import com.groupdocs.viewer.domain.FilePath;
import com.groupdocs.viewer.domain.FileUrl;
import com.groupdocs.viewer.domain.GroupDocsPath;
import com.groupdocs.viewer.domain.TokenId;
import com.groupdocs.viewer.handler.CustomInputDataHandler;
import com.groupdocs.viewer.handlers.ViewerHandler;
import com.groupdocs.viewer.views.ViewerView;
import com.sun.jersey.multipart.FormDataParam;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Alex Bobkov
 */

@Path(value = "")
public class ViewerResource extends GroupDocsViewer{
    private final ViewerHandler viewerHandler;
    private final Config configuration;
    
    public ViewerResource(Config configuration) throws Exception{
        this.configuration = configuration;
        String appPath = configuration.getApplicationPath();
        String basePath = configuration.getBasePath();
        String licensePath = configuration.getLicensePath();
        boolean auth = configuration.useAuthorization();
        boolean useCache = configuration.useCache();
        ServiceConfiguration config = new ServiceConfiguration(appPath, basePath, licensePath, auth, useCache);
        viewerHandler = new ViewerHandler(config/*, new CustomInputDataHandler(config)*/);
    }

    @GET
    public ViewerView getViewer(String filePath){
        try {
            return new ViewerView(viewerHandler.getHeader(), viewerHandler.getLocale(), filePath, configuration);
        } catch (IOException ex) {
            return null;
        }
    }
    
    @GET
    @Path(value = VIEW)
    public ViewerView getView(@QueryParam("fileId") String fileId, @QueryParam("fileUrl") String fileUrl, @QueryParam("filePath") String filePath, @QueryParam("tokenId") String tokenId){
        GroupDocsPath gPath;
        if(fileId !=null && !fileId.isEmpty()){
            gPath = new FileId(fileId);
        }else if(filePath != null && !filePath.isEmpty()){
            gPath = new FilePath(filePath, viewerHandler.getConfiguration());
        }else if(tokenId != null && !tokenId.isEmpty()){
            TokenId tki = new TokenId(tokenId);
            if(tki.isExpired()){
                return getViewer("");
            }
            gPath = tki;
        }else{
            gPath = new FileUrl(fileUrl);
        }
        return getViewer(gPath.getPath());
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
    @Path(value = GET_FONT_HANDLER)
    @Override
    public void getFontHandler(@PathParam("name") String fontName, @Context HttpServletResponse response) throws IOException {
        viewerHandler.getFontHandler(fontName, response);
    }
    
    @GET
    @Path(value = GET_HTML_RESOURCES_HANDLER)
    @Override
    public void getHtmlRecoucesHandler(@QueryParam("filePath") String filePath, @Context HttpServletResponse response) throws FileNotFoundException, IOException {
        viewerHandler.getHtmlRecoucesHandler(filePath, response);
    }

    @GET
    @Path(value = GET_FILE_HANDLER)
    @Override
    public void getFileHandler(@QueryParam("path") String path, @Context HttpServletResponse response) throws Exception{
        viewerHandler.getFileHandler(path, response);
    }

    @GET
    @Path(value=GET_DOCUMENT_PAGE_IMAGE_HANDLER)
    @Override
    public void getDocumentPageImageHandler(@QueryParam("path") String path, @QueryParam("width") Integer width, @QueryParam("quality") Integer quality, @QueryParam("usePdf") Boolean usePdf, @QueryParam("pageIndex") Integer pageIndex, @Context HttpServletResponse response) throws Exception{
        viewerHandler.getDocumentPageImageHandler(path, width, quality, usePdf, pageIndex, response);
    }

    @POST
    @Path(value = VIEW_DOCUMENT_HANDLER)
    @Override
    public Object viewDocumentHandler(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.viewDocumentHandler(request, response);
    }

    @GET
    @Path(value = VIEW_DOCUMENT_HANDLER)
    @Override
    public Object viewDocumentHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.viewDocumentHandler(callback, data, request, response);
    }

    @POST
    @Path(value = LOAD_FILE_BROWSER_TREE_DATA_HANLER)
    @Override
    public Object loadFileBrowserTreeDataHandler(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.loadFileBrowserTreeDataHandler(request, response);
    }

    @GET
    @Path(value=LOAD_FILE_BROWSER_TREE_DATA_HANLER)
    @Override
    public Object loadFileBrowserTreeDataHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletResponse response) {
        return viewerHandler.loadFileBrowserTreeDataHandler(callback, data, response);
    }

    @POST
    @Path(value = GET_IMAGE_URL_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object getImageUrlsHandler(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.getImageUrlsHandler(request, response);
    }

    @GET
    @Path(value = GET_IMAGE_URL_HANDLER)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Object getImageUrlsHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.getImageUrlsHandler(callback, data, request, response);
    }

    @POST
    @Path(value = GET_PDF_2_JAVA_SCRIPT_HANDLER)
    @Override
    public Object getPdf2JavaScriptHandler(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.getPdf2JavaScriptHandler(request, response);
    }

    @GET
    @Path(value = GET_PDF_2_JAVA_SCRIPT_HANDLER)
    @Override
    public Object getPdf2JavaScriptHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletResponse response) {
        return viewerHandler.getPdf2JavaScriptHandler(callback, data, response);
    }

    @POST
    @Path(value = GET_PRINTABLE_HTML_HANDLER)
    @Override
    public Object getPrintableHtmlHandler(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.getPrintableHtmlHandler(request, response);
    }

    @GET
    @Path(value = GET_PRINTABLE_HTML_HANDLER)
    @Override
    public Object getPrintableHtmlHandler(@QueryParam("callback") String callback, @QueryParam("data") String data, @Context HttpServletRequest request, @Context HttpServletResponse response) {
        return viewerHandler.getPrintableHtmlHandler(callback, data, request, response);
    }
    
    @POST
    @Path(value = UPLOAD_FILE)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public void uploadFileHandler(@FormDataParam("file") InputStream inputStream, @FormDataParam("fileName") String fileName, @Context HttpServletResponse response) throws IOException, JSONException{
        // Upload file
        String uploadResponse = (String) viewerHandler.uploadFile(inputStream, fileName, configuration.getExpirationDate());
        // Convert upload response to json object
        JSONObject obj = new JSONObject(uploadResponse);
        // Get token id
        String tokenId = obj.getString("tokenId");
        // Redirect to uplaoded file
        response.sendRedirect(VIEW + "?tokenId=" + tokenId);
    }

    @POST
    @Path(value = "UploadFileAPI")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Object uploadFileHandler(@FormDataParam("file") InputStream inputStream, @FormDataParam("fileName") String fileName){
        return viewerHandler.uploadFile(inputStream, fileName, configuration.getExpirationDate());
    }
    
    @GET
    @Path(value = "RenewToken")
    public Object renewTokenId(@QueryParam("tokenId") String tokenId){
        return viewerHandler.renewTokenId(tokenId);
    }
    
    @POST
    @Path(value = GET_DOCUMENT_PAGE_HTML_HANDLER)
    @Override
    public void getDocumentPageHtmlHandler(@Context HttpServletRequest request, @Context HttpServletResponse response){
        viewerHandler.getDocumentPageHtmlHandler(request, response);
    }

}
