/*
 * Springular REST API
 * Springular REST API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact:   
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.HaircutDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HaircutConsultationApi {
    private ApiClient localVarApiClient;

    public HaircutConsultationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HaircutConsultationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getHaircutUsingGET
     * @param id Identifier of the hairstyle to consult (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved haircut </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHaircutUsingGETCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/haircuts/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHaircutUsingGETValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getHaircutUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getHaircutUsingGETCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get haircut by id
     * 
     * @param id Identifier of the hairstyle to consult (required)
     * @return HaircutDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved haircut </td><td>  -  </td></tr>
     </table>
     */
    public HaircutDTO getHaircutUsingGET(String id) throws ApiException {
        ApiResponse<HaircutDTO> localVarResp = getHaircutUsingGETWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get haircut by id
     * 
     * @param id Identifier of the hairstyle to consult (required)
     * @return ApiResponse&lt;HaircutDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved haircut </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HaircutDTO> getHaircutUsingGETWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getHaircutUsingGETValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<HaircutDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get haircut by id (asynchronously)
     * 
     * @param id Identifier of the hairstyle to consult (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved haircut </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHaircutUsingGETAsync(String id, final ApiCallback<HaircutDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHaircutUsingGETValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<HaircutDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHaircutsUsingGET
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved all haircuts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHaircutsUsingGETCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/haircuts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHaircutsUsingGETValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getHaircutsUsingGETCall(_callback);
        return localVarCall;

    }

    /**
     * Get all haircuts
     * 
     * @return List&lt;HaircutDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved all haircuts </td><td>  -  </td></tr>
     </table>
     */
    public List<HaircutDTO> getHaircutsUsingGET() throws ApiException {
        ApiResponse<List<HaircutDTO>> localVarResp = getHaircutsUsingGETWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get all haircuts
     * 
     * @return ApiResponse&lt;List&lt;HaircutDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved all haircuts </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<HaircutDTO>> getHaircutsUsingGETWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getHaircutsUsingGETValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<HaircutDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all haircuts (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved all haircuts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHaircutsUsingGETAsync(final ApiCallback<List<HaircutDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHaircutsUsingGETValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<HaircutDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
