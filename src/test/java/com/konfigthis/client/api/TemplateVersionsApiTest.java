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
import com.konfigthis.client.model.TemplateVersion;
import com.konfigthis.client.model.TemplateVersionDeletion;
import com.konfigthis.client.model.TemplateVersionUpdatable;
import com.konfigthis.client.model.TemplateVersionWritable;
import com.konfigthis.client.model.TemplateVersionsGetListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateVersionsApi
 */
@Disabled
public class TemplateVersionsApiTest {

    private static TemplateVersionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TemplateVersionsApi(apiClient);
    }

    /**
     * Create
     *
     * Creates a new template version attached to the specified template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewVersionTest() throws ApiException {
        String html = null;
        String tmplId = null;
        String description = null;
        Engine engine = null;
        List<String> requiredVars = null;
        TemplateVersion response = api.createNewVersion(html, tmplId)
                .description(description)
                .engine(engine)
                .requiredVars(requiredVars)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete
     *
     * Permanently deletes a template version. A template&#39;s &#x60;published_version&#x60; can not be deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVersionTest() throws ApiException {
        String tmplId = null;
        String vrsnId = null;
        TemplateVersionDeletion response = api.deleteVersion(tmplId, vrsnId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the template version with the given template and version ids.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String tmplId = null;
        String vrsnId = null;
        TemplateVersion response = api.get(tmplId, vrsnId)
                .execute();
        // TODO: test validations
    }

    /**
     * List
     *
     * Returns a list of template versions for the given template ID. The template versions are sorted by creation date, with the most recently created appearing first. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String tmplId = null;
        Integer limit = null;
        AddressesListBeforeAfterParameter beforeAfter = null;
        List<String> include = null;
        Map<String, String> dateCreated = null;
        TemplateVersionsGetListResponse response = api.getList(tmplId)
                .limit(limit)
                .beforeAfter(beforeAfter)
                .include(include)
                .dateCreated(dateCreated)
                .execute();
        // TODO: test validations
    }

    /**
     * Update
     *
     * Updates the template version with the given template and version ids.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTemplateVersionTest() throws ApiException {
        String tmplId = null;
        String vrsnId = null;
        String description = null;
        Engine engine = null;
        List<String> requiredVars = null;
        TemplateVersion response = api.updateTemplateVersion(tmplId, vrsnId)
                .description(description)
                .engine(engine)
                .requiredVars(requiredVars)
                .execute();
        // TODO: test validations
    }

}
