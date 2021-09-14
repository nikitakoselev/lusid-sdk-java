/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3487
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreatePropertyDefinitionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePropertyDefinitionRequest {
  /**
   * The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity
   */
  @JsonAdapter(DomainEnum.Adapter.class)
  public enum DomainEnum {
    NOTDEFINED("NotDefined"),
    
    TRANSACTION("Transaction"),
    
    PORTFOLIO("Portfolio"),
    
    HOLDING("Holding"),
    
    REFERENCEHOLDING("ReferenceHolding"),
    
    TRANSACTIONCONFIGURATION("TransactionConfiguration"),
    
    INSTRUMENT("Instrument"),
    
    CUTLABELDEFINITION("CutLabelDefinition"),
    
    ANALYTIC("Analytic"),
    
    PORTFOLIOGROUP("PortfolioGroup"),
    
    PERSON("Person"),
    
    ACCESSMETADATA("AccessMetadata"),
    
    ORDER("Order"),
    
    UNITRESULT("UnitResult"),
    
    MARKETDATA("MarketData"),
    
    CONFIGURATIONRECIPE("ConfigurationRecipe"),
    
    ALLOCATION("Allocation"),
    
    CALENDAR("Calendar"),
    
    LEGALENTITY("LegalEntity"),
    
    PLACEMENT("Placement"),
    
    EXECUTION("Execution"),
    
    BLOCK("Block"),
    
    PARTICIPATION("Participation"),
    
    PACKAGE("Package"),
    
    ORDERINSTRUCTION("OrderInstruction"),
    
    CUSTOMENTITY("CustomEntity");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DomainEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DomainEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DomainEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DomainEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private DomainEnum domain;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_VALUE_REQUIRED = "valueRequired";
  @SerializedName(SERIALIZED_NAME_VALUE_REQUIRED)
  private Boolean valueRequired;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DATA_TYPE_ID = "dataTypeId";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE_ID)
  private ResourceId dataTypeId;

  /**
   * Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant
   */
  @JsonAdapter(LifeTimeEnum.Adapter.class)
  public enum LifeTimeEnum {
    PERPETUAL("Perpetual"),
    
    TIMEVARIANT("TimeVariant");

    private String value;

    LifeTimeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LifeTimeEnum fromValue(String value) {
      for (LifeTimeEnum b : LifeTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LifeTimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LifeTimeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LifeTimeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LifeTimeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LIFE_TIME = "lifeTime";
  @SerializedName(SERIALIZED_NAME_LIFE_TIME)
  private LifeTimeEnum lifeTime;

  public static final String SERIALIZED_NAME_CONSTRAINT_STYLE = "constraintStyle";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_STYLE)
  private String constraintStyle;

  public static final String SERIALIZED_NAME_PROPERTY_DESCRIPTION = "propertyDescription";
  @SerializedName(SERIALIZED_NAME_PROPERTY_DESCRIPTION)
  private String propertyDescription;


  public CreatePropertyDefinitionRequest domain(DomainEnum domain) {
    this.domain = domain; 
    return this;
  }

   /**
   * The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity
   * @return domain
  **/
  @ApiModelProperty(required = true, value = "The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity")
  public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }


  public CreatePropertyDefinitionRequest scope(String scope) {
    this.scope = scope; 
    return this;
  }

   /**
   * The scope that the property exists in.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The scope that the property exists in.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  public CreatePropertyDefinitionRequest code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * The code of the property. Together with the domain and scope this uniquely identifies the property.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The code of the property. Together with the domain and scope this uniquely identifies the property.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public CreatePropertyDefinitionRequest valueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired; 
    return this;
  }

   /**
   * Whether or not a value is always required for this property.
   * @return valueRequired
  **/
  @ApiModelProperty(value = "Whether or not a value is always required for this property.")
  public Boolean getValueRequired() {
    return valueRequired;
  }

  public void setValueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
  }


  public CreatePropertyDefinitionRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The display name of the property.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name of the property.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreatePropertyDefinitionRequest dataTypeId(ResourceId dataTypeId) {
    this.dataTypeId = dataTypeId; 
    return this;
  }

   /**
   * Get dataTypeId
   * @return dataTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getDataTypeId() {
    return dataTypeId;
  }

  public void setDataTypeId(ResourceId dataTypeId) {
    this.dataTypeId = dataTypeId;
  }


  public CreatePropertyDefinitionRequest lifeTime(LifeTimeEnum lifeTime) {
    this.lifeTime = lifeTime; 
    return this;
  }

   /**
   * Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant
   * @return lifeTime
  **/
  @ApiModelProperty(value = "Describes how the property's values can change over time. The available values are: Perpetual, TimeVariant")
  public LifeTimeEnum getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(LifeTimeEnum lifeTime) {
    this.lifeTime = lifeTime;
  }


  public CreatePropertyDefinitionRequest constraintStyle(String constraintStyle) {
    this.constraintStyle = constraintStyle; 
    return this;
  }

   /**
   * Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. Defaults to \&quot;Property\&quot; if not specified. Valid values for this field are: Property, Collection or Identifier.
   * @return constraintStyle
  **/
  @ApiModelProperty(value = "Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. Defaults to \"Property\" if not specified. Valid values for this field are: Property, Collection or Identifier.")
  public String getConstraintStyle() {
    return constraintStyle;
  }

  public void setConstraintStyle(String constraintStyle) {
    this.constraintStyle = constraintStyle;
  }


  public CreatePropertyDefinitionRequest propertyDescription(String propertyDescription) {
    this.propertyDescription = propertyDescription; 
    return this;
  }

   /**
   * Describes the property
   * @return propertyDescription
  **/
  @ApiModelProperty(value = "Describes the property")
  public String getPropertyDescription() {
    return propertyDescription;
  }

  public void setPropertyDescription(String propertyDescription) {
    this.propertyDescription = propertyDescription;
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
    sb.append("class CreatePropertyDefinitionRequest {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    valueRequired: ").append(toIndentedString(valueRequired)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dataTypeId: ").append(toIndentedString(dataTypeId)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    constraintStyle: ").append(toIndentedString(constraintStyle)).append("\n");
    sb.append("    propertyDescription: ").append(toIndentedString(propertyDescription)).append("\n");
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
