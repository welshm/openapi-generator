<?php

/**
 * OpenAPI Petstore
 * PHP version 7.3
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

use OpenAPIServer\BaseModel;

/**
 * Order
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class Order extends BaseModel
{
    /**
     * @var string Models namespace.
     * Can be required for data deserialization when model contains referenced schemas.
     */
    protected const MODELS_NAMESPACE = '\OpenAPIServer\Model';

    /**
     * @var string Constant with OAS schema of current class.
     * Should be overwritten by inherited class.
     */
    protected const MODEL_SCHEMA = <<<'SCHEMA'
{
  "title" : "Pet Order",
  "type" : "object",
  "properties" : {
    "id" : {
      "type" : "integer",
      "format" : "int64"
    },
    "petId" : {
      "type" : "integer",
      "format" : "int64"
    },
    "quantity" : {
      "type" : "integer",
      "format" : "int32"
    },
    "shipDate" : {
      "type" : "string",
      "format" : "date-time"
    },
    "status" : {
      "type" : "string",
      "description" : "Order Status",
      "enum" : [ "placed", "approved", "delivered" ]
    },
    "complete" : {
      "type" : "boolean",
      "default" : false
    }
  },
  "description" : "An order for a pets from the pet store",
  "xml" : {
    "name" : "Order"
  }
}
SCHEMA;
}
