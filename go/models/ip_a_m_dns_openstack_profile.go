// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAMDNSOpenstackProfile ipam Dns openstack profile
// swagger:model IpamDnsOpenstackProfile
type IPAMDNSOpenstackProfile struct {

	// Keystone's hostname or IP address.
	KeystoneHost *string `json:"keystone_host,omitempty"`

	// The password Avi Vantage will use when authenticating to Keystone.
	Password *string `json:"password,omitempty"`

	// Region name.
	Region *string `json:"region,omitempty"`

	// OpenStack tenant name.
	Tenant *string `json:"tenant,omitempty"`

	// The username Avi Vantage will use when authenticating to Keystone.
	Username *string `json:"username,omitempty"`

	// Network to be used for VIP allocation.
	VipNetworkName *string `json:"vip_network_name,omitempty"`
}
