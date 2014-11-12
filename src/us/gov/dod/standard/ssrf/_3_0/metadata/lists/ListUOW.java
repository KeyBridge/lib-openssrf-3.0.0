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
 * Enumerated values for fields using the ListUOW type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListUOW")
@XmlEnum
public enum ListUOW {

  @XmlEnumValue("Agency")
  AGENCY("Agency"),
  @XmlEnumValue("Unified Command")
  UNIFIED_COMMAND("Unified Command"),
  @XmlEnumValue("Unified Command Service")
  UNIFIED_COMMAND_SERVICE("Unified Command Service"),
  @XmlEnumValue("Bureau")
  BUREAU("Bureau"),
  @XmlEnumValue("Major Command")
  MAJOR_COMMAND("Major Command"),
  @XmlEnumValue("Subcommand")
  SUBCOMMAND("Subcommand"),
  @XmlEnumValue("Installation Frequency Manager")
  INSTALLATION_FREQUENCY_MANAGER("Installation Frequency Manager"),
  @XmlEnumValue("Operating Unit")
  OPERATING_UNIT("Operating Unit"),
  @XmlEnumValue("Area AFC/DoD AFC/Other Organizations")
  AREA_AFC_DO_D_AFC_OTHER_ORGANIZATIONS("Area AFC/DoD AFC/Other Organizations"),
  @XmlEnumValue("Requestor")
  REQUESTOR("Requestor"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUOW(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUOW fromValue(String v) {
    for (ListUOW c : ListUOW.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}