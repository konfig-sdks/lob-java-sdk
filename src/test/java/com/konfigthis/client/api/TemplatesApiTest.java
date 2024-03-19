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
import com.konfigthis.client.model.AddressesListBeforeAfterParameterAllOf;
import com.konfigthis.client.model.Engine;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Template;
import com.konfigthis.client.model.TemplateDeletion;
import com.konfigthis.client.model.TemplateUpdate;
import com.konfigthis.client.model.TemplateWritable;
import com.konfigthis.client.model.TemplatesListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Disabled
public class TemplatesApiTest {

    private static TemplatesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TemplatesApi(apiClient);
    }

    /**
     * Delete
     *
     * Permanently deletes a template. Deleting a template also deletes its associated versions. Deleted templates can not be used to create postcard, letter, or check resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String tmplId = null;
        TemplateDeletion response = api.delete(tmplId)
                .execute();
        // TODO: test validations
    }

    /**
     * List
     *
     * Returns a list of your templates. The templates are returned sorted by creation date, with the most recently created templates appearing first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer limit = null;
        AddressesListBeforeAfterParameter beforeAfter = null;
        List<String> include = null;
        Map<String, String> dateCreated = null;
        Map<String, String> metadata = null;
        TemplatesListResponse response = api.list()
                .limit(limit)
                .beforeAfter(beforeAfter)
                .include(include)
                .dateCreated(dateCreated)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the details of an existing template. You need only supply the unique template identifier that was returned upon template creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        String tmplId = null;
        Template response = api.retrieve(tmplId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create
     *
     * Creates a new template for use with the Print &amp; Mail API. In Live mode, you can only have as many non-deleted templates as allotted in your current &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt;. If you attempt to create a template past your limit, you will receive a &#x60;403&#x60; error. There is no limit in Test mode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        String html = null;
        String description = null;
        Map<String, String> metadata = null;
        Engine engine = null;
        List<String> requiredVars = null;
        Template response = api.template(html)
                .description(description)
                .metadata(metadata)
                .engine(engine)
                .requiredVars(requiredVars)
                .execute();
        // TODO: test validations
    }

    /**
     * Update
     *
     * Updates the description and/or published version of the template with the given id. To update the template&#39;s html, create a new version of the template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String tmplId = null;
        String description = null;
        String publishedVersion = null;
        Template response = api.update(tmplId)
                .description(description)
                .publishedVersion(publishedVersion)
                .execute();
        // TODO: test validations
    }

}
