<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%><%@taglib
	uri="http://java.sun.com/jsf/core" prefix="f"%><%@taglib
	uri="http://richfaces.org/rich" prefix="rich"%><f:view>
	<h:form>

		<h:panelGrid border="2" columns="2">
			<h:outputText value="libelle"></h:outputText>
			<h:inputText value="#{soutenanceCtr.soutenance.libelle}"></h:inputText>

			<h:outputText value="date"></h:outputText>
			<rich:calendar value="#{soutenanceCtr.soutenance.dateSoutenance}"></rich:calendar>
		
			<h:outputText value="salle"></h:outputText>
			<h:selectOneMenu value="#{soutenanceCtr.selectedSalleId}">
				<f:selectItems  value="#{soutenanceCtr.items}"/>
			</h:selectOneMenu>
		</h:panelGrid>
		<h:commandButton value="add" action="#{soutenanceCtr.doAdd}"></h:commandButton>
	</h:form>
</f:view>