/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> 
 *
 * The version of the OpenAPI document: 1.19.28
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ExportRetrieveResponse;
import java.io.File;
import com.konfigthis.client.model.OptionalAddressColumnMapping;
import com.konfigthis.client.model.ReportRetrieveResponse;
import com.konfigthis.client.model.RequiredAddressColumnMapping;
import com.konfigthis.client.model.Upload;
import com.konfigthis.client.model.UploadCreateExport;
import com.konfigthis.client.model.UploadFile;
import com.konfigthis.client.model.UploadFileRequest;
import com.konfigthis.client.model.UploadUpdatable;
import com.konfigthis.client.model.UploadWritable;
import com.konfigthis.client.model.UploadsCreateExportFileRequest;
import com.konfigthis.client.model.UploadsMetadata;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadsApi
 */
@Disabled
public class UploadsApiTest {

    private static UploadsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UploadsApi(apiClient);
    }

    /**
     * Upload file
     *
     * Upload an [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) and associate it with an upload.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callFileTest() throws ApiException {
        String uplId = null;
        File _file = null;
        UploadFile response = api.callFile(uplId)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Create
     *
     * Creates a new upload with the provided properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String campaignId = null;
        RequiredAddressColumnMapping requiredAddressColumnMapping = null;
        OptionalAddressColumnMapping optionalAddressColumnMapping = null;
        UploadsMetadata metadata = null;
        String mergeVariableColumnMapping = null;
        Upload response = api.create(campaignId)
                .requiredAddressColumnMapping(requiredAddressColumnMapping)
                .optionalAddressColumnMapping(optionalAddressColumnMapping)
                .metadata(metadata)
                .mergeVariableColumnMapping(mergeVariableColumnMapping)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Export
     *
     * Campaign Exports can help you understand exactly which records in a campaign could not be created. By initiating and retrieving an export, you will get row-by-row errors for your campaign. For a step-by-step walkthrough of creating a campaign and exporting failures, see our [Campaigns Guide](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).  Create an export file associated with an upload.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createExportFileTest() throws ApiException {
        String uplId = null;
        String type = null;
        UploadCreateExport response = api.createExportFile(uplId)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete
     *
     * Delete an existing upload. You need only supply the unique identifier that was returned upon upload creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String uplId = null;
        api.delete(uplId)
                .execute();
        // TODO: test validations
    }

    /**
     * List
     *
     * Returns a list of your uploads. Optionally, filter uploads by campaign.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String campaignId = null;
        List<Upload> response = api.list()
                .campaignId(campaignId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the details of an existing upload. You need only supply the unique upload identifier that was returned upon upload creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        String uplId = null;
        Upload response = api.retrieve(uplId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Line Item Report
     *
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob&#39;s support team if you  would like access to this API endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieve_0Test() throws ApiException {
        String uplId = null;
        String status = null;
        Integer limit = null;
        Integer offset = null;
        ReportRetrieveResponse response = api.retrieve_0(uplId)
                .status(status)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Export
     *
     * Retrieves the details of an existing export. You need only supply the unique export identifier that was returned upon export creation. If you try retrieving an export immediately after creating one (i.e., before we&#39;re done processing the export), you will get back an export object with &#x60;state &#x3D; in_progress&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieve_1Test() throws ApiException {
        String uplId = null;
        String exId = null;
        ExportRetrieveResponse response = api.retrieve_1(uplId, exId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update
     *
     * Update the details of an existing upload. You need only supply the unique identifier that was returned upon upload creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String uplId = null;
        String originalFilename = null;
        RequiredAddressColumnMapping requiredAddressColumnMapping = null;
        OptionalAddressColumnMapping optionalAddressColumnMapping = null;
        UploadsMetadata metadata = null;
        String mergeVariableColumnMapping = null;
        Upload response = api.update(uplId)
                .originalFilename(originalFilename)
                .requiredAddressColumnMapping(requiredAddressColumnMapping)
                .optionalAddressColumnMapping(optionalAddressColumnMapping)
                .metadata(metadata)
                .mergeVariableColumnMapping(mergeVariableColumnMapping)
                .execute();
        // TODO: test validations
    }

}
