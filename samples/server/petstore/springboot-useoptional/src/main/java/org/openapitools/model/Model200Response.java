package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Model for testing model name starting with number
 */

@ApiModel(description = "Model for testing model name starting with number")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Model200Response   {

  @JsonProperty("name")
  private Optional<Integer> name;

  @JsonProperty("class")
  private Optional<String> propertyClass;

  public Model200Response name(Integer name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<Integer> getName() {
    return Optional.ofNullable(name);
  }

  public void setName(Optional<Integer> name) {
    this.name = name;
  }

  public Model200Response propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<String> getPropertyClass() {
    return Optional.ofNullable(propertyClass);
  }

  public void setPropertyClass(Optional<String> propertyClass) {
    this.propertyClass = propertyClass;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model200Response _200response = (Model200Response) o;
    return Objects.equals(this.name, _200response.name) &&
        Objects.equals(this.propertyClass, _200response.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

