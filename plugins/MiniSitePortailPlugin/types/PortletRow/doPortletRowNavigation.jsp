<%@ include file='/jcore/doInitPage.jspf' %>
<%@ include file='/jcore/portal/doPortletParams.jspf' %>
<%@ include file='/types/AbstractCollection/doIncludePortletCollection.jspf'%>
<%


// Intégration de la css 
jcmsContext.addCSSHeader("plugins/MiniSitePortailPlugin/css/Portail/Portal.css");

// Initialisation des variables d'affichage

String MDNavigationCategorie = "7";
String MDNavigationReseau = "5";

String portletNavigationCategorieDisplay ="";
String portletNavigationReseauDisplay ="";

if(getPortlet(bufferMap,"navigationcategorie").isEmpty()) {
}
if(getPortlet(bufferMap,"navigationreseau").isEmpty()) {
}

%>
<div class="row">
	<div class="col-md-<%=MDNavigationCategorie%>" <%=portletNavigationCategorieDisplay %>>
    	<%= getPortlet(bufferMap,"navigationcategorie") %>
	</div>
	<div class="col-md-<%=MDNavigationReseau%>" <%=portletNavigationReseauDisplay %> style="margin-top: 10px;">
    	<%= getPortlet(bufferMap,"navigationreseau") %>
	</div>
</div>

