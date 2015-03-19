<%@ include file="/jcore/doInitPage.jspf" %>
<%@ include file="/jcore/portal/doPortletParams.jspf" %>

<% PortletQueryForeachDetail box = (PortletQueryForeachDetail) portlet; 
%>
<% 

// Javascript
jcmsContext.addJavaScript("plugins/MiniSiteCarouselPlugin/js/owl.carousel.js");
jcmsContext.addJavaScript("plugins/MiniSiteCarouselPlugin/js/owl.carousel.min.js");

// CSS
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/custom.css");
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/owl.carousel.css");
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/owl.theme.css");
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/owl.transitions.css");
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/custom.css");
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/custom.css");
jcmsContext.addCSSHeader("plugins/MiniSiteCarouselPlugin/css/jquery.bxslider");


if(box.getCssClasses()==null || "".equals(box.getCssClasses())) {
jcmsContext.addCSSHeader("css/jalios/ux/jalios-pqf.css");
}
else {
	jcmsContext.addCSSHeader(box.getCssClasses());
}
%>

<jalios:javascript>

    !function ($) {
     $(document).ready(function() {
      	$("#owl-demo").owlCarousel({
                navigation : true,
                navigationText: [
                    "<i class='fa fa-chevron-left'></i>",
                    "<i class='fa fa-chevron-right'></i>"
                ],
                slideSpeed : 300,
                paginationSpeed : 400,
                singleItem:true
            });
        });
  }(window.jQuery);
</jalios:javascript>

<%@ include file="/types/PortletQueryForeach/doQuery.jspf" %>
<%@ include file="/types/PortletQueryForeach/doSort.jspf" %>

<div class="row">
  
  <%@ include file="/types/PortletQueryForeach/doForeachHeader.jspf" %>
  	<div id="owl-demo" class="owl-carousel owl-theme">

   <div class="item"><img src="upload\images\dossiersthematique\dossier1.jpg" alt="Dossier1">
   	<div class="bx-caption"><span>Dossier 1</span></div>
   </div>
    <div class="item"><img src="upload\images\dossiersthematique\dossier2.jpg" alt="Dossier2">
    	<div class="bx-caption"><span>Dossier 2</span></div>
    </div>
    <div class="item"><img src="upload\images\dossiersthematique\dossier3.jpg" alt="Dossier3">
    	<div class="bx-caption"><span>Dossier 3</span></div>
    </div>
</div>
  
  <%@ include file="/types/PortletQueryForeach/doForeachFooter.jspf" %>
  
</div>

<%@ include file="/types/PortletQueryForeach/doPager.jspf" %>




