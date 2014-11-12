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
 * Enumerated values for fields using the ListCCD type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCCD")
@XmlEnum
public enum ListCCD {

  @XmlEnumValue("Draft")
  DRAFT("Draft"),
  @XmlEnumValue("Pending")
  PENDING("Pending"),
  @XmlEnumValue("Not Supported")
  NOT_SUPPORTED("Not Supported"),
  @XmlEnumValue("Supported")
  SUPPORTED("Supported"),
  @XmlEnumValue("Supported with Recommendations")
  SUPPORTED_WITH_RECOMMENDATIONS("Supported with Recommendations"),
  @XmlEnumValue("Supported with Restrictions")
  SUPPORTED_WITH_RESTRICTIONS("Supported with Restrictions"),
  @XmlEnumValue("Request Frequency Assignment")
  REQUEST_FREQUENCY_ASSIGNMENT("Request Frequency Assignment"),
  @XmlEnumValue("Temporary Assignment Only")
  TEMPORARY_ASSIGNMENT_ONLY("Temporary Assignment Only");
  private final String value;

  ListCCD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCD fromValue(String v) {
    for (ListCCD c : ListCCD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
