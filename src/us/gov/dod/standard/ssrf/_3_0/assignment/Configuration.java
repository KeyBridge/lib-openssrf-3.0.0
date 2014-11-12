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

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.common.CaseNum;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.multiple.*;

/**
 * Configuration identifies each operational configuration that is required in a
 * SSRequest, granted by a Host Nation in a SSReply, or authorised in a
 * frequency Assignment or Allotment dataset.
 * <p>
 * Element of
 * {@link Assignment}, {@link Multiple}, {@link RFSystem}, {@link SSReply}, {@link SSRequest}
 * <p>
 * Sub-Elements are
 * {@link CaseNum}, {@link ConfigEmission}, {@link ConfigFreq}, {@link Notation}, {@link ObservedERPAnalysis}, {@link RxRef}, {@link TxRef}, {@link Usage}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
  "configID",
  "description",
  "repeater",
  "numUsers",
  "eirpMin",
  "eirpMax",
  "oobJustification",
  "powerLimit",
  "powerType",
  "spectrumLink",
  "notation",
  "usage",
  "configFreq",
  "txRef",
  "rxRef",
  "configEmission"
})
public class Configuration {

  /**
   * ConfigID - Configuration Identifier (Required)
   * <p>
   * A short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;
  /**
   * Description - Configuration Description (Optional)
   * <p>
   * A description of the operational configuration. This description should be
   * a meaningful explanation of the configurations main characteristics.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * Repeater - Repeater Indicator (Optional)
   * <p>
   * "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Repeater", required = false)
  private TString repeater;
  /**
   * NumUsers - Number of Users (Optional)
   * <p>
   * The number of users supported by the configuration. This data may be used
   * to analyse spectrum usage.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumUsers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numUsers;
  /**
   * EIRPMin - Minimum or Nominal EIRP (Optional)
   * <p>
   * The minimum or nominal effective isotropic radiated power (EIRP) radiated
   * from the transmitter antenna. It is the sum of the power supplied to the
   * antenna and the gain of the antenna, less the line loss.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EIRPMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMin;
  /**
   * EIRPMax - Maximum EIRP (Optional)
   * <p>
   * The maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EIRPMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMax;
  /**
   * OOBJustification - Out-Of-Band Justification (Optional)
   * <p>
   * The justification for out-of-band frequency use.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OOBJustification", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString oobJustification;
  /**
   * US:PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of the transmissions in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerLimit", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerLimit;
  /**
   * US:PowerType - Power Type (Optional)
   * <p>
   * The power type code for carrier, mean, or peak envelope power emitted. The
   * power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * Format is L:CPT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString powerType;
  /**
   * US:SpectrumLink - Spectrum Link (Optional)
   * <p>
   * Whether the transmitter(s) communicate or interact with the receiver(s) in
   * this Configuration, i.e. enters a link versus a box.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpectrumLink", required = false)
  private TString spectrumLink;
  /**
   * Notation (Optional)
   * <p>
   * Notation contains the electronic identification for a pulsed or non-pulsed
   * electromagnetic emission. It includes but is not limited to Communications
   * Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Notation")
  private List<Notation> notation;
  /**
   * Usage (Optional)
   * <p>
   * Usage identifies how an operational configuration can be used or will be
   * used.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Usage")
  private List<Usage> usage;
  /**
   * ConfigFreq (Optional)
   * <p>
   * ConfigFreq indicates the set of frequencies that a configuration uses,
   * which may be a subset of the frequencies that the linked components
   * (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * Notes: When referenced by SSRequest, the Frequency i
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigFreq")
  private List<ConfigFreq> configFreq;
  /**
   * TxRef (Optional)
   * <p>
   * TxRef contains the reference of a Transmitter, and optionnally some of its
   * TxModes and the associated Antennas and AntMode.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxRef")
  private List<TxRef> txRef;
  /**
   * RxRef (Optional)
   * <p>
   * RxRef contains the reference of a Receiver, and optionnally some of its
   * RxModes and the associated Antennas and AntMode.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxRef")
  private List<RxRef> rxRef;
  /**
   * US:ConfigEmission (Optional)
   * <p>
   * ConfigEmission (US) specifies the emission bandwidths and classification
   * symbols that a Configuration uses, which may be a subset of the linked
   * components' capabilities.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigEmission")
  private List<ConfigEmission> configEmission;

  /**
   * Get a short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
   * <p>
   * @return the ConfigID value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Set a short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
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
   * Get a description of the operational configuration. This description should
   * be a meaningful explanation of the configurations main characteristics.
   * <p>
   * @return the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a description of the operational configuration. This description should
   * be a meaningful explanation of the configurations main characteristics.
   * <p>
   * @param value the Description value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @return the Repeater value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRepeater() {
    return repeater;
  }

  /**
   * Set "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @param value the Repeater value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRepeater(TString value) {
    this.repeater = value;
  }

  /**
   * Determine if the Repeater is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRepeater() {
    return (this.repeater != null ? this.repeater.isSetValue() : false);
  }

  /**
   * Get the number of users supported by the configuration. This data may be
   * used to analyse spectrum usage.
   * <p>
   * @return the NumUsers value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getNumUsers() {
    return numUsers;
  }

  /**
   * Set the number of users supported by the configuration. This data may be
   * used to analyse spectrum usage.
   * <p>
   * @param value the NumUsers value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setNumUsers(TInteger value) {
    this.numUsers = value;
  }

  /**
   * Determine if the NumUsers is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumUsers() {
    return (this.numUsers != null ? this.numUsers.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @return the EIRPMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getEIRPMin() {
    return eirpMin;
  }

  /**
   * Set the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @param value the EIRPMin value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setEIRPMin(TDecimal value) {
    this.eirpMin = value;
  }

  /**
   * Determine if the EIRPMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEIRPMin() {
    return (this.eirpMin != null ? this.eirpMin.isSetValue() : false);
  }

  /**
   * Get the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @return the EIRPMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getEIRPMax() {
    return eirpMax;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value the EIRPMax value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setEIRPMax(TDecimal value) {
    this.eirpMax = value;
  }

  /**
   * Determine if the EIRPMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEIRPMax() {
    return (this.eirpMax != null ? this.eirpMax.isSetValue() : false);
  }

  /**
   * Get the justification for out-of-band frequency use.
   * <p>
   * @return the OOBJustification value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOOBJustification() {
    return oobJustification;
  }

  /**
   * Set the justification for out-of-band frequency use.
   * <p>
   * @param value the OOBJustification value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOOBJustification(TString value) {
    this.oobJustification = value;
  }

  /**
   * Determine if the OOBJustification is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOOBJustification() {
    return (this.oobJustification != null ? this.oobJustification.isSetValue() : false);
  }

  /**
   * Get the power limit of the transmissions in this configuration.
   * <p>
   * @return the PowerLimit value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getPowerLimit() {
    return powerLimit;
  }

  /**
   * Set the power limit of the transmissions in this configuration.
   * <p>
   * @param value the PowerLimit value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setPowerLimit(TDecimal value) {
    this.powerLimit = value;
  }

  /**
   * Determine if the PowerLimit is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerLimit() {
    return (this.powerLimit != null ? this.powerLimit.isSetValue() : false);
  }

  /**
   * Get the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @return the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  /**
   * Determine if the PowerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerType() {
    return (this.powerType != null ? this.powerType.isSetValue() : false);
  }

  /**
   * Get whether the transmitter(s) communicate or interact with the receiver(s)
   * in this Configuration, i.e. enters a link versus a box.
   * <p>
   * @return the SpectrumLink value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSpectrumLink() {
    return spectrumLink;
  }

  /**
   * Set whether the transmitter(s) communicate or interact with the receiver(s)
   * in this Configuration, i.e. enters a link versus a box.
   * <p>
   * @param value the SpectrumLink value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSpectrumLink(TString value) {
    this.spectrumLink = value;
  }

  /**
   * Determine if the SpectrumLink is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpectrumLink() {
    return (this.spectrumLink != null ? this.spectrumLink.isSetValue() : false);
  }

  /**
   * Get the Notation
   * <p>
   * Complex element Notation contains the electronic identification for a
   * pulsed or non-pulsed electromagnetic emission. It includes but is not
   * limited to Communications Emitter Notation (CENOT) and Electronic
   * Intelligence Notation (ELNOT).
   * <p>
   * @return a {@link Notation} instance
   * @since 3.1.0
   */
  public List<Notation> getNotation() {
    if (notation == null) {
      notation = new ArrayList<Notation>();
    }
    return this.notation;
  }

  /**
   * Determine if the Notation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNotation() {
    return ((this.notation != null) && (!this.notation.isEmpty()));
  }

  /**
   * Clear the Notation field. This sets the field to null.
   */
  public void unsetNotation() {
    this.notation = null;
  }

  /**
   * Get the Usage
   * <p>
   * Complex element Usage identifies how an operational configuration can be
   * used or will be used.
   * <p>
   * @return a {@link Usage} instance
   * @since 3.1.0
   */
  public List<Usage> getUsage() {
    if (usage == null) {
      usage = new ArrayList<Usage>();
    }
    return this.usage;
  }

  /**
   * Determine if the Usage is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsage() {
    return ((this.usage != null) && (!this.usage.isEmpty()));
  }

  /**
   * Clear the Usage field. This sets the field to null.
   */
  public void unsetUsage() {
    this.usage = null;
  }

  /**
   * Get the ConfigFreq
   * <p>
   * Complex element ConfigFreq indicates the set of frequencies that a
   * configuration uses, which may be a subset of the frequencies that the
   * linked components (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * @return a {@link ConfigFreq} instance
   * @since 3.1.0
   */
  public List<ConfigFreq> getConfigFreq() {
    if (configFreq == null) {
      configFreq = new ArrayList<ConfigFreq>();
    }
    return this.configFreq;
  }

  /**
   * Determine if the ConfigFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigFreq() {
    return ((this.configFreq != null) && (!this.configFreq.isEmpty()));
  }

  /**
   * Clear the ConfigFreq field. This sets the field to null.
   */
  public void unsetConfigFreq() {
    this.configFreq = null;
  }

  /**
   * Get the TxRef
   * <p>
   * Complex element TxRef contains the reference of a Transmitter, and
   * optionnally some of its TxModes and the associated Antennas and AntMode.
   * <p>
   * @return a {@link TxRef} instance
   * @since 3.1.0
   */
  public List<TxRef> getTxRef() {
    if (txRef == null) {
      txRef = new ArrayList<TxRef>();
    }
    return this.txRef;
  }

  /**
   * Determine if the TxRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxRef() {
    return ((this.txRef != null) && (!this.txRef.isEmpty()));
  }

  /**
   * Clear the TxRef field. This sets the field to null.
   */
  public void unsetTxRef() {
    this.txRef = null;
  }

  /**
   * Get the RxRef
   * <p>
   * Complex element RxRef contains the reference of a Receiver, and optionnally
   * some of its RxModes and the associated Antennas and AntMode.
   * <p>
   * @return a {@link RxRef} instance
   * @since 3.1.0
   */
  public List<RxRef> getRxRef() {
    if (rxRef == null) {
      rxRef = new ArrayList<RxRef>();
    }
    return this.rxRef;
  }

  /**
   * Determine if the RxRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxRef() {
    return ((this.rxRef != null) && (!this.rxRef.isEmpty()));
  }

  /**
   * Clear the RxRef field. This sets the field to null.
   */
  public void unsetRxRef() {
    this.rxRef = null;
  }

  /**
   * Get the US:ConfigEmission
   * <p>
   * Complex element ConfigEmission (US) specifies the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities.
   * <p>
   * @return a {@link ConfigEmission} instance
   * @since 3.1.0
   */
  public List<ConfigEmission> getConfigEmission() {
    if (configEmission == null) {
      configEmission = new ArrayList<ConfigEmission>();
    }
    return this.configEmission;
  }

  /**
   * Determine if the ConfigEmission is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigEmission() {
    return ((this.configEmission != null) && (!this.configEmission.isEmpty()));
  }

  /**
   * Clear the ConfigEmission field. This sets the field to null.
   */
  public void unsetConfigEmission() {
    this.configEmission = null;
  }

  /**
   * Set a short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

  /**
   * Set a description of the operational configuration. This description should
   * be a meaningful explanation of the configurations main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withRepeater(ListCBO value) {
    setRepeater(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of users supported by the configuration. This data may be
   * used to analyse spectrum usage.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withNumUsers(Integer value) {
    setNumUsers(new TInteger(value));
    return this;
  }

  /**
   * Set the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withEIRPMin(Double value) {
    setEIRPMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withEIRPMax(Double value) {
    setEIRPMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the justification for out-of-band frequency use.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withOOBJustification(String value) {
    setOOBJustification(new TString(value));
    return this;
  }

  /**
   * Set the power limit of the transmissions in this configuration.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withPowerLimit(Double value) {
    setPowerLimit(new TDecimal(value));
    return this;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withPowerType(String value) {
    setPowerType(new TString(value));
    return this;
  }

  /**
   * Set whether the transmitter(s) communicate or interact with the receiver(s)
   * in this Configuration, i.e. enters a link versus a box.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withSpectrumLink(ListCBO value) {
    setSpectrumLink(new TString(value.value()));
    return this;
  }

  /**
   * Set the Notation
   * <p>
   * Complex element Notation contains the electronic identification for a
   * pulsed or non-pulsed electromagnetic emission. It includes but is not
   * limited to Communications Emitter Notation (CENOT) and Electronic
   * Intelligence Notation (ELNOT).
   * <p>
   * @param values One or more instances of type {@link Notation...}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withNotation(Notation... values) {
    if (values != null) {
      getNotation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Notation
   * <p>
   * Complex element Notation contains the electronic identification for a
   * pulsed or non-pulsed electromagnetic emission. It includes but is not
   * limited to Communications Emitter Notation (CENOT) and Electronic
   * Intelligence Notation (ELNOT).
   * <p>
   * @param values A collection of {@link Notation} instances
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withNotation(Collection<Notation> values) {
    if (values != null) {
      getNotation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Usage
   * <p>
   * Complex element Usage identifies how an operational configuration can be
   * used or will be used.
   * <p>
   * @param values One or more instances of type {@link Usage...}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withUsage(Usage... values) {
    if (values != null) {
      getUsage().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Usage
   * <p>
   * Complex element Usage identifies how an operational configuration can be
   * used or will be used.
   * <p>
   * @param values A collection of {@link Usage} instances
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withUsage(Collection<Usage> values) {
    if (values != null) {
      getUsage().addAll(values);
    }
    return this;
  }

  /**
   * Set the ConfigFreq
   * <p>
   * Complex element ConfigFreq indicates the set of frequencies that a
   * configuration uses, which may be a subset of the frequencies that the
   * linked components (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * @param values One or more instances of type {@link ConfigFreq...}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withConfigFreq(ConfigFreq... values) {
    if (values != null) {
      getConfigFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ConfigFreq
   * <p>
   * Complex element ConfigFreq indicates the set of frequencies that a
   * configuration uses, which may be a subset of the frequencies that the
   * linked components (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * @param values A collection of {@link ConfigFreq} instances
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withConfigFreq(Collection<ConfigFreq> values) {
    if (values != null) {
      getConfigFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxRef
   * <p>
   * Complex element TxRef contains the reference of a Transmitter, and
   * optionnally some of its TxModes and the associated Antennas and AntMode.
   * <p>
   * @param values One or more instances of type {@link TxRef...}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withTxRef(TxRef... values) {
    if (values != null) {
      getTxRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TxRef
   * <p>
   * Complex element TxRef contains the reference of a Transmitter, and
   * optionnally some of its TxModes and the associated Antennas and AntMode.
   * <p>
   * @param values A collection of {@link TxRef} instances
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withTxRef(Collection<TxRef> values) {
    if (values != null) {
      getTxRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxRef
   * <p>
   * Complex element RxRef contains the reference of a Receiver, and optionnally
   * some of its RxModes and the associated Antennas and AntMode.
   * <p>
   * @param values One or more instances of type {@link RxRef...}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withRxRef(RxRef... values) {
    if (values != null) {
      getRxRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxRef
   * <p>
   * Complex element RxRef contains the reference of a Receiver, and optionnally
   * some of its RxModes and the associated Antennas and AntMode.
   * <p>
   * @param values A collection of {@link RxRef} instances
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withRxRef(Collection<RxRef> values) {
    if (values != null) {
      getRxRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ConfigEmission
   * <p>
   * Complex element ConfigEmission (US) specifies the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities.
   * <p>
   * @param values One or more instances of type {@link ConfigEmission...}
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withConfigEmission(ConfigEmission... values) {
    if (values != null) {
      getConfigEmission().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ConfigEmission
   * <p>
   * Complex element ConfigEmission (US) specifies the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities.
   * <p>
   * @param values A collection of {@link ConfigEmission} instances
   * @return The current Configuration object instance
   * @since 3.1.0
   */
  public Configuration withConfigEmission(Collection<ConfigEmission> values) {
    if (values != null) {
      getConfigEmission().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Configuration instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Configuration {"
      + (configFreq != null ? " configFreq [" + configFreq + "]" : "")
      + (eirpMin != null ? " eirpMin [" + eirpMin + "]" : "")
      + (eirpMax != null ? " eirpMax [" + eirpMax + "]" : "")
      + (oobJustification != null ? " oobJustification [" + oobJustification + "]" : "")
      + (spectrumLink != null ? " spectrumLink [" + spectrumLink + "]" : "")
      + (configID != null ? " configID [" + configID + "]" : "")
      + (configEmission != null ? " configEmission [" + configEmission + "]" : "")
      + (repeater != null ? " repeater [" + repeater + "]" : "")
      + (powerLimit != null ? " powerLimit [" + powerLimit + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (rxRef != null ? " rxRef [" + rxRef + "]" : "")
      + (powerType != null ? " powerType [" + powerType + "]" : "")
      + (numUsers != null ? " numUsers [" + numUsers + "]" : "")
      + (usage != null ? " usage [" + usage + "]" : "")
      + (notation != null ? " notation [" + notation + "]" : "")
      + (txRef != null ? " txRef [" + txRef + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Configuration} requires {@link TString ConfigID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetConfigID();
  }
}
