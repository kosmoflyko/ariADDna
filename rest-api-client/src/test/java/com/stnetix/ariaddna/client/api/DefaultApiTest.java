/*
 * ariADDna API
 * #### This document contains the API description for ariADDna project. Using this API one can manage all available cloud services (DropBox, GDrive, Yandex.Disk etc.) from single point. 
 *
 * OpenAPI spec version: 1.0
 * Contact: ariaddna.support@stnetix.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.stnetix.ariaddna.client.api;

import com.stnetix.ariaddna.client.ApiException;
import com.stnetix.ariaddna.client.model.Cloud;
import com.stnetix.ariaddna.client.model.CloudSetPages;
import com.stnetix.ariaddna.client.model.Credential;
import org.joda.time.DateTime;
import com.stnetix.ariaddna.client.model.InitialAllocationModel;
import com.stnetix.ariaddna.client.model.Session;
import com.stnetix.ariaddna.client.model.StatisticSet;
import com.stnetix.ariaddna.client.model.User;
import com.stnetix.ariaddna.client.model.Vufs;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Allows one to add an external cloud account to an existing ariADDna&#39;s user. The User MUST be already registered at the cloud service to be added.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addExternalCloudAccountTest() throws ApiException {
        Cloud cloud = new Cloud();
        Cloud response = api.addExternalCloudAccount(cloud);
        //Check response is not null
        Assert.assertNotNull(response);
    }
    
    /**
     * 
     *
     * Allows one to create a new user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserTest() throws ApiException {
        User user = new User();
        User response = api.addUser(user);
        //check response is not null
        Assert.assertNotNull(response);
    }
    
    /**
     * 
     *
     * Creating new user session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authUserTest() throws ApiException {
        Credential user = new Credential();
        Session response = api.authUser(user);
        //check response is not null
        Assert.assertNotNull(response);
    }
    
    /**
     * 
     *
     * Changing user password.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeUserPasswordTest() throws ApiException {
        String userUuid = "user uuid";
        User user = new User();
        api.changeUserPassword(userUuid, user);

        // TODO: test validations
    }
    
    /**     *
     *
     * Allows to delete user&#39;s external cloud account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExternalCloudAccountTest() throws ApiException {
        String cloudUuid = "cloud uuid";
        String response = api.deleteExternalCloudAccount(cloudUuid);
        Assert.assertNotNull(response);
    }
    
    /**
     * 
     *
     * Deleting user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userUuid = "userUuid";
        api.deleteUser(userUuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * This operation allows one to get back information about certain user providing his UUID as a path parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findUserByUuidTest() throws ApiException {
        String userUuid = "userUuid";
        User response = api.findUserByUuid(userUuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to get statistic object about clouds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudStatisticSetTest() throws ApiException {
        String userUuid = "userUuid";
        StatisticSet response = api.getCloudStatisticSet(userUuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to get difference of previous snapshot and actual.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiffVUFSTest() throws ApiException {
        String userUuid = "userUuid";
        Long dateTime = System.currentTimeMillis();
        Vufs response = api.getDiffVUFS(userUuid, dateTime);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of clouds which a certain user has connected to his ariADDna account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalCloudAccountsTest() throws ApiException {
        String userUuid = "userUuid";
        CloudSetPages response = api.getExternalCloudAccounts(userUuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to get health-check statistic about users Clouds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHealthCheckStatTest() throws ApiException {
        String userUuid = "userUuid";
        StatisticSet response = api.getHealthCheckStat(userUuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to get snapshot vufs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVUFSTest() throws ApiException {
        String userUuid = "userUuid";
        Vufs response = api.getVUFS(userUuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Closing user session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutSessionTest() throws ApiException {
        String uuid = "userUuid";
        api.logoutSession(uuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to post file allocate strategy from client to server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAllocateModelTest() throws ApiException {
        String userUuid = "userUuid";
        InitialAllocationModel initialAllocationModel = new InitialAllocationModel();
        Vufs response = api.postAllocateModel(userUuid, initialAllocationModel);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to post statistic from client to server about clouds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCloudStatSetTest() throws ApiException {
        String userUuid = "userUuid";
        StatisticSet cloudStatisticSet = new StatisticSet();
        api.postCloudStatSet(userUuid, cloudStatisticSet);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Allows to send changes in local file storage to server with empty Allocation model and as response get Vufs object with Allocation model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendChangesInLFSTest() throws ApiException {
        Vufs localChanges = new Vufs();
        String userUuid = "userUuid";
        Vufs response = api.sendChangesInLFS(localChanges, userUuid);

        // TODO: test validations
    }
    
}
