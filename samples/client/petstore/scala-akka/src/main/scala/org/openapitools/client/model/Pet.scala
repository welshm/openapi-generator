/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class Pet (
  id: Option[Long] = None,
  category: Option[Category] = None,
  name: String,
  photoUrls: Seq[String],
  tags: Option[Seq[Tag]] = None,
  /* pet status in the store */
  status: Option[PetEnums.Status] = None
) extends ApiModel

object PetEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val Available = Value("available")
    val Pending = Value("pending")
    val Sold = Value("sold")
  }

}
