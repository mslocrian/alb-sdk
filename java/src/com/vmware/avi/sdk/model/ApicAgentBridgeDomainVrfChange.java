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
 * The ApicAgentBridgeDomainVrfChange is a POJO class extends AviRestResource that used for creating
 * ApicAgentBridgeDomainVrfChange.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApicAgentBridgeDomainVrfChange  {
    @JsonProperty("bridge_domain")
    private String bridgeDomain;

    @JsonProperty("new_vrf")
    private String newVrf;

    @JsonProperty("old_vrf")
    private String oldVrf;

    @JsonProperty("pool_list")
    private List<String> poolList;

    @JsonProperty("vs_list")
    private List<String> vsList;



    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return bridgeDomain
     */
    public String getBridgeDomain() {
        return bridgeDomain;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param bridgeDomain set the bridgeDomain.
     */
    public void setBridgeDomain(String  bridgeDomain) {
        this.bridgeDomain = bridgeDomain;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return newVrf
     */
    public String getNewVrf() {
        return newVrf;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param newVrf set the newVrf.
     */
    public void setNewVrf(String  newVrf) {
        this.newVrf = newVrf;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return oldVrf
     */
    public String getOldVrf() {
        return oldVrf;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param oldVrf set the oldVrf.
     */
    public void setOldVrf(String  oldVrf) {
        this.oldVrf = oldVrf;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return poolList
     */
    public List<String> getPoolList() {
        return poolList;
    }

    /**
     * This is the setter method. this will set the poolList
     * Field deprecated in 21.1.1.
     * @return poolList
     */
    public void setPoolList(List<String>  poolList) {
        this.poolList = poolList;
    }

    /**
     * This is the setter method this will set the poolList
     * Field deprecated in 21.1.1.
     * @return poolList
     */
    public ApicAgentBridgeDomainVrfChange addPoolListItem(String poolListItem) {
      if (this.poolList == null) {
        this.poolList = new ArrayList<String>();
      }
      this.poolList.add(poolListItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return vsList
     */
    public List<String> getVsList() {
        return vsList;
    }

    /**
     * This is the setter method. this will set the vsList
     * Field deprecated in 21.1.1.
     * @return vsList
     */
    public void setVsList(List<String>  vsList) {
        this.vsList = vsList;
    }

    /**
     * This is the setter method this will set the vsList
     * Field deprecated in 21.1.1.
     * @return vsList
     */
    public ApicAgentBridgeDomainVrfChange addVsListItem(String vsListItem) {
      if (this.vsList == null) {
        this.vsList = new ArrayList<String>();
      }
      this.vsList.add(vsListItem);
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
      ApicAgentBridgeDomainVrfChange objApicAgentBridgeDomainVrfChange = (ApicAgentBridgeDomainVrfChange) o;
      return   Objects.equals(this.bridgeDomain, objApicAgentBridgeDomainVrfChange.bridgeDomain)&&
  Objects.equals(this.oldVrf, objApicAgentBridgeDomainVrfChange.oldVrf)&&
  Objects.equals(this.newVrf, objApicAgentBridgeDomainVrfChange.newVrf)&&
  Objects.equals(this.vsList, objApicAgentBridgeDomainVrfChange.vsList)&&
  Objects.equals(this.poolList, objApicAgentBridgeDomainVrfChange.poolList);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApicAgentBridgeDomainVrfChange {\n");
                  sb.append("    bridgeDomain: ").append(toIndentedString(bridgeDomain)).append("\n");
                        sb.append("    newVrf: ").append(toIndentedString(newVrf)).append("\n");
                        sb.append("    oldVrf: ").append(toIndentedString(oldVrf)).append("\n");
                        sb.append("    poolList: ").append(toIndentedString(poolList)).append("\n");
                        sb.append("    vsList: ").append(toIndentedString(vsList)).append("\n");
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
