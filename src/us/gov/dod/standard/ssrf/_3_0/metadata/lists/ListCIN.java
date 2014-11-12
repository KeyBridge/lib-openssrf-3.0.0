/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Enumerated values for fields using the ListCIN type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCIN")
@XmlEnum
public enum ListCIN {

  @XmlEnumValue("Air")
  AIR("Air"),
  @XmlEnumValue("Amphibious")
  AMPHIBIOUS("Amphibious"),
  @XmlEnumValue("Deep Space")
  DEEP_SPACE("Deep Space"),
  @XmlEnumValue("Handheld")
  HANDHELD("Handheld"),
  @XmlEnumValue("Land")
  LAND("Land"),
  @XmlEnumValue("Land Fixed")
  LAND_FIXED("Land Fixed"),
  @XmlEnumValue("Land Mobile")
  LAND_MOBILE("Land Mobile"),
  @XmlEnumValue("Manpack")
  MANPACK("Manpack"),
  @XmlEnumValue("Missile")
  MISSILE("Missile"),
  @XmlEnumValue("Non Synchronous Orbit")
  NON_SYNCHRONOUS_ORBIT("Non Synchronous Orbit"),
  @XmlEnumValue("Unmanned Aerial Vehicle (UAV)")
  UNMANNED_AERIAL_VEHICLE__UAV__("Unmanned Aerial Vehicle (UAV)"),
  @XmlEnumValue("Unmanned Aircraft System (UAS)")
  UNMANNED_AIRCRAFT_SYSTEM__UAS__("Unmanned Aircraft System (UAS)"),
  @XmlEnumValue("Unmanned Ground Vehicle (UGV)")
  UNMANNED_GROUND_VEHICLE__UGV__("Unmanned Ground Vehicle (UGV)"),
  @XmlEnumValue("Unmanned Surface Vehicle (USV)")
  UNMANNED_SURFACE_VEHICLE__USV__("Unmanned Surface Vehicle (USV)"),
  @XmlEnumValue("Unmanned Underwater Vehicle (UUV)")
  UNMANNED_UNDERWATER_VEHICLE__UUV__("Unmanned Underwater Vehicle (UUV)"),
  @XmlEnumValue("Satellite")
  SATELLITE("Satellite"),
  @XmlEnumValue("Shipboard")
  SHIPBOARD("Shipboard"),
  @XmlEnumValue("Space")
  SPACE("Space"),
  @XmlEnumValue("Submarine")
  SUBMARINE("Submarine"),
  @XmlEnumValue("Synchronous Orbit")
  SYNCHRONOUS_ORBIT("Synchronous Orbit"),
  @XmlEnumValue("Transport")
  TRANSPORT("Transport"),
  @XmlEnumValue("Water")
  WATER("Water"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCIN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIN fromValue(String v) {
    for (ListCIN c : ListCIN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
