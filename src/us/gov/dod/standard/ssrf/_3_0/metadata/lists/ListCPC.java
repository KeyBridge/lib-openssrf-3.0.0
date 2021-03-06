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
import us.gov.dod.standard.ssrf._3_0.jrfl.JRFLEntry;

/**
 * Enumerated values for fields using the ListCPC type.
 * <p>
 * Used in {@link JRFLEntry}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCPC")
@XmlEnum
public enum ListCPC {

  @XmlEnumValue("Guarded")
  GUARDED("Guarded"),
  @XmlEnumValue("Protected")
  PROTECTED("Protected"),
  @XmlEnumValue("Taboo")
  TABOO("Taboo");
  private final String value;

  ListCPC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPC fromValue(String v) {
    for (ListCPC c : ListCPC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
