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
import us.gov.dod.standard.ssrf._3_0.Assignment;
import us.gov.dod.standard.ssrf._3_0.DetailedFunction;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Link identifies each link in a system of assignments. This is the top element
 * of each Link. The exact definition of a link is very flexible and depends on
 * the degree of accuracy needed for the assignment. A link can be very generic
 * (one or several base stations serving an area or a volume with non-defined
 * mobiles) to very accurate (such as one link for each radio-relay hop).
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Sub-Elements are
 * {@link Assigned}, {@link DCSTrunk}, {@link DetailedFunctionID}, {@link StationConfig}, {@link Tuning}
 * <p>
 * Example:
 * <pre>
 * &lt;Link&gt;
 *   &lt;LinkID cls="U"&gt;LINK1&lt;/LinkID&gt;
 *   &lt;StationConfig&gt;
 *     &lt;Type cls="U"&gt;Transmit-Receive&lt;/Type&gt;
 *     &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
 *     &lt;StationID cls="U"&gt;STATION1&lt;/StationID&gt;
 *   &lt;/StationConfig&gt;
 *   &lt;Assigned&gt;
 *     &lt;Freq&gt;
 *       &lt;FreqMin cls="U"&gt;256.275&lt;/FreqMin&gt;
 *     &lt;/Freq&gt;
 *   &lt;/Assigned&gt;
 * &lt;/Link&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link", propOrder = {
  "linkID",
  "intermediateFunction",
  "majorFunction",
  "linkName",
  "tuning",
  "stationConfig",
  "assigned",
  "dcsTrunk",
  "detailedFunction"
})
public class Link {

  /**
   * LinkID - Link Identifier (Required)
   * <p>
   * A unique identifier for the link. This identifier should be a meaningful
   * identification of the link, but may also be automatically generated. The
   * identifier SHOULD NOT be modified during the lifetime of the dataset.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LinkID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString linkID;

  @XmlElement(name = "IntermediateFunction", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS150.class)
  private TString intermediateFunction;
  /**
   * US:MajorFunction - Major Function (Optional)
   * <p>
   * The major (or primary) function of the frequency assignment.
   * <p>
   * Format is L:UFN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MajorFunction", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS150.class)
  private TString majorFunction;
  /**
   * US:LinkName - Link Name (Optional)
   * <p>
   * A human readable name of the link.
   * <p>
   * Format is S25
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LinkName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS24.class)
  private TString linkName;
  /**
   * Tuning (Optional)
   * <p>
   * Tuning indicates the specific frequency or range of frequencies, tuning
   * increment, and number of frequencies, required for an assignment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Tuning")
  private List<Tuning> tuning;
  /**
   * StationConfig (Required)
   * <p>
   * StationConfig describes one couple (station, configuration) used for
   * transmitting and/or receiving in the current Link. It may also contain
   * additional antenna pointing/blanking parameters.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StationConfig", required = true)
  private List<StationConfig> stationConfig;
  /**
   * Assigned (Optional)
   * <p>
   * Assigned contains the assigned frequency(ies), channel or net number; it
   * can also contain the old frequency.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Assigned")
  private List<Assigned> assigned;
  /**
   * US:DCSTrunk (Optional)
   * <p>
   * DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier
   * for a specific "trunked" system. The identifier is assigned by the Defense
   * Information Systems Agency (DISA).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DCSTrunk", nillable = true)
  private List<DCSTrunk> dcsTrunk;

  @XmlElement(name = "DetailedFunction", nillable = true)
  private List<DetailedFunction> detailedFunction;

  /**
   * Get a unique identifier for the link. This identifier should be a
   * meaningful identification of the link, but may also be automatically
   * generated. The identifier SHOULD NOT be modified during the lifetime of the
   * dataset.
   * <p>
   * @return the LinkID value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLinkID() {
    return linkID;
  }

  /**
   * Set a unique identifier for the link. This identifier should be a
   * meaningful identification of the link, but may also be automatically
   * generated. The identifier SHOULD NOT be modified during the lifetime of the
   * dataset.
   * <p>
   * @param value the LinkID value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLinkID(TString value) {
    this.linkID = value;
  }

  /**
   * Determine if the LinkID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLinkID() {
    return (this.linkID != null ? this.linkID.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the IntermediateFunction value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIntermediateFunction() {
    return intermediateFunction;
  }

  /**
   * Set
   * <p>
   * @param value the IntermediateFunction value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIntermediateFunction(TString value) {
    this.intermediateFunction = value;
  }

  /**
   * Determine if the IntermediateFunction is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermediateFunction() {
    return (this.intermediateFunction != null ? this.intermediateFunction.isSetValue() : false);
  }

  /**
   * Get the major (or primary) function of the frequency assignment.
   * <p>
   * @return the MajorFunction value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMajorFunction() {
    return majorFunction;
  }

  /**
   * Set the major (or primary) function of the frequency assignment.
   * <p>
   * @param value the MajorFunction value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMajorFunction(TString value) {
    this.majorFunction = value;
  }

  /**
   * Determine if the MajorFunction is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMajorFunction() {
    return (this.majorFunction != null ? this.majorFunction.isSetValue() : false);
  }

  /**
   * Get a human readable name of the link.
   * <p>
   * @return the LinkName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLinkName() {
    return linkName;
  }

  /**
   * Set a human readable name of the link.
   * <p>
   * @param value the LinkName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLinkName(TString value) {
    this.linkName = value;
  }

  /**
   * Determine if the LinkName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLinkName() {
    return (this.linkName != null ? this.linkName.isSetValue() : false);
  }

  /**
   * Get the Tuning
   * <p>
   * Complex element Tuning indicates the specific frequency or range of
   * frequencies, tuning increment, and number of frequencies, required for an
   * assignment.
   * <p>
   * @return a {@link Tuning} instance
   * @since 3.1.0
   */
  public List<Tuning> getTuning() {
    if (tuning == null) {
      tuning = new ArrayList<>();
    }
    return this.tuning;
  }

  /**
   * Determine if the Tuning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuning() {
    return ((this.tuning != null) && (!this.tuning.isEmpty()));
  }

  /**
   * Clear the Tuning field. This sets the field to null.
   */
  public void unsetTuning() {
    this.tuning = null;
  }

  /**
   * Get the StationConfig
   * <p>
   * Complex element StationConfig describes one couple (station, configuration)
   * used for transmitting and/or receiving in the current Link. It may also
   * contain additional antenna pointing/blanking parameters.
   * <p>
   * @return a {@link StationConfig} instance
   * @since 3.1.0
   */
  public List<StationConfig> getStationConfig() {
    if (stationConfig == null) {
      stationConfig = new ArrayList<>();
    }
    return this.stationConfig;
  }

  /**
   * Determine if the StationConfig is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationConfig() {
    return ((this.stationConfig != null) && (!this.stationConfig.isEmpty()));
  }

  /**
   * Clear the StationConfig field. This sets the field to null.
   */
  public void unsetStationConfig() {
    this.stationConfig = null;
  }

  /**
   * Get the Assigned
   * <p>
   * Complex element Assigned contains the assigned frequency(ies), channel or
   * net number; it can also contain the old frequency.
   * <p>
   * @return a {@link Assigned} instance
   * @since 3.1.0
   */
  public List<Assigned> getAssigned() {
    if (assigned == null) {
      assigned = new ArrayList<>();
    }
    return this.assigned;
  }

  /**
   * Determine if the Assigned is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssigned() {
    return ((this.assigned != null) && (!this.assigned.isEmpty()));
  }

  /**
   * Clear the Assigned field. This sets the field to null.
   */
  public void unsetAssigned() {
    this.assigned = null;
  }

  /**
   * Get the US:DCSTrunk
   * <p>
   * Complex element DCSTrunk (US) is the Defense Communications System (DCS)
   * trunk identifier for a specific "trunked" system. The identifier is
   * assigned by the Defense Information Systems Agency (DISA).
   * <p>
   * @return a {@link DCSTrunk} instance
   * @since 3.1.0
   */
  public List<DCSTrunk> getDCSTrunk() {
    if (dcsTrunk == null) {
      dcsTrunk = new ArrayList<>();
    }
    return this.dcsTrunk;
  }

  /**
   * Determine if the DCSTrunk is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDCSTrunk() {
    return ((this.dcsTrunk != null) && (!this.dcsTrunk.isEmpty()));
  }

  /**
   * Clear the DCSTrunk field. This sets the field to null.
   */
  public void unsetDCSTrunk() {
    this.dcsTrunk = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link DetailedFunction} instance
   * @since 3.1.0
   */
  public List<DetailedFunction> getDetailedFunction() {
    if (detailedFunction == null) {
      detailedFunction = new ArrayList<DetailedFunction>();
    }
    return this.detailedFunction;
  }

  /**
   * Determine if the DetailedFunction is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDetailedFunction() {
    return ((this.detailedFunction != null) && (!this.detailedFunction.isEmpty()));
  }

  /**
   * Clear the DetailedFunction field. This sets the field to null.
   */
  public void unsetDetailedFunction() {
    this.detailedFunction = null;
  }

  /**
   * Set a unique identifier for the link. This identifier should be a
   * meaningful identification of the link, but may also be automatically
   * generated. The identifier SHOULD NOT be modified during the lifetime of the
   * dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withLinkID(String value) {
    setLinkID(new TString(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withIntermediateFunction(String value) {
    setIntermediateFunction(new TString(value));
    return this;
  }

  /**
   * Set the major (or primary) function of the frequency assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withMajorFunction(String value) {
    setMajorFunction(new TString(value));
    return this;
  }

  /**
   * Set a human readable name of the link.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withLinkName(String value) {
    setLinkName(new TString(value));
    return this;
  }

  /**
   * Set the Tuning
   * <p>
   * Complex element Tuning indicates the specific frequency or range of
   * frequencies, tuning increment, and number of frequencies, required for an
   * assignment.
   * <p>
   * @param values One or more instances of type {@link Tuning...}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withTuning(Tuning... values) {
    if (values != null) {
      getTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Tuning
   * <p>
   * Complex element Tuning indicates the specific frequency or range of
   * frequencies, tuning increment, and number of frequencies, required for an
   * assignment.
   * <p>
   * @param values A collection of {@link Tuning} instances
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withTuning(Collection<Tuning> values) {
    if (values != null) {
      getTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the StationConfig
   * <p>
   * Complex element StationConfig describes one couple (station, configuration)
   * used for transmitting and/or receiving in the current Link. It may also
   * contain additional antenna pointing/blanking parameters.
   * <p>
   * @param values One or more instances of type {@link StationConfig...}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withStationConfig(StationConfig... values) {
    if (values != null) {
      getStationConfig().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StationConfig
   * <p>
   * Complex element StationConfig describes one couple (station, configuration)
   * used for transmitting and/or receiving in the current Link. It may also
   * contain additional antenna pointing/blanking parameters.
   * <p>
   * @param values A collection of {@link StationConfig} instances
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withStationConfig(Collection<StationConfig> values) {
    if (values != null) {
      getStationConfig().addAll(values);
    }
    return this;
  }

  /**
   * Set the Assigned
   * <p>
   * Complex element Assigned contains the assigned frequency(ies), channel or
   * net number; it can also contain the old frequency.
   * <p>
   * @param values One or more instances of type {@link Assigned...}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withAssigned(Assigned... values) {
    if (values != null) {
      getAssigned().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Assigned
   * <p>
   * Complex element Assigned contains the assigned frequency(ies), channel or
   * net number; it can also contain the old frequency.
   * <p>
   * @param values A collection of {@link Assigned} instances
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withAssigned(Collection<Assigned> values) {
    if (values != null) {
      getAssigned().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:DCSTrunk
   * <p>
   * Complex element DCSTrunk (US) is the Defense Communications System (DCS)
   * trunk identifier for a specific "trunked" system. The identifier is
   * assigned by the Defense Information Systems Agency (DISA).
   * <p>
   * @param values One or more instances of type {@link DCSTrunk...}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withDCSTrunk(DCSTrunk... values) {
    if (values != null) {
      getDCSTrunk().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:DCSTrunk
   * <p>
   * Complex element DCSTrunk (US) is the Defense Communications System (DCS)
   * trunk identifier for a specific "trunked" system. The identifier is
   * assigned by the Defense Information Systems Agency (DISA).
   * <p>
   * @param values A collection of {@link DCSTrunk} instances
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withDCSTrunk(Collection<DCSTrunk> values) {
    if (values != null) {
      getDCSTrunk().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link DetailedFunction...}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withDetailedFunction(DetailedFunction... values) {
    if (values != null) {
      getDetailedFunction().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link DetailedFunction} instances
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withDetailedFunction(Collection<DetailedFunction> values) {
    if (values != null) {
      getDetailedFunction().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Link instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Link {"
      + (linkID != null ? " linkID [" + linkID + "]" : "")
      + (dcsTrunk != null ? " dcsTrunk [" + dcsTrunk + "]" : "")
      + (stationConfig != null ? " stationConfig [" + stationConfig + "]" : "")
      + (detailedFunction != null ? " detailedFunction [" + detailedFunction + "]" : "")
      + (assigned != null ? " assigned [" + assigned + "]" : "")
      + (tuning != null ? " tuning [" + tuning + "]" : "")
      + (linkName != null ? " linkName [" + linkName + "]" : "")
      + (majorFunction != null ? " majorFunction [" + majorFunction + "]" : "")
      + (intermediateFunction != null ? " intermediateFunction [" + intermediateFunction + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Link} requires
   * {@link TString LinkID}, {@link StationConfig StationConfig}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLinkID() && isSetStationConfig();
  }

}
