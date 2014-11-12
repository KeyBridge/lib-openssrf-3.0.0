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
package us.gov.dod.standard.ssrf._3_0.toa;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Allocation contains the allocation of a specific frequency band to a specific
 * radiocommunication service.
 * <p>
 * Element of {@link FreqBand}
 * <p>
 * Sub-Elements are {@link StnClass}, {@link Variance}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocation", propOrder = {
  "allocatedService",
  "priority",
  "effectiveDate",
  "expirationDate",
  "allocatedByFootnote",
  "variance",
  "stnClass",
  "channelPlanRef"
})
public class Allocation {

  /**
   * AllocatedService - Allocated Service (Required)
   * <p>
   * A radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * Format is L:CSN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllocatedService", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString allocatedService;
  /**
   * Priority - Priority (Required)
   * <p>
   * If this service is a primary or secondary use of this band. ("Permitted"
   * SHOULD only be used if the priority is unknown.)
   * <p>
   * Format is L:CPS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;
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
   * AllocatedByFootnote - Allocated By Footnote (Optional)
   * <p>
   * "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s).
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllocatedByFootnote", required = false)
  private TString allocatedByFootnote;
  /**
   * Variance (Optional)
   * <p>
   * Variance indicates if the local allocation deviates from an upper level
   * allocation (e.g. a national allocation not aligned with the ITU RR).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Variance")
  private List<Variance> variance;
  /**
   * StnClass (Optional)
   * <p>
   * StnClass contains the station class associated with the TOA frequency
   * usage.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StnClass", nillable = true)
  private List<StnClass> stnClass;
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef references the ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TSerial> channelPlanRef;
  /**
   * footnotes - Link to allocation usage notes (Optional)
   * <p>
   * A list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * Format is List of UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "footnotes")
  private List<BigInteger> footnotes;

  @XmlAttribute(name = "bandApps")
  private List<BigInteger> bandApps;

  @XmlAttribute(name = "bandUsers")
  private List<BigInteger> bandUsers;

  /**
   * Get a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @return the AllocatedService value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAllocatedService() {
    return allocatedService;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value the AllocatedService value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAllocatedService(TString value) {
    this.allocatedService = value;
  }

  /**
   * Determine if the AllocatedService is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocatedService() {
    return (this.allocatedService != null ? this.allocatedService.isSetValue() : false);
  }

  /**
   * Get if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @return the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
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
   * Get "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s).
   * <p>
   * @return the AllocatedByFootnote value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAllocatedByFootnote() {
    return allocatedByFootnote;
  }

  /**
   * Set "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s).
   * <p>
   * @param value the AllocatedByFootnote value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAllocatedByFootnote(TString value) {
    this.allocatedByFootnote = value;
  }

  /**
   * Determine if the AllocatedByFootnote is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocatedByFootnote() {
    return (this.allocatedByFootnote != null ? this.allocatedByFootnote.isSetValue() : false);
  }

  /**
   * Get the Variance
   * <p>
   * Complex element Variance indicates if the local allocation deviates from an
   * upper level allocation (e.g. a national allocation not aligned with the ITU
   * RR).
   * <p>
   * @return a {@link Variance} instance
   * @since 3.1.0
   */
  public List<Variance> getVariance() {
    if (variance == null) {
      variance = new ArrayList<>();
    }
    return this.variance;
  }

  /**
   * Determine if the Variance is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVariance() {
    return ((this.variance != null) && (!this.variance.isEmpty()));
  }

  /**
   * Clear the Variance field. This sets the field to null.
   */
  public void unsetVariance() {
    this.variance = null;
  }

  /**
   * Get the StnClass
   * <p>
   * Complex element StnClass contains the station class associated with the TOA
   * frequency usage.
   * <p>
   * @return a {@link StnClass} instance
   * @since 3.1.0
   */
  public List<StnClass> getStnClass() {
    if (stnClass == null) {
      stnClass = new ArrayList<>();
    }
    return this.stnClass;
  }

  /**
   * Determine if the StnClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStnClass() {
    return ((this.stnClass != null) && (!this.stnClass.isEmpty()));
  }

  /**
   * Clear the StnClass field. This sets the field to null.
   */
  public void unsetStnClass() {
    this.stnClass = null;
  }

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
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
   * Get a list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getFootnotes() {
    if (footnotes == null) {
      footnotes = new ArrayList<>();
    }
    return this.footnotes;
  }

  /**
   * Determine if the Footnotes is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnotes() {
    return ((this.footnotes != null) && (!this.footnotes.isEmpty()));
  }

  /**
   * Clear the Footnotes field. This sets the field to null.
   */
  public void unsetFootnotes() {
    this.footnotes = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getBandApps() {
    if (bandApps == null) {
      bandApps = new ArrayList<>();
    }
    return this.bandApps;
  }

  /**
   * Determine if the BandApps is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandApps() {
    return ((this.bandApps != null) && (!this.bandApps.isEmpty()));
  }

  /**
   * Clear the BandApps field. This sets the field to null.
   */
  public void unsetBandApps() {
    this.bandApps = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public List<BigInteger> getBandUsers() {
    if (bandUsers == null) {
      bandUsers = new ArrayList<>();
    }
    return this.bandUsers;
  }

  /**
   * Determine if the BandUsers is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandUsers() {
    return ((this.bandUsers != null) && (!this.bandUsers.isEmpty()));
  }

  /**
   * Clear the BandUsers field. This sets the field to null.
   */
  public void unsetBandUsers() {
    this.bandUsers = null;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withAllocatedService(String value) {
    setAllocatedService(new TString(value));
    return this;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withExpirationDate(Date value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s).
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withAllocatedByFootnote(ListCBO value) {
    setAllocatedByFootnote(new TString(value.value()));
    return this;
  }

  /**
   * Set the Variance
   * <p>
   * Complex element Variance indicates if the local allocation deviates from an
   * upper level allocation (e.g. a national allocation not aligned with the ITU
   * RR).
   * <p>
   * @param values One or more instances of type {@link Variance...}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withVariance(Variance... values) {
    if (values != null) {
      getVariance().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Variance
   * <p>
   * Complex element Variance indicates if the local allocation deviates from an
   * upper level allocation (e.g. a national allocation not aligned with the ITU
   * RR).
   * <p>
   * @param values A collection of {@link Variance} instances
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withVariance(Collection<Variance> values) {
    if (values != null) {
      getVariance().addAll(values);
    }
    return this;
  }

  /**
   * Set the StnClass
   * <p>
   * Complex element StnClass contains the station class associated with the TOA
   * frequency usage.
   * <p>
   * @param values One or more instances of type {@link StnClass...}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withStnClass(StnClass... values) {
    if (values != null) {
      getStnClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StnClass
   * <p>
   * Complex element StnClass contains the station class associated with the TOA
   * frequency usage.
   * <p>
   * @param values A collection of {@link StnClass} instances
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withStnClass(Collection<StnClass> values) {
    if (values != null) {
      getStnClass().addAll(values);
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link ChannelPlanRef...}
   * @return The current Allocation object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public Allocation withChannelPlanRef(TSerial... values) {
    if (values != null) {
      getChannelPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Allocation object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public Allocation withChannelPlanRef(Collection<TSerial> values) {
    if (values != null) {
      getChannelPlanRef().addAll(values);
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withFootnotes(BigInteger... values) {
    if (values != null) {
      getFootnotes().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values A collection of {@link Footnotes} instances
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withFootnotes(Collection<BigInteger> values) {
    if (values != null) {
      getFootnotes().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withBandApps(BigInteger... values) {
    if (values != null) {
      getBandApps().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link BandApps} instances
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withBandApps(Collection<BigInteger> values) {
    if (values != null) {
      getBandApps().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withBandUsers(BigInteger... values) {
    if (values != null) {
      getBandUsers().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link BandUsers} instances
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withBandUsers(Collection<BigInteger> values) {
    if (values != null) {
      getBandUsers().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Allocation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Allocation {"
      + (stnClass != null ? " stnClass [" + stnClass + "]" : "")
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (bandApps != null ? " bandApps [" + bandApps + "]" : "")
      + (priority != null ? " priority [" + priority + "]" : "")
      + (variance != null ? " variance [" + variance + "]" : "")
      + (channelPlanRef != null ? " channelPlanRef [" + channelPlanRef + "]" : "")
      + (allocatedService != null ? " allocatedService [" + allocatedService + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + (footnotes != null ? " footnotes [" + footnotes + "]" : "")
      + (bandUsers != null ? " bandUsers [" + bandUsers + "]" : "")
      + (allocatedByFootnote != null ? " allocatedByFootnote [" + allocatedByFootnote + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Allocation} requires
   * {@link TString AllocatedService}, {@link TString Priority}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAllocatedService() && isSetPriority();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef references the ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private List<ChannelPlan> channelPlan;

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
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
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withChannelPlan(ChannelPlan... values) {
    return withChannelPlan(Arrays.asList(values));
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation withChannelPlan(Collection<ChannelPlan> values) {
    getChannelPlan().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Allocation record.
   * <p>
   * This method builds the exported {@link #channelPlanRef} field with values
   * from the transient {@link #channelPlan} field. This method should typically
   * be called after the Allocation is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @return The current Allocation object instance
   * @since 3.1.0
   */
  public Allocation build() {
    this.channelPlanRef = new ArrayList<>();
    for (ChannelPlan instance : getChannelPlan()) {
      this.channelPlanRef.add(instance.getSerial());
    }
    return this;
  }

  /**
   * Update the SSRF data type references in this Allocation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #channelPlan} with values from the
   * imported {@link #channelPlanRef} field. This method should typically be
   * called after the Allocation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
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
