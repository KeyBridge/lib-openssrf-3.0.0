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
 * Enumerated values for fields using the ListCEN type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCEN")
@XmlEnum
public enum ListCEN {

  CENOT("CENOT"),
  @XmlEnumValue("DIA Equipment Number")
  DIA_EQUIPMENT_NUMBER("DIA Equipment Number"),
  ELNOT("ELNOT"),
  @XmlEnumValue("Interim identifier")
  INTERIM_IDENTIFIER("Interim identifier"),
  SPOT("SPOT"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCEN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCEN fromValue(String v) {
    for (ListCEN c : ListCEN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
