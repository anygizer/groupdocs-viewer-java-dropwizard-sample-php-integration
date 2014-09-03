<#-- @ftlvariable name="" type="com.groupdocs.viewer.views.ViewerView" -->
<!DOCTYPE html>
<html>
    <head>
        <title>GroupDocs.Viewer for Java Dropwizard Sample</title>
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
        <div id="test"></div>
        ${viewerScript}
    </body>
</html>