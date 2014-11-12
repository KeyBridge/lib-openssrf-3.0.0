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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * EndpointLocation defines locations where the diagram endpoint is allowed or
 * forbidden from use.
 * <p>
 * Element of {@link DiagramEndpoint}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointLocation", propOrder = {
  "antennaHeight",
  "excluded",
  "locSatRef",
  "minPointAngle",
  "siteElevation"
})
public class EndpointLocation {

  /**
   * AntennaHeight - Antenna Height (Optional)
   * <p>
   * The antenna height above the ground level.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntennaHeight", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal antennaHeight;
  /**
   * Excluded - Exclude Location (Optional)
   * <p>
   * Whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  /**
   * LocSatRef - Location or Satellite Reference (Optional)
   * <p>
   * A reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocSatRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial locSatRef;
  /**
   * MinPointAngle - Minimum Pointing Angle (Optional)
   * <p>
   * The minimum vertical pointing angle for satellite ground station antennas.
   * <p>
   * Format is UN(5,2) [0..180] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MinPointAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal minPointAngle;
  /**
   * SiteElevation - Site Elevation (Optional)
   * <p>
   * The site elevation of each base station and repeater in a trunking system.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SiteElevation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal siteElevation;

  /**
   * Get the antenna height above the ground level.
   * <p>
   * @return the AntennaHeight value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getAntennaHeight() {
    return antennaHeight;
  }

  /**
   * Set the antenna height above the ground level.
   * <p>
   * @param value the AntennaHeight value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setAntennaHeight(TDecimal value) {
    this.antennaHeight = value;
  }

  /**
   * Determine if the AntennaHeight is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntennaHeight() {
    return (this.antennaHeight != null ? this.antennaHeight.isSetValue() : false);
  }

  /**
   * Get whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * @return the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Set whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * @param value the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  /**
   * Determine if the Excluded is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExcluded() {
    return (this.excluded != null ? this.excluded.isSetValue() : false);
  }

  /**
   * Get a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @return the LocSatRef value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocSat()} instead.
   */
  @Deprecated
  public TSerial getLocSatRef() {
    return locSatRef;
  }

  /**
   * Set a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @param value the LocSatRef value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocSat(Common)} instead.
   */
  @Deprecated
  public void setLocSatRef(TSerial value) {
    this.locSatRef = value;
  }

  /**
   * Determine if the LocSatRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocSatRef() {
    return (this.locSatRef != null ? this.locSatRef.isSetValue() : false);
  }

  /**
   * Get the minimum vertical pointing angle for satellite ground station
   * antennas.
   * <p>
   * @return the MinPointAngle value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getMinPointAngle() {
    return minPointAngle;
  }

  /**
   * Set the minimum vertical pointing angle for satellite ground station
   * antennas.
   * <p>
   * @param value the MinPointAngle value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setMinPointAngle(TDecimal value) {
    this.minPointAngle = value;
  }

  /**
   * Determine if the MinPointAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinPointAngle() {
    return (this.minPointAngle != null ? this.minPointAngle.isSetValue() : false);
  }

  /**
   * Get the site elevation of each base station and repeater in a trunking
   * system.
   * <p>
   * @return the SiteElevation value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getSiteElevation() {
    return siteElevation;
  }

  /**
   * Set the site elevation of each base station and repeater in a trunking
   * system.
   * <p>
   * @param value the SiteElevation value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setSiteElevation(TDecimal value) {
    this.siteElevation = value;
  }

  /**
   * Determine if the SiteElevation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSiteElevation() {
    return (this.siteElevation != null ? this.siteElevation.isSetValue() : false);
  }

  /**
   * Set the antenna height above the ground level.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current EndpointLocation object instance
   * @since 3.1.0
   */
  public EndpointLocation withAntennaHeight(Double value) {
    setAntennaHeight(new TDecimal(value));
    return this;
  }

  /**
   * Set whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current EndpointLocation object instance
   * @since 3.1.0
   */
  public EndpointLocation withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Set a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EndpointLocation object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocSat(Common)} instead.
   */
  @Deprecated
  public EndpointLocation withLocSatRef(TSerial value) {
    setLocSatRef(value);
    return this;
  }

  /**
   * Set the minimum vertical pointing angle for satellite ground station
   * antennas.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current EndpointLocation object instance
   * @since 3.1.0
   */
  public EndpointLocation withMinPointAngle(Double value) {
    setMinPointAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set the site elevation of each base station and repeater in a trunking
   * system.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current EndpointLocation object instance
   * @since 3.1.0
   */
  public EndpointLocation withSiteElevation(Double value) {
    setSiteElevation(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this EndpointLocation instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EndpointLocation {"
      + (excluded != null ? " excluded [" + excluded + "]" : "")
      + (antennaHeight != null ? " antennaHeight [" + antennaHeight + "]" : "")
      + (locSatRef != null ? " locSatRef [" + locSatRef + "]" : "")
      + (siteElevation != null ? " siteElevation [" + siteElevation + "]" : "")
      + (minPointAngle != null ? " minPointAngle [" + minPointAngle + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EndpointLocation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocSatRef - Location or Satellite Reference (Optional)
   * <p>
   * A reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> locSat;

  /**
   * Get a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getLocSat() {
    return locSat;
  }

  /**
   * Determine if the locSat field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocSat() {
    return this.locSat != null;
  }

  /**
   * Set a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @param value An instances of type {@link Common<?>}
   * @return The current EndpointLocation object instance
   * @since 3.1.0
   */
  public EndpointLocation withLocSat(Common<?> value) {
    this.locSat = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this EndpointLocation record.
   * <p>
   * This method builds the exported {@link #locSatRef} field with values from
   * the transient {@link #locSat} field. This method should typically be called
   * after the EndpointLocation is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @return The current EndpointLocation object instance
   */
  public EndpointLocation build() {
    this.locSatRef = locSat != null ? locSat.getSerial() : null;
    return this;
  }

  /**
   * Update the SSRF data type references in this EndpointLocation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #locSat} with values from the
   * imported {@link #locSatRef} field. This method should typically be called
   * after the EndpointLocation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (locSatRef == null || !locSatRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locSatRef.equals(instance.getSerial())) {
        locSat = instance;
        return;
      }
    }
    for (Satellite instance : root.getSatellite()) {
      if (locSatRef.equals(instance.getSerial())) {
        locSat = instance;
        return;
      }
    }
  }//</editor-fold>

}
