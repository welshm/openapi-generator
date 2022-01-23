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
 * Capitalization
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Capitalization   {

  @JsonProperty("smallCamel")
  private Optional<String> smallCamel;

  @JsonProperty("CapitalCamel")
  private Optional<String> capitalCamel;

  @JsonProperty("small_Snake")
  private Optional<String> smallSnake;

  @JsonProperty("Capital_Snake")
  private Optional<String> capitalSnake;

  @JsonProperty("SCA_ETH_Flow_Points")
  private Optional<String> scAETHFlowPoints;

  @JsonProperty("ATT_NAME")
  private Optional<String> ATT_NAME;

  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

  /**
   * Get smallCamel
   * @return smallCamel
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<String> getSmallCamel() {
    return Optional.ofNullable(smallCamel);
  }

  public void setSmallCamel(Optional<String> smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

  /**
   * Get capitalCamel
   * @return capitalCamel
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<String> getCapitalCamel() {
    return Optional.ofNullable(capitalCamel);
  }

  public void setCapitalCamel(Optional<String> capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

  /**
   * Get smallSnake
   * @return smallSnake
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<String> getSmallSnake() {
    return Optional.ofNullable(smallSnake);
  }

  public void setSmallSnake(Optional<String> smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

  /**
   * Get capitalSnake
   * @return capitalSnake
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<String> getCapitalSnake() {
    return Optional.ofNullable(capitalSnake);
  }

  public void setCapitalSnake(Optional<String> capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

  /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "")
  public Optional<String> getScAETHFlowPoints() {
    return Optional.ofNullable(scAETHFlowPoints);
  }

  public void setScAETHFlowPoints(Optional<String> scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }

  /**
   * Name of the pet 
   * @return ATT_NAME
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @ApiModelProperty(value = "Name of the pet ")
  public Optional<String> getATTNAME() {
    return Optional.ofNullable(ATT_NAME);
  }

  public void setATTNAME(Optional<String> ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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

