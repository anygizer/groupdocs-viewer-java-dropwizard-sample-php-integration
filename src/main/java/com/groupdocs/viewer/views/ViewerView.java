package com.groupdocs.viewer.views;

import com.yammer.dropwizard.views.View;

/**
 *
 * @author Alex Bobkov
 */
public class ViewerView extends View{
    private String headerElems;
    private String locale;
    private String filePath;
    
    public ViewerView(String headerElems, String locale, String filePath){
        super("viewer.ftl");
        this.headerElems = headerElems;
        this.locale = locale;
        this.filePath = filePath;
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
}
