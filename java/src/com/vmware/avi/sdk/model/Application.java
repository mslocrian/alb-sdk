/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The Application is a POJO class extends AviRestResource that used for creating
 * Application.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Application extends AviRestResource  {
    @JsonProperty("description")
    private String description = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;

    @JsonProperty("virtualservice_refs")
    private List<String> virtualserviceRefs = null;



    /**
     * This is the getter method this will return the attribute value.
     * User defined description for the object.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * User defined description for the object.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the object.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the object.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Unique object identifier of the object.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Unique object identifier of the object.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type virtualservice.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return virtualserviceRefs
     */
    public List<String> getVirtualserviceRefs() {
        return virtualserviceRefs;
    }

    /**
     * This is the setter method. this will set the virtualserviceRefs
     * It is a reference to an object of type virtualservice.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return virtualserviceRefs
     */
    public void setVirtualserviceRefs(List<String>  virtualserviceRefs) {
        this.virtualserviceRefs = virtualserviceRefs;
    }

    /**
     * This is the setter method this will set the virtualserviceRefs
     * It is a reference to an object of type virtualservice.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return virtualserviceRefs
     */
    public Application addVirtualserviceRefsItem(String virtualserviceRefsItem) {
      if (this.virtualserviceRefs == null) {
        this.virtualserviceRefs = new ArrayList<String>();
      }
      this.virtualserviceRefs.add(virtualserviceRefsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Application objApplication = (Application) o;
      return   Objects.equals(this.uuid, objApplication.uuid)&&
  Objects.equals(this.name, objApplication.name)&&
  Objects.equals(this.virtualserviceRefs, objApplication.virtualserviceRefs)&&
  Objects.equals(this.description, objApplication.description)&&
  Objects.equals(this.tenantRef, objApplication.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Application {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    virtualserviceRefs: ").append(toIndentedString(virtualserviceRefs)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
