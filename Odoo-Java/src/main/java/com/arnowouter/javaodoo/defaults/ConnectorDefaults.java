/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arnowouter.javaodoo.defaults;

/**
 *
 * @author Arno
 */
public class ConnectorDefaults {

    // ERRORS
    public static final String ERROR_XML_RPC = "XML-RPC error";    
    public static final String ERROR_MALFORMED_URL = "Malformed URL Exception";
    public static final String ERROR_UNEXPECTED = "Unexpected Error";
    
    // ENDPOINTS
    public static final String COMMON_ENDPOINT = "/xmlrpc/2/common";
    public static final String OBJECT_ENDPOINT = "/xmlrpc/2/object";
    
    // RPC FUNCTIONS
    public static final String EXECUTE = "execute_kw";
    
    // ACTIONS
    public final static String ACTION_AUTHENTICATE = "authenticate";
    public final static String ACTION_VERSION_INFO = "version";
    public final static String ACTION_SEARCH = "search";
    public final static String ACTION_READ = "read";
    public final static String ACTION_SEARCH_READ = "search_read";
    public final static String ACTION_CREATE_RECORD = "create";
    public final static String ACTION_UPDATE_LOCATION = "geo_localize";
    
    public final static String PROTOCOL_HTTP = "http";
    public final static String PROTOCOL_HTTPS = "https";
    
    // OTHER
    public final static int ODOO_DEFAULT_PORT = 8080;
    public final static int DEFAULT_HTTP_PORT = 80;
    public final static int DEFAULT_HTTPS_PORT = 443;
    public final static String ODOO_FIELDS = "fields";
}
