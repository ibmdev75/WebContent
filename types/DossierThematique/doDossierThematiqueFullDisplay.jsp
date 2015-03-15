<%@ page contentType="text/html; charset=UTF-8" %><%
%><%-- This file has been automatically generated. --%><%
%><%--
  @Summary: DossierThematique display page
  @Category: Generated
  @Author: JCMS Type Processor
  @Customizable: True
  @Requestable: True
--%><%
%><%@ include file='/jcore/doInitPage.jspf' %><%
%><% DossierThematique obj = (DossierThematique)request.getAttribute(PortalManager.PORTAL_PUBLICATION); %><%
%><%@ include file='/front/doFullDisplay.jspf' %>
<div class="fullDisplay DossierThematique <%= obj.canBeEditedFieldByField(loggedMember) ? "unitFieldEdition" : "" %>">
<%@ include file='/front/publication/doPublicationHeader.jspf' %>
<table class="fields">
  <tr class="field titreAffiche textareaEditor  <%= Util.isEmpty(obj.getTitreAffiche(userLang)) ? "empty" : "" %>">
    <td class='field-label'><%= channel.getTypeFieldLabel(DossierThematique.class, "titreAffiche", userLang) %><jalios:edit pub='<%= obj %>' fields='titreAffiche'/></td>
    <td class='field-data' <%= gfla(obj, "titreAffiche") %>>
            <jalios:if predicate='<%= Util.notEmpty(obj.getTitreAffiche(userLang)) %>'>
            <jalios:wiki><%= obj.getTitreAffiche(userLang) %></jalios:wiki>
            </jalios:if>
    </td>
  </tr>
  <tr class="field description wysiwygEditor abstract <%= Util.isEmpty(obj.getDescription(userLang)) ? "empty" : "" %>">
    <td class='field-label'><%= channel.getTypeFieldLabel(DossierThematique.class, "description", userLang) %><jalios:edit pub='<%= obj %>' fields='description'/></td>
    <td class='field-data' <%= gfla(obj, "description") %>>
            <jalios:if predicate='<%= Util.notEmpty(obj.getDescription(userLang)) %>'>
            <jalios:wysiwyg><%= obj.getDescription(userLang) %></jalios:wysiwyg>            
            </jalios:if>
    </td>
  </tr>
  <tr class="field image imageEditor  <%= Util.isEmpty(obj.getImage(userLang)) ? "empty" : "" %>">
    <td class='field-label'><%= channel.getTypeFieldLabel(DossierThematique.class, "image", userLang) %><jalios:edit pub='<%= obj %>' fields='image'/></td>
    <td class='field-data' <%= gfla(obj, "image") %>>
            <jalios:if predicate='<%= Util.notEmpty(obj.getImage(userLang)) %>'>
            <img src='<%= Util.encodeUrl(obj.getImage(userLang)) %>' alt='' />
            </jalios:if>
    </td>
  </tr>
  <tr class="field contenu wysiwygEditor  <%= Util.isEmpty(obj.getContenu(userLang)) ? "empty" : "" %>">
    <td class='field-label'><%= channel.getTypeFieldLabel(DossierThematique.class, "contenu", userLang) %><jalios:edit pub='<%= obj %>' fields='contenu'/></td>
    <td class='field-data' <%= gfla(obj, "contenu") %>>
            <jalios:if predicate='<%= Util.notEmpty(obj.getContenu(userLang)) %>'>
            <jalios:wysiwyg><%= obj.getContenu(userLang) %></jalios:wysiwyg>            
            </jalios:if>
    </td>
  </tr>
  <tr class="field lienArticle linkEditor  <%= Util.isEmpty(obj.getLienArticle()) ? "empty" : "" %>">
    <td class='field-label'><%= channel.getTypeFieldLabel(DossierThematique.class, "lienArticle", userLang) %><jalios:edit pub='<%= obj %>' fields='lienArticle'/></td>
    <td class='field-data' >
            <% if (Util.notEmpty(obj.getLienArticle())) { %>
            <ol>
              <jalios:foreach name="itData" type="generated.Article" array="<%= obj.getLienArticle() %>">
              <jalios:if predicate='<%= itData != null && itData.canBeReadBy(loggedMember) %>'>
              <li>
              <jalios:link data='<%= itData %>'/>
              </li>
              </jalios:if>
              </jalios:foreach>
            </ol>
            <% } %>
    </td>
  </tr>
 
</table>
<jsp:include page="/front/doFullDisplayCommonFields.jsp" />
</div><%-- **********4A616C696F73204A434D53 *** SIGNATURE BOUNDARY * DO NOT EDIT ANYTHING BELOW THIS LINE *** --%><%
%><%-- LZnB1hY+qKnleTa57nFNPQ== --%>