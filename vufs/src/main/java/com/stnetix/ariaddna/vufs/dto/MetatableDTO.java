/*
 * Copyright (c) 2017 stnetix.com. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, without warranties or
 * conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.stnetix.ariaddna.vufs.dto;

import java.util.HashSet;
import java.util.Set;

import com.stnetix.ariaddna.vufs.businessobjects.MetatableType;

/**
 * Data transfer object to Metatable {@link com.stnetix.ariaddna.vufs.businessobjects.Metatable} class
 */
public class MetatableDTO {
    private String uuid;
    private String version;
    private MetatableType type;
    private Set<MetafileDTO> metafileSet;
    private Long lastUpdateTimestamp;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MetatableType getType() {
        return type;
    }

    public void setType(MetatableType type) {
        this.type = type;
    }

    public Set<MetafileDTO> getMetafileSet() {
        return metafileSet != null ? metafileSet : new HashSet<>();
    }

    public void setMetafileSet(Set<MetafileDTO> metafileSet) {
        this.metafileSet = metafileSet;
    }

    public Long getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }
}
