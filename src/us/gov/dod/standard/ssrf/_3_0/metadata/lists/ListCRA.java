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
 * Enumerated values for fields using the ListCRA type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCRA")
@XmlEnum
public enum ListCRA {

  @XmlEnumValue("Coded Pulse")
  CODED_PULSE("Coded Pulse"),
  CW("CW"),
  @XmlEnumValue("FM CW")
  FM_CW("FM CW"),
  @XmlEnumValue("FM Pulse")
  FM_PULSE("FM Pulse"),
  @XmlEnumValue("Non-FM Pulse")
  NON_FM_PULSE("Non-FM Pulse"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCRA(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCRA fromValue(String v) {
    for (ListCRA c : ListCRA.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
