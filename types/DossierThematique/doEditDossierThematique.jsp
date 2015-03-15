<%-- This file has been automatically generated. --%>
<%--
  @Summary: DossierThematique content editor
  @Category: Generated
  @Author: JCMS Type Processor 
  @Customizable: True
  @Requestable: False 
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file='/jcore/doInitPage.jspf' %>
<% 
  EditDossierThematiqueHandler formHandler = (EditDossierThematiqueHandler)request.getAttribute("formHandler");
  ServletUtil.backupAttribute(pageContext, "classBeingProcessed");
  request.setAttribute("classBeingProcessed", generated.DossierThematique.class);
%>
<%-- TitreAffiche ------------------------------------------------------------ --%>
<jalios:field name="titreAffiche" formHandler="<%= formHandler %>">
  <jalios:control />
</jalios:field>
 
<%-- Description ------------------------------------------------------------ --%>
<jalios:field name="description" formHandler="<%= formHandler %>">
  <jalios:control />
</jalios:field>
 
<%-- Image ------------------------------------------------------------ --%>
<jalios:field name="image" formHandler="<%= formHandler %>">
  <jalios:control />
</jalios:field>
 
<%-- Contenu ------------------------------------------------------------ --%>
<jalios:field name="contenu" formHandler="<%= formHandler %>">
  <jalios:control />
</jalios:field>
 
<%-- LienArticle ------------------------------------------------------------ --%>
<jalios:field name="lienArticle" formHandler="<%= formHandler %>">
  <jalios:control />
</jalios:field>
 
<%
{ 
  TreeSet  removedCatSet = new TreeSet(); 
  Category itRemoveCat = null;
  request.setAttribute("DossierThematique.removedCatSet", removedCatSet);
}  
%>
<jalios:include target="EDIT_PUB_MAINTAB" targetContext="div" />
<jalios:include jsp="/jcore/doEditExtraData.jsp" />
<% ServletUtil.restoreAttribute(pageContext , "classBeingProcessed"); %><%-- **********4A616C696F73204A434D53 *** SIGNATURE BOUNDARY * DO NOT EDIT ANYTHING BELOW THIS LINE *** --%><%
%><%-- Ge4Y3zwB8giGAnGpXVajWg== --%>