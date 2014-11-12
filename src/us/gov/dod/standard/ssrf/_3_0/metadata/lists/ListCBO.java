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
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.antenna.AntGain;
import us.gov.dod.standard.ssrf._3_0.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_0.antenna.AntPattern;
import us.gov.dod.standard.ssrf._3_0.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_0.assignment.StationLoc;
import us.gov.dod.standard.ssrf._3_0.assignment.Tuning;
import us.gov.dod.standard.ssrf._3_0.contact.EMail;
import us.gov.dod.standard.ssrf._3_0.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_0.location.Ellipse;
import us.gov.dod.standard.ssrf._3_0.location.Point;
import us.gov.dod.standard.ssrf._3_0.location.Polygon;
import us.gov.dod.standard.ssrf._3_0.multiple.ConfigFreq;
import us.gov.dod.standard.ssrf._3_0.receiver.Curve;
import us.gov.dod.standard.ssrf._3_0.receiver.SpreadSpectrum;
import us.gov.dod.standard.ssrf._3_0.ssreply.StageLocation;
import us.gov.dod.standard.ssrf._3_0.ssrequest.DiagramEndpoint;
import us.gov.dod.standard.ssrf._3_0.ssrequest.EndpointLocation;
import us.gov.dod.standard.ssrf._3_0.ssrequest.Trunking;
import us.gov.dod.standard.ssrf._3_0.ssrequest.TrunkingAssignment;
import us.gov.dod.standard.ssrf._3_0.toa.Allocation;
import us.gov.dod.standard.ssrf._3_0.transmitter.Power;
import us.gov.dod.standard.ssrf._3_0.transmitter.TxMode;

/**
 * Enumerated values for fields using the ListCBO type.
 * <p>
 * Used in
 * {@link Allocation}, {@link AntGain}, {@link AntMode}, {@link AntPattern}, {@link Antenna}, {@link Assignment}, {@link ConfigFreq}, {@link Configuration}, {@link Curve}, {@link DiagramEndpoint}, {@link EMail}, {@link Ellipse}, {@link EndpointLocation}, {@link ExternalReference}, {@link IntfReport}, {@link Point}, {@link Polygon}, {@link Power}, {@link RFSystem}, {@link Receiver}, {@link SSRequest}, {@link SpreadSpectrum}, {@link StageLocation}, {@link StationLoc}, {@link TelephoneFax}, {@link Transmitter}, {@link Trunking}, {@link TrunkingAssignment}, {@link Tuning}, {@link TxMode}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCBO")
@XmlEnum
public enum ListCBO {

  @XmlEnumValue("Yes")
  YES("Yes"),
  @XmlEnumValue("No")
  NO("No");
  private final String value;

  ListCBO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCBO fromValue(String v) {
    for (ListCBO c : ListCBO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
