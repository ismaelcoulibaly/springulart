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
import org.openapitools.client.model.Links;
import org.openapitools.client.model.UserModel;

/**
 * EntityModelOfAddressModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-04T16:51:53.605532400-04:00[America/New_York]")
public class EntityModelOfAddressModel {
  public static final String SERIALIZED_NAME_APARTEMENT = "apartement";
  @SerializedName(SERIALIZED_NAME_APARTEMENT)
  private String apartement;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Links links;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private Set<UserModel> users = null;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;


  public EntityModelOfAddressModel apartement(String apartement) {
    
    this.apartement = apartement;
    return this;
  }

   /**
   * Get apartement
   * @return apartement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApartement() {
    return apartement;
  }


  public void setApartement(String apartement) {
    this.apartement = apartement;
  }


  public EntityModelOfAddressModel city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public EntityModelOfAddressModel id(Long id) {
    
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


  public EntityModelOfAddressModel links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  public EntityModelOfAddressModel state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public EntityModelOfAddressModel street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public EntityModelOfAddressModel users(Set<UserModel> users) {
    
    this.users = users;
    return this;
  }

  public EntityModelOfAddressModel addUsersItem(UserModel usersItem) {
    if (this.users == null) {
      this.users = new LinkedHashSet<UserModel>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<UserModel> getUsers() {
    return users;
  }


  public void setUsers(Set<UserModel> users) {
    this.users = users;
  }


  public EntityModelOfAddressModel zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityModelOfAddressModel entityModelOfAddressModel = (EntityModelOfAddressModel) o;
    return Objects.equals(this.apartement, entityModelOfAddressModel.apartement) &&
        Objects.equals(this.city, entityModelOfAddressModel.city) &&
        Objects.equals(this.id, entityModelOfAddressModel.id) &&
        Objects.equals(this.links, entityModelOfAddressModel.links) &&
        Objects.equals(this.state, entityModelOfAddressModel.state) &&
        Objects.equals(this.street, entityModelOfAddressModel.street) &&
        Objects.equals(this.users, entityModelOfAddressModel.users) &&
        Objects.equals(this.zip, entityModelOfAddressModel.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apartement, city, id, links, state, street, users, zip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityModelOfAddressModel {\n");
    sb.append("    apartement: ").append(toIndentedString(apartement)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

