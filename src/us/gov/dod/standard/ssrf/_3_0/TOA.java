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
package us.gov.dod.standard.ssrf._3_0;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_0.toa.Country;
import us.gov.dod.standard.ssrf._3_0.toa.Footnote;
import us.gov.dod.standard.ssrf._3_0.toa.FreqBand;

/**
 * TOA is the XML root for all parameters of a Table of Allocations. It inherits
 * attributes and sub-elements from element Common.
 * <p>
 * Sub-Elements are {@link Country}, {@link Footnote}, {@link FreqBand}
 * <p>
 * Example:
 * <pre>
 * &lt;TOA cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:TA:1&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Administration cls="U"&gt;NTIA&lt;/Administration&gt;
 *   &lt;FreqBand&gt;
 *     &lt;FreqMin cls="U"&gt;230&lt;/FreqMin&gt;
 *     &lt;FreqMax cls="U"&gt;400&lt;/FreqMax&gt;
 *     &lt;Allocation&gt;
 *       &lt;AllocatedService cls="U"&gt;Mobile Service&lt;/AllocatedService&gt;
 *       &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
 *     &lt;/Allocation&gt;
 *   &lt;/FreqBand&gt;
 * &lt;/TOA&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOA", propOrder = {
  "administration",
  "effectiveDate",
  "expirationDate",
  "title",
  "footnote",
  "channelPlanRef",
  "bandApplication",
  "bandUser",
  "country",
  "freqBand"
})
public class TOA extends Common<TOA> {

  /**
   * Administration - Administration (Required)
   * <p>
   * The nation or regulatory body that administers this Table of Allocations.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Administration", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString administration;
  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * Title - Title (Optional)
   * <p>
   * An identifying name for this Table of Allocations.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * Footnote (Optional)
   * <p>
   * Footnote contains the text and identifier of a Footnote, FCC Rule Part
   * Number, Band User (e.g., "Military", "Civil Support Team"). or Band
   * Application (e.g., "Wind Profiler").
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Footnote")
  private List<Footnote> footnote;
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TSerial> channelPlanRef;

  @XmlElement(name = "BandApplication", nillable = true)
  private List<BandApplication> bandApplication;

  @XmlElement(name = "BandUser", nillable = true)
  private List<BandUser> bandUser;
  /**
   * Country (Optional)
   * <p>
   * Country indicates the country or area for which this Table of Allocations
   * is in force.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Country", nillable = true)
  private List<Country> country;
  /**
   * FreqBand (Required)
   * <p>
   * FreqBand contains the allocation of a specific frequency band to
   * radiocommunication services. It may also provide additional information
   * such as the specification of the rights and responsibilities of a user.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqBand", required = true)
  private List<FreqBand> freqBand;

  /**
   * Get the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @return the Administration value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Set the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @param value the Administration value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAdministration(TString value) {
    this.administration = value;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return (this.administration != null ? this.administration.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective.
   * <p>
   * @return the EffectiveDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value the EffectiveDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @return the ExpirationDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value the ExpirationDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get an identifying name for this Table of Allocations.
   * <p>
   * @return the Title value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set an identifying name for this Table of Allocations.
   * <p>
   * @param value the Title value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @return a {@link Footnote} instance
   * @since 3.1.0
   */
  public List<Footnote> getFootnote() {
    if (footnote == null) {
      footnote = new ArrayList<Footnote>();
    }
    return this.footnote;
  }

  /**
   * Determine if the Footnote is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnote() {
    return ((this.footnote != null) && (!this.footnote.isEmpty()));
  }

  /**
   * Clear the Footnote field. This sets the field to null.
   */
  public void unsetFootnote() {
    this.footnote = null;
  }

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @return a {@link TString} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getChannelPlan()} instead.
   */
  @Deprecated
  public List<TSerial> getChannelPlanRef() {
    if (channelPlanRef == null) {
      channelPlanRef = new ArrayList<>();
    }
    return this.channelPlanRef;
  }

  /**
   * Determine if the ChannelPlanRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelPlanRef() {
    return ((this.channelPlanRef != null) && (!this.channelPlanRef.isEmpty()));
  }

  /**
   * Clear the ChannelPlanRef field. This sets the field to null.
   */
  public void unsetChannelPlanRef() {
    this.channelPlanRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BandApplication} instance
   * @since 3.1.0
   */
  public List<BandApplication> getBandApplication() {
    if (bandApplication == null) {
      bandApplication = new ArrayList<>();
    }
    return this.bandApplication;
  }

  /**
   * Determine if the BandApplication is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandApplication() {
    return ((this.bandApplication != null) && (!this.bandApplication.isEmpty()));
  }

  /**
   * Clear the BandApplication field. This sets the field to null.
   */
  public void unsetBandApplication() {
    this.bandApplication = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BandUser} instance
   * @since 3.1.0
   */
  public List<BandUser> getBandUser() {
    if (bandUser == null) {
      bandUser = new ArrayList<>();
    }
    return this.bandUser;
  }

  /**
   * Determine if the BandUser is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandUser() {
    return ((this.bandUser != null) && (!this.bandUser.isEmpty()));
  }

  /**
   * Clear the BandUser field. This sets the field to null.
   */
  public void unsetBandUser() {
    this.bandUser = null;
  }

  /**
   * Get the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force.
   * <p>
   * @return a {@link Country} instance
   * @since 3.1.0
   */
  public List<Country> getCountry() {
    if (country == null) {
      country = new ArrayList<Country>();
    }
    return this.country;
  }

  /**
   * Determine if the Country is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountry() {
    return ((this.country != null) && (!this.country.isEmpty()));
  }

  /**
   * Clear the Country field. This sets the field to null.
   */
  public void unsetCountry() {
    this.country = null;
  }

  /**
   * Get the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @return a {@link FreqBand} instance
   * @since 3.1.0
   */
  public List<FreqBand> getFreqBand() {
    if (freqBand == null) {
      freqBand = new ArrayList<FreqBand>();
    }
    return this.freqBand;
  }

  /**
   * Determine if the FreqBand is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqBand() {
    return ((this.freqBand != null) && (!this.freqBand.isEmpty()));
  }

  /**
   * Clear the FreqBand field. This sets the field to null.
   */
  public void unsetFreqBand() {
    this.freqBand = null;
  }

  /**
   * Set the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withAdministration(String value) {
    setAdministration(new TString(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withExpirationDate(Date value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set an identifying name for this Table of Allocations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values One or more instances of type {@link Footnote...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withFootnote(Footnote... values) {
    if (values != null) {
      getFootnote().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values A collection of {@link Footnote} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withFootnote(Collection<Footnote> values) {
    if (values != null) {
      getFootnote().addAll(values);
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link ChannelPlanRef...}
   * @return The current TOA object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public TOA withChannelPlanRef(TSerial... values) {
    if (values != null) {
      getChannelPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current TOA object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public TOA withChannelPlanRef(Collection<TSerial> values) {
    if (values != null) {
      getChannelPlanRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BandApplication...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withBandApplication(BandApplication... values) {
    if (values != null) {
      getBandApplication().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link BandApplication} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withBandApplication(Collection<BandApplication> values) {
    if (values != null) {
      getBandApplication().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BandUser...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withBandUser(BandUser... values) {
    if (values != null) {
      getBandUser().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link BandUser} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withBandUser(Collection<BandUser> values) {
    if (values != null) {
      getBandUser().addAll(values);
    }
    return this;
  }

  /**
   * Set the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force.
   * <p>
   * @param values One or more instances of type {@link Country...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withCountry(Country... values) {
    if (values != null) {
      getCountry().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force.
   * <p>
   * @param values A collection of {@link Country} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withCountry(Collection<Country> values) {
    if (values != null) {
      getCountry().addAll(values);
    }
    return this;
  }

  /**
   * Set the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @param values One or more instances of type {@link FreqBand...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withFreqBand(FreqBand... values) {
    if (values != null) {
      getFreqBand().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @param values A collection of {@link FreqBand} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withFreqBand(Collection<FreqBand> values) {
    if (values != null) {
      getFreqBand().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this TOA instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TOA {"
      + (bandUser != null ? " bandUser [" + bandUser + "]" : "")
      + (title != null ? " title [" + title + "]" : "")
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (footnote != null ? " footnote [" + footnote + "]" : "")
      + (channelPlanRef != null ? " channelPlanRef [" + channelPlanRef + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + (freqBand != null ? " freqBand [" + freqBand + "]" : "")
      + (administration != null ? " administration [" + administration + "]" : "")
      + (country != null ? " country [" + country + "]" : "")
      + (bandApplication != null ? " bandApplication [" + bandApplication + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TOA} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Administration}, {@link FreqBand FreqBand}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAdministration() && isSetFreqBand();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private List<ChannelPlan> channelPlan;

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @return a {@link ChannelPlan} instance
   * @since 3.1.0
   */
  public List<ChannelPlan> getChannelPlan() {
    if (channelPlan == null) {
      channelPlan = new ArrayList<>();
    }
    return channelPlan;
  }

  /**
   * Determine if the channelPlan field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelPlan() {
    return this.channelPlan != null && !this.channelPlan.isEmpty();
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withChannelPlan(ChannelPlan... values) {
    return withChannelPlan(Arrays.asList(values));
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withChannelPlan(Collection<ChannelPlan> values) {
    getChannelPlan().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this TOA record.
   * <p>
   * This method builds the exported {@link #channelPlanRef} field with values
   * from the transient {@link #channelPlan} field. This method should typically
   * be called after the TOA is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @return The current TOA object instance
   * @since 3.1.0
   */
  @Override
  public TOA prepare() {
    super.prepare();
    this.channelPlanRef = new ArrayList<>();
    for (ChannelPlan instance : getChannelPlan()) {
      this.channelPlanRef.add(instance.getSerial());
    }
    return this;
  }

  /**
   * Update the SSRF data type references in this TOA record after loading from
   * XML.
   * <p>
   * This method builds the transient {@link #channelPlan} with values from the
   * imported {@link #channelPlanRef} field. This method should typically be
   * called after the TOA is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (channelPlanRef == null || channelPlanRef.isEmpty()) {
      return;
    }
    for (ChannelPlan instance : root.getChannelPlan()) {
      if (channelPlanRef.contains(instance.getSerial())) {
        channelPlan.add(instance);
      }
    }
  }//</editor-fold>

}
