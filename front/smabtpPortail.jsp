<%@ include file='/jcore/doInitPage.jspf'%>
<% 
%><%@ include file='/jcore/portal/doPortletParams.jspf'%>
<% 
%><%@ page contentType="text/html; charset=UTF-8"%>
<%

PortalJspCollection box = (PortalJspCollection) portlet;
ServletUtil.backupAttribute(pageContext, "ShowChildPortalElement");
%><%@ include
	file='/types/AbstractCollection/doIncludePortletCollection.jspf'%>
<%
ServletUtil.restoreAttribute(pageContext, "ShowChildPortalElement");
String headerNav = getPortlet(bufferMap, "header");
%>
<div class="container">
	<div class="row header">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<%= headerNav %>
				</div>
			</div>
		</div>
	</div>
</div>
			
