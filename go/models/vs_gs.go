// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsGs vs gs
// swagger:model VsGs
type VsGs struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.3.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Gslb GeoDB being associated using this object. Field introduced in 21.1.3.
	GeodbUUID *string `json:"geodb_uuid,omitempty"`

	// Gslb Service being associated using this object. Field introduced in 21.1.3.
	GsUUID *string `json:"gs_uuid,omitempty"`

	// Gslb being associated using this object. Field introduced in 21.1.3.
	GslbUUID *string `json:"gslb_uuid,omitempty"`

	// Name of the VS-GS association object. Field introduced in 21.1.3.
	Name *string `json:"name,omitempty"`

	// Tenant. It is a reference to an object of type Tenant. Field introduced in 21.1.3.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Type of the VS-GS association object. Enum options - VSGS_TYPE_GSLB, VSGS_TYPE_GS, VSGS_TYPE_GEO_DB. Field introduced in 21.1.3.
	Type *string `json:"type,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the VS-GS association object. Field introduced in 21.1.3.
	UUID *string `json:"uuid,omitempty"`

	// Virtual Service being associated using this object. Field introduced in 21.1.3.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
