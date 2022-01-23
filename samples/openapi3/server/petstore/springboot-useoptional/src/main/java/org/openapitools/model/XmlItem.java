package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * XmlItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class XmlItem   {

  @JsonProperty("attribute_string")
  private Optional<String> attributeString;

  @JsonProperty("attribute_number")
  private Optional<BigDecimal> attributeNumber;

  @JsonProperty("attribute_integer")
  private Optional<Integer> attributeInteger;

  @JsonProperty("attribute_boolean")
  private Optional<Boolean> attributeBoolean;

  @JsonProperty("wrapped_array")
  @Valid
  private Optional<List<Integer>> wrappedArray = null;

  @JsonProperty("name_string")
  private Optional<String> nameString;

  @JsonProperty("name_number")
  private Optional<BigDecimal> nameNumber;

  @JsonProperty("name_integer")
  private Optional<Integer> nameInteger;

  @JsonProperty("name_boolean")
  private Optional<Boolean> nameBoolean;

  @JsonProperty("name_array")
  @Valid
  private Optional<List<Integer>> nameArray = null;

  @JsonProperty("name_wrapped_array")
  @Valid
  private Optional<List<Integer>> nameWrappedArray = null;

  @JsonProperty("prefix_string")
  private Optional<String> prefixString;

  @JsonProperty("prefix_number")
  private Optional<BigDecimal> prefixNumber;

  @JsonProperty("prefix_integer")
  private Optional<Integer> prefixInteger;

  @JsonProperty("prefix_boolean")
  private Optional<Boolean> prefixBoolean;

  @JsonProperty("prefix_array")
  @Valid
  private Optional<List<Integer>> prefixArray = null;

  @JsonProperty("prefix_wrapped_array")
  @Valid
  private Optional<List<Integer>> prefixWrappedArray = null;

  @JsonProperty("namespace_string")
  private Optional<String> namespaceString;

  @JsonProperty("namespace_number")
  private Optional<BigDecimal> namespaceNumber;

  @JsonProperty("namespace_integer")
  private Optional<Integer> namespaceInteger;

  @JsonProperty("namespace_boolean")
  private Optional<Boolean> namespaceBoolean;

  @JsonProperty("namespace_array")
  @Valid
  private Optional<List<Integer>> namespaceArray = null;

  @JsonProperty("namespace_wrapped_array")
  @Valid
  private Optional<List<Integer>> namespaceWrappedArray = null;

  @JsonProperty("prefix_ns_string")
  private Optional<String> prefixNsString;

  @JsonProperty("prefix_ns_number")
  private Optional<BigDecimal> prefixNsNumber;

  @JsonProperty("prefix_ns_integer")
  private Optional<Integer> prefixNsInteger;

  @JsonProperty("prefix_ns_boolean")
  private Optional<Boolean> prefixNsBoolean;

  @JsonProperty("prefix_ns_array")
  @Valid
  private Optional<List<Integer>> prefixNsArray = null;

  @JsonProperty("prefix_ns_wrapped_array")
  @Valid
  private Optional<List<Integer>> prefixNsWrappedArray = null;

  public XmlItem attributeString(String attributeString) {
    this.attributeString = attributeString;
    return this;
  }

  /**
   * Get attributeString
   * @return attributeString
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "attribute_string", example = "string", required = false)
  public Optional<String> getAttributeString() {
    return Optional.ofNullable(attributeString);
  }

  public void setAttributeString(Optional<String> attributeString) {
    this.attributeString = attributeString;
  }

  public XmlItem attributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
    return this;
  }

  /**
   * Get attributeNumber
   * @return attributeNumber
  */
  @Valid 
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "attribute_number", example = "1.234", required = false)
  public Optional<BigDecimal> getAttributeNumber() {
    return Optional.ofNullable(attributeNumber);
  }

  public void setAttributeNumber(Optional<BigDecimal> attributeNumber) {
    this.attributeNumber = attributeNumber;
  }

  public XmlItem attributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
    return this;
  }

  /**
   * Get attributeInteger
   * @return attributeInteger
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "attribute_integer", example = "-2", required = false)
  public Optional<Integer> getAttributeInteger() {
    return Optional.ofNullable(attributeInteger);
  }

  public void setAttributeInteger(Optional<Integer> attributeInteger) {
    this.attributeInteger = attributeInteger;
  }

  public XmlItem attributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
    return this;
  }

  /**
   * Get attributeBoolean
   * @return attributeBoolean
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "attribute_boolean", example = "true", required = false)
  public Optional<Boolean> getAttributeBoolean() {
    return Optional.ofNullable(attributeBoolean);
  }

  public void setAttributeBoolean(Optional<Boolean> attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }

  public XmlItem wrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
    return this;
  }

  public XmlItem addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }
    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

  /**
   * Get wrappedArray
   * @return wrappedArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "wrapped_array", required = false)
  public Optional<List<Integer>> getWrappedArray() {
    return Optional.ofNullable(wrappedArray);
  }

  public void setWrappedArray(Optional<List<Integer>> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }

  public XmlItem nameString(String nameString) {
    this.nameString = nameString;
    return this;
  }

  /**
   * Get nameString
   * @return nameString
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "name_string", example = "string", required = false)
  public Optional<String> getNameString() {
    return Optional.ofNullable(nameString);
  }

  public void setNameString(Optional<String> nameString) {
    this.nameString = nameString;
  }

  public XmlItem nameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
    return this;
  }

  /**
   * Get nameNumber
   * @return nameNumber
  */
  @Valid 
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "name_number", example = "1.234", required = false)
  public Optional<BigDecimal> getNameNumber() {
    return Optional.ofNullable(nameNumber);
  }

  public void setNameNumber(Optional<BigDecimal> nameNumber) {
    this.nameNumber = nameNumber;
  }

  public XmlItem nameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
    return this;
  }

  /**
   * Get nameInteger
   * @return nameInteger
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "name_integer", example = "-2", required = false)
  public Optional<Integer> getNameInteger() {
    return Optional.ofNullable(nameInteger);
  }

  public void setNameInteger(Optional<Integer> nameInteger) {
    this.nameInteger = nameInteger;
  }

  public XmlItem nameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
    return this;
  }

  /**
   * Get nameBoolean
   * @return nameBoolean
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "name_boolean", example = "true", required = false)
  public Optional<Boolean> getNameBoolean() {
    return Optional.ofNullable(nameBoolean);
  }

  public void setNameBoolean(Optional<Boolean> nameBoolean) {
    this.nameBoolean = nameBoolean;
  }

  public XmlItem nameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
    return this;
  }

  public XmlItem addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }
    this.nameArray.add(nameArrayItem);
    return this;
  }

  /**
   * Get nameArray
   * @return nameArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "name_array", required = false)
  public Optional<List<Integer>> getNameArray() {
    return Optional.ofNullable(nameArray);
  }

  public void setNameArray(Optional<List<Integer>> nameArray) {
    this.nameArray = nameArray;
  }

  public XmlItem nameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

  public XmlItem addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }
    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

  /**
   * Get nameWrappedArray
   * @return nameWrappedArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "name_wrapped_array", required = false)
  public Optional<List<Integer>> getNameWrappedArray() {
    return Optional.ofNullable(nameWrappedArray);
  }

  public void setNameWrappedArray(Optional<List<Integer>> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }

  public XmlItem prefixString(String prefixString) {
    this.prefixString = prefixString;
    return this;
  }

  /**
   * Get prefixString
   * @return prefixString
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_string", example = "string", required = false)
  public Optional<String> getPrefixString() {
    return Optional.ofNullable(prefixString);
  }

  public void setPrefixString(Optional<String> prefixString) {
    this.prefixString = prefixString;
  }

  public XmlItem prefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  /**
   * Get prefixNumber
   * @return prefixNumber
  */
  @Valid 
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_number", example = "1.234", required = false)
  public Optional<BigDecimal> getPrefixNumber() {
    return Optional.ofNullable(prefixNumber);
  }

  public void setPrefixNumber(Optional<BigDecimal> prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public XmlItem prefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
    return this;
  }

  /**
   * Get prefixInteger
   * @return prefixInteger
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_integer", example = "-2", required = false)
  public Optional<Integer> getPrefixInteger() {
    return Optional.ofNullable(prefixInteger);
  }

  public void setPrefixInteger(Optional<Integer> prefixInteger) {
    this.prefixInteger = prefixInteger;
  }

  public XmlItem prefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
    return this;
  }

  /**
   * Get prefixBoolean
   * @return prefixBoolean
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_boolean", example = "true", required = false)
  public Optional<Boolean> getPrefixBoolean() {
    return Optional.ofNullable(prefixBoolean);
  }

  public void setPrefixBoolean(Optional<Boolean> prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }

  public XmlItem prefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
    return this;
  }

  public XmlItem addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }
    this.prefixArray.add(prefixArrayItem);
    return this;
  }

  /**
   * Get prefixArray
   * @return prefixArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_array", required = false)
  public Optional<List<Integer>> getPrefixArray() {
    return Optional.ofNullable(prefixArray);
  }

  public void setPrefixArray(Optional<List<Integer>> prefixArray) {
    this.prefixArray = prefixArray;
  }

  public XmlItem prefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

  public XmlItem addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }
    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixWrappedArray
   * @return prefixWrappedArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_wrapped_array", required = false)
  public Optional<List<Integer>> getPrefixWrappedArray() {
    return Optional.ofNullable(prefixWrappedArray);
  }

  public void setPrefixWrappedArray(Optional<List<Integer>> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }

  public XmlItem namespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
    return this;
  }

  /**
   * Get namespaceString
   * @return namespaceString
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "namespace_string", example = "string", required = false)
  public Optional<String> getNamespaceString() {
    return Optional.ofNullable(namespaceString);
  }

  public void setNamespaceString(Optional<String> namespaceString) {
    this.namespaceString = namespaceString;
  }

  public XmlItem namespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
    return this;
  }

  /**
   * Get namespaceNumber
   * @return namespaceNumber
  */
  @Valid 
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "namespace_number", example = "1.234", required = false)
  public Optional<BigDecimal> getNamespaceNumber() {
    return Optional.ofNullable(namespaceNumber);
  }

  public void setNamespaceNumber(Optional<BigDecimal> namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }

  public XmlItem namespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
    return this;
  }

  /**
   * Get namespaceInteger
   * @return namespaceInteger
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "namespace_integer", example = "-2", required = false)
  public Optional<Integer> getNamespaceInteger() {
    return Optional.ofNullable(namespaceInteger);
  }

  public void setNamespaceInteger(Optional<Integer> namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }

  public XmlItem namespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

  /**
   * Get namespaceBoolean
   * @return namespaceBoolean
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "namespace_boolean", example = "true", required = false)
  public Optional<Boolean> getNamespaceBoolean() {
    return Optional.ofNullable(namespaceBoolean);
  }

  public void setNamespaceBoolean(Optional<Boolean> namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }

  public XmlItem namespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
    return this;
  }

  public XmlItem addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }
    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

  /**
   * Get namespaceArray
   * @return namespaceArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "namespace_array", required = false)
  public Optional<List<Integer>> getNamespaceArray() {
    return Optional.ofNullable(namespaceArray);
  }

  public void setNamespaceArray(Optional<List<Integer>> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }

  public XmlItem namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

  public XmlItem addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }
    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

  /**
   * Get namespaceWrappedArray
   * @return namespaceWrappedArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "namespace_wrapped_array", required = false)
  public Optional<List<Integer>> getNamespaceWrappedArray() {
    return Optional.ofNullable(namespaceWrappedArray);
  }

  public void setNamespaceWrappedArray(Optional<List<Integer>> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }

  public XmlItem prefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
    return this;
  }

  /**
   * Get prefixNsString
   * @return prefixNsString
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_ns_string", example = "string", required = false)
  public Optional<String> getPrefixNsString() {
    return Optional.ofNullable(prefixNsString);
  }

  public void setPrefixNsString(Optional<String> prefixNsString) {
    this.prefixNsString = prefixNsString;
  }

  public XmlItem prefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

  /**
   * Get prefixNsNumber
   * @return prefixNsNumber
  */
  @Valid 
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_ns_number", example = "1.234", required = false)
  public Optional<BigDecimal> getPrefixNsNumber() {
    return Optional.ofNullable(prefixNsNumber);
  }

  public void setPrefixNsNumber(Optional<BigDecimal> prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }

  public XmlItem prefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

  /**
   * Get prefixNsInteger
   * @return prefixNsInteger
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_ns_integer", example = "-2", required = false)
  public Optional<Integer> getPrefixNsInteger() {
    return Optional.ofNullable(prefixNsInteger);
  }

  public void setPrefixNsInteger(Optional<Integer> prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }

  public XmlItem prefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

  /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_ns_boolean", example = "true", required = false)
  public Optional<Boolean> getPrefixNsBoolean() {
    return Optional.ofNullable(prefixNsBoolean);
  }

  public void setPrefixNsBoolean(Optional<Boolean> prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }

  public XmlItem prefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
    return this;
  }

  public XmlItem addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }
    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

  /**
   * Get prefixNsArray
   * @return prefixNsArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_ns_array", required = false)
  public Optional<List<Integer>> getPrefixNsArray() {
    return Optional.ofNullable(prefixNsArray);
  }

  public void setPrefixNsArray(Optional<List<Integer>> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }

  public XmlItem prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

  public XmlItem addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }
    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixNsWrappedArray
   * @return prefixNsWrappedArray
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "prefix_ns_wrapped_array", required = false)
  public Optional<List<Integer>> getPrefixNsWrappedArray() {
    return Optional.ofNullable(prefixNsWrappedArray);
  }

  public void setPrefixNsWrappedArray(Optional<List<Integer>> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItem xmlItem = (XmlItem) o;
    return Objects.equals(this.attributeString, xmlItem.attributeString) &&
        Objects.equals(this.attributeNumber, xmlItem.attributeNumber) &&
        Objects.equals(this.attributeInteger, xmlItem.attributeInteger) &&
        Objects.equals(this.attributeBoolean, xmlItem.attributeBoolean) &&
        Objects.equals(this.wrappedArray, xmlItem.wrappedArray) &&
        Objects.equals(this.nameString, xmlItem.nameString) &&
        Objects.equals(this.nameNumber, xmlItem.nameNumber) &&
        Objects.equals(this.nameInteger, xmlItem.nameInteger) &&
        Objects.equals(this.nameBoolean, xmlItem.nameBoolean) &&
        Objects.equals(this.nameArray, xmlItem.nameArray) &&
        Objects.equals(this.nameWrappedArray, xmlItem.nameWrappedArray) &&
        Objects.equals(this.prefixString, xmlItem.prefixString) &&
        Objects.equals(this.prefixNumber, xmlItem.prefixNumber) &&
        Objects.equals(this.prefixInteger, xmlItem.prefixInteger) &&
        Objects.equals(this.prefixBoolean, xmlItem.prefixBoolean) &&
        Objects.equals(this.prefixArray, xmlItem.prefixArray) &&
        Objects.equals(this.prefixWrappedArray, xmlItem.prefixWrappedArray) &&
        Objects.equals(this.namespaceString, xmlItem.namespaceString) &&
        Objects.equals(this.namespaceNumber, xmlItem.namespaceNumber) &&
        Objects.equals(this.namespaceInteger, xmlItem.namespaceInteger) &&
        Objects.equals(this.namespaceBoolean, xmlItem.namespaceBoolean) &&
        Objects.equals(this.namespaceArray, xmlItem.namespaceArray) &&
        Objects.equals(this.namespaceWrappedArray, xmlItem.namespaceWrappedArray) &&
        Objects.equals(this.prefixNsString, xmlItem.prefixNsString) &&
        Objects.equals(this.prefixNsNumber, xmlItem.prefixNsNumber) &&
        Objects.equals(this.prefixNsInteger, xmlItem.prefixNsInteger) &&
        Objects.equals(this.prefixNsBoolean, xmlItem.prefixNsBoolean) &&
        Objects.equals(this.prefixNsArray, xmlItem.prefixNsArray) &&
        Objects.equals(this.prefixNsWrappedArray, xmlItem.prefixNsWrappedArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeString, attributeNumber, attributeInteger, attributeBoolean, wrappedArray, nameString, nameNumber, nameInteger, nameBoolean, nameArray, nameWrappedArray, prefixString, prefixNumber, prefixInteger, prefixBoolean, prefixArray, prefixWrappedArray, namespaceString, namespaceNumber, namespaceInteger, namespaceBoolean, namespaceArray, namespaceWrappedArray, prefixNsString, prefixNsNumber, prefixNsInteger, prefixNsBoolean, prefixNsArray, prefixNsWrappedArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlItem {\n");
    sb.append("    attributeString: ").append(toIndentedString(attributeString)).append("\n");
    sb.append("    attributeNumber: ").append(toIndentedString(attributeNumber)).append("\n");
    sb.append("    attributeInteger: ").append(toIndentedString(attributeInteger)).append("\n");
    sb.append("    attributeBoolean: ").append(toIndentedString(attributeBoolean)).append("\n");
    sb.append("    wrappedArray: ").append(toIndentedString(wrappedArray)).append("\n");
    sb.append("    nameString: ").append(toIndentedString(nameString)).append("\n");
    sb.append("    nameNumber: ").append(toIndentedString(nameNumber)).append("\n");
    sb.append("    nameInteger: ").append(toIndentedString(nameInteger)).append("\n");
    sb.append("    nameBoolean: ").append(toIndentedString(nameBoolean)).append("\n");
    sb.append("    nameArray: ").append(toIndentedString(nameArray)).append("\n");
    sb.append("    nameWrappedArray: ").append(toIndentedString(nameWrappedArray)).append("\n");
    sb.append("    prefixString: ").append(toIndentedString(prefixString)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    prefixInteger: ").append(toIndentedString(prefixInteger)).append("\n");
    sb.append("    prefixBoolean: ").append(toIndentedString(prefixBoolean)).append("\n");
    sb.append("    prefixArray: ").append(toIndentedString(prefixArray)).append("\n");
    sb.append("    prefixWrappedArray: ").append(toIndentedString(prefixWrappedArray)).append("\n");
    sb.append("    namespaceString: ").append(toIndentedString(namespaceString)).append("\n");
    sb.append("    namespaceNumber: ").append(toIndentedString(namespaceNumber)).append("\n");
    sb.append("    namespaceInteger: ").append(toIndentedString(namespaceInteger)).append("\n");
    sb.append("    namespaceBoolean: ").append(toIndentedString(namespaceBoolean)).append("\n");
    sb.append("    namespaceArray: ").append(toIndentedString(namespaceArray)).append("\n");
    sb.append("    namespaceWrappedArray: ").append(toIndentedString(namespaceWrappedArray)).append("\n");
    sb.append("    prefixNsString: ").append(toIndentedString(prefixNsString)).append("\n");
    sb.append("    prefixNsNumber: ").append(toIndentedString(prefixNsNumber)).append("\n");
    sb.append("    prefixNsInteger: ").append(toIndentedString(prefixNsInteger)).append("\n");
    sb.append("    prefixNsBoolean: ").append(toIndentedString(prefixNsBoolean)).append("\n");
    sb.append("    prefixNsArray: ").append(toIndentedString(prefixNsArray)).append("\n");
    sb.append("    prefixNsWrappedArray: ").append(toIndentedString(prefixNsWrappedArray)).append("\n");
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

