package com.microsoft.schemas.sharepoint.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:49.120+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", name = "WebsSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WebsSoap {

    @RequestWrapper(localName = "RevertFileContentStream", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RevertFileContentStream")
    @WebMethod(operationName = "RevertFileContentStream", action = "http://schemas.microsoft.com/sharepoint/soap/RevertFileContentStream")
    @ResponseWrapper(localName = "RevertFileContentStreamResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RevertFileContentStreamResponse")
    public void revertFileContentStream(
        @WebParam(name = "fileUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String fileUrl
    );

    @RequestWrapper(localName = "RevertCss", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RevertCss")
    @WebMethod(operationName = "RevertCss", action = "http://schemas.microsoft.com/sharepoint/soap/RevertCss")
    @ResponseWrapper(localName = "RevertCssResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RevertCssResponse")
    public void revertCss(
        @WebParam(name = "cssFile", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String cssFile
    );

    @WebResult(name = "UpdateContentTypeXmlDocumentResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "UpdateContentTypeXmlDocument", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocument")
    @WebMethod(operationName = "UpdateContentTypeXmlDocument", action = "http://schemas.microsoft.com/sharepoint/soap/UpdateContentTypeXmlDocument")
    @ResponseWrapper(localName = "UpdateContentTypeXmlDocumentResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponse")
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult updateContentTypeXmlDocument(
        @WebParam(name = "contentTypeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String contentTypeId,
        @WebParam(name = "newDocument", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocument.NewDocument newDocument
    );

    @WebResult(name = "GetWebResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetWeb", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetWeb")
    @WebMethod(operationName = "GetWeb", action = "http://schemas.microsoft.com/sharepoint/soap/GetWeb")
    @ResponseWrapper(localName = "GetWebResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetWebResponse")
    public com.microsoft.schemas.sharepoint.soap.GetWebResponse.GetWebResult getWeb(
        @WebParam(name = "webUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String webUrl
    );

    @WebResult(name = "GetCustomizedPageStatusResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetCustomizedPageStatus", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetCustomizedPageStatus")
    @WebMethod(operationName = "GetCustomizedPageStatus", action = "http://schemas.microsoft.com/sharepoint/soap/GetCustomizedPageStatus")
    @ResponseWrapper(localName = "GetCustomizedPageStatusResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetCustomizedPageStatusResponse")
    public com.microsoft.schemas.sharepoint.soap.CustomizedPageStatus getCustomizedPageStatus(
        @WebParam(name = "fileUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String fileUrl
    );

    @WebResult(name = "GetColumnsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetColumns", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetColumns")
    @WebMethod(operationName = "GetColumns", action = "http://schemas.microsoft.com/sharepoint/soap/GetColumns")
    @ResponseWrapper(localName = "GetColumnsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetColumnsResponse")
    public com.microsoft.schemas.sharepoint.soap.GetColumnsResponse.GetColumnsResult getColumns();

    @WebResult(name = "GetObjectIdFromUrlResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetObjectIdFromUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetObjectIdFromUrl")
    @WebMethod(operationName = "GetObjectIdFromUrl", action = "http://schemas.microsoft.com/sharepoint/soap/GetObjectIdFromUrl")
    @ResponseWrapper(localName = "GetObjectIdFromUrlResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetObjectIdFromUrlResponse")
    public com.microsoft.schemas.sharepoint.soap.GetObjectIdFromUrlResponse.GetObjectIdFromUrlResult getObjectIdFromUrl(
        @WebParam(name = "objectUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String objectUrl
    );

    @WebResult(name = "CreateContentTypeResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "CreateContentType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.CreateContentType")
    @WebMethod(operationName = "CreateContentType", action = "http://schemas.microsoft.com/sharepoint/soap/CreateContentType")
    @ResponseWrapper(localName = "CreateContentTypeResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponse")
    public java.lang.String createContentType(
        @WebParam(name = "displayName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String displayName,
        @WebParam(name = "parentType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String parentType,
        @WebParam(name = "newFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.CreateContentType.NewFields newFields,
        @WebParam(name = "contentTypeProperties", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.CreateContentType.ContentTypeProperties contentTypeProperties
    );

    @WebResult(name = "GetContentTypeResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetContentType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentType")
    @WebMethod(operationName = "GetContentType", action = "http://schemas.microsoft.com/sharepoint/soap/GetContentType")
    @ResponseWrapper(localName = "GetContentTypeResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentTypeResponse")
    public com.microsoft.schemas.sharepoint.soap.GetContentTypeResponse.GetContentTypeResult getContentType(
        @WebParam(name = "contentTypeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String contentTypeId
    );

    @WebResult(name = "WebUrlFromPageUrlResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "WebUrlFromPageUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.WebUrlFromPageUrl")
    @WebMethod(operationName = "WebUrlFromPageUrl", action = "http://schemas.microsoft.com/sharepoint/soap/WebUrlFromPageUrl")
    @ResponseWrapper(localName = "WebUrlFromPageUrlResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.WebUrlFromPageUrlResponse")
    public java.lang.String webUrlFromPageUrl(
        @WebParam(name = "pageUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String pageUrl
    );

    @WebResult(name = "GetContentTypesResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetContentTypes", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentTypes")
    @WebMethod(operationName = "GetContentTypes", action = "http://schemas.microsoft.com/sharepoint/soap/GetContentTypes")
    @ResponseWrapper(localName = "GetContentTypesResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentTypesResponse")
    public com.microsoft.schemas.sharepoint.soap.GetContentTypesResponse.GetContentTypesResult getContentTypes();

    @WebResult(name = "GetActivatedFeaturesResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetActivatedFeatures", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetActivatedFeatures")
    @WebMethod(operationName = "GetActivatedFeatures", action = "http://schemas.microsoft.com/sharepoint/soap/GetActivatedFeatures")
    @ResponseWrapper(localName = "GetActivatedFeaturesResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetActivatedFeaturesResponse")
    public java.lang.String getActivatedFeatures();

    @WebResult(name = "GetAllSubWebCollectionResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetAllSubWebCollection", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetAllSubWebCollection")
    @WebMethod(operationName = "GetAllSubWebCollection", action = "http://schemas.microsoft.com/sharepoint/soap/GetAllSubWebCollection")
    @ResponseWrapper(localName = "GetAllSubWebCollectionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetAllSubWebCollectionResponse")
    public com.microsoft.schemas.sharepoint.soap.GetAllSubWebCollectionResponse.GetAllSubWebCollectionResult getAllSubWebCollection();

    @RequestWrapper(localName = "CustomizeCss", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.CustomizeCss")
    @WebMethod(operationName = "CustomizeCss", action = "http://schemas.microsoft.com/sharepoint/soap/CustomizeCss")
    @ResponseWrapper(localName = "CustomizeCssResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.CustomizeCssResponse")
    public void customizeCss(
        @WebParam(name = "cssFile", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String cssFile
    );

    @WebResult(name = "UpdateColumnsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "UpdateColumns", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.UpdateColumns")
    @WebMethod(operationName = "UpdateColumns", action = "http://schemas.microsoft.com/sharepoint/soap/UpdateColumns")
    @ResponseWrapper(localName = "UpdateColumnsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.UpdateColumnsResponse")
    public com.microsoft.schemas.sharepoint.soap.UpdateColumnsResponse.UpdateColumnsResult updateColumns(
        @WebParam(name = "newFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateColumns.NewFields newFields,
        @WebParam(name = "updateFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateColumns.UpdateFields updateFields,
        @WebParam(name = "deleteFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateColumns.DeleteFields deleteFields
    );

    @WebResult(name = "GetWebCollectionResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetWebCollection", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetWebCollection")
    @WebMethod(operationName = "GetWebCollection", action = "http://schemas.microsoft.com/sharepoint/soap/GetWebCollection")
    @ResponseWrapper(localName = "GetWebCollectionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetWebCollectionResponse")
    public com.microsoft.schemas.sharepoint.soap.GetWebCollectionResponse.GetWebCollectionResult getWebCollection();

    @WebResult(name = "UpdateContentTypeResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "UpdateContentType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.UpdateContentType")
    @WebMethod(operationName = "UpdateContentType", action = "http://schemas.microsoft.com/sharepoint/soap/UpdateContentType")
    @ResponseWrapper(localName = "UpdateContentTypeResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponse")
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponse.UpdateContentTypeResult updateContentType(
        @WebParam(name = "contentTypeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String contentTypeId,
        @WebParam(name = "contentTypeProperties", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateContentType.ContentTypeProperties contentTypeProperties,
        @WebParam(name = "newFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateContentType.NewFields newFields,
        @WebParam(name = "updateFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateContentType.UpdateFields updateFields,
        @WebParam(name = "deleteFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.UpdateContentType.DeleteFields deleteFields
    );

    @WebResult(name = "DeleteContentTypeResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "DeleteContentType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.DeleteContentType")
    @WebMethod(operationName = "DeleteContentType", action = "http://schemas.microsoft.com/sharepoint/soap/DeleteContentType")
    @ResponseWrapper(localName = "DeleteContentTypeResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponse")
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponse.DeleteContentTypeResult deleteContentType(
        @WebParam(name = "contentTypeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String contentTypeId
    );

    @WebResult(name = "GetListTemplatesResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetListTemplates", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListTemplates")
    @WebMethod(operationName = "GetListTemplates", action = "http://schemas.microsoft.com/sharepoint/soap/GetListTemplates")
    @ResponseWrapper(localName = "GetListTemplatesResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListTemplatesResponse")
    public com.microsoft.schemas.sharepoint.soap.GetListTemplatesResponse.GetListTemplatesResult getListTemplates();

    @RequestWrapper(localName = "RevertAllFileContentStreams", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RevertAllFileContentStreams")
    @WebMethod(operationName = "RevertAllFileContentStreams", action = "http://schemas.microsoft.com/sharepoint/soap/RevertAllFileContentStreams")
    @ResponseWrapper(localName = "RevertAllFileContentStreamsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RevertAllFileContentStreamsResponse")
    public void revertAllFileContentStreams();

    @WebResult(name = "RemoveContentTypeXmlDocumentResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "RemoveContentTypeXmlDocument", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RemoveContentTypeXmlDocument")
    @WebMethod(operationName = "RemoveContentTypeXmlDocument", action = "http://schemas.microsoft.com/sharepoint/soap/RemoveContentTypeXmlDocument")
    @ResponseWrapper(localName = "RemoveContentTypeXmlDocumentResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RemoveContentTypeXmlDocumentResponse")
    public com.microsoft.schemas.sharepoint.soap.RemoveContentTypeXmlDocumentResponse.RemoveContentTypeXmlDocumentResult removeContentTypeXmlDocument(
        @WebParam(name = "contentTypeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String contentTypeId,
        @WebParam(name = "documentUri", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String documentUri
    );
}
