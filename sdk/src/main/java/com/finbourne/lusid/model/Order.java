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
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An Order for a certain quantity of a specific instrument
 */
@ApiModel(description = "An Order for a certain quantity of a specific instrument")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Order {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_ORDER_BOOK_ID = "orderBookId";
  @SerializedName(SERIALIZED_NAME_ORDER_BOOK_ID)
  private ResourceId orderBookId;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private ResourceId portfolioId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "lusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private String timeInForce;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CurrencyAndAmount price;

  public static final String SERIALIZED_NAME_ORDER_INSTRUCTION_ID = "orderInstructionId";
  @SerializedName(SERIALIZED_NAME_ORDER_INSTRUCTION_ID)
  private ResourceId orderInstructionId;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "packageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private ResourceId packageId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Order properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties; 
    return this;
  }

  public Order putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Client-defined properties associated with this order.
   * @return properties
  **/
  @ApiModelProperty(value = "Client-defined properties associated with this order.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }


  public Order version(Version version) {
    this.version = version; 
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }


  public Order instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers; 
    return this;
  }

  public Order putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * The instrument ordered.
   * @return instrumentIdentifiers
  **/
  @ApiModelProperty(required = true, value = "The instrument ordered.")
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }

  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }


  public Order quantity(Integer quantity) {
    this.quantity = quantity; 
    return this;
  }

   /**
   * The quantity of given instrument ordered.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of given instrument ordered.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public Order side(String side) {
    this.side = side; 
    return this;
  }

   /**
   * The client&#39;s representation of the order&#39;s side (buy, sell, short, etc)
   * @return side
  **/
  @ApiModelProperty(required = true, value = "The client's representation of the order's side (buy, sell, short, etc)")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }


  public Order orderBookId(ResourceId orderBookId) {
    this.orderBookId = orderBookId; 
    return this;
  }

   /**
   * Get orderBookId
   * @return orderBookId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getOrderBookId() {
    return orderBookId;
  }

  public void setOrderBookId(ResourceId orderBookId) {
    this.orderBookId = orderBookId;
  }


  public Order portfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId; 
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
  }


  public Order id(ResourceId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getId() {
    return id;
  }

  public void setId(ResourceId id) {
    this.id = id;
  }


  public Order lusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId; 
    return this;
  }

   /**
   * The LUSID instrument id for the instrument ordered.
   * @return lusidInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The LUSID instrument id for the instrument ordered.")
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }

  public void setLusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId;
  }


  public Order state(String state) {
    this.state = state; 
    return this;
  }

   /**
   * The order&#39;s state (examples: New, PartiallyFilled, ...)
   * @return state
  **/
  @ApiModelProperty(value = "The order's state (examples: New, PartiallyFilled, ...)")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Order type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * The order&#39;s type (examples: Limit, Market, ...)
   * @return type
  **/
  @ApiModelProperty(value = "The order's type (examples: Limit, Market, ...)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Order timeInForce(String timeInForce) {
    this.timeInForce = timeInForce; 
    return this;
  }

   /**
   * The order&#39;s time in force (examples: Day, GoodTilCancel, ...)
   * @return timeInForce
  **/
  @ApiModelProperty(value = "The order's time in force (examples: Day, GoodTilCancel, ...)")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }


  public Order date(OffsetDateTime date) {
    this.date = date; 
    return this;
  }

   /**
   * The date on which the order was made
   * @return date
  **/
  @ApiModelProperty(value = "The date on which the order was made")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public Order price(CurrencyAndAmount price) {
    this.price = price; 
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getPrice() {
    return price;
  }

  public void setPrice(CurrencyAndAmount price) {
    this.price = price;
  }


  public Order orderInstructionId(ResourceId orderInstructionId) {
    this.orderInstructionId = orderInstructionId; 
    return this;
  }

   /**
   * Get orderInstructionId
   * @return orderInstructionId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getOrderInstructionId() {
    return orderInstructionId;
  }

  public void setOrderInstructionId(ResourceId orderInstructionId) {
    this.orderInstructionId = orderInstructionId;
  }


  public Order packageId(ResourceId packageId) {
    this.packageId = packageId; 
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getPackageId() {
    return packageId;
  }

  public void setPackageId(ResourceId packageId) {
    this.packageId = packageId;
  }


  public Order links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Order addLinksItem(Link linksItem) {
   
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
    sb.append("class Order {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderBookId: ").append(toIndentedString(orderBookId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    orderInstructionId: ").append(toIndentedString(orderInstructionId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
