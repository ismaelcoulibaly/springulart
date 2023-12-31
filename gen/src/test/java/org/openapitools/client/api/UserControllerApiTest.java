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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.UserDTOReq;
import org.openapitools.client.model.UserDTORes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserControllerApi
 */
@Ignore
public class UserControllerApiTest {

    private final UserControllerApi api = new UserControllerApi();

    
    /**
     * Delete a user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMyAccountUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteMyAccountUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Get a user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserUsingGETTest() throws ApiException {
        Long id = null;
        UserDTORes response = api.getUserUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Update a user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserUsingPUTTest() throws ApiException {
        Long id = null;
        UserDTOReq userDTOReq = null;
        UserDTORes response = api.updateUserUsingPUT(id, userDTOReq);

        // TODO: test validations
    }
    
}
