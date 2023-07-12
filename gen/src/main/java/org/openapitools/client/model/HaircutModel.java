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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.ReservationModel;

/**
 * HaircutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-04T16:51:53.605532400-04:00[America/New_York]")
public class HaircutModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ESTIMATED_TIME = "estimatedTime";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_TIME)
  private String estimatedTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_U_R_L = "imageURL";
  @SerializedName(SERIALIZED_NAME_IMAGE_U_R_L)
  private String imageURL;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_RESERVATION_MODEL = "reservationModel";
  @SerializedName(SERIALIZED_NAME_RESERVATION_MODEL)
  private Set<ReservationModel> reservationModel = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;


  public HaircutModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public HaircutModel estimatedTime(String estimatedTime) {
    
    this.estimatedTime = estimatedTime;
    return this;
  }

   /**
   * Get estimatedTime
   * @return estimatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEstimatedTime() {
    return estimatedTime;
  }


  public void setEstimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
  }


  public HaircutModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public HaircutModel imageURL(String imageURL) {
    
    this.imageURL = imageURL;
    return this;
  }

   /**
   * Get imageURL
   * @return imageURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageURL() {
    return imageURL;
  }


  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }


  public HaircutModel price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public HaircutModel reservationModel(Set<ReservationModel> reservationModel) {
    
    this.reservationModel = reservationModel;
    return this;
  }

  public HaircutModel addReservationModelItem(ReservationModel reservationModelItem) {
    if (this.reservationModel == null) {
      this.reservationModel = new LinkedHashSet<ReservationModel>();
    }
    this.reservationModel.add(reservationModelItem);
    return this;
  }

   /**
   * Get reservationModel
   * @return reservationModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<ReservationModel> getReservationModel() {
    return reservationModel;
  }


  public void setReservationModel(Set<ReservationModel> reservationModel) {
    this.reservationModel = reservationModel;
  }


  public HaircutModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HaircutModel haircutModel = (HaircutModel) o;
    return Objects.equals(this.description, haircutModel.description) &&
        Objects.equals(this.estimatedTime, haircutModel.estimatedTime) &&
        Objects.equals(this.id, haircutModel.id) &&
        Objects.equals(this.imageURL, haircutModel.imageURL) &&
        Objects.equals(this.price, haircutModel.price) &&
        Objects.equals(this.reservationModel, haircutModel.reservationModel) &&
        Objects.equals(this.title, haircutModel.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, estimatedTime, id, imageURL, price, reservationModel, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HaircutModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reservationModel: ").append(toIndentedString(reservationModel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
