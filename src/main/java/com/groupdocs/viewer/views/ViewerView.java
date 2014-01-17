package com.groupdocs.viewer.views;

import com.yammer.dropwizard.views.View;

/**
 *
 * @author Alex Bobkov
 */
public class ViewerView extends View{
    private String headerElems;
    private String locale;
    
    public ViewerView(String headerElems, String locale){
        super("viewer.ftl");
        this.headerElems = headerElems;
        this.locale = locale;
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
    
}
