// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TencentCredentials tencent credentials
// swagger:model TencentCredentials
type TencentCredentials struct {

	// Tencent secret ID. Field introduced in 18.2.3.
	// Required: true
	SecretID *string `json:"secret_id"`

	// Tencent secret key. Field introduced in 18.2.3.
	// Required: true
	SecretKey *string `json:"secret_key"`
}
