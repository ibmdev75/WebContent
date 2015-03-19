<%@ include file="/jcore/doInitPage.jspf" %>
<%@ include file="/jcore/portal/doPortletParams.jspf" %>

<% PortletQueryForeachDetail box = (PortletQueryForeachDetail) portlet; 
%>
<% 
System.out.println("box.getCssClasses(): "+box.getCssClasses());
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
    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
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
  
  <%@ include file="/types/PortletQueryForeach/doForeachFooter.jspf" %>
</div>
<%@ include file="/types/PortletQueryForeach/doPager.jspf" %>
