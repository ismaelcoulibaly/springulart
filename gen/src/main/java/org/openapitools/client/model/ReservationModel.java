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
import org.openapitools.client.model.HaircutModel;
import org.openapitools.client.model.LocationModel;
import org.openapitools.client.model.ReservationTimeModel;
import org.openapitools.client.model.UserModel;
import org.threeten.bp.LocalDate;

/**
 * ReservationModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-04T16:51:53.605532400-04:00[America/New_York]")
public class ReservationModel {
  public static final String SERIALIZED_NAME_BARBER = "barber";
  @SerializedName(SERIALIZED_NAME_BARBER)
  private UserModel barber;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private UserModel client;

  public static final String SERIALIZED_NAME_HAIRCUT = "haircut";
  @SerializedName(SERIALIZED_NAME_HAIRCUT)
  private HaircutModel haircut;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationModel location;

  public static final String SERIALIZED_NAME_RESERVATION_DATE = "reservationDate";
  @SerializedName(SERIALIZED_NAME_RESERVATION_DATE)
  private LocalDate reservationDate;

  public static final String SERIALIZED_NAME_RESERVATION_TIME = "reservationTime";
  @SerializedName(SERIALIZED_NAME_RESERVATION_TIME)
  private ReservationTimeModel reservationTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public ReservationModel barber(UserModel barber) {
    
    this.barber = barber;
    return this;
  }

   /**
   * Get barber
   * @return barber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserModel getBarber() {
    return barber;
  }


  public void setBarber(UserModel barber) {
    this.barber = barber;
  }


  public ReservationModel client(UserModel client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserModel getClient() {
    return client;
  }


  public void setClient(UserModel client) {
    this.client = client;
  }


  public ReservationModel haircut(HaircutModel haircut) {
    
    this.haircut = haircut;
    return this;
  }

   /**
   * Get haircut
   * @return haircut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HaircutModel getHaircut() {
    return haircut;
  }


  public void setHaircut(HaircutModel haircut) {
    this.haircut = haircut;
  }


  public ReservationModel id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ReservationModel location(LocationModel location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationModel getLocation() {
    return location;
  }


  public void setLocation(LocationModel location) {
    this.location = location;
  }


  public ReservationModel reservationDate(LocalDate reservationDate) {
    
    this.reservationDate = reservationDate;
    return this;
  }

   /**
   * Get reservationDate
   * @return reservationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getReservationDate() {
    return reservationDate;
  }


  public void setReservationDate(LocalDate reservationDate) {
    this.reservationDate = reservationDate;
  }


  public ReservationModel reservationTime(ReservationTimeModel reservationTime) {
    
    this.reservationTime = reservationTime;
    return this;
  }

   /**
   * Get reservationTime
   * @return reservationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReservationTimeModel getReservationTime() {
    return reservationTime;
  }


  public void setReservationTime(ReservationTimeModel reservationTime) {
    this.reservationTime = reservationTime;
  }


  public ReservationModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationModel reservationModel = (ReservationModel) o;
    return Objects.equals(this.barber, reservationModel.barber) &&
        Objects.equals(this.client, reservationModel.client) &&
        Objects.equals(this.haircut, reservationModel.haircut) &&
        Objects.equals(this.id, reservationModel.id) &&
        Objects.equals(this.location, reservationModel.location) &&
        Objects.equals(this.reservationDate, reservationModel.reservationDate) &&
        Objects.equals(this.reservationTime, reservationModel.reservationTime) &&
        Objects.equals(this.status, reservationModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barber, client, haircut, id, location, reservationDate, reservationTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationModel {\n");
    sb.append("    barber: ").append(toIndentedString(barber)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    haircut: ").append(toIndentedString(haircut)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reservationDate: ").append(toIndentedString(reservationDate)).append("\n");
    sb.append("    reservationTime: ").append(toIndentedString(reservationTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

