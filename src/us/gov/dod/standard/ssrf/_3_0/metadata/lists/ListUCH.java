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
 * Enumerated values for fields using the ListUCH type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListUCH")
@XmlEnum
public enum ListUCH {

  NOISE("NOISE"),
  PULSED("PULSED"),
  @XmlEnumValue("VOICE ENGLISH")
  VOICE_ENGLISH("VOICE ENGLISH"),
  @XmlEnumValue("VOICE FOREIGN")
  VOICE_FOREIGN("VOICE FOREIGN"),
  @XmlEnumValue("OTHERS NEARBY AFFECTED")
  OTHERS_NEARBY_AFFECTED("OTHERS NEARBY AFFECTED"),
  @XmlEnumValue("OTHERS FAR AWAY AFFECTED")
  OTHERS_FAR_AWAY_AFFECTED("OTHERS FAR AWAY AFFECTED"),
  @XmlEnumValue("INTERFERENCE FOLLOWS WHEN I CHANGE")
  INTERFERENCE_FOLLOWS_WHEN_I_CHANGE("INTERFERENCE FOLLOWS WHEN I CHANGE"),
  GARBLED("GARBLED"),
  @XmlEnumValue("FRAME LOSS")
  FRAME_LOSS("FRAME LOSS"),
  @XmlEnumValue("STEADY RECEIVE INDICATION (SRI)")
  STEADY_RECEIVE_INDICATION__SRI__("STEADY RECEIVE INDICATION (SRI)"),
  @XmlEnumValue("REDUCED RANGE")
  REDUCED_RANGE("REDUCED RANGE"),
  @XmlEnumValue("FALSE TARGETS")
  FALSE_TARGETS("FALSE TARGETS"),
  @XmlEnumValue("REDUCED INTELLIGIBILITY (VOICE)")
  REDUCED_INTELLIGIBILITY__VOICE__("REDUCED INTELLIGIBILITY (VOICE)"),
  @XmlEnumValue("DATA ERRORS")
  DATA_ERRORS("DATA ERRORS");
  private final String value;

  ListUCH(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUCH fromValue(String v) {
    for (ListUCH c : ListUCH.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
