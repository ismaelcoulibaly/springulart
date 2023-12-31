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
import org.openapitools.client.model.UserModel;
import org.threeten.bp.LocalDate;

/**
 * CredentialModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-04T16:51:53.605532400-04:00[America/New_York]")
public class CredentialModel {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private LocalDate created;

  public static final String SERIALIZED_NAME_GRANTED_AUTHORITY = "grantedAuthority";
  @SerializedName(SERIALIZED_NAME_GRANTED_AUTHORITY)
  private String grantedAuthority;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private LocalDate updated;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserModel user;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CredentialModel created(LocalDate created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getCreated() {
    return created;
  }


  public void setCreated(LocalDate created) {
    this.created = created;
  }


  public CredentialModel grantedAuthority(String grantedAuthority) {
    
    this.grantedAuthority = grantedAuthority;
    return this;
  }

   /**
   * Get grantedAuthority
   * @return grantedAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrantedAuthority() {
    return grantedAuthority;
  }


  public void setGrantedAuthority(String grantedAuthority) {
    this.grantedAuthority = grantedAuthority;
  }


  public CredentialModel id(Long id) {
    
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


  public CredentialModel password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CredentialModel updated(LocalDate updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getUpdated() {
    return updated;
  }


  public void setUpdated(LocalDate updated) {
    this.updated = updated;
  }


  public CredentialModel user(UserModel user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserModel getUser() {
    return user;
  }


  public void setUser(UserModel user) {
    this.user = user;
  }


  public CredentialModel username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialModel credentialModel = (CredentialModel) o;
    return Objects.equals(this.created, credentialModel.created) &&
        Objects.equals(this.grantedAuthority, credentialModel.grantedAuthority) &&
        Objects.equals(this.id, credentialModel.id) &&
        Objects.equals(this.password, credentialModel.password) &&
        Objects.equals(this.updated, credentialModel.updated) &&
        Objects.equals(this.user, credentialModel.user) &&
        Objects.equals(this.username, credentialModel.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, grantedAuthority, id, password, updated, user, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialModel {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    grantedAuthority: ").append(toIndentedString(grantedAuthority)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

