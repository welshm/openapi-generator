package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OuterComposite
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OuterComposite   {

  @JsonProperty("my_number")
  private Optional<BigDecimal> myNumber;

  @JsonProperty("my_string")
  private Optional<String> myString;

  @JsonProperty("my_boolean")
  private Optional<Boolean> myBoolean;

  public OuterComposite myNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
    return this;
  }

  /**
   * Get myNumber
   * @return myNumber
  */
  @Valid 
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "my_number", required = false)
  public Optional<BigDecimal> getMyNumber() {
    return Optional.ofNullable(myNumber);
  }

  public void setMyNumber(Optional<BigDecimal> myNumber) {
    this.myNumber = myNumber;
  }

  public OuterComposite myString(String myString) {
    this.myString = myString;
    return this;
  }

  /**
   * Get myString
   * @return myString
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "my_string", required = false)
  public Optional<String> getMyString() {
    return Optional.ofNullable(myString);
  }

  public void setMyString(Optional<String> myString) {
    this.myString = myString;
  }

  public OuterComposite myBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
    return this;
  }

  /**
   * Get myBoolean
   * @return myBoolean
  */
  
  // Rely on the @JsonProperty annotation on the variable and ignore the getter methods.
  @JsonIgnore
  @Schema(name = "my_boolean", required = false)
  public Optional<Boolean> getMyBoolean() {
    return Optional.ofNullable(myBoolean);
  }

  public void setMyBoolean(Optional<Boolean> myBoolean) {
    this.myBoolean = myBoolean;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(this.myNumber, outerComposite.myNumber) &&
        Objects.equals(this.myString, outerComposite.myString) &&
        Objects.equals(this.myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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

