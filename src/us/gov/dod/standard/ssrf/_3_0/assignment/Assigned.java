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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Assigned contains the assigned frequency(ies), channel or net number; it can
 * also contain the old frequency.
 * <p>
 * Element of {@link Link}
 * <p>
 * Sub-Elements are {@link Freq}, {@link FreqOld}
 * <p>
 * Example:
 * <pre>
 * &lt;Assigned&gt;
 *   &lt;Freq&gt;
 *     &lt;FreqMin cls="U"&gt;265.575&lt;/FreqMin&gt;
 *     &lt;TAD cls="U"&gt;HE125&lt;/TAD&gt;
 *   &lt;/Freq&gt;
 * &lt;/Assigned&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assigned", propOrder = {
  "quality",
  "colourWord",
  "colourNum",
  "ituRegStatus",
  "ituRegDate",
  "ituRegNum",
  "navAidsChannel",
  "netNum",
  "ituRegComments",
  "freq",
  "freqOld"
})
public class Assigned {

  /**
   * Quality - Quality (Optional)
   * <p>
   * An application-specific measure of the quality for the assigned frequency.
   * FOR UHF AMS assignments performed at NATO HQ via the NUFAS application,
   * this measure ranges from 0 (best quality) to 3 (high risk of interference),
   * and a value 4 means the assigned has been forced whilst it lays outside of
   * the UHF AMS resource.
   * <p>
   * Format is UN(1)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Quality", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN1.class)
  private TInteger quality;
  /**
   * ColourWord - Colour Word (Optional)
   * <p>
   * The Colour Word associated to the assigned frequency. A tactical colour
   * word is a series of alpha characters that can be used to identify
   * frequencies and nets. These words are usually listed in the Air Tasking
   * Order (ATO) to prevent inadvertent disclosure of classified information.
   * <p>
   * Format is S16
   * <p>
   * Attribute group Colour (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ColourWord", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString colourWord;
  /**
   * ColourNum - Colour Number (Optional)
   * <p>
   * A Colour Number associated to the assigned frequency. These numbers are
   * usually listed in the Air Tasking Order (ATO) to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * Format is UN(2)
   * <p>
   * Attribute group Colour (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ColourNum", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN2.class)
  private TInteger colourNum;
  /**
   * ITURegStatus - ITU Registration Status (Optional)
   * <p>
   * The status of the Assignment ITU-R registration.
   * <p>
   * Format is L:CIR
   * <p>
   * Attribute group ITURegistration (Optional)
   * <p>
   * Divergence from SMADEF:
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ITURegStatus", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString ituRegStatus;
  /**
   * ITURegDate - ITU Registration Date (Optional)
   * <p>
   * The date the frequency assignment was registered with the International
   * Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * Format is Date
   * <p>
   * Attribute group ITURegistration (Optional)
   * <p>
   * Divergence from SMADEF:
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ITURegDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar ituRegDate;
  /**
   * ITURegNum - ITU Registration Number (Optional)
   * <p>
   * The registration number assigned by the International Telecommunication
   * Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * Format is S10
   * <p>
   * Attribute group ITURegistration (Optional)
   * <p>
   * Divergence from SMADEF:
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ITURegNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS10.class)
  private TString ituRegNum;
  /**
   * In Data Item NavAidsChannel, for TACAN and DME assignments, enter the
   * channel number of the allocated pair of radio frequencies assigned for use
   * by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC,
   * DME, MLS/DME, etc ... as follows: 001 through 126 "X" 001 through 126 "Y"
   * 018 through 056 "W" 017 through 119 "Z" Leading zeros are required.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NavAidsChannel", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterNAVAIDCHNL.class)
  private TString navAidsChannel;
  /**
   * NetNum - Net Number (Optional)
   * <p>
   * The net number in the format PXXXnn where 'P' is either A for HAVE QUICK II
   * or B for SATURN, XXX is in the range 000 through 999, and nn is one of the
   * following four modes: 00 - sub-band hopping mode (only for SATURN), 25 -
   * full-band hopping mode (HAVE QUICK II and SATURN), 50 - SATURN mode, and 75
   * - SATURN mode
   * <p>
   * Format is S6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NetNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterNETNUMBER.class)
  private TString netNum;
  /**
   * US:ITURegComments - ITU Regulatory Comments (Optional)
   * <p>
   * Amplifying comments related to registering an assignment with the
   * International Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * Format is Memo
   * <p>
   * Attribute group ITURegistration (Optional)
   * <p>
   * Divergence from SMADEF:
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ITURegComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString ituRegComments;
  /**
   * Freq (Optional)
   * <p>
   * Freq indicates a single assigned frequency or an assigned range of
   * frequencies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Freq")
  private List<Freq> freq;
  /**
   * FreqOld (Optional)
   * <p>
   * FreqOld indicates a previously assigned single frequency or range of
   * frequencies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqOld", nillable = true)
  private List<FreqOld> freqOld;

  /**
   * Get an application-specific measure of the quality for the assigned
   * frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS
   * application, this measure ranges from 0 (best quality) to 3 (high risk of
   * interference), and a value 4 means the assigned has been forced whilst it
   * lays outside of the UHF AMS resource.
   * <p>
   * @return the Quality value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getQuality() {
    return quality;
  }

  /**
   * Set an application-specific measure of the quality for the assigned
   * frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS
   * application, this measure ranges from 0 (best quality) to 3 (high risk of
   * interference), and a value 4 means the assigned has been forced whilst it
   * lays outside of the UHF AMS resource.
   * <p>
   * @param value the Quality value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setQuality(TInteger value) {
    this.quality = value;
  }

  /**
   * Determine if the Quality is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetQuality() {
    return (this.quality != null ? this.quality.isSetValue() : false);
  }

  /**
   * Get the Colour Word associated to the assigned frequency. A tactical colour
   * word is a series of alpha characters that can be used to identify
   * frequencies and nets. These words are usually listed in the Air Tasking
   * Order (ATO) to prevent inadvertent disclosure of classified information.
   * <p>
   * @return the ColourWord value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getColourWord() {
    return colourWord;
  }

  /**
   * Set the Colour Word associated to the assigned frequency. A tactical colour
   * word is a series of alpha characters that can be used to identify
   * frequencies and nets. These words are usually listed in the Air Tasking
   * Order (ATO) to prevent inadvertent disclosure of classified information.
   * <p>
   * @param value the ColourWord value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setColourWord(TString value) {
    this.colourWord = value;
  }

  /**
   * Determine if the ColourWord is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetColourWord() {
    return (this.colourWord != null ? this.colourWord.isSetValue() : false);
  }

  /**
   * Get a Colour Number associated to the assigned frequency. These numbers are
   * usually listed in the Air Tasking Order (ATO) to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @return the ColourNum value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getColourNum() {
    return colourNum;
  }

  /**
   * Set a Colour Number associated to the assigned frequency. These numbers are
   * usually listed in the Air Tasking Order (ATO) to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @param value the ColourNum value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setColourNum(TInteger value) {
    this.colourNum = value;
  }

  /**
   * Determine if the ColourNum is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetColourNum() {
    return (this.colourNum != null ? this.colourNum.isSetValue() : false);
  }

  /**
   * Get the status of the Assignment ITU-R registration.
   * <p>
   * @return the ITURegStatus value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getITURegStatus() {
    return ituRegStatus;
  }

  /**
   * Set the status of the Assignment ITU-R registration.
   * <p>
   * @param value the ITURegStatus value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setITURegStatus(TString value) {
    this.ituRegStatus = value;
  }

  /**
   * Determine if the ITURegStatus is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetITURegStatus() {
    return (this.ituRegStatus != null ? this.ituRegStatus.isSetValue() : false);
  }

  /**
   * Get the date the frequency assignment was registered with the International
   * Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @return the ITURegDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getITURegDate() {
    return ituRegDate;
  }

  /**
   * Set the date the frequency assignment was registered with the International
   * Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value the ITURegDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setITURegDate(TCalendar value) {
    this.ituRegDate = value;
  }

  /**
   * Determine if the ITURegDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetITURegDate() {
    return (this.ituRegDate != null ? this.ituRegDate.isSetValue() : false);
  }

  /**
   * Get the registration number assigned by the International Telecommunication
   * Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @return the ITURegNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getITURegNum() {
    return ituRegNum;
  }

  /**
   * Set the registration number assigned by the International Telecommunication
   * Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value the ITURegNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setITURegNum(TString value) {
    this.ituRegNum = value;
  }

  /**
   * Determine if the ITURegNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetITURegNum() {
    return (this.ituRegNum != null ? this.ituRegNum.isSetValue() : false);
  }

  /**
   * Get In Data Item NavAidsChannel, for TACAN and DME assignments, enter the
   * channel number of the allocated pair of radio frequencies assigned for use
   * by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC,
   * DME, MLS/DME, etc ... as follows: 001 through 126 "X" 001 through 126 "Y"
   * 018 through 056 "W" 017 through 119 "Z" Leading zeros are required.
   * <p>
   * @return the NavAidsChannel value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getNavAidsChannel() {
    return navAidsChannel;
  }

  /**
   * Set In Data Item NavAidsChannel, for TACAN and DME assignments, enter the
   * channel number of the allocated pair of radio frequencies assigned for use
   * by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC,
   * DME, MLS/DME, etc ... as follows: 001 through 126 "X" 001 through 126 "Y"
   * 018 through 056 "W" 017 through 119 "Z" Leading zeros are required.
   * <p>
   * @param value the NavAidsChannel value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setNavAidsChannel(TString value) {
    this.navAidsChannel = value;
  }

  /**
   * Determine if the NavAidsChannel is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNavAidsChannel() {
    return (this.navAidsChannel != null ? this.navAidsChannel.isSetValue() : false);
  }

  /**
   * Get the net number in the format PXXXnn where 'P' is either A for HAVE
   * QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is
   * one of the following four modes: 00 - sub-band hopping mode (only for
   * SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 -
   * SATURN mode, and 75 - SATURN mode
   * <p>
   * @return the NetNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getNetNum() {
    return netNum;
  }

  /**
   * Set the net number in the format PXXXnn where 'P' is either A for HAVE
   * QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is
   * one of the following four modes: 00 - sub-band hopping mode (only for
   * SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 -
   * SATURN mode, and 75 - SATURN mode
   * <p>
   * @param value the NetNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setNetNum(TString value) {
    this.netNum = value;
  }

  /**
   * Determine if the NetNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetNum() {
    return (this.netNum != null ? this.netNum.isSetValue() : false);
  }

  /**
   * Get amplifying comments related to registering an assignment with the
   * International Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @return the ITURegComments value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getITURegComments() {
    return ituRegComments;
  }

  /**
   * Set amplifying comments related to registering an assignment with the
   * International Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value the ITURegComments value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setITURegComments(TString value) {
    this.ituRegComments = value;
  }

  /**
   * Determine if the ITURegComments is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetITURegComments() {
    return (this.ituRegComments != null ? this.ituRegComments.isSetValue() : false);
  }

  /**
   * Get the Freq
   * <p>
   * Complex element Freq indicates a single assigned frequency or an assigned
   * range of frequencies.
   * <p>
   * @return a {@link Freq} instance
   * @since 3.1.0
   */
  public List<Freq> getFreq() {
    if (freq == null) {
      freq = new ArrayList<>();
    }
    return this.freq;
  }

  /**
   * Determine if the Freq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreq() {
    return ((this.freq != null) && (!this.freq.isEmpty()));
  }

  /**
   * Clear the Freq field. This sets the field to null.
   */
  public void unsetFreq() {
    this.freq = null;
  }

  /**
   * Get the FreqOld
   * <p>
   * Complex element FreqOld indicates a previously assigned single frequency or
   * range of frequencies.
   * <p>
   * @return a {@link FreqOld} instance
   * @since 3.1.0
   */
  public List<FreqOld> getFreqOld() {
    if (freqOld == null) {
      freqOld = new ArrayList<>();
    }
    return this.freqOld;
  }

  /**
   * Determine if the FreqOld is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqOld() {
    return ((this.freqOld != null) && (!this.freqOld.isEmpty()));
  }

  /**
   * Clear the FreqOld field. This sets the field to null.
   */
  public void unsetFreqOld() {
    this.freqOld = null;
  }

  /**
   * Set an application-specific measure of the quality for the assigned
   * frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS
   * application, this measure ranges from 0 (best quality) to 3 (high risk of
   * interference), and a value 4 means the assigned has been forced whilst it
   * lays outside of the UHF AMS resource.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withQuality(Integer value) {
    setQuality(new TInteger(value));
    return this;
  }

  /**
   * Set the Colour Word associated to the assigned frequency. A tactical colour
   * word is a series of alpha characters that can be used to identify
   * frequencies and nets. These words are usually listed in the Air Tasking
   * Order (ATO) to prevent inadvertent disclosure of classified information.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withColourWord(String value) {
    setColourWord(new TString(value));
    return this;
  }

  /**
   * Set a Colour Number associated to the assigned frequency. These numbers are
   * usually listed in the Air Tasking Order (ATO) to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withColourNum(Integer value) {
    setColourNum(new TInteger(value));
    return this;
  }

  /**
   * Set the status of the Assignment ITU-R registration.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withITURegStatus(String value) {
    setITURegStatus(new TString(value));
    return this;
  }

  /**
   * Set the date the frequency assignment was registered with the International
   * Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withITURegDate(Calendar value) {
    setITURegDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date the frequency assignment was registered with the International
   * Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withITURegDate(Date value) {
    setITURegDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the registration number assigned by the International Telecommunication
   * Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withITURegNum(String value) {
    setITURegNum(new TString(value));
    return this;
  }

  /**
   * Set In Data Item NavAidsChannel, for TACAN and DME assignments, enter the
   * channel number of the allocated pair of radio frequencies assigned for use
   * by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC,
   * DME, MLS/DME, etc ... as follows: 001 through 126 "X" 001 through 126 "Y"
   * 018 through 056 "W" 017 through 119 "Z" Leading zeros are required.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withNavAidsChannel(String value) {
    setNavAidsChannel(new TString(value));
    return this;
  }

  /**
   * Set the net number in the format PXXXnn where 'P' is either A for HAVE
   * QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is
   * one of the following four modes: 00 - sub-band hopping mode (only for
   * SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 -
   * SATURN mode, and 75 - SATURN mode
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withNetNum(String value) {
    setNetNum(new TString(value));
    return this;
  }

  /**
   * Set amplifying comments related to registering an assignment with the
   * International Telecommunication Union (ITU) Radiocommunication Bureau (BR).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withITURegComments(String value) {
    setITURegComments(new TString(value));
    return this;
  }

  /**
   * Set the Freq
   * <p>
   * Complex element Freq indicates a single assigned frequency or an assigned
   * range of frequencies.
   * <p>
   * @param values One or more instances of type {@link Freq...}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withFreq(Freq... values) {
    if (values != null) {
      getFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Freq
   * <p>
   * Complex element Freq indicates a single assigned frequency or an assigned
   * range of frequencies.
   * <p>
   * @param values A collection of {@link Freq} instances
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withFreq(Collection<Freq> values) {
    if (values != null) {
      getFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the FreqOld
   * <p>
   * Complex element FreqOld indicates a previously assigned single frequency or
   * range of frequencies.
   * <p>
   * @param values One or more instances of type {@link FreqOld...}
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withFreqOld(FreqOld... values) {
    if (values != null) {
      getFreqOld().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the FreqOld
   * <p>
   * Complex element FreqOld indicates a previously assigned single frequency or
   * range of frequencies.
   * <p>
   * @param values A collection of {@link FreqOld} instances
   * @return The current Assigned object instance
   * @since 3.1.0
   */
  public Assigned withFreqOld(Collection<FreqOld> values) {
    if (values != null) {
      getFreqOld().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Assigned instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Assigned {"
      + (freqOld != null ? " freqOld [" + freqOld + "]" : "")
      + (colourNum != null ? " colourNum [" + colourNum + "]" : "")
      + (ituRegStatus != null ? " ituRegStatus [" + ituRegStatus + "]" : "")
      + (freq != null ? " freq [" + freq + "]" : "")
      + (navAidsChannel != null ? " navAidsChannel [" + navAidsChannel + "]" : "")
      + (ituRegNum != null ? " ituRegNum [" + ituRegNum + "]" : "")
      + (quality != null ? " quality [" + quality + "]" : "")
      + (ituRegDate != null ? " ituRegDate [" + ituRegDate + "]" : "")
      + (colourWord != null ? " colourWord [" + colourWord + "]" : "")
      + (netNum != null ? " netNum [" + netNum + "]" : "")
      + (ituRegComments != null ? " ituRegComments [" + ituRegComments + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Assigned} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
