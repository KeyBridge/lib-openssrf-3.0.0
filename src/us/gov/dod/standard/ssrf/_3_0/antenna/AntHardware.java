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
package us.gov.dod.standard.ssrf._3_0.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Antenna;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * AntHardware contains the physical parameters related to the antenna feed and
 * lead.
 * <p>
 * Element of {@link Antenna}
 * <p>
 * Example:
 * <pre>
 * &lt;Ant Hardware&gt;
 *   &lt;ConnectorType  cls="U"&gt;Neill-Concelman Threaded&lt;/ConnectorType &gt;
 *   &lt;FeedOrientation  cls="U"&gt;down-right&lt;/FeedOrientation &gt;
 *   &lt;FeedType  cls="U"&gt;Eight Feed Horn Cluster&lt;/FeedType &gt;
 *   &lt;LeadType  cls="U"&gt;Waveguide Semirigid&lt;/LeadType &gt;
 * &lt;/Ant Hardware&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntHardware", propOrder = {
  "feedType",
  "leadType",
  "connectorType",
  "feedOrientation"
})
public class AntHardware {

  /**
   * FeedType - Antenna Feed Type (Optional)
   * <p>
   * The element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * Format is L:CAF
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FeedType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString feedType;
  /**
   * LeadType - Antenna Lead Type (Optional)
   * <p>
   * The type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * Format is L:CAL
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LeadType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString leadType;
  /**
   * ConnectorType - Antenna Connector Type (Optional)
   * <p>
   * The type of connector used to attach the antenna to the equipment or the
   * antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * Format is L:CCN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConnectorType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString connectorType;
  /**
   * FeedOrientation - Antenna Feed Orientation (Optional)
   * <p>
   * The orientation of the feed when looking in the direction of the boresight.
   * Examples of orientations are right, left, center, up, down, up-left,
   * up-right, down-left, down-right.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FeedOrientation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString feedOrientation;

  /**
   * Get the element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * @return the FeedType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFeedType() {
    return feedType;
  }

  /**
   * Set the element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * @param value the FeedType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFeedType(TString value) {
    this.feedType = value;
  }

  /**
   * Determine if the FeedType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFeedType() {
    return (this.feedType != null ? this.feedType.isSetValue() : false);
  }

  /**
   * Get the type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * @return the LeadType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLeadType() {
    return leadType;
  }

  /**
   * Set the type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * @param value the LeadType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLeadType(TString value) {
    this.leadType = value;
  }

  /**
   * Determine if the LeadType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLeadType() {
    return (this.leadType != null ? this.leadType.isSetValue() : false);
  }

  /**
   * Get the type of connector used to attach the antenna to the equipment or
   * the antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * @return the ConnectorType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getConnectorType() {
    return connectorType;
  }

  /**
   * Set the type of connector used to attach the antenna to the equipment or
   * the antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * @param value the ConnectorType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setConnectorType(TString value) {
    this.connectorType = value;
  }

  /**
   * Determine if the ConnectorType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConnectorType() {
    return (this.connectorType != null ? this.connectorType.isSetValue() : false);
  }

  /**
   * Get the orientation of the feed when looking in the direction of the
   * boresight. Examples of orientations are right, left, center, up, down,
   * up-left, up-right, down-left, down-right.
   * <p>
   * @return the FeedOrientation value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFeedOrientation() {
    return feedOrientation;
  }

  /**
   * Set the orientation of the feed when looking in the direction of the
   * boresight. Examples of orientations are right, left, center, up, down,
   * up-left, up-right, down-left, down-right.
   * <p>
   * @param value the FeedOrientation value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFeedOrientation(TString value) {
    this.feedOrientation = value;
  }

  /**
   * Determine if the FeedOrientation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFeedOrientation() {
    return (this.feedOrientation != null ? this.feedOrientation.isSetValue() : false);
  }

  /**
   * Set the element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntHardware object instance
   * @since 3.1.0
   */
  public AntHardware withFeedType(String value) {
    setFeedType(new TString(value));
    return this;
  }

  /**
   * Set the type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntHardware object instance
   * @since 3.1.0
   */
  public AntHardware withLeadType(String value) {
    setLeadType(new TString(value));
    return this;
  }

  /**
   * Set the type of connector used to attach the antenna to the equipment or
   * the antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntHardware object instance
   * @since 3.1.0
   */
  public AntHardware withConnectorType(String value) {
    setConnectorType(new TString(value));
    return this;
  }

  /**
   * Set the orientation of the feed when looking in the direction of the
   * boresight. Examples of orientations are right, left, center, up, down,
   * up-left, up-right, down-left, down-right.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntHardware object instance
   * @since 3.1.0
   */
  public AntHardware withFeedOrientation(String value) {
    setFeedOrientation(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this AntHardware instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntHardware {"
      + (connectorType != null ? " connectorType [" + connectorType + "]" : "")
      + (feedType != null ? " feedType [" + feedType + "]" : "")
      + (leadType != null ? " leadType [" + leadType + "]" : "")
      + (feedOrientation != null ? " feedOrientation [" + feedOrientation + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntHardware} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
