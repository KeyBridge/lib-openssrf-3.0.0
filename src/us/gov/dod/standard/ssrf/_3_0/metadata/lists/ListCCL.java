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
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.assignment.DCSTrunk;
import us.gov.dod.standard.ssrf._3_0.channelplan.ChannelFreq;
import us.gov.dod.standard.ssrf._3_0.common.Downgrade;
import us.gov.dod.standard.ssrf._3_0.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_0.common.Remarks;
import us.gov.dod.standard.ssrf._3_0.contact.EMail;
import us.gov.dod.standard.ssrf._3_0.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_0.multiple.RxModeRef;
import us.gov.dod.standard.ssrf._3_0.receiver.EmsClass;
import us.gov.dod.standard.ssrf._3_0.receiver.Installation;
import us.gov.dod.standard.ssrf._3_0.satellite.ServiceArea;
import us.gov.dod.standard.ssrf._3_0.ssreply.Comment;
import us.gov.dod.standard.ssrf._3_0.ssrequest.HostNation;
import us.gov.dod.standard.ssrf._3_0.toa.Administration;
import us.gov.dod.standard.ssrf._3_0.toa.Country;
import us.gov.dod.standard.ssrf._3_0.toa.StnClass;
import us.gov.dod.standard.ssrf._3_0.transmitter.SubCarrierFreq;
import us.gov.dod.standard.ssrf._3_0.transmitter.SubCarrierTone;

/**
 * Enumerated values for fields using the ListCCL type.
 * <p>
 * Used in
 * {@link Administration}, {@link Administrative}, {@link Allotment}, {@link Antenna}, {@link Assignment}, {@link BandApplication}, {@link BandUser}, {@link ChannelFreq}, {@link ChannelPlan}, {@link Comment}, {@link Common}, {@link Contact}, {@link Country}, {@link DCSTrunk}, {@link DetailedFunction}, {@link Downgrade}, {@link EMail}, {@link EmsClass}, {@link ExtReferenceRef}, {@link ExternalReference}, {@link FEDeployment}, {@link ForceElement}, {@link HostNation}, {@link Installation}, {@link IntfReport}, {@link JRFL}, {@link Location}, {@link Note}, {@link Organisation}, {@link RFSystem}, {@link Receiver}, {@link Remarks}, {@link Role}, {@link RxModeRef}, {@link SSReply}, {@link SSRequest}, {@link Satellite}, {@link ServiceArea}, {@link StnClass}, {@link SubCarrierFreq}, {@link SubCarrierTone}, {@link TOA}, {@link TelephoneFax}, {@link Transmitter}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCCL")
@XmlEnum
public enum ListCCL {

  U,
  R,
  C,
  S,
  T;

  public String value() {
    return name();
  }

  public static ListCCL fromValue(String v) {
    return valueOf(v);
  }

}
