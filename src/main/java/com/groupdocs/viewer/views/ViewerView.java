package com.groupdocs.viewer.views;

import com.yammer.dropwizard.views.View;

/**
 *
 * @author Alex Bobkov
 */
public class ViewerView extends View{
    private String headerElems;
    private String viewerScript;
    
    public ViewerView(String headerElems, String viewerScript){
        super("viewer.ftl");
        this.headerElems = headerElems;
        this.viewerScript = viewerScript;
        
    }

    public String getHeaderElems() {
        return headerElems;
    }

    public void setHeaderElems(String headerElems) {
        this.headerElems = headerElems;
    }

    public String getViewerScript() {
        return viewerScript;
    }

    public void setViewerScript(String viewerScript) {
        this.viewerScript = viewerScript;
    }

}
