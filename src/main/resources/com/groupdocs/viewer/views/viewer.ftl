<#-- @ftlvariable name="" type="com.groupdocs.viewer.views.ViewerView" -->
<!DOCTYPE html>
<html>
    <head>
        <title>GroupDocs.Viewer for Java Sample</title>
        ${headerElems}
        <script>
            $(document).ready(function(){
                $('#fileUpload').on('change', function(){
                    var fakePath = $('#fileUpload').val();
                    var fileName = fakePath.replace(/^.*[\\\/]/, '');
                    $('#fileName').val(fileName);
                });
            });
        </script>
    </head>
    <body>
        <h1>GroupDocs.Viewer for Java Sample</h1>
        <div>
            <form enctype="multipart/form-data" method="POST" action="UploadFile">
                <input type="file" id="fileUpload" name="file"/>
                <input type="hidden" id="fileName" name="fileName"/>
                <input type="submit" value="Upload"/>
            </form>
        </div>
        <div id="test" style="width:1000px;height:500px;overflow:hidden;position:relative;margin-bottom:20px;background-color:gray;border:1px solid #ccc;"></div>
        <script>
            $(function() {
                var localizedStrings = 'null';
                <#if locale??>
                    localizedStrings = ${locale};
                </#if>
                var thumbsImageBase64Encoded = null;
                $('#test').groupdocsViewer({ 
                    filePath: '${filePath}', 
                    docViewerId: 'doc_viewer1', 
                    quality: 100, 
                    showThumbnails: true, 
                    openThumbnails: true, 
                    initialZoom: 100, 
                    zoomToFitWidth: true, 
                    zoomToFitHeight: false, 
                    width: 1000, 
                    height: 500, 
                    backgroundColor: '', 
                    showFolderBrowser: true, 
                    showPrint: true, 
                    showDownload: true, 
                    showZoom: true, 
                    showPaging: true, 
                    showViewerStyleControl: true, 
                    showSearch: true, 
                    preloadPagesCount: 0, 
                    viewerStyle: 1, 
                    supportTextSelection: true, 
                    usePdfPrinting: false, 
                    localizedStrings: localizedStrings, 
                    thumbsImageBase64Encoded: thumbsImageBase64Encoded, 
                    toolbarButtonsBoxShadowStyle: '', 
                    toolbarButtonsBoxShadowHoverStyle: '',
                    thumbnailsContainerBackgroundColor: '', 
                    thumbnailsContainerBorderRightColor: '',
                    toolbarBorderBottomColor: '', 
                    toolbarInputFieldBorderColor: '',
                    toolbarButtonBorderColor: '', 
                    toolbarButtonBorderHoverColor: '',
                    thumbnailsContainerWidth: 0,
                    jqueryFileDownloadCookieName: 'jqueryFileDownloadJSForGD', 
                    showDownloadErrorsInPopup: true,
                    showImageWidth: false, 
                    showHeader: true,
                    minimumImageWidth: 0, 
                    enableStandardErrorHandling: true});
            });
        </script>
    </body>
</html>