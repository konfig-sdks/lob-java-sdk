package com.konfigthis.client;

import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.AddressesApi;
import com.konfigthis.client.api.BankAccountsApi;
import com.konfigthis.client.api.BillingGroupsApi;
import com.konfigthis.client.api.BuckslipOrdersApi;
import com.konfigthis.client.api.BuckslipsApi;
import com.konfigthis.client.api.CampaignsApi;
import com.konfigthis.client.api.CardOrdersApi;
import com.konfigthis.client.api.CardsApi;
import com.konfigthis.client.api.ChecksApi;
import com.konfigthis.client.api.CreativesApi;
import com.konfigthis.client.api.IdentityValidationApi;
import com.konfigthis.client.api.IntlAutocompletionsApi;
import com.konfigthis.client.api.IntlVerificationsApi;
import com.konfigthis.client.api.LettersApi;
import com.konfigthis.client.api.LobCreditsApi;
import com.konfigthis.client.api.PostcardsApi;
import com.konfigthis.client.api.QrCodesApi;
import com.konfigthis.client.api.ReverseGeocodeLookupsApi;
import com.konfigthis.client.api.SelfMailersApi;
import com.konfigthis.client.api.SnapPacksApi;
import com.konfigthis.client.api.TemplateVersionsApi;
import com.konfigthis.client.api.TemplatesApi;
import com.konfigthis.client.api.UrlShortenerApi;
import com.konfigthis.client.api.UsAutocompletionsApi;
import com.konfigthis.client.api.UsVerificationsApi;
import com.konfigthis.client.api.UploadsApi;
import com.konfigthis.client.api.ZipLookupsApi;

public class Lob {
    private ApiClient apiClient;
    public final AccountsApi accounts;
    public final AddressesApi addresses;
    public final BankAccountsApi bankAccounts;
    public final BillingGroupsApi billingGroups;
    public final BuckslipOrdersApi buckslipOrders;
    public final BuckslipsApi buckslips;
    public final CampaignsApi campaigns;
    public final CardOrdersApi cardOrders;
    public final CardsApi cards;
    public final ChecksApi checks;
    public final CreativesApi creatives;
    public final IdentityValidationApi identityValidation;
    public final IntlAutocompletionsApi intlAutocompletions;
    public final IntlVerificationsApi intlVerifications;
    public final LettersApi letters;
    public final LobCreditsApi lobCredits;
    public final PostcardsApi postcards;
    public final QrCodesApi qrCodes;
    public final ReverseGeocodeLookupsApi reverseGeocodeLookups;
    public final SelfMailersApi selfMailers;
    public final SnapPacksApi snapPacks;
    public final TemplateVersionsApi templateVersions;
    public final TemplatesApi templates;
    public final UrlShortenerApi urlShortener;
    public final UsAutocompletionsApi usAutocompletions;
    public final UsVerificationsApi usVerifications;
    public final UploadsApi uploads;
    public final ZipLookupsApi zipLookups;

    public Lob() {
        this(null);
    }

    public Lob(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accounts = new AccountsApi(this.apiClient);
        this.addresses = new AddressesApi(this.apiClient);
        this.bankAccounts = new BankAccountsApi(this.apiClient);
        this.billingGroups = new BillingGroupsApi(this.apiClient);
        this.buckslipOrders = new BuckslipOrdersApi(this.apiClient);
        this.buckslips = new BuckslipsApi(this.apiClient);
        this.campaigns = new CampaignsApi(this.apiClient);
        this.cardOrders = new CardOrdersApi(this.apiClient);
        this.cards = new CardsApi(this.apiClient);
        this.checks = new ChecksApi(this.apiClient);
        this.creatives = new CreativesApi(this.apiClient);
        this.identityValidation = new IdentityValidationApi(this.apiClient);
        this.intlAutocompletions = new IntlAutocompletionsApi(this.apiClient);
        this.intlVerifications = new IntlVerificationsApi(this.apiClient);
        this.letters = new LettersApi(this.apiClient);
        this.lobCredits = new LobCreditsApi(this.apiClient);
        this.postcards = new PostcardsApi(this.apiClient);
        this.qrCodes = new QrCodesApi(this.apiClient);
        this.reverseGeocodeLookups = new ReverseGeocodeLookupsApi(this.apiClient);
        this.selfMailers = new SelfMailersApi(this.apiClient);
        this.snapPacks = new SnapPacksApi(this.apiClient);
        this.templateVersions = new TemplateVersionsApi(this.apiClient);
        this.templates = new TemplatesApi(this.apiClient);
        this.urlShortener = new UrlShortenerApi(this.apiClient);
        this.usAutocompletions = new UsAutocompletionsApi(this.apiClient);
        this.usVerifications = new UsVerificationsApi(this.apiClient);
        this.uploads = new UploadsApi(this.apiClient);
        this.zipLookups = new ZipLookupsApi(this.apiClient);
    }

}
