<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file='/jcore/doInitPage.jspf' %>

<%
Article obj = (Article)request.getAttribute(PortalManager.PORTAL_PUBLICATION);
String urlPrint = "http://"+request.getServerName()+":"
        +request.getServerPort()
        +getServletContext().getContextPath()
        +"/"+DescriptiveURLs.getDescriptiveURL(obj,userLocale)
        +"?id="+obj.getId()
        +"&portal="+Channel.getChannel().getProperty("channel.default-printportal")
        +"&printView=true";


%>
<%
jcmsContext.addCSSHeader("plugins/MiniSitePortailPlugin/css/Article/ArticleDetail.css");
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
		<h1 class="TitleArticleDetail"><%=obj.getTitle(userLang) %></h1>
	</div>
</div>

<div class="row">
        		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 ArticleContainerDetail">
            		<div class="ArticleImageDetail">
            			<jalios:thumbnail  path="<%= obj.getDataImage(userLang) %>" height="100" width="100"/>
            		</div>
            		<div class="ArticleDescriptionDetail">
            			<%= obj.getSummary(userLang) %>
            		</div>
            	</div>
 </div>
 
 <!-- Contenu de l'article -->
 <div class="row">
        		<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
            	</div>
            	<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6"><%= obj.getContent(userLang) %></div>
 </div>
 
