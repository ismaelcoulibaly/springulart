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


import org.openapitools.client.model.AuthDTO;
import java.io.File;
import org.threeten.bp.LocalDate;
import org.openapitools.client.model.LoginDTO;
import org.openapitools.client.model.UserDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationOfAccountsApi {
    private ApiClient localVarApiClient;

    public RegistrationOfAccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RegistrationOfAccountsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for authenticateUserUsingPOST
     * @param authDTO  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticateUserUsingPOSTCall(AuthDTO authDTO, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = authDTO;

        // create path and map variables
        String localVarPath = "/auth/login";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authenticateUserUsingPOSTValidateBeforeCall(AuthDTO authDTO, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = authenticateUserUsingPOSTCall(authDTO, _callback);
        return localVarCall;

    }

    /**
     * Login
     * Login to the application
     * @param authDTO  (optional)
     * @return LoginDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public LoginDTO authenticateUserUsingPOST(AuthDTO authDTO) throws ApiException {
        ApiResponse<LoginDTO> localVarResp = authenticateUserUsingPOSTWithHttpInfo(authDTO);
        return localVarResp.getData();
    }

    /**
     * Login
     * Login to the application
     * @param authDTO  (optional)
     * @return ApiResponse&lt;LoginDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LoginDTO> authenticateUserUsingPOSTWithHttpInfo(AuthDTO authDTO) throws ApiException {
        okhttp3.Call localVarCall = authenticateUserUsingPOSTValidateBeforeCall(authDTO, null);
        Type localVarReturnType = new TypeToken<LoginDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Login (asynchronously)
     * Login to the application
     * @param authDTO  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticateUserUsingPOSTAsync(AuthDTO authDTO, final ApiCallback<LoginDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = authenticateUserUsingPOSTValidateBeforeCall(authDTO, _callback);
        Type localVarReturnType = new TypeToken<LoginDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for registerUserUsingPOST
     * @param apartment  (optional)
     * @param city  (optional)
     * @param dob  (optional)
     * @param email  (optional)
     * @param fname  (optional)
     * @param imageURL  (optional)
     * @param lname  (optional)
     * @param password  (optional)
     * @param phone  (optional)
     * @param role  (optional)
     * @param state  (optional)
     * @param street  (optional)
     * @param zip  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Successfully created an account </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerUserUsingPOSTCall(String apartment, String city, LocalDate dob, String email, String fname, File imageURL, String lname, String password, String phone, String role, String state, String street, String zip, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/register";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (apartment != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apartment", apartment));
        }

        if (city != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("city", city));
        }

        if (dob != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dob", dob));
        }

        if (email != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("email", email));
        }

        if (fname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fname", fname));
        }

        if (imageURL != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("imageURL", imageURL));
        }

        if (lname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lname", lname));
        }

        if (password != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("password", password));
        }

        if (phone != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("phone", phone));
        }

        if (role != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("role", role));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

        if (street != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("street", street));
        }

        if (zip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("zip", zip));
        }

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registerUserUsingPOSTValidateBeforeCall(String apartment, String city, LocalDate dob, String email, String fname, File imageURL, String lname, String password, String phone, String role, String state, String street, String zip, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = registerUserUsingPOSTCall(apartment, city, dob, email, fname, imageURL, lname, password, phone, role, state, street, zip, _callback);
        return localVarCall;

    }

    /**
     * Register
     * Register to the application
     * @param apartment  (optional)
     * @param city  (optional)
     * @param dob  (optional)
     * @param email  (optional)
     * @param fname  (optional)
     * @param imageURL  (optional)
     * @param lname  (optional)
     * @param password  (optional)
     * @param phone  (optional)
     * @param role  (optional)
     * @param state  (optional)
     * @param street  (optional)
     * @param zip  (optional)
     * @return UserDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Successfully created an account </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public UserDTO registerUserUsingPOST(String apartment, String city, LocalDate dob, String email, String fname, File imageURL, String lname, String password, String phone, String role, String state, String street, String zip) throws ApiException {
        ApiResponse<UserDTO> localVarResp = registerUserUsingPOSTWithHttpInfo(apartment, city, dob, email, fname, imageURL, lname, password, phone, role, state, street, zip);
        return localVarResp.getData();
    }

    /**
     * Register
     * Register to the application
     * @param apartment  (optional)
     * @param city  (optional)
     * @param dob  (optional)
     * @param email  (optional)
     * @param fname  (optional)
     * @param imageURL  (optional)
     * @param lname  (optional)
     * @param password  (optional)
     * @param phone  (optional)
     * @param role  (optional)
     * @param state  (optional)
     * @param street  (optional)
     * @param zip  (optional)
     * @return ApiResponse&lt;UserDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Successfully created an account </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDTO> registerUserUsingPOSTWithHttpInfo(String apartment, String city, LocalDate dob, String email, String fname, File imageURL, String lname, String password, String phone, String role, String state, String street, String zip) throws ApiException {
        okhttp3.Call localVarCall = registerUserUsingPOSTValidateBeforeCall(apartment, city, dob, email, fname, imageURL, lname, password, phone, role, state, street, zip, null);
        Type localVarReturnType = new TypeToken<UserDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Register (asynchronously)
     * Register to the application
     * @param apartment  (optional)
     * @param city  (optional)
     * @param dob  (optional)
     * @param email  (optional)
     * @param fname  (optional)
     * @param imageURL  (optional)
     * @param lname  (optional)
     * @param password  (optional)
     * @param phone  (optional)
     * @param role  (optional)
     * @param state  (optional)
     * @param street  (optional)
     * @param zip  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Successfully created an account </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerUserUsingPOSTAsync(String apartment, String city, LocalDate dob, String email, String fname, File imageURL, String lname, String password, String phone, String role, String state, String street, String zip, final ApiCallback<UserDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerUserUsingPOSTValidateBeforeCall(apartment, city, dob, email, fname, imageURL, lname, password, phone, role, state, street, zip, _callback);
        Type localVarReturnType = new TypeToken<UserDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for resetPasswordUsingPOST
     * @param authDTO  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully reset password </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resetPasswordUsingPOSTCall(AuthDTO authDTO, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = authDTO;

        // create path and map variables
        String localVarPath = "/auth/reset-password";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resetPasswordUsingPOSTValidateBeforeCall(AuthDTO authDTO, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = resetPasswordUsingPOSTCall(authDTO, _callback);
        return localVarCall;

    }

    /**
     * Reset password
     * 
     * @param authDTO  (optional)
     * @return Map&lt;String, String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully reset password </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, String> resetPasswordUsingPOST(AuthDTO authDTO) throws ApiException {
        ApiResponse<Map<String, String>> localVarResp = resetPasswordUsingPOSTWithHttpInfo(authDTO);
        return localVarResp.getData();
    }

    /**
     * Reset password
     * 
     * @param authDTO  (optional)
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully reset password </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, String>> resetPasswordUsingPOSTWithHttpInfo(AuthDTO authDTO) throws ApiException {
        okhttp3.Call localVarCall = resetPasswordUsingPOSTValidateBeforeCall(authDTO, null);
        Type localVarReturnType = new TypeToken<Map<String, String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Reset password (asynchronously)
     * 
     * @param authDTO  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully reset password </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resetPasswordUsingPOSTAsync(AuthDTO authDTO, final ApiCallback<Map<String, String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = resetPasswordUsingPOSTValidateBeforeCall(authDTO, _callback);
        Type localVarReturnType = new TypeToken<Map<String, String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
