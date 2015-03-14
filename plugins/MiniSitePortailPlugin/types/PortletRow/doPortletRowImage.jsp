<%@ include file='/jcore/doInitPage.jspf' %>
<%@ include file='/jcore/portal/doPortletParams.jspf' %><%
PortletRow box = (PortletRow) portlet;
ServletUtil.backupAttribute(pageContext, "ShowChildPortalElement");
ServletUtil.backupAttribute(pageContext, "RowToolbar");
%>
<%@ include file='/types/AbstractCollection/doIncludePortletCollection.jspf'%>
<%

// Intégration de la css 
jcmsContext.addCSSHeader("plugins/MiniSitePortailPlugin/css/Portail/Portal.css");

// Initialisation des variables d'affichage
String MDLogo = "2";
String MDBandeau = "4";
String portletLogoDisplay ="";
String portletBandeauDisplay ="";

if(getPortlet(bufferMap,"logo").isEmpty()) {
	MDBandeau = "12";
	portletLogoDisplay="nodisplay";
}
if(getPortlet(bufferMap,"bandeau").isEmpty()) {
	MDLogo = "12";
	portletBandeauDisplay="nodisplay";
}

%>
<div class="row">
	
	<div class="col-md-<%=MDLogo%>" <%=portletLogoDisplay %>>
    	<%= getPortlet(bufferMap,"logo") %>
	</div>
	<div class="col-md-<%=MDBandeau%>"<%=portletBandeauDisplay %>>
		<%= getPortlet(bufferMap,"bandeau") %>
	</div>
	
</div>

