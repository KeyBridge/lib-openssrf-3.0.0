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
 * Enumerated values for fields using the ListCCI type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCCI")
@XmlEnum
public enum ListCCI {

  @XmlEnumValue("Submitter")
  SUBMITTER("Submitter"),
  @XmlEnumValue("Reviewer")
  REVIEWER("Reviewer"),
  @XmlEnumValue("Program Manager")
  PROGRAM_MANAGER("Program Manager"),
  @XmlEnumValue("Project Engineer")
  PROJECT_ENGINEER("Project Engineer"),
  @XmlEnumValue("Point of Contact")
  POINT_OF_CONTACT("Point of Contact"),
  @XmlEnumValue("User")
  USER("User"),
  @XmlEnumValue("Supplier")
  SUPPLIER("Supplier"),
  @XmlEnumValue("Spectrum Manager")
  SPECTRUM_MANAGER("Spectrum Manager"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCCI(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCI fromValue(String v) {
    for (ListCCI c : ListCCI.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
