/*
 *   Copyright 2020 Huawei Technologies Co., Ltd.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.mec.emulator.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The connection type for the access point
 */
public enum ConnectionType {

    FEMTO("Femto"),

    LTE_FEMTO("LTE-femto"),

    SMALLCELL("Smallcell"),

    LTE_SMALLCELL("LTE-smallcell"),

    WIFI("Wifi"),

    PICO("Pico"),

    MICRO("Micro"),

    MACRO("Macro"),

    WIMAX("Wimax"),

    UNKNOWN("Unknown");

    private String value;

    ConnectionType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ConnectionType fromValue(String text) {
        for (ConnectionType b : ConnectionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
}

