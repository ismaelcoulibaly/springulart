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
import org.openapitools.client.model.HaircutDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HaircutConsultationApi
 */
@Ignore
public class HaircutConsultationApiTest {

    private final HaircutConsultationApi api = new HaircutConsultationApi();

    
    /**
     * Get haircut by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHaircutUsingGETTest() throws ApiException {
        String id = null;
        HaircutDTO response = api.getHaircutUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Get all haircuts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHaircutsUsingGETTest() throws ApiException {
        List<HaircutDTO> response = api.getHaircutsUsingGET();

        // TODO: test validations
    }
    
}
