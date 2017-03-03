package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * A generalized error response which contains the product- specific error code and an identifier for cross-referencing in the error logs. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A generalized error response which contains the product- specific error code and an identifier for cross-referencing in the error logs. ")

public class GenericError   {
  
  private String code = null;
  private String message = null;
  private String errorId = null;

  /**
   * The error code which should be used for localized messaging to the end user 
   **/
  public GenericError code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "EE-877331", required = true, value = "The error code which should be used for localized messaging to the end user ")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public GenericError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "General error, contact please contact your support agent", required = true, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * An identifier used in the centralized log collection facility for cross-referencing and support follow-up 
   **/
  public GenericError errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

  
  @ApiModelProperty(example = "7c64cc53-0e80-47be-a5a4-f084c89d0521", value = "An identifier used in the centralized log collection facility for cross-referencing and support follow-up ")
  public String getErrorId() {
    return errorId;
  }
  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericError genericError = (GenericError) o;
    return Objects.equals(code, genericError.code) &&
        Objects.equals(message, genericError.message) &&
        Objects.equals(errorId, genericError.errorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, errorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
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
