<%@ include file="/jcore/doInitPage.jspf" %>
<%@ include file="/jcore/portal/doPortletParams.jspf" %>
<% PortletQueryForeach box = (PortletQueryForeach) portlet;  %>
<%@ include file="/types/PortletQueryForeach/doQuery.jspf" %>
<%@ include file="/types/PortletQueryForeach/doSort.jspf" %>
<%@ include file="/types/PortletQueryForeach/doForeachHeader.jspf" %>
<%
jcmsContext.addCSSHeader("plugins/MiniSitePortailPlugin/css/DossierThematique/ResumeDossierThematiqueDetail.css");
jcmsContext.addCSSHeader("plugins/MiniSitePortailPlugin/css/DossierThematique/ResumeDossierThematiqueVignette.css");

%>

<%
Article current_article = (Article)itPub;
%>

<div class="panel_dossier panel-default_dossier">
					<div class="panel-heading_dossier">
   						<div class="panel-title"><span class="skinTitle"><%=current_article.getTitle(userLang) %></span></div>
   					</div>
   					<div class="row">
        			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 dossierThematiqueContainerResumeDetail">
            			<div class="dossierThematiqueImageResume">
            				<jalios:thumbnail  path="<%= current_article.getDataImage(userLang) %>" height="100" width="100"/>
            			</div>
            			<div class="dossierThematiqueDescriptionArticleDetail">
            				<%= current_article.getSummary(userLang) %>
            			</div>
            		</div>
            		<a href="<%=current_article.getDisplayUrl(Locale.FRANCE) %>" class="btn btn-default float-position_article">En savoir plus...</a>
 				</div>
 				
				</div>


<%@ include file="/types/PortletQueryForeach/doForeachFooter.jspf" %>
<%@ include file="/types/PortletQueryForeach/doPager.jspf" %>