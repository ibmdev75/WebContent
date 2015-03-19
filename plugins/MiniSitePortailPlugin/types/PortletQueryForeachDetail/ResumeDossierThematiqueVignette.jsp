<%@ include file="/jcore/doInitPage.jspf" %>
<%@ include file="/jcore/portal/doPortletParams.jspf" %>

<% PortletQueryForeachDetail box = (PortletQueryForeachDetail) portlet; 
%>
<% 
if(box.getCssClasses()==null || "".equals(box.getCssClasses())) {
jcmsContext.addCSSHeader("css/jalios/ux/jalios-pqf.css");
}
else {
	jcmsContext.addCSSHeader(box.getCssClasses());
}

%>

<%@ include file="/types/PortletQueryForeach/doQuery.jspf" %>
<%@ include file="/types/PortletQueryForeach/doSort.jspf" %>

<div class="row">
  
  <%@ include file="/types/PortletQueryForeach/doForeachHeader.jspf" %>
  	<div class="row">
    	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
      		<div class="thumbnail pqf-thumbnail">
      		<%
      		DossierThematique obj = (DossierThematique)itPub;
      		%>
     
     		<div class="container-fluid">

    		<!--Image et description -->

    		<div class="row">
        		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 dossierThematiqueContainerResume">
            		<div class="dossierThematiqueImageResume">
            			<jalios:thumbnail  path="<%= obj.getImage(userLang) %>" height="100" width="100"/>
            		</div>
            		<div class="dossierThematiqueDescriptionResume">
            			<%= obj.getDescription(userLang) %>
            		</div>
        		</div>
    		</div>
    			<a href="<%=obj.getDisplayUrl(Locale.FRANCE) %>" class="btn btn-default float-position">En savoir plus...</a>
			</div>
		</div>
	</div>
</div>
  
  <%@ include file="/types/PortletQueryForeach/doForeachFooter.jspf" %>
  
</div>

<%@ include file="/types/PortletQueryForeach/doPager.jspf" %>
