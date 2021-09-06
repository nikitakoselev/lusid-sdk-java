/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3454
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.ActionId;
import com.finbourne.lusid.model.IdSelectorDefinition;
import com.finbourne.lusid.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An action that can be access controlled
 */
@ApiModel(description = "An action that can be access controlled")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlledAction {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionId action;

  public static final String SERIALIZED_NAME_LIMITED_SET = "limitedSet";
  @SerializedName(SERIALIZED_NAME_LIMITED_SET)
  private List<IdSelectorDefinition> limitedSet = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public AccessControlledAction description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description of the action
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the action")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AccessControlledAction action(ActionId action) {
    this.action = action; 
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public ActionId getAction() {
    return action;
  }

  public void setAction(ActionId action) {
    this.action = action;
  }


  public AccessControlledAction limitedSet(List<IdSelectorDefinition> limitedSet) {
    this.limitedSet = limitedSet; 
    return this;
  }

  public AccessControlledAction addLimitedSetItem(IdSelectorDefinition limitedSetItem) {
   
    if (this.limitedSet == null) {
      this.limitedSet = new ArrayList<>();
    }
    this.limitedSet.add(limitedSetItem);
    return this;
  }

   /**
   * When populated, the provided values are the limited set of resources that are allowed to be specified for  access control for this action
   * @return limitedSet
  **/
  @ApiModelProperty(value = "When populated, the provided values are the limited set of resources that are allowed to be specified for  access control for this action")
  public List<IdSelectorDefinition> getLimitedSet() {
    return limitedSet;
  }

  public void setLimitedSet(List<IdSelectorDefinition> limitedSet) {
    this.limitedSet = limitedSet;
  }


  public AccessControlledAction links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public AccessControlledAction addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
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
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControlledAction {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    limitedSet: ").append(toIndentedString(limitedSet)).append("\n");
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
