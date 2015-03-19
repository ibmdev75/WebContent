<%@ include file='/jcore/doInitPage.jspf' %>
<%@ include file='/jcore/portal/doPortletParams.jspf' %>
<% PortletWYSIWYG box = (PortletWYSIWYG) portlet;  %>
<%
if(box.getCssClasses()!=null && !"".equals(box.getCssClasses())) {
	jcmsContext.addCSSHeader(box.getCssClasses());
}
%>
<div id="footerLeft">
<jalios:if predicate='<%= Util.notEmpty(box.getWysiwyg(userLang)) %>'>
	<jalios:wysiwyg><%= box.getWysiwyg(userLang) %></jalios:wysiwyg>
</jalios:if>
</div>