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
package us.gov.dod.standard.ssrf._3_0.ssrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.SSRequest;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * DiagramLine defines a line between two endpoints on the diagram.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramLine", propOrder = {
  "txEndpointName",
  "rxEndpointName",
  "configID"
})
public class DiagramLine {

  @XmlElement(name = "TxEndpointName", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString txEndpointName;

  @XmlElement(name = "RxEndpointName", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString rxEndpointName;
  /**
   * ConfigID - Configuration ID (Optional)
   * <p>
   * A reference to a Configuration associated with this line on the diagram.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;

  /**
   * Get
   * <p>
   * @return the TxEndpointName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTxEndpointName() {
    return txEndpointName;
  }

  /**
   * Set
   * <p>
   * @param value the TxEndpointName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTxEndpointName(TString value) {
    this.txEndpointName = value;
  }

  /**
   * Determine if the TxEndpointName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxEndpointName() {
    return (this.txEndpointName != null ? this.txEndpointName.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the RxEndpointName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRxEndpointName() {
    return rxEndpointName;
  }

  /**
   * Set
   * <p>
   * @param value the RxEndpointName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRxEndpointName(TString value) {
    this.rxEndpointName = value;
  }

  /**
   * Determine if the RxEndpointName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxEndpointName() {
    return (this.rxEndpointName != null ? this.rxEndpointName.isSetValue() : false);
  }

  /**
   * Get a reference to a Configuration associated with this line on the
   * diagram.
   * <p>
   * @return the ConfigID value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Set a reference to a Configuration associated with this line on the
   * diagram.
   * <p>
   * @param value the ConfigID value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setConfigID(TString value) {
    this.configID = value;
  }

  /**
   * Determine if the ConfigID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigID() {
    return (this.configID != null ? this.configID.isSetValue() : false);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DiagramLine object instance
   * @since 3.1.0
   */
  public DiagramLine withTxEndpointName(String value) {
    setTxEndpointName(new TString(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DiagramLine object instance
   * @since 3.1.0
   */
  public DiagramLine withRxEndpointName(String value) {
    setRxEndpointName(new TString(value));
    return this;
  }

  /**
   * Set a reference to a Configuration associated with this line on the
   * diagram.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DiagramLine object instance
   * @since 3.1.0
   */
  public DiagramLine withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this DiagramLine instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DiagramLine {"
      + (rxEndpointName != null ? " rxEndpointName [" + rxEndpointName + "]" : "")
      + (txEndpointName != null ? " txEndpointName [" + txEndpointName + "]" : "")
      + (configID != null ? " configID [" + configID + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DiagramLine} requires
   * {@link TString RxEndpointName}, {@link TString TxEndpointName}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRxEndpointName() && isSetTxEndpointName();
  }

}
