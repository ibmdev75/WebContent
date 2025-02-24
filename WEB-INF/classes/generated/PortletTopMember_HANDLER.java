// This class was automatically generated by jsc. Please, do not edit.
// Generation date: Wed Jan 28 18:44:24 CET 2015

package generated;

import java.util.*;
import com.jalios.jstore.*;

@SuppressWarnings("unchecked")
public class PortletTopMember_HANDLER implements com.jalios.jstore.StorableHandler {

  public void setAttributes(com.jalios.jstore.Storable storable, StorableLogEntry sle, com.jalios.jstore.Store store) {
    PortletTopMember handler = (generated.PortletTopMember)storable;
    String value;
    Map attributes = sle.getAttributes();
    value = (String)attributes.get("titleText");
    if (value != null) {
      handler.setTitleText((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "titleText")));
    }

    value = (String)attributes.get("titleTextML");
    if (value != null) {
      handler.setTitleTextML((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "titleTextML")));
    }

    value = (String)attributes.get("maxResults");
    if (value != null) {
        try {handler.setMaxResults((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("description");
    if (value != null) {
      handler.setDescription((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "description")));
    }

    value = (String)attributes.get("descriptionML");
    if (value != null) {
      handler.setDescriptionML((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "descriptionML")));
    }

    value = (String)attributes.get("portletImage");
    if (value != null) {
      handler.setPortletImage((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "portletImage")));
    }

    value = (String)attributes.get("portletImageML");
    if (value != null) {
      handler.setPortletImageML((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "portletImageML")));
    }

    value = (String)attributes.get("cacheType");
    if (value != null) {
      handler.setCacheType((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "cacheType")));
    }

    value = (String)attributes.get("cacheSensibility");
    if (value != null) {
      handler.setCacheSensibility((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "cacheSensibility")));
    }

    value = (String)attributes.get("invalidClass");
    if (value != null) {
      handler.setInvalidClass((java.lang.String[])StoreUtil.decodeObject(java.lang.String[].class, value, store, new DecodeContext(sle, "invalidClass")));
    }

    value = (String)attributes.get("invalidTime");
    if (value != null) {
        try {handler.setInvalidTime((Long.valueOf(value)).longValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("displayCSS");
    if (value != null) {
      handler.setDisplayCSS((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "displayCSS")));
    }

    value = (String)attributes.get("width");
    if (value != null) {
      handler.setWidth((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "width")));
    }

    value = (String)attributes.get("insetLeft");
    if (value != null) {
        try {handler.setInsetLeft((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("insetRight");
    if (value != null) {
        try {handler.setInsetRight((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("insetTop");
    if (value != null) {
        try {handler.setInsetTop((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("insetBottom");
    if (value != null) {
        try {handler.setInsetBottom((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("cellPadding");
    if (value != null) {
        try {handler.setCellPadding((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("alignH");
    if (value != null) {
      handler.setAlignH((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "alignH")));
    }

    value = (String)attributes.get("alignV");
    if (value != null) {
      handler.setAlignV((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "alignV")));
    }

    value = (String)attributes.get("alignTable");
    if (value != null) {
      handler.setAlignTable((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "alignTable")));
    }

    value = (String)attributes.get("border");
    if (value != null) {
        try {handler.setBorder((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("borderColor");
    if (value != null) {
      handler.setBorderColor((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "borderColor")));
    }

    value = (String)attributes.get("backColor");
    if (value != null) {
      handler.setBackColor((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "backColor")));
    }

    value = (String)attributes.get("backImage");
    if (value != null) {
      handler.setBackImage((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "backImage")));
    }

    value = (String)attributes.get("displayTitle");
    if (value != null) {
      handler.setDisplayTitle((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "displayTitle")));
    }

    value = (String)attributes.get("displayTitleML");
    if (value != null) {
      handler.setDisplayTitleML((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "displayTitleML")));
    }

    value = (String)attributes.get("skins");
    if (value != null) {
      handler.setSkins((java.lang.String[])StoreUtil.decodeObject(java.lang.String[].class, value, store, new DecodeContext(sle, "skins")));
    }

    value = (String)attributes.get("skinCSS");
    if (value != null) {
      handler.setSkinCSS((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "skinCSS")));
    }

    value = (String)attributes.get("popupState");
    if (value != null) {
      handler.setPopupState((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "popupState")));
    }

    value = (String)attributes.get("expandState");
    if (value != null) {
      handler.setExpandState((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "expandState")));
    }

    value = (String)attributes.get("behaviorCopy");
    if (value != null) {
      handler.setBehaviorCopy((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "behaviorCopy")));
    }

    value = (String)attributes.get("originalPortlet");
    if (value != null) {
      handler.setOriginalPortlet((com.jalios.jcms.portlet.PortalElement)StoreUtil.decodeObject(com.jalios.jcms.portlet.PortalElement.class, value, store, new DecodeContext(sle, "originalPortlet")));
    }

    value = (String)attributes.get("condition");
    if (value != null) {
      handler.setCondition((java.lang.String[])StoreUtil.decodeObject(java.lang.String[].class, value, store, new DecodeContext(sle, "condition")));
    }

    value = (String)attributes.get("cssId");
    if (value != null) {
      handler.setCssId((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "cssId")));
    }

    value = (String)attributes.get("cssClasses");
    if (value != null) {
      handler.setCssClasses((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "cssClasses")));
    }

    value = (String)attributes.get("skinClasses");
    if (value != null) {
      handler.setSkinClasses((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "skinClasses")));
    }

    value = (String)attributes.get("abilities");
    if (value != null) {
      handler.setAbilities((java.lang.String[])StoreUtil.decodeObject(java.lang.String[].class, value, store, new DecodeContext(sle, "abilities")));
    }

    value = (String)attributes.get("mainLanguage");
    if (value != null) {
      handler.setMainLanguage((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "mainLanguage")));
    }

    value = (String)attributes.get("title");
    if (value != null) {
      handler.setTitle((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "title")));
    }

    value = (String)attributes.get("titleML");
    if (value != null) {
      handler.setTitleML((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "titleML")));
    }

    value = (String)attributes.get("pdate");
    if (value != null) {
      handler.setPdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "pdate")));
    }

    value = (String)attributes.get("edate");
    if (value != null) {
      handler.setEdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "edate")));
    }

    value = (String)attributes.get("sdate");
    if (value != null) {
      handler.setSdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "sdate")));
    }

    value = (String)attributes.get("adate");
    if (value != null) {
      handler.setAdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "adate")));
    }

    value = (String)attributes.get("udate");
    if (value != null) {
      handler.setUdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "udate")));
    }

    value = (String)attributes.get("majorVersion");
    if (value != null) {
        try {handler.setMajorVersion((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("pstatus");
    if (value != null) {
        try {handler.setPstatus((Integer.valueOf(value)).intValue());} catch(NumberFormatException ex) {}
    }

    value = (String)attributes.get("mergeDate");
    if (value != null) {
      handler.setMergeDate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "mergeDate")));
    }

    value = (String)attributes.get("mergeId");
    if (value != null) {
      handler.setMergeId((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "mergeId")));
    }

    value = (String)attributes.get("categories");
    if (value != null) {
      handler.setCategories((com.jalios.jcms.Category[])StoreUtil.decodeObject(com.jalios.jcms.Category[].class, value, store, new DecodeContext(sle, "categories")));
    }

    value = (String)attributes.get("templates");
    if (value != null) {
      handler.setTemplates((java.lang.String[])StoreUtil.decodeObject(java.lang.String[].class, value, store, new DecodeContext(sle, "templates")));
    }

    value = (String)attributes.get("authorizedMemberSet");
    if (value != null) {
      handler.setAuthorizedMemberSet((java.util.TreeSet)StoreUtil.decodeObject(java.util.TreeSet.class, value, store, new DecodeContext(sle, "authorizedMemberSet")));
    }

    value = (String)attributes.get("authorizedGroupSet");
    if (value != null) {
      handler.setAuthorizedGroupSet((java.util.TreeSet)StoreUtil.decodeObject(java.util.TreeSet.class, value, store, new DecodeContext(sle, "authorizedGroupSet")));
    }

    value = (String)attributes.get("updateMemberSet");
    if (value != null) {
      handler.setUpdateMemberSet((java.util.TreeSet)StoreUtil.decodeObject(java.util.TreeSet.class, value, store, new DecodeContext(sle, "updateMemberSet")));
    }

    value = (String)attributes.get("updateGroupSet");
    if (value != null) {
      handler.setUpdateGroupSet((java.util.TreeSet)StoreUtil.decodeObject(java.util.TreeSet.class, value, store, new DecodeContext(sle, "updateGroupSet")));
    }

    value = (String)attributes.get("mainInstance");
    if (value != null) {
      handler.setMainInstance((com.jalios.jcms.Publication)StoreUtil.decodeObject(com.jalios.jcms.Publication.class, value, store, new DecodeContext(sle, "mainInstance")));
    }

    value = (String)attributes.get("isTracked");
    if (value != null) {
        handler.setTracked(Boolean.valueOf(value).booleanValue());
    }

    value = (String)attributes.get("friendlyURLSet");
    if (value != null) {
      handler.setFriendlyURLSet((java.util.TreeSet)StoreUtil.decodeObject(java.util.TreeSet.class, value, store, new DecodeContext(sle, "friendlyURLSet")));
    }

    value = (String)attributes.get("workspace");
    if (value != null) {
      handler.setWorkspace((com.jalios.jcms.workspace.Workspace)StoreUtil.decodeObject(com.jalios.jcms.workspace.Workspace.class, value, store, new DecodeContext(sle, "workspace")));
    }

    value = (String)attributes.get("roleMap");
    if (value != null) {
      handler.setRoleMap((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "roleMap")));
    }

    value = (String)attributes.get("workflowId");
    if (value != null) {
      handler.setWorkflowId((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "workflowId")));
    }

    value = (String)attributes.get("author");
    if (value != null) {
      handler.setAuthor((com.jalios.jcms.Member)StoreUtil.decodeObject(com.jalios.jcms.Member.class, value, store, new DecodeContext(sle, "author")));
    }

    value = (String)attributes.get("authorDBID");
    if (value != null) {
      handler.setAuthorDBID((java.lang.String)StoreUtil.decodeObject(java.lang.String.class, value, store, new DecodeContext(sle, "authorDBID")));
    }

    value = (String)attributes.get("opAuthor");
    if (value != null) {
      handler.setOpAuthor((com.jalios.jcms.Member)StoreUtil.decodeObject(com.jalios.jcms.Member.class, value, store, new DecodeContext(sle, "opAuthor")));
    }

    value = (String)attributes.get("opDelegate");
    if (value != null) {
      handler.setOpDelegate((com.jalios.jcms.Member)StoreUtil.decodeObject(com.jalios.jcms.Member.class, value, store, new DecodeContext(sle, "opDelegate")));
    }

    value = (String)attributes.get("extension");
    if (value != null) {
      handler.setExtension((com.jalios.jcms.DataExtension)StoreUtil.decodeObject(com.jalios.jcms.DataExtension.class, value, store, new DecodeContext(sle, "extension")));
    }

    value = (String)attributes.get("importMap");
    if (value != null) {
      handler.setImportMap((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "importMap")));
    }

    value = (String)attributes.get("extraDataMap");
    if (value != null) {
      handler.setExtraDataMap((java.util.HashMap)StoreUtil.decodeObject(java.util.HashMap.class, value, store, new DecodeContext(sle, "extraDataMap")));
    }

    value = (String)attributes.get("cdate");
    if (value != null) {
      handler.setCdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "cdate")));
    }

    value = (String)attributes.get("mdate");
    if (value != null) {
      handler.setMdate((java.util.Date)StoreUtil.decodeObject(java.util.Date.class, value, store, new DecodeContext(sle, "mdate")));
    }

  }

  public Map getAttributes(com.jalios.jstore.Storable storable, com.jalios.jstore.Store store) {
    generated.PortletTopMember handler = (generated.PortletTopMember)storable;
    Map attributes = new HashMap();
    attributes.put("titleText", StoreUtil.encodeObject(handler.getTitleText(), store));
    attributes.put("titleTextML", StoreUtil.encodeObject(handler.getTitleTextML(), store));
    attributes.put("maxResults", String.valueOf(handler.getMaxResults()));
    attributes.put("description", StoreUtil.encodeObject(handler.getDescription(), store));
    attributes.put("descriptionML", StoreUtil.encodeObject(handler.getDescriptionML(), store));
    attributes.put("portletImage", StoreUtil.encodeObject(handler.getPortletImage(), store));
    attributes.put("portletImageML", StoreUtil.encodeObject(handler.getPortletImageML(), store));
    attributes.put("cacheType", StoreUtil.encodeObject(handler.getCacheType(), store));
    attributes.put("cacheSensibility", StoreUtil.encodeObject(handler.getCacheSensibility(), store));
    attributes.put("invalidClass", StoreUtil.encodeObject(handler.getInvalidClass(), store));
    attributes.put("invalidTime", String.valueOf(handler.getInvalidTime()));
    attributes.put("displayCSS", StoreUtil.encodeObject(handler.getDisplayCSS(), store));
    attributes.put("width", StoreUtil.encodeObject(handler.getWidth(), store));
    attributes.put("insetLeft", String.valueOf(handler.getInsetLeft()));
    attributes.put("insetRight", String.valueOf(handler.getInsetRight()));
    attributes.put("insetTop", String.valueOf(handler.getInsetTop()));
    attributes.put("insetBottom", String.valueOf(handler.getInsetBottom()));
    attributes.put("cellPadding", String.valueOf(handler.getCellPadding()));
    attributes.put("alignH", StoreUtil.encodeObject(handler.getAlignH(), store));
    attributes.put("alignV", StoreUtil.encodeObject(handler.getAlignV(), store));
    attributes.put("alignTable", StoreUtil.encodeObject(handler.getAlignTable(), store));
    attributes.put("border", String.valueOf(handler.getBorder()));
    attributes.put("borderColor", StoreUtil.encodeObject(handler.getBorderColor(), store));
    attributes.put("backColor", StoreUtil.encodeObject(handler.getBackColor(), store));
    attributes.put("backImage", StoreUtil.encodeObject(handler.getBackImage(), store));
    attributes.put("displayTitle", StoreUtil.encodeObject(handler.getDisplayTitle(), store));
    attributes.put("displayTitleML", StoreUtil.encodeObject(handler.getDisplayTitleML(), store));
    attributes.put("skins", StoreUtil.encodeObject(handler.getSkins(), store));
    attributes.put("skinCSS", StoreUtil.encodeObject(handler.getSkinCSS(), store));
    attributes.put("popupState", StoreUtil.encodeObject(handler.getPopupState(), store));
    attributes.put("expandState", StoreUtil.encodeObject(handler.getExpandState(), store));
    attributes.put("behaviorCopy", StoreUtil.encodeObject(handler.getBehaviorCopy(), store));
    attributes.put("originalPortlet", StoreUtil.encodeObject(handler.getOriginalPortlet(), store));
    attributes.put("condition", StoreUtil.encodeObject(handler.getCondition(), store));
    attributes.put("cssId", StoreUtil.encodeObject(handler.getCssId(), store));
    attributes.put("cssClasses", StoreUtil.encodeObject(handler.getCssClasses(), store));
    attributes.put("skinClasses", StoreUtil.encodeObject(handler.getSkinClasses(), store));
    attributes.put("abilities", StoreUtil.encodeObject(handler.getAbilities(), store));
    attributes.put("mainLanguage", StoreUtil.encodeObject(handler.getMainLanguage(), store));
    attributes.put("title", StoreUtil.encodeObject(handler.getTitle(), store));
    attributes.put("titleML", StoreUtil.encodeObject(handler.getTitleML(), store));
    attributes.put("pdate", StoreUtil.encodeObject(handler.getPdate(), store));
    attributes.put("edate", StoreUtil.encodeObject(handler.getEdate(), store));
    attributes.put("sdate", StoreUtil.encodeObject(handler.getSdate(), store));
    attributes.put("adate", StoreUtil.encodeObject(handler.getAdate(), store));
    attributes.put("udate", StoreUtil.encodeObject(handler.getUdate(), store));
    attributes.put("majorVersion", String.valueOf(handler.getMajorVersion()));
    attributes.put("pstatus", String.valueOf(handler.getPstatus()));
    attributes.put("mergeDate", StoreUtil.encodeObject(handler.getMergeDate(), store));
    attributes.put("mergeId", StoreUtil.encodeObject(handler.getMergeId(), store));
    attributes.put("categories", StoreUtil.encodeObject(handler.getCategories(), store));
    attributes.put("templates", StoreUtil.encodeObject(handler.getTemplates(), store));
    attributes.put("authorizedMemberSet", StoreUtil.encodeObject(handler.getAuthorizedMemberSet(), store));
    attributes.put("authorizedGroupSet", StoreUtil.encodeObject(handler.getAuthorizedGroupSet(), store));
    attributes.put("updateMemberSet", StoreUtil.encodeObject(handler.getUpdateMemberSet(), store));
    attributes.put("updateGroupSet", StoreUtil.encodeObject(handler.getUpdateGroupSet(), store));
    attributes.put("mainInstance", StoreUtil.encodeObject(handler.getMainInstance(), store));
    attributes.put("isTracked", String.valueOf(handler.isTracked()));
    attributes.put("friendlyURLSet", StoreUtil.encodeObject(handler.getFriendlyURLSet(), store));
    attributes.put("workspace", StoreUtil.encodeObject(handler.getWorkspace(), store));
    attributes.put("roleMap", StoreUtil.encodeObject(handler.getRoleMap(), store));
    attributes.put("workflowId", StoreUtil.encodeObject(handler.getWorkflowId(), store));
    attributes.put("author", StoreUtil.encodeObject(handler.getAuthor(), store));
    attributes.put("authorDBID", StoreUtil.encodeObject(handler.getAuthorDBID(), store));
    attributes.put("opAuthor", StoreUtil.encodeObject(handler.getOpAuthor(), store));
    attributes.put("opDelegate", StoreUtil.encodeObject(handler.getOpDelegate(), store));
    attributes.put("extension", StoreUtil.encodeObject(handler.getExtension(), store));
    attributes.put("importMap", StoreUtil.encodeObject(handler.getImportMap(), store));
    attributes.put("extraDataMap", StoreUtil.encodeObject(handler.getExtraDataMap(), store));
    attributes.put("cdate", StoreUtil.encodeObject(handler.getCdate(), store));
    attributes.put("mdate", StoreUtil.encodeObject(handler.getMdate(), store));
    return attributes;
  }
}
