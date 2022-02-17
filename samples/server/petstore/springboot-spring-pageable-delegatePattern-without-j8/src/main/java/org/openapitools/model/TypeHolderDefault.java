package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * TypeHolderDefault
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TypeHolderDefault   {

  @JsonProperty("string_item")
  private String stringItem = "what";

  @JsonProperty("number_item")
  private BigDecimal numberItem;

  @JsonProperty("integer_item")
  private Integer integerItem;

  @JsonProperty("bool_item")
  private Boolean boolItem = true;

  @JsonProperty("array_item")
  @Valid
  private List<Integer> arrayItem = new ArrayList<>();

  public TypeHolderDefault stringItem(String stringItem) {
    this.stringItem = stringItem;
    return this;
  }

  /**
   * Get stringItem
   * @return stringItem
  */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  public String getStringItem() {
    return stringItem;
  }

  public void setStringItemString stringItem) {
    this.stringItem = stringItem;
  }

  public TypeHolderDefault numberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
    return this;
  }

  /**
   * Get numberItem
   * @return numberItem
  */
  @NotNull @Valid 
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNumberItem() {
    return numberItem;
  }

  public void setNumberItemBigDecimal numberItem) {
    this.numberItem = numberItem;
  }

  public TypeHolderDefault integerItem(Integer integerItem) {
    this.integerItem = integerItem;
    return this;
  }

  /**
   * Get integerItem
   * @return integerItem
  */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  public Integer getIntegerItem() {
    return integerItem;
  }

  public void setIntegerItemInteger integerItem) {
    this.integerItem = integerItem;
  }

  public TypeHolderDefault boolItem(Boolean boolItem) {
    this.boolItem = boolItem;
    return this;
  }

  /**
   * Get boolItem
   * @return boolItem
  */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  public Boolean getBoolItem() {
    return boolItem;
  }

  public void setBoolItemBoolean boolItem) {
    this.boolItem = boolItem;
  }

  public TypeHolderDefault arrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
    return this;
  }

  public TypeHolderDefault addArrayItemItem(Integer arrayItemItem) {
    this.arrayItem.add(arrayItemItem);
    return this;
  }

  /**
   * Get arrayItem
   * @return arrayItem
  */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getArrayItem() {
    return arrayItem;
  }

  public void setArrayItemList<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderDefault typeHolderDefault = (TypeHolderDefault) o;
    return Objects.equals(this.stringItem, typeHolderDefault.stringItem) &&
        Objects.equals(this.numberItem, typeHolderDefault.numberItem) &&
        Objects.equals(this.integerItem, typeHolderDefault.integerItem) &&
        Objects.equals(this.boolItem, typeHolderDefault.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderDefault.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, integerItem, boolItem, arrayItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderDefault {\n");
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
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

