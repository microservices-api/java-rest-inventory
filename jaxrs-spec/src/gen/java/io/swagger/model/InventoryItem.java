package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class InventoryItem   {
  
  private String sku = null;
  private String name = null;

  /**
   **/
  public InventoryItem sku(String sku) {
    this.sku = sku;
    return this;
  }

  
  @ApiModelProperty(example = "abc123-xyz", required = true, value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   **/
  public InventoryItem name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "macbook", required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItem inventoryItem = (InventoryItem) o;
    return Objects.equals(sku, inventoryItem.sku) &&
        Objects.equals(name, inventoryItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItem {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
