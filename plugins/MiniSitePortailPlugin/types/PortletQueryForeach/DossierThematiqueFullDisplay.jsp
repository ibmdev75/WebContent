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
DossierThematique obj = (DossierThematique)itPub;
String urlPrint = "http://"+request.getServerName()+":"
        +request.getServerPort()
        +getServletContext().getContextPath()
        +"/"+DescriptiveURLs.getDescriptiveURL(obj,userLocale)
        +"?id="+obj.getId()
        +"&portal="+Channel.getChannel().getProperty("channel.default-printportal")
        +"&printView=true";
%>

<!-- Lien réseaux sociaux  -->
<div class="row">
	<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
	</div>
	<div class="col-xs-6 col-sm- col-md-6 col-lg-6">
		<i class="fa fa-linkedin-square fa-2x" style="color:#007bb6 "></i>
		<i class=" fa  fa-twitter fa-2x" style="color: #00aced"></i>
		<i class=" fa  fa-facebook-square fa-2x" style="color:#3b5998"></i>
		<i class=" fa  fa-google fa-2x" style="color: #dd4b39"></i>
		<a href="<%=urlPrint%>"><i class="fa fa-print fa-2x" style="color: #000000""></i></a>
		<i class="fa fa-envelope fa-2x" style="color: #000000""></i>
	</div>
</div>
<div class="row">
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		<h1 class="TitleDossierThematique"><%=obj.getTitle(userLang) %></h1>
	</div>
</div>

<div class="row">
        		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 dossierThematiqueContainerResumeDetail">
            		<div class="dossierThematiqueImageResume">
            			<jalios:thumbnail  path="<%= obj.getImage(userLang) %>" height="100" width="100"/>
            		</div>
            		<div class="dossierThematiqueDescriptionResumeDetail">
            			<%= obj.getDescription(userLang) %>
            		</div>
            	</div>
 </div>
 
 <div class="row">
        		<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
            	</div>
            	<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
            	
            	<%for(int i=0;i<obj.getLienArticle().length;i++) { 
            		Article current_article = (Article)obj.getLienArticle()[i];
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
				
				
				
				<%} %>
            	</div>
 </div>


<%@ include file="/types/PortletQueryForeach/doForeachFooter.jspf" %>
<%@ include file="/types/PortletQueryForeach/doPager.jspf" %>