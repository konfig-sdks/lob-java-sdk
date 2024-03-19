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
import com.konfigthis.client.model.AddressPlacement;
import com.konfigthis.client.model.AddressesListBeforeAfterParameterAllOf;
import com.konfigthis.client.model.ChecksListSortByParameterAllOf;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.ExtraService;
import com.konfigthis.client.model.LetterDeletion;
import com.konfigthis.client.model.LetterEditable;
import com.konfigthis.client.model.LettersListResponse;
import com.konfigthis.client.model.LtrSize;
import com.konfigthis.client.model.LtrUseType;
import com.konfigthis.client.model.MailType;
import com.konfigthis.client.model.QrCode;
import com.konfigthis.client.model.Status;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LettersApi
 */
@Disabled
public class LettersApiTest {

    private static LettersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LettersApi(apiClient);
    }

    /**
     * Cancel
     *
     * Completely removes a letter from production. This can only be done if the letter has a &#x60;send_date&#x60; and the &#x60;send_date&#x60; has not yet passed. If the letter is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTest() throws ApiException {
        String ltrId = null;
        LetterDeletion response = api.cancel(ltrId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create
     *
     * Creates a new letter given information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Object to = null;
        Object from = null;
        String description = null;
        Map<String, String> metadata = null;
        MailType mailType = null;
        String mergeVariables = null;
        Object sendDate = null;
        Object _file = null;
        ExtraService extraService = null;
        List<String> cards = null;
        Boolean color = null;
        Boolean doubleSided = null;
        AddressPlacement addressPlacement = null;
        Object returnEnvelope = null;
        Integer perforatedPage = null;
        String customEnvelope = null;
        String billingGroupId = null;
        QrCode qrCode = null;
        LtrUseType useType = null;
        Boolean fsc = null;
        LtrSize size = null;
        String idempotencyKey = null;
        String idempotencyKey2 = null;
        String lobVersion = null;
        Object response = api.create()
                .to(to)
                .from(from)
                .description(description)
                .metadata(metadata)
                .mailType(mailType)
                .mergeVariables(mergeVariables)
                .sendDate(sendDate)
                ._file(_file)
                .extraService(extraService)
                .cards(cards)
                .color(color)
                .doubleSided(doubleSided)
                .addressPlacement(addressPlacement)
                .returnEnvelope(returnEnvelope)
                .perforatedPage(perforatedPage)
                .customEnvelope(customEnvelope)
                .billingGroupId(billingGroupId)
                .qrCode(qrCode)
                .useType(useType)
                .fsc(fsc)
                .size(size)
                .idempotencyKey(idempotencyKey)
                .idempotencyKey2(idempotencyKey2)
                .lobVersion(lobVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * List
     *
     * Returns a list of your letters. The letters are returned sorted by creation date, with the most recently created letters appearing first.
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
        String campaignId = null;
        Status status = null;
        Boolean color = null;
        Boolean scheduled = null;
        Object sendDate = null;
        MailType mailType = null;
        ChecksListSortByParameter sortBy = null;
        LettersListResponse response = api.list()
                .limit(limit)
                .beforeAfter(beforeAfter)
                .include(include)
                .dateCreated(dateCreated)
                .metadata(metadata)
                .campaignId(campaignId)
                .status(status)
                .color(color)
                .scheduled(scheduled)
                .sendDate(sendDate)
                .mailType(mailType)
                .sortBy(sortBy)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the details of an existing letter. You need only supply the unique letter identifier that was returned upon letter creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        String ltrId = null;
        Object response = api.retrieve(ltrId)
                .execute();
        // TODO: test validations
    }

}
