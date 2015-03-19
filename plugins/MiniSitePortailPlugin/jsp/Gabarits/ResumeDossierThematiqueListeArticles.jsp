<%@ include file='/jcore/doInitPage.jspf'%><%-- 
--%><%@ include file='/jcore/portal/doPortletParams.jspf'%><%-- 
--%><%@ page contentType="text/html; charset=UTF-8" %><%--
--%><%
  PortalJspCollection box = (PortalJspCollection) portlet;
  ServletUtil.backupAttribute(pageContext, "ShowChildPortalElement");
%>
<%@ include file='/types/AbstractCollection/doIncludePortletCollection.jspf'%>
<%
  ServletUtil.restoreAttribute(pageContext , "ShowChildPortalElement");
%>

<div class="row">
	<%= getPortlet(bufferMap,"resumeDossierThematique") %>
</div>
<div class="row">
        		<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
            	</div>
            	<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
            	<%= getPortlet(bufferMap,"listeArticlesDossierThematique") %>
            	</div>
 </div>

