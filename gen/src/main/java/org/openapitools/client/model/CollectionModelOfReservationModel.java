/*
 * Springular REST API
 * Springular REST API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact:   
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.EmbeddedCollectionOfReservationModel;
import org.openapitools.client.model.Link;

/**
 * Resources of ReservationModel
 */
@ApiModel(description = "Resources of ReservationModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-04T16:51:53.605532400-04:00[America/New_York]")
public class CollectionModelOfReservationModel {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private EmbeddedCollectionOfReservationModel embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = new HashMap<String, Link>();


  public CollectionModelOfReservationModel embedded(EmbeddedCollectionOfReservationModel embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(required = true, value = "")

  public EmbeddedCollectionOfReservationModel getEmbedded() {
    return embedded;
  }


  public void setEmbedded(EmbeddedCollectionOfReservationModel embedded) {
    this.embedded = embedded;
  }


  public CollectionModelOfReservationModel links(Map<String, Link> links) {
    
    this.links = links;
    return this;
  }

  public CollectionModelOfReservationModel putLinksItem(String key, Link linksItem) {
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Link collection
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Link collection")

  public Map<String, Link> getLinks() {
    return links;
  }


  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionModelOfReservationModel collectionModelOfReservationModel = (CollectionModelOfReservationModel) o;
    return Objects.equals(this.embedded, collectionModelOfReservationModel.embedded) &&
        Objects.equals(this.links, collectionModelOfReservationModel.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionModelOfReservationModel {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

