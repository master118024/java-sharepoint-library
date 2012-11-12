package com.microsoft.sharepoint.webpartpages;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:48.820+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://microsoft.com/sharepoint/webpartpages", name = "WebPartPagesWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WebPartPagesWebServiceSoap {

    @WebResult(name = "GetDataFromDataSourceControlResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetDataFromDataSourceControl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetDataFromDataSourceControl")
    @WebMethod(operationName = "GetDataFromDataSourceControl", action = "http://microsoft.com/sharepoint/webpartpages/GetDataFromDataSourceControl")
    @ResponseWrapper(localName = "GetDataFromDataSourceControlResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetDataFromDataSourceControlResponse")
    public java.lang.String getDataFromDataSourceControl(
        @WebParam(name = "dscXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String dscXml,
        @WebParam(name = "contextUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String contextUrl
    );

    @WebResult(name = "GetWebPartPageResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPartPage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPage")
    @WebMethod(operationName = "GetWebPartPage", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPartPage")
    @ResponseWrapper(localName = "GetWebPartPageResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPageResponse")
    public java.lang.String getWebPartPage(
        @WebParam(name = "documentName", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String documentName,
        @WebParam(name = "behavior", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior
    );

    @WebResult(name = "GetWebPartCrossPageCompatibilityResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPartCrossPageCompatibility", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartCrossPageCompatibility")
    @WebMethod(operationName = "GetWebPartCrossPageCompatibility", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPartCrossPageCompatibility")
    @ResponseWrapper(localName = "GetWebPartCrossPageCompatibilityResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartCrossPageCompatibilityResponse")
    public java.lang.String getWebPartCrossPageCompatibility(
        @WebParam(name = "sourcePageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String sourcePageUrl,
        @WebParam(name = "sourcePageContents", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String sourcePageContents,
        @WebParam(name = "targetPageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String targetPageUrl,
        @WebParam(name = "targetPageContents", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String targetPageContents,
        @WebParam(name = "providerPartID", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String providerPartID,
        @WebParam(name = "lcid", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String lcid
    );

    @RequestWrapper(localName = "SaveWebPart2", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.SaveWebPart2")
    @WebMethod(operationName = "SaveWebPart2", action = "http://microsoft.com/sharepoint/webpartpages/SaveWebPart2")
    @ResponseWrapper(localName = "SaveWebPart2Response", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.SaveWebPart2Response")
    public void saveWebPart2(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "storageKey", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String storageKey,
        @WebParam(name = "webPartXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String webPartXml,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage,
        @WebParam(name = "allowTypeChange", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        boolean allowTypeChange
    );

    @WebResult(name = "GetWebPart2Result", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPart2", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPart2")
    @WebMethod(operationName = "GetWebPart2", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPart2")
    @ResponseWrapper(localName = "GetWebPart2Response", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPart2Response")
    public java.lang.String getWebPart2(
        @WebParam(name = "pageurl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageurl,
        @WebParam(name = "storageKey", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String storageKey,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage,
        @WebParam(name = "behavior", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior
    );

    @WebResult(name = "GetAssemblyMetaDataResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetAssemblyMetaData", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetAssemblyMetaData")
    @WebMethod(operationName = "GetAssemblyMetaData", action = "http://microsoft.com/sharepoint/webpartpages/GetAssemblyMetaData")
    @ResponseWrapper(localName = "GetAssemblyMetaDataResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetAssemblyMetaDataResponse")
    public java.lang.String getAssemblyMetaData(
        @WebParam(name = "assemblyName", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String assemblyName,
        @WebParam(name = "baseTypes", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String baseTypes
    );

    @WebResult(name = "ValidateWorkflowMarkupAndCreateSupportObjectsResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "ValidateWorkflowMarkupAndCreateSupportObjects", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.ValidateWorkflowMarkupAndCreateSupportObjects")
    @WebMethod(operationName = "ValidateWorkflowMarkupAndCreateSupportObjects", action = "http://microsoft.com/sharepoint/webpartpages/ValidateWorkflowMarkupAndCreateSupportObjects")
    @ResponseWrapper(localName = "ValidateWorkflowMarkupAndCreateSupportObjectsResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.ValidateWorkflowMarkupAndCreateSupportObjectsResponse")
    public java.lang.String validateWorkflowMarkupAndCreateSupportObjects(
        @WebParam(name = "workflowMarkupText", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String workflowMarkupText,
        @WebParam(name = "rulesText", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String rulesText,
        @WebParam(name = "configBlob", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String configBlob,
        @WebParam(name = "flag", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String flag
    );

    @WebResult(name = "GetXmlDataFromDataSourceResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetXmlDataFromDataSource", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetXmlDataFromDataSource")
    @WebMethod(operationName = "GetXmlDataFromDataSource", action = "http://microsoft.com/sharepoint/webpartpages/GetXmlDataFromDataSource")
    @ResponseWrapper(localName = "GetXmlDataFromDataSourceResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetXmlDataFromDataSourceResponse")
    public java.lang.String getXmlDataFromDataSource(
        @WebParam(name = "queryXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String queryXml
    );

    @WebResult(name = "GetWebPartProperties2Result", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPartProperties2", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartProperties2")
    @WebMethod(operationName = "GetWebPartProperties2", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPartProperties2")
    @ResponseWrapper(localName = "GetWebPartProperties2Response", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartProperties2Response")
    public com.microsoft.sharepoint.webpartpages.GetWebPartProperties2Response.GetWebPartProperties2Result getWebPartProperties2(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage,
        @WebParam(name = "behavior", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior
    );

    @WebResult(name = "GetWebPartResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPart", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPart")
    @WebMethod(operationName = "GetWebPart", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPart")
    @ResponseWrapper(localName = "GetWebPartResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartResponse")
    public java.lang.String getWebPart(
        @WebParam(name = "pageurl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageurl,
        @WebParam(name = "storageKey", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String storageKey,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage
    );

    @RequestWrapper(localName = "DeleteWebPart", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.DeleteWebPart")
    @WebMethod(operationName = "DeleteWebPart", action = "http://microsoft.com/sharepoint/webpartpages/DeleteWebPart")
    @ResponseWrapper(localName = "DeleteWebPartResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.DeleteWebPartResponse")
    public void deleteWebPart(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "storageKey", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String storageKey,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage
    );

    @WebResult(name = "ExecuteProxyUpdatesResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "ExecuteProxyUpdates", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.ExecuteProxyUpdates")
    @WebMethod(operationName = "ExecuteProxyUpdates", action = "http://microsoft.com/sharepoint/webpartpages/ExecuteProxyUpdates")
    @ResponseWrapper(localName = "ExecuteProxyUpdatesResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.ExecuteProxyUpdatesResponse")
    public java.lang.String executeProxyUpdates(
        @WebParam(name = "updateData", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String updateData
    );

    @WebResult(name = "GetFormCapabilityFromDataSourceControlResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetFormCapabilityFromDataSourceControl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetFormCapabilityFromDataSourceControl")
    @WebMethod(operationName = "GetFormCapabilityFromDataSourceControl", action = "http://microsoft.com/sharepoint/webpartpages/GetFormCapabilityFromDataSourceControl")
    @ResponseWrapper(localName = "GetFormCapabilityFromDataSourceControlResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetFormCapabilityFromDataSourceControlResponse")
    public java.lang.String getFormCapabilityFromDataSourceControl(
        @WebParam(name = "dscXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String dscXml
    );

    @WebResult(name = "AssociateWorkflowMarkupResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "AssociateWorkflowMarkup", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.AssociateWorkflowMarkup")
    @WebMethod(operationName = "AssociateWorkflowMarkup", action = "http://microsoft.com/sharepoint/webpartpages/AssociateWorkflowMarkup")
    @ResponseWrapper(localName = "AssociateWorkflowMarkupResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.AssociateWorkflowMarkupResponse")
    public java.lang.String associateWorkflowMarkup(
        @WebParam(name = "configUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String configUrl,
        @WebParam(name = "configVersion", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String configVersion
    );

    @WebResult(name = "ConvertWebPartFormatResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "ConvertWebPartFormat", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.ConvertWebPartFormat")
    @WebMethod(operationName = "ConvertWebPartFormat", action = "http://microsoft.com/sharepoint/webpartpages/ConvertWebPartFormat")
    @ResponseWrapper(localName = "ConvertWebPartFormatResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.ConvertWebPartFormatResponse")
    public java.lang.String convertWebPartFormat(
        @WebParam(name = "inputFormat", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String inputFormat,
        @WebParam(name = "formatConversionOption", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.FormatConversionOption formatConversionOption
    );

    @WebResult(name = "RemoveWorkflowAssociationResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "RemoveWorkflowAssociation", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.RemoveWorkflowAssociation")
    @WebMethod(operationName = "RemoveWorkflowAssociation", action = "http://microsoft.com/sharepoint/webpartpages/RemoveWorkflowAssociation")
    @ResponseWrapper(localName = "RemoveWorkflowAssociationResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.RemoveWorkflowAssociationResponse")
    public java.lang.String removeWorkflowAssociation(
        @WebParam(name = "configUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String configUrl,
        @WebParam(name = "configVersion", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String configVersion
    );

    @WebResult(name = "GetWebPartPageConnectionInfoResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPartPageConnectionInfo", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPageConnectionInfo")
    @WebMethod(operationName = "GetWebPartPageConnectionInfo", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPartPageConnectionInfo")
    @ResponseWrapper(localName = "GetWebPartPageConnectionInfoResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPageConnectionInfoResponse")
    public java.lang.String getWebPartPageConnectionInfo(
        @WebParam(name = "sourcePageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String sourcePageUrl,
        @WebParam(name = "sourcePageContents", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String sourcePageContents,
        @WebParam(name = "providerPartID", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String providerPartID,
        @WebParam(name = "lcid", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String lcid
    );

    @WebResult(name = "GetWebPartPropertiesResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPartProperties", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartProperties")
    @WebMethod(operationName = "GetWebPartProperties", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPartProperties")
    @ResponseWrapper(localName = "GetWebPartPropertiesResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponse")
    public com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponse.GetWebPartPropertiesResult getWebPartProperties(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage
    );

    @WebResult(name = "GetExpandedListViewXmlResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetExpandedListViewXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetExpandedListViewXml")
    @WebMethod(operationName = "GetExpandedListViewXml", action = "http://microsoft.com/sharepoint/webpartpages/GetExpandedListViewXml")
    @ResponseWrapper(localName = "GetExpandedListViewXmlResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetExpandedListViewXmlResponse")
    public java.lang.String getExpandedListViewXml(
        @WebParam(name = "webId", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String webId,
        @WebParam(name = "listViewXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String listViewXml,
        @WebParam(name = "listGuid", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String listGuid,
        @WebParam(name = "listUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String listUrl,
        @WebParam(name = "listDisplayName", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String listDisplayName,
        @WebParam(name = "hasConnection", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.Boolean hasConnection,
        @WebParam(name = "partialView", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.Boolean partialView
    );

    @WebResult(name = "FetchLegalWorkflowActionsResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "FetchLegalWorkflowActions", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.FetchLegalWorkflowActions")
    @WebMethod(operationName = "FetchLegalWorkflowActions", action = "http://microsoft.com/sharepoint/webpartpages/FetchLegalWorkflowActions")
    @ResponseWrapper(localName = "FetchLegalWorkflowActionsResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.FetchLegalWorkflowActionsResponse")
    public java.lang.String fetchLegalWorkflowActions();

    @WebResult(name = "GetBindingResourceDataResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetBindingResourceData", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetBindingResourceData")
    @WebMethod(operationName = "GetBindingResourceData", action = "http://microsoft.com/sharepoint/webpartpages/GetBindingResourceData")
    @ResponseWrapper(localName = "GetBindingResourceDataResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetBindingResourceDataResponse")
    public java.lang.String getBindingResourceData(
        @WebParam(name = "ResourceName", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String resourceName
    );

    @WebResult(name = "GetWebPartPageDocumentResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetWebPartPageDocument", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPageDocument")
    @WebMethod(operationName = "GetWebPartPageDocument", action = "http://microsoft.com/sharepoint/webpartpages/GetWebPartPageDocument")
    @ResponseWrapper(localName = "GetWebPartPageDocumentResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetWebPartPageDocumentResponse")
    public java.lang.String getWebPartPageDocument(
        @WebParam(name = "documentName", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String documentName
    );

    @WebResult(name = "AddWebPartResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "AddWebPart", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.AddWebPart")
    @WebMethod(operationName = "AddWebPart", action = "http://microsoft.com/sharepoint/webpartpages/AddWebPart")
    @ResponseWrapper(localName = "AddWebPartResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.AddWebPartResponse")
    public java.lang.String addWebPart(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "webPartXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String webPartXml,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage
    );

    @WebResult(name = "AddWebPartToZoneResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "AddWebPartToZone", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.AddWebPartToZone")
    @WebMethod(operationName = "AddWebPartToZone", action = "http://microsoft.com/sharepoint/webpartpages/AddWebPartToZone")
    @ResponseWrapper(localName = "AddWebPartToZoneResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.AddWebPartToZoneResponse")
    public java.lang.String addWebPartToZone(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "webPartXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String webPartXml,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage,
        @WebParam(name = "zoneId", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String zoneId,
        @WebParam(name = "zoneIndex", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        int zoneIndex
    );

    @RequestWrapper(localName = "SaveWebPart", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.SaveWebPart")
    @WebMethod(operationName = "SaveWebPart", action = "http://microsoft.com/sharepoint/webpartpages/SaveWebPart")
    @ResponseWrapper(localName = "SaveWebPartResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.SaveWebPartResponse")
    public void saveWebPart(
        @WebParam(name = "pageUrl", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String pageUrl,
        @WebParam(name = "storageKey", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String storageKey,
        @WebParam(name = "webPartXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String webPartXml,
        @WebParam(name = "storage", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        com.microsoft.sharepoint.webpartpages.Storage storage
    );

    @WebResult(name = "GetCustomControlListResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetCustomControlList", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetCustomControlList")
    @WebMethod(operationName = "GetCustomControlList", action = "http://microsoft.com/sharepoint/webpartpages/GetCustomControlList")
    @ResponseWrapper(localName = "GetCustomControlListResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetCustomControlListResponse")
    public com.microsoft.sharepoint.webpartpages.GetCustomControlListResponse.GetCustomControlListResult getCustomControlList();

    @WebResult(name = "RenderWebPartForEditResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "RenderWebPartForEdit", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.RenderWebPartForEdit")
    @WebMethod(operationName = "RenderWebPartForEdit", action = "http://microsoft.com/sharepoint/webpartpages/RenderWebPartForEdit")
    @ResponseWrapper(localName = "RenderWebPartForEditResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.RenderWebPartForEditResponse")
    public java.lang.String renderWebPartForEdit(
        @WebParam(name = "webPartXml", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
        java.lang.String webPartXml
    );

    @WebResult(name = "GetSafeAssemblyInfoResult", targetNamespace = "http://microsoft.com/sharepoint/webpartpages")
    @RequestWrapper(localName = "GetSafeAssemblyInfo", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfo")
    @WebMethod(operationName = "GetSafeAssemblyInfo", action = "http://microsoft.com/sharepoint/webpartpages/GetSafeAssemblyInfo")
    @ResponseWrapper(localName = "GetSafeAssemblyInfoResponse", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", className = "com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponse")
    public com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponse.GetSafeAssemblyInfoResult getSafeAssemblyInfo();
}
