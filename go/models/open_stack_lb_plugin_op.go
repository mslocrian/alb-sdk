// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OpenStackLbPluginOp open stack lb plugin op
// swagger:model OpenStackLbPluginOp
type OpenStackLbPluginOp struct {

	// cc_id of OpenStackLbPluginOp.
	CcID *string `json:"cc_id,omitempty"`

	// command of OpenStackLbPluginOp.
	// Required: true
	Command *string `json:"command"`

	// detail of OpenStackLbPluginOp.
	Detail *string `json:"detail,omitempty"`

	// Number of elapsed.
	Elapsed *int32 `json:"elapsed,omitempty"`

	// id of OpenStackLbPluginOp.
	// Required: true
	ID *string `json:"id"`

	// prov of OpenStackLbPluginOp.
	// Required: true
	Prov *string `json:"prov"`

	// result of OpenStackLbPluginOp.
	Result *string `json:"result,omitempty"`
}
