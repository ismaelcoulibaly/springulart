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
import org.openapitools.client.model.HaircutDTO;
import org.openapitools.client.model.LocationDTO;
import org.openapitools.client.model.ReservationTimeDTO;
import org.openapitools.client.model.UserDTORes;
import org.threeten.bp.LocalDate;

/**
 * ReservationDTORes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-04T16:51:53.605532400-04:00[America/New_York]")
public class ReservationDTORes {
  public static final String SERIALIZED_NAME_BARBER = "barber";
  @SerializedName(SERIALIZED_NAME_BARBER)
  private UserDTORes barber;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private UserDTORes client;

  public static final String SERIALIZED_NAME_HAIRCUT = "haircut";
  @SerializedName(SERIALIZED_NAME_HAIRCUT)
  private HaircutDTO haircut;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationDTO location;

  public static final String SERIALIZED_NAME_RESERVATION_DATE = "reservationDate";
  @SerializedName(SERIALIZED_NAME_RESERVATION_DATE)
  private LocalDate reservationDate;

  public static final String SERIALIZED_NAME_RESERVATION_TIME = "reservationTime";
  @SerializedName(SERIALIZED_NAME_RESERVATION_TIME)
  private ReservationTimeDTO reservationTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public ReservationDTORes barber(UserDTORes barber) {
    
    this.barber = barber;
    return this;
  }

   /**
   * Get barber
   * @return barber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserDTORes getBarber() {
    return barber;
  }


  public void setBarber(UserDTORes barber) {
    this.barber = barber;
  }


  public ReservationDTORes client(UserDTORes client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserDTORes getClient() {
    return client;
  }


  public void setClient(UserDTORes client) {
    this.client = client;
  }


  public ReservationDTORes haircut(HaircutDTO haircut) {
    
    this.haircut = haircut;
    return this;
  }

   /**
   * Get haircut
   * @return haircut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HaircutDTO getHaircut() {
    return haircut;
  }


  public void setHaircut(HaircutDTO haircut) {
    this.haircut = haircut;
  }


  public ReservationDTORes id(Long id) {
    
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


  public ReservationDTORes location(LocationDTO location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationDTO getLocation() {
    return location;
  }


  public void setLocation(LocationDTO location) {
    this.location = location;
  }


  public ReservationDTORes reservationDate(LocalDate reservationDate) {
    
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


  public ReservationDTORes reservationTime(ReservationTimeDTO reservationTime) {
    
    this.reservationTime = reservationTime;
    return this;
  }

   /**
   * Get reservationTime
   * @return reservationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReservationTimeDTO getReservationTime() {
    return reservationTime;
  }


  public void setReservationTime(ReservationTimeDTO reservationTime) {
    this.reservationTime = reservationTime;
  }


  public ReservationDTORes status(String status) {
    
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
    ReservationDTORes reservationDTORes = (ReservationDTORes) o;
    return Objects.equals(this.barber, reservationDTORes.barber) &&
        Objects.equals(this.client, reservationDTORes.client) &&
        Objects.equals(this.haircut, reservationDTORes.haircut) &&
        Objects.equals(this.id, reservationDTORes.id) &&
        Objects.equals(this.location, reservationDTORes.location) &&
        Objects.equals(this.reservationDate, reservationDTORes.reservationDate) &&
        Objects.equals(this.reservationTime, reservationDTORes.reservationTime) &&
        Objects.equals(this.status, reservationDTORes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barber, client, haircut, id, location, reservationDate, reservationTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationDTORes {\n");
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

