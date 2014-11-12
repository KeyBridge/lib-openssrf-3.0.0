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
 * Enumerated values for fields using the ListUUF type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListUUF")
@XmlEnum
public enum ListUUF {

  @XmlEnumValue("Regular, not limited to workweek")
  REGULAR__NOT_LIMITED_TO_WORKWEEK("Regular, not limited to workweek"),
  @XmlEnumValue("Regular, workweek")
  REGULAR__WORKWEEK("Regular, workweek"),
  @XmlEnumValue("Occasional, not limited to workweek")
  OCCASIONAL__NOT_LIMITED_TO_WORKWEEK("Occasional, not limited to workweek"),
  @XmlEnumValue("Occasional, workweek")
  OCCASIONAL__WORKWEEK("Occasional, workweek");
  private final String value;

  ListUUF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUUF fromValue(String v) {
    for (ListUUF c : ListUUF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
