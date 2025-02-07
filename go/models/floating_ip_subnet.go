// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FloatingIPSubnet floating Ip subnet
// swagger:model FloatingIpSubnet
type FloatingIPSubnet struct {

	// FloatingIp subnet name if available, else uuid. Field introduced in 17.2.1.
	// Required: true
	Name *string `json:"name"`

	// FloatingIp subnet prefix. Field introduced in 17.2.1.
	Prefix *IPAddrPrefix `json:"prefix,omitempty"`

	// FloatingIp subnet uuid. Field introduced in 17.2.1.
	UUID *string `json:"uuid,omitempty"`
}
