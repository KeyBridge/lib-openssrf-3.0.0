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
import us.gov.dod.standard.ssrf._3_0.allotment.AllotFreq;
import us.gov.dod.standard.ssrf._3_0.allotment.Emission;
import us.gov.dod.standard.ssrf._3_0.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_0.allotment.Project;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * Allotment is a group of frequencies given to a subordinate organisation for
 * local management, for specific types of emissions, at a certain location, and
 * for a specified period of time.
 * <p>
 * Sub-Elements are
 * {@link AllotFreq}, {@link Emission}, {@link POCInformation}, {@link Project}
 * <p>
 * Example:
 * <pre>
 * &lt;Allotment cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::AL:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Title cls="U"&gt;Allotment Title Here&lt;/Title&gt;
 *   &lt;UsageType cls="U"&gt;Request Permanent&lt;/UsageType&gt;
 *   &lt;DateResponseRequired cls="U"&gt;2011-12-25&lt;/DateResponseRequired&gt;
 *   &lt;EffectiveDate cls="U"&gt;2012-01-01&lt;/EffectiveDate&gt;
 *   &lt;ExpirationDate cls="U"&gt;2106-01-01&lt;/ExpirationDate&gt;
 *   &lt;ReviewDate cls="U"&gt;2104-01-01&lt;/ReviewDate&gt;
 *   &lt;Requirement cls="U"&gt;Need reply ASAP&lt;/Requirement&gt;
 *   &lt;AllotFreq&gt;
 *     &lt;FreqMin cls="U"&gt;30&lt;/FreqMin&gt;
 *     &lt;FreqMax cls="U"&gt;35&lt;/FreqMax&gt;
 *     &lt;PairedFreqMin cls=”U”&gt;20.5&lt;/PairedFreqMin&gt;
 *     &lt;TuningStep cls="U"&gt;0.050&lt;/TuningStep&gt;
 *     &lt;LocationRestriction cls="U"&gt;DEU::LO:25001&lt;/LocationRestriction&gt;
 *   &lt;/AllotFreq&gt;
 *   &lt;Emission&gt;
 *     &lt;EmsClass cls="U"&gt;G1D&lt;/EmsClass&gt;
 *     &lt;NecessaryBw cls="U"&gt;2.5&lt;/NecessaryBw&gt;
 *     &lt;Power cls="U"&gt;1.2&lt;/Power&gt;
 *   &lt;/Emission&gt;
 *   &lt;LocationRef cls="U"&gt;DEU::LO:25&lt;/LocationRef&gt;
 * &lt;/Allotment&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allotment", propOrder = {
  "title",
  "usageType",
  "dateResponseRequired",
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "requirement",
  "project",
  "pocInformation",
  "locationRef",
  "emission",
  "allotFreq"
})
public class Allotment extends Common<Allotment> {

  /**
   * Title - Title (Optional)
   * <p>
   * An identifying name for this Allotment or Assignment.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * UsageType - Type of Usage (Optional)
   * <p>
   * The type of assignment request or approved assignment/allotment. In Data
   * Item case of a rejected or cancelled assignment/allotment, use an
   * associated Remarks to indicate the reason.
   * <p>
   * Format is L:CUT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "UsageType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString usageType;
  /**
   * DateResponseRequired - Date Response Required (Optional)
   * <p>
   * The date by which the frequency assignment or Spectrum Supportability Reply
   * is required by the user in order to complete necessary advanced operation
   * coordination.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  /**
   * EffectiveDate - Effective Date (Required)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = true)
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
   * Attribute group ExpireReview (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Requirement - Description of Requirement (Optional)
   * <p>
   * Any amplifying information on the requirement.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Requirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Project")
  private List<Project> project;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * LocationRef (Required)
   * <p>
   * LocationRef references a Location dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef", required = true, nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TSerial> locationRef;
  /**
   * Emission (Optional)
   * <p>
   * Emission defines the limits of the authorized bandwidth and power within
   * the allotment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Emission")
  private List<Emission> emission;
  /**
   * AllotFreq (Required)
   * <p>
   * AllotFreq defines a frequency or range of frequencies belonging to the
   * Allotment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllotFreq", required = true)
  private List<AllotFreq> allotFreq;

  /**
   * Get an identifying name for this Allotment or Assignment.
   * <p>
   * @return the Title value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set an identifying name for this Allotment or Assignment.
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
   * Get the type of assignment request or approved assignment/allotment. In
   * Data Item case of a rejected or cancelled assignment/allotment, use an
   * associated Remarks to indicate the reason.
   * <p>
   * @return the UsageType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getUsageType() {
    return usageType;
  }

  /**
   * Set the type of assignment request or approved assignment/allotment. In
   * Data Item case of a rejected or cancelled assignment/allotment, use an
   * associated Remarks to indicate the reason.
   * <p>
   * @param value the UsageType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setUsageType(TString value) {
    this.usageType = value;
  }

  /**
   * Determine if the UsageType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageType() {
    return (this.usageType != null ? this.usageType.isSetValue() : false);
  }

  /**
   * Get the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @return the DateResponseRequired value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @param value the DateResponseRequired value in a {@link TCalendar} data
   *              type
   * @since 3.1.0
   */
  public void setDateResponseRequired(TCalendar value) {
    this.dateResponseRequired = value;
  }

  /**
   * Determine if the DateResponseRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateResponseRequired() {
    return (this.dateResponseRequired != null ? this.dateResponseRequired.isSetValue() : false);
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
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value the ReviewDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get any amplifying information on the requirement.
   * <p>
   * @return the Requirement value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRequirement() {
    return requirement;
  }

  /**
   * Set any amplifying information on the requirement.
   * <p>
   * @param value the Requirement value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRequirement(TString value) {
    this.requirement = value;
  }

  /**
   * Determine if the Requirement is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequirement() {
    return (this.requirement != null ? this.requirement.isSetValue() : false);
  }

  /**
   * Get the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @return a {@link Project} instance
   * @since 3.1.0
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<Project>();
    }
    return this.project;
  }

  /**
   * Determine if the Project is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  /**
   * Clear the Project field. This sets the field to null.
   */
  public void unsetProject() {
    this.project = null;
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @return a {@link POCInformation} instance
   * @since 3.1.0
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<POCInformation>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Get the LocationRef
   * <p>
   * Complex element LocationRef references a Location dataset.
   * <p>
   * @return a {@link TString} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public List<TSerial> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  /**
   * Clear the LocationRef field. This sets the field to null.
   */
  public void unsetLocationRef() {
    this.locationRef = null;
  }

  /**
   * Get the Emission
   * <p>
   * Complex element Emission defines the limits of the authorized bandwidth and
   * power within the allotment.
   * <p>
   * @return a {@link Emission} instance
   * @since 3.1.0
   */
  public List<Emission> getEmission() {
    if (emission == null) {
      emission = new ArrayList<Emission>();
    }
    return this.emission;
  }

  /**
   * Determine if the Emission is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmission() {
    return ((this.emission != null) && (!this.emission.isEmpty()));
  }

  /**
   * Clear the Emission field. This sets the field to null.
   */
  public void unsetEmission() {
    this.emission = null;
  }

  /**
   * Get the AllotFreq
   * <p>
   * Complex element AllotFreq defines a frequency or range of frequencies
   * belonging to the Allotment.
   * <p>
   * @return a {@link AllotFreq} instance
   * @since 3.1.0
   */
  public List<AllotFreq> getAllotFreq() {
    if (allotFreq == null) {
      allotFreq = new ArrayList<AllotFreq>();
    }
    return this.allotFreq;
  }

  /**
   * Determine if the AllotFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllotFreq() {
    return ((this.allotFreq != null) && (!this.allotFreq.isEmpty()));
  }

  /**
   * Clear the AllotFreq field. This sets the field to null.
   */
  public void unsetAllotFreq() {
    this.allotFreq = null;
  }

  /**
   * Set an identifying name for this Allotment or Assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the type of assignment request or approved assignment/allotment. In
   * Data Item case of a rejected or cancelled assignment/allotment, use an
   * associated Remarks to indicate the reason.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withUsageType(String value) {
    setUsageType(new TString(value));
    return this;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withDateResponseRequired(Date value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withExpirationDate(Date value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set any amplifying information on the requirement.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withRequirement(String value) {
    setRequirement(new TString(value));
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values One or more instances of type {@link Project...}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the LocationRef
   * <p>
   * Complex element LocationRef references a Location dataset.
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current Allotment object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location...)} instead.
   */
  @Deprecated
  public Allotment withLocationRef(TSerial... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the LocationRef
   * <p>
   * Complex element LocationRef references a Location dataset.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Allotment object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location...)} instead.
   */
  @Deprecated
  public Allotment withLocationRef(Collection<TSerial> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the Emission
   * <p>
   * Complex element Emission defines the limits of the authorized bandwidth and
   * power within the allotment.
   * <p>
   * @param values One or more instances of type {@link Emission...}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withEmission(Emission... values) {
    if (values != null) {
      getEmission().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Emission
   * <p>
   * Complex element Emission defines the limits of the authorized bandwidth and
   * power within the allotment.
   * <p>
   * @param values A collection of {@link Emission} instances
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withEmission(Collection<Emission> values) {
    if (values != null) {
      getEmission().addAll(values);
    }
    return this;
  }

  /**
   * Set the AllotFreq
   * <p>
   * Complex element AllotFreq defines a frequency or range of frequencies
   * belonging to the Allotment.
   * <p>
   * @param values One or more instances of type {@link AllotFreq...}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withAllotFreq(AllotFreq... values) {
    if (values != null) {
      getAllotFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AllotFreq
   * <p>
   * Complex element AllotFreq defines a frequency or range of frequencies
   * belonging to the Allotment.
   * <p>
   * @param values A collection of {@link AllotFreq} instances
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withAllotFreq(Collection<AllotFreq> values) {
    if (values != null) {
      getAllotFreq().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Allotment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Allotment {"
      + (project != null ? " project [" + project + "]" : "")
      + (locationRef != null ? " locationRef [" + locationRef + "]" : "")
      + (requirement != null ? " requirement [" + requirement + "]" : "")
      + (title != null ? " title [" + title + "]" : "")
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (dateResponseRequired != null ? " dateResponseRequired [" + dateResponseRequired + "]" : "")
      + (emission != null ? " emission [" + emission + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (usageType != null ? " usageType [" + usageType + "]" : "")
      + (allotFreq != null ? " allotFreq [" + allotFreq + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Allotment} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link AllotFreq AllotFreq}, {@link TCalendar EffectiveDate}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAllotFreq() && isSetEffectiveDate();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocationRef (Required)
   * <p>
   * LocationRef references a Location dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private List<Location> location;

  /**
   * Get the LocationRef
   * <p>
   * Complex element LocationRef references a Location dataset.
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public List<Location> getLocation() {
    if (location == null) {
      location = new ArrayList<>();
    }
    return location;
  }

  /**
   * Determine if the location field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return this.location != null && !this.location.isEmpty();
  }

  /**
   * Set the LocationRef
   * <p>
   * Complex element LocationRef references a Location dataset.
   * <p>
   * @param values An instances of type {@link Location}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withLocation(Location... values) {
    return withLocation(Arrays.asList(values));
  }

  /**
   * Set the LocationRef
   * <p>
   * Complex element LocationRef references a Location dataset.
   * <p>
   * @param values An instances of type {@link Location}
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  public Allotment withLocation(Collection<Location> values) {
    getLocation().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Allotment record.
   * <p>
   * This method builds the exported {@link #locationRef} field with values from
   * the transient {@link #location} field. This method should typically be
   * called after the Allotment is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @return The current Allotment object instance
   * @since 3.1.0
   */
  @Override
  public Allotment prepare() {
    super.prepare();
    this.locationRef = new ArrayList<>();
    for (Location instance : getLocation()) {
      this.locationRef.add(instance.getSerial());
    }
    return this;
  }

  /**
   * Update the SSRF data type references in this Allotment record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #location} with values from the
   * imported {@link #locationRef} field. This method should typically be called
   * after the Allotment is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (locationRef == null || locationRef.isEmpty()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRef.contains(instance.getSerial())) {
        location.add(instance);
      }
    }
  }//</editor-fold>

}
