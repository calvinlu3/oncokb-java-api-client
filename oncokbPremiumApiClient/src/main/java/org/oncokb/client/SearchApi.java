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

import org.oncokb.ApiCallback;
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.ApiResponse;
import org.oncokb.Configuration;
import org.oncokb.Pair;
import org.oncokb.ProgressRequestBody;
import org.oncokb.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.oncokb.client.EvidenceQueries;
import org.oncokb.client.IndicatorQueryResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for searchGetUsingGET
     * @param id The query ID (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param variant Variant name. (optional)
     * @param variantType Variant type. (optional)
     * @param svType Structural Variant Type. (optional)
     * @param consequence Consequence (optional)
     * @param proteinStart Protein Start (optional)
     * @param proteinEnd Protein End (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param source Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest. (optional, default to oncotree)
     * @param levels Level of evidences. (optional)
     * @param highestLevelOnly Only show treatments of highest level (optional, default to false)
     * @param queryType Query type. There maybe slight differences between different query types. Currently support web or regular. (optional, default to regular)
     * @param evidenceType Evidence type. (optional)
     * @param hgvs HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination (optional)
     * @param fields The fields to be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchGetUsingGETCall(String id, String hugoSymbol, Integer entrezGeneId, String variant, String variantType, String svType, String consequence, Integer proteinStart, Integer proteinEnd, String tumorType, String source, String levels, Boolean highestLevelOnly, String queryType, String evidenceType, String hgvs, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));
        if (hugoSymbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hugoSymbol", hugoSymbol));
        if (entrezGeneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entrezGeneId", entrezGeneId));
        if (variant != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("variant", variant));
        if (variantType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("variantType", variantType));
        if (svType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("svType", svType));
        if (consequence != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("consequence", consequence));
        if (proteinStart != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("proteinStart", proteinStart));
        if (proteinEnd != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("proteinEnd", proteinEnd));
        if (tumorType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tumorType", tumorType));
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (levels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("levels", levels));
        if (highestLevelOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("highestLevelOnly", highestLevelOnly));
        if (queryType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("queryType", queryType));
        if (evidenceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("evidenceType", evidenceType));
        if (hgvs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hgvs", hgvs));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchGetUsingGETValidateBeforeCall(String id, String hugoSymbol, Integer entrezGeneId, String variant, String variantType, String svType, String consequence, Integer proteinStart, Integer proteinEnd, String tumorType, String source, String levels, Boolean highestLevelOnly, String queryType, String evidenceType, String hgvs, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchGetUsingGETCall(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * searchGet
     * General search for possible combinations.
     * @param id The query ID (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param variant Variant name. (optional)
     * @param variantType Variant type. (optional)
     * @param svType Structural Variant Type. (optional)
     * @param consequence Consequence (optional)
     * @param proteinStart Protein Start (optional)
     * @param proteinEnd Protein End (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param source Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest. (optional, default to oncotree)
     * @param levels Level of evidences. (optional)
     * @param highestLevelOnly Only show treatments of highest level (optional, default to false)
     * @param queryType Query type. There maybe slight differences between different query types. Currently support web or regular. (optional, default to regular)
     * @param evidenceType Evidence type. (optional)
     * @param hgvs HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination (optional)
     * @param fields The fields to be returned. (optional)
     * @return IndicatorQueryResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IndicatorQueryResp searchGetUsingGET(String id, String hugoSymbol, Integer entrezGeneId, String variant, String variantType, String svType, String consequence, Integer proteinStart, Integer proteinEnd, String tumorType, String source, String levels, Boolean highestLevelOnly, String queryType, String evidenceType, String hgvs, String fields) throws ApiException {
        ApiResponse<IndicatorQueryResp> resp = searchGetUsingGETWithHttpInfo(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields);
        return resp.getData();
    }

    /**
     * searchGet
     * General search for possible combinations.
     * @param id The query ID (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param variant Variant name. (optional)
     * @param variantType Variant type. (optional)
     * @param svType Structural Variant Type. (optional)
     * @param consequence Consequence (optional)
     * @param proteinStart Protein Start (optional)
     * @param proteinEnd Protein End (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param source Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest. (optional, default to oncotree)
     * @param levels Level of evidences. (optional)
     * @param highestLevelOnly Only show treatments of highest level (optional, default to false)
     * @param queryType Query type. There maybe slight differences between different query types. Currently support web or regular. (optional, default to regular)
     * @param evidenceType Evidence type. (optional)
     * @param hgvs HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination (optional)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;IndicatorQueryResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IndicatorQueryResp> searchGetUsingGETWithHttpInfo(String id, String hugoSymbol, Integer entrezGeneId, String variant, String variantType, String svType, String consequence, Integer proteinStart, Integer proteinEnd, String tumorType, String source, String levels, Boolean highestLevelOnly, String queryType, String evidenceType, String hgvs, String fields) throws ApiException {
        com.squareup.okhttp.Call call = searchGetUsingGETValidateBeforeCall(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields, null, null);
        Type localVarReturnType = new TypeToken<IndicatorQueryResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * searchGet (asynchronously)
     * General search for possible combinations.
     * @param id The query ID (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param variant Variant name. (optional)
     * @param variantType Variant type. (optional)
     * @param svType Structural Variant Type. (optional)
     * @param consequence Consequence (optional)
     * @param proteinStart Protein Start (optional)
     * @param proteinEnd Protein End (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param source Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest. (optional, default to oncotree)
     * @param levels Level of evidences. (optional)
     * @param highestLevelOnly Only show treatments of highest level (optional, default to false)
     * @param queryType Query type. There maybe slight differences between different query types. Currently support web or regular. (optional, default to regular)
     * @param evidenceType Evidence type. (optional)
     * @param hgvs HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination (optional)
     * @param fields The fields to be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchGetUsingGETAsync(String id, String hugoSymbol, Integer entrezGeneId, String variant, String variantType, String svType, String consequence, Integer proteinStart, Integer proteinEnd, String tumorType, String source, String levels, Boolean highestLevelOnly, String queryType, String evidenceType, String hgvs, String fields, final ApiCallback<IndicatorQueryResp> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchGetUsingGETValidateBeforeCall(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IndicatorQueryResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchPostUsingPOST
     * @param body List of queries. Please see swagger.json for request body format. (required)
     * @param fields The fields to be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchPostUsingPOSTCall(EvidenceQueries body, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchPostUsingPOSTValidateBeforeCall(EvidenceQueries body, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling searchPostUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = searchPostUsingPOSTCall(body, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * searchPost
     * General search for possible combinations.
     * @param body List of queries. Please see swagger.json for request body format. (required)
     * @param fields The fields to be returned. (optional)
     * @return List&lt;IndicatorQueryResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IndicatorQueryResp> searchPostUsingPOST(EvidenceQueries body, String fields) throws ApiException {
        ApiResponse<List<IndicatorQueryResp>> resp = searchPostUsingPOSTWithHttpInfo(body, fields);
        return resp.getData();
    }

    /**
     * searchPost
     * General search for possible combinations.
     * @param body List of queries. Please see swagger.json for request body format. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;IndicatorQueryResp&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IndicatorQueryResp>> searchPostUsingPOSTWithHttpInfo(EvidenceQueries body, String fields) throws ApiException {
        com.squareup.okhttp.Call call = searchPostUsingPOSTValidateBeforeCall(body, fields, null, null);
        Type localVarReturnType = new TypeToken<List<IndicatorQueryResp>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * searchPost (asynchronously)
     * General search for possible combinations.
     * @param body List of queries. Please see swagger.json for request body format. (required)
     * @param fields The fields to be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchPostUsingPOSTAsync(EvidenceQueries body, String fields, final ApiCallback<List<IndicatorQueryResp>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchPostUsingPOSTValidateBeforeCall(body, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IndicatorQueryResp>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
