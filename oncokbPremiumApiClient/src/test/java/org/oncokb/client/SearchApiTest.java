/*
 * OncoKB APIs for Premium Users
 * These endpoints are designed for premium users. Please contact OncoKB team(contact@oncokb.org) if you want to be upgraded.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

import org.oncokb.ApiException;
import org.oncokb.client.EvidenceQueries;
import org.oncokb.client.IndicatorQueryResp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * searchGet
     *
     * General search for possible combinations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchGetUsingGETTest() throws ApiException {
        String id = null;
        String hugoSymbol = null;
        Integer entrezGeneId = null;
        String variant = null;
        String variantType = null;
        String svType = null;
        String consequence = null;
        Integer proteinStart = null;
        Integer proteinEnd = null;
        String tumorType = null;
        String source = null;
        String levels = null;
        Boolean highestLevelOnly = null;
        String queryType = null;
        String evidenceType = null;
        String hgvs = null;
        String fields = null;
        IndicatorQueryResp response = api.searchGetUsingGET(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields);

        // TODO: test validations
    }
    
    /**
     * searchPost
     *
     * General search for possible combinations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchPostUsingPOSTTest() throws ApiException {
        EvidenceQueries body = null;
        String fields = null;
        List<IndicatorQueryResp> response = api.searchPostUsingPOST(body, fields);

        // TODO: test validations
    }
    
}
