<%@ include file='/jcore/doInitPage.jspf'%>
<%@ include file='/jcore/portal/doPortletParams.jspf'%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
  PortalJspCollection box = (PortalJspCollection) portlet;
  ServletUtil.backupAttribute(pageContext, "ShowChildPortalElement");
  jcmsContext.addCSSHeader("plugins/MiniSitePortailPlugin/css/Portail/Portal.css");
%>
<%@ include file='/types/AbstractCollection/doIncludePortletCollection.jspf'%>
<%
  ServletUtil.restoreAttribute(pageContext , "ShowChildPortalElement");
  
  
  // Gestion de la structure colonne gauche sur toute la hauteur
  String portletColGaucheDisplay = getPortlet(bufferMap,"colgauche").isEmpty()?"nodisplay":"";
  String portletColDroiteDisplay = getPortlet(bufferMap,"colgauche").isEmpty()?"12":"8";
  
  // Gestion de la structure colonne à gauche
  // Cas où la colonne de droite n'est pas renseignée
  String portletColDteDisplay = getPortlet(bufferMap,"coldte").isEmpty()?"nodisplay":"";
  String MDSelection = (getPortlet(bufferMap,"coldte").isEmpty() && !getPortlet(bufferMap,"colgch").isEmpty())?"8":"4";
  
  // Gestion de la structure colonne à droite
  String portletColGchDisplay = getPortlet(bufferMap,"colgch").isEmpty()?"nodisplay":"";
  MDSelection = (getPortlet(bufferMap,"colgch").isEmpty() && !getPortlet(bufferMap,"coldte").isEmpty())?"8":"4";
  
  // Gestion de la structure sans colonne
  if(getPortlet(bufferMap,"colgch").isEmpty() && getPortlet(bufferMap,"coldte").isEmpty()) {
   MDSelection="12";  
  }
%>
<div class="container-fluid">
	<div class="row">
	    
	    <div class="col-md-4 portletColonneGauche contentPortlet <%=portletColGaucheDisplay %>">
	    	<%= getPortlet(bufferMap,"colgauche") %>
	    </div>
        
        <div class="contentPortlet col-md-<%=portletColDroiteDisplay%>">
        	<div class="row">
        		<div class="col-md-12 contentPortlet">
        			<%= getPortlet(bufferMap,"header") %>
        		</div>
        	</div>
        	<div class="row">
            	<div class="col-md-4 contentPortlet <%=portletColGchDisplay %>">
            		<%= getPortlet(bufferMap,"colgch") %>
            	</div>
            	<div class="col-md-<%=MDSelection%> contentPortlet">
            		<%= getPortlet(bufferMap,"selection") %>
            	</div>
            	<div class="col-md-4 contentPortlet <%=portletColDteDisplay %>">
            		<%= getPortlet(bufferMap,"coldte") %>
            	</div>
          </div>
          <div class="row">
        		<div class="col-md-12 contentPortlet">
        		<%= getPortlet(bufferMap,"footer") %>
        		</div>
        	</div>
        </div>
      </div>
</div>
