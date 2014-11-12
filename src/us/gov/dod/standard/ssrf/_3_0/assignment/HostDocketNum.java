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
package us.gov.dod.standard.ssrf._3_0.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Assignment;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * HostDocketNum (US) contains the Host Nation docket number from a prior data
 * repository.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDocketNum", propOrder = {
  "hostDocketNum"
})
public class HostDocketNum {

  /**
   * US:HostDocketNum - Element Content (Required)
   * <p>
   * The docket number assigned by the host (soil) country to the frequency
   * authorization.
   * <p>
   * Format is S35
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HostDocketNum", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS35.class)
  private TString hostDocketNum;

  /**
   * Get the docket number assigned by the host (soil) country to the frequency
   * authorization.
   * <p>
   * @return the HostDocketNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getHostDocketNum() {
    return hostDocketNum;
  }

  /**
   * Set the docket number assigned by the host (soil) country to the frequency
   * authorization.
   * <p>
   * @param value the HostDocketNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setHostDocketNum(TString value) {
    this.hostDocketNum = value;
  }

  /**
   * Determine if the HostDocketNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHostDocketNum() {
    return (this.hostDocketNum != null ? this.hostDocketNum.isSetValue() : false);
  }

  /**
   * Set the docket number assigned by the host (soil) country to the frequency
   * authorization.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current HostDocketNum object instance
   * @since 3.1.0
   */
  public HostDocketNum withHostDocketNum(String value) {
    setHostDocketNum(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this HostDocketNum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "HostDocketNum {"
      + (hostDocketNum != null ? " hostDocketNum [" + hostDocketNum + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link HostDocketNum} requires {@link TString HostDocketNum}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetHostDocketNum();
  }

}
