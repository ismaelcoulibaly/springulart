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
import org.openapitools.client.model.SignupDTO;
import org.openapitools.client.model.UserDTOReq;
import org.openapitools.client.model.UserDTORes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserManagementControllerApi
 */
@Ignore
public class UserManagementControllerApiTest {

    private final UserManagementControllerApi api = new UserManagementControllerApi();

    
    /**
     * Delete a user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteUserUsingDELETE(id);

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
    public void getUserUsingGET1Test() throws ApiException {
        Long id = null;
        UserDTORes response = api.getUserUsingGET1(id);

        // TODO: test validations
    }
    
    /**
     * Get all users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersUsingGETTest() throws ApiException {
        List<UserDTORes> response = api.getUsersUsingGET();

        // TODO: test validations
    }
    
    /**
     * Create a new user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerNewUserUsingPOSTTest() throws ApiException {
        SignupDTO signupDTO = null;
        UserDTORes response = api.registerNewUserUsingPOST(signupDTO);

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
    public void updateUserUsingPUT1Test() throws ApiException {
        Long id = null;
        UserDTOReq userDTOReq = null;
        UserDTORes response = api.updateUserUsingPUT1(id, userDTOReq);

        // TODO: test validations
    }
    
}
