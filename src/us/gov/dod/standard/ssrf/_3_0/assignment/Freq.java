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
import us.gov.dod.standard.ssrf._3_0.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;

/**
 * Freq indicates a single assigned frequency or an assigned range of
 * frequencies.
 * <p>
 * Element of {@link Assigned}
 * <p>
 * Sub-Elements are {@link NarrowBandPlanning}, {@link PairedFreq}
 * <p>
 * Example:
 * <pre>
 * &lt;Freq&gt;
 *   &lt;FreqMin cls="U"&gt;351.125&lt;/FreqMin&gt;
 *   &lt;LegacyNum cls="U"&gt;USAF11012345&lt;/LegacyNum&gt;
 * &lt;/Freq&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Freq", propOrder = {
  "tad",
  "legacyNum",
  "pairedFreq",
  "narrowBandPlanning"
})
public class Freq
  extends AsgnFreqBase {

  /**
   * TAD - Tactical Air Designator (Optional)
   * <p>
   * The TAD associated to the assigned frequency. A Tactical Air Designator is
   * a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * Format is US5
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TAD", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS5.class)
  private TString tad;
  /**
   * LegacyNum - Legacy Number (Optional)
   * <p>
   * A legacy reference number associated with the assigned frequency.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LegacyNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString legacyNum;
  /**
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedFreq")
  private List<PairedFreq> pairedFreq;
  /**
   * US:NarrowBandPlanning (Optional)
   * <p>
   * NarrowBandPlanning (US) describes a reduced bandwidth assignment for a
   * single frequency or a range of frequencies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NarrowBandPlanning")
  private List<NarrowBandPlanning> narrowBandPlanning;

  /**
   * Get the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @return the TAD value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTAD() {
    return tad;
  }

  /**
   * Set the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @param value the TAD value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTAD(TString value) {
    this.tad = value;
  }

  /**
   * Determine if the TAD is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTAD() {
    return (this.tad != null ? this.tad.isSetValue() : false);
  }

  /**
   * Get a legacy reference number associated with the assigned frequency.
   * <p>
   * @return the LegacyNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLegacyNum() {
    return legacyNum;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param value the LegacyNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLegacyNum(TString value) {
    this.legacyNum = value;
  }

  /**
   * Determine if the LegacyNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyNum() {
    return (this.legacyNum != null ? this.legacyNum.isSetValue() : false);
  }

  /**
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @return a {@link PairedFreq} instance
   * @since 3.1.0
   */
  public List<PairedFreq> getPairedFreq() {
    if (pairedFreq == null) {
      pairedFreq = new ArrayList<>();
    }
    return this.pairedFreq;
  }

  /**
   * Determine if the PairedFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedFreq() {
    return ((this.pairedFreq != null) && (!this.pairedFreq.isEmpty()));
  }

  /**
   * Clear the PairedFreq field. This sets the field to null.
   */
  public void unsetPairedFreq() {
    this.pairedFreq = null;
  }

  /**
   * Get the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @return a {@link NarrowBandPlanning} instance
   * @since 3.1.0
   */
  public List<NarrowBandPlanning> getNarrowBandPlanning() {
    if (narrowBandPlanning == null) {
      narrowBandPlanning = new ArrayList<>();
    }
    return this.narrowBandPlanning;
  }

  /**
   * Determine if the NarrowBandPlanning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNarrowBandPlanning() {
    return ((this.narrowBandPlanning != null) && (!this.narrowBandPlanning.isEmpty()));
  }

  /**
   * Clear the NarrowBandPlanning field. This sets the field to null.
   */
  public void unsetNarrowBandPlanning() {
    this.narrowBandPlanning = null;
  }

  /**
   * Set the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withTAD(String value) {
    setTAD(new TString(value));
    return this;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withLegacyNum(String value) {
    setLegacyNum(new TString(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param values One or more instances of type {@link PairedFreq...}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withPairedFreq(PairedFreq... values) {
    if (values != null) {
      getPairedFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param values A collection of {@link PairedFreq} instances
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withPairedFreq(Collection<PairedFreq> values) {
    if (values != null) {
      getPairedFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @param values One or more instances of type {@link NarrowBandPlanning...}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withNarrowBandPlanning(NarrowBandPlanning... values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @param values A collection of {@link NarrowBandPlanning} instances
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withNarrowBandPlanning(Collection<NarrowBandPlanning> values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Freq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Freq {"
      + (narrowBandPlanning != null ? " narrowBandPlanning [" + narrowBandPlanning + "]" : "")
      + (legacyNum != null ? " legacyNum [" + legacyNum + "]" : "")
      + (tad != null ? " tad [" + tad + "]" : "")
      + (pairedFreq != null ? " pairedFreq [" + pairedFreq + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Freq} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
