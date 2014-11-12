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
 * Enumerated values for fields using the ListCTU type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCTU")
@XmlEnum
public enum ListCTU {

  @XmlEnumValue("Continuous")
  CONTINUOUS("Continuous"),
  @XmlEnumValue("Continuous+Stepped")
  CONTINUOUS_STEPPED("Continuous+Stepped"),
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  @XmlEnumValue("Fixed+Continuous")
  FIXED_CONTINUOUS("Fixed+Continuous"),
  @XmlEnumValue("Fixed+Stepped")
  FIXED_STEPPED("Fixed+Stepped"),
  @XmlEnumValue("Stepped")
  STEPPED("Stepped"),
  @XmlEnumValue("Fixed-Constrained")
  FIXED_CONSTRAINED("Fixed-Constrained"),
  @XmlEnumValue("Fixed or Random")
  FIXED_OR_RANDOM("Fixed or Random");
  private final String value;

  ListCTU(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCTU fromValue(String v) {
    for (ListCTU c : ListCTU.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
