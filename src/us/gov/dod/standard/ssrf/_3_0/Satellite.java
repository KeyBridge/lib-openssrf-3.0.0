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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.adapter.types.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_0.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_0.satellite.EarthStation;
import us.gov.dod.standard.ssrf._3_0.satellite.ServiceArea;

/**
 * Satellite contains station information related to the space service.
 * <p>
 * Sub-Elements are
 * {@link EarthStation}, {@link Nomenclature}, {@link ServiceArea}
 * <p>
 * Example:
 * <pre>
 * &lt;Satellite cls="U"&gt;
 *   &lt;Serial cls="U"&gt;GBR::SA:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;OrbitType cls="U"&gt;GEO Stationary&lt;/OrbitType&gt;
 *   &lt;LaunchStatus cls="U"&gt;Operational&lt;/LaunchStatus&gt;
 *   &lt;GeoNominalLon cls="U"&gt;0053000E&lt;/GeoNominalLon&gt;
 *   &lt;NetworkName cls="U"&gt;SKYNET 4&lt;/NetworkName&gt;
 * &lt;/Satellite&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Satellite", propOrder = {
  "reviewDate",
  "callSign",
  "orbitType",
  "launchStatus",
  "launchLocRef",
  "launchDate",
  "geoNominalLon",
  "geoAltitude",
  "nonGeoPeriod",
  "nonGeoNumSatellites",
  "nonGeoApogee",
  "nonGeoPerigee",
  "nonGeoInclination",
  "internationalDesignator",
  "objectNum",
  "administration",
  "networkName",
  "rfSystemRef",
  "earthStation",
  "identifier",
  "serviceArea"
})
public class Satellite extends Common<Satellite> {

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
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * CallSign - Call Sign (Optional)
   * <p>
   * The call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CallSign", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString callSign;
  /**
   * OrbitType - Orbit Type (Optional)
   * <p>
   * The type of orbit.
   * <p>
   * Format is L:CSP
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OrbitType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString orbitType;
  /**
   * LaunchStatus - Launch Status (Optional)
   * <p>
   * The status of the satellite.
   * <p>
   * Format is L:CLS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LaunchStatus", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString launchStatus;
  /**
   * LaunchLocRef - Launch Location Serial (Optional)
   * <p>
   * A reference to a Location that identifies the satellite launch location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LaunchLocRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial launchLocRef;
  /**
   * LaunchDate - Launch Date (Optional)
   * <p>
   * The date of the satellite launch.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LaunchDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar launchDate;
  /**
   * GeoNominalLon - Geostationary Nominal Longitude (Optional)
   * <p>
   * The longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GeoNominalLon", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString geoNominalLon;
  /**
   * GeoAltitude - Geostationary Altitude (Optional)
   * <p>
   * The altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GeoAltitude", required = false)
  private TDecimal geoAltitude;
  /**
   * NonGeoPeriod - Non-Geostationary Period (Optional)
   * <p>
   * The time required for the non-geostationary satellite to make one complete
   * orbit around the earth.
   * <p>
   * Format is UN(10,4) (min)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoPeriod", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMINUTES.class)
  private TDecimal nonGeoPeriod;
  /**
   * NonGeoNumSatellites - Number of Non-Geostationary Satellites (Optional)
   * <p>
   * The number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * Format is UN(4)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoNumSatellites", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger nonGeoNumSatellites;
  /**
   * NonGeoApogee - Non-Geostationary Apogee (Optional)
   * <p>
   * The maximum altitude of the non-geostationary satellite relative to Mean
   * Sea Level (MSL).
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoApogee", required = false)
  private TDecimal nonGeoApogee;
  /**
   * NonGeoPerigee - Non-Geostationary Perigee (Optional)
   * <p>
   * The minimum altitude of the non-geostationary satellite relative to Mean
   * Sea Level (MSL).
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoPerigee", required = false)
  private TDecimal nonGeoPerigee;
  /**
   * NonGeoInclination - Non-Geostationary Inclination (Optional)
   * <p>
   * The angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoInclination", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal nonGeoInclination;
  /**
   * InternationalDesignator - International Designator (Optional)
   * <p>
   * The externally-assigned International Designator for the satellite.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InternationalDesignator", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString internationalDesignator;
  /**
   * ObjectNum - Object Number (Optional)
   * <p>
   * The USSPACECOM-assigned space object identification number.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObjectNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString objectNum;
  /**
   * Administration - Notifying Administration (Optional)
   * <p>
   * The country and/or administration which registered the satellite.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Administration", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString administration;
  /**
   * NetworkName - Network Name (Optional)
   * <p>
   * The name of the network to which the satellite belongs.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NetworkName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString networkName;
  /**
   * RFSystemRef (Optional)
   * <p>
   * RFSystemRef contains a reference to a RF System used on the satellite.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFSystemRef", nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TString> rfSystemRef;
  /**
   * EarthStation (Optional)
   * <p>
   * EarthStation contains the name and type of an earth station used in a
   * satellite network.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EarthStation")
  private List<EarthStation> earthStation;

  @XmlElement(name = "Identifier")
  private List<Identifier> identifier;
  /**
   * ServiceArea (Optional)
   * <p>
   * ServiceArea contains the geographic area serviced by the satellite.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ServiceArea", nillable = true)
  private List<ServiceArea> serviceArea;

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
   * Get the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @return the CallSign value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCallSign() {
    return callSign;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value the CallSign value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCallSign(TString value) {
    this.callSign = value;
  }

  /**
   * Determine if the CallSign is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCallSign() {
    return (this.callSign != null ? this.callSign.isSetValue() : false);
  }

  /**
   * Get the type of orbit.
   * <p>
   * @return the OrbitType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOrbitType() {
    return orbitType;
  }

  /**
   * Set the type of orbit.
   * <p>
   * @param value the OrbitType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOrbitType(TString value) {
    this.orbitType = value;
  }

  /**
   * Determine if the OrbitType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrbitType() {
    return (this.orbitType != null ? this.orbitType.isSetValue() : false);
  }

  /**
   * Get the status of the satellite.
   * <p>
   * @return the LaunchStatus value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLaunchStatus() {
    return launchStatus;
  }

  /**
   * Set the status of the satellite.
   * <p>
   * @param value the LaunchStatus value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLaunchStatus(TString value) {
    this.launchStatus = value;
  }

  /**
   * Determine if the LaunchStatus is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchStatus() {
    return (this.launchStatus != null ? this.launchStatus.isSetValue() : false);
  }

  /**
   * Get a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @return the LaunchLocRef value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLaunchLoc()} instead.
   */
  @Deprecated
  public TSerial getLaunchLocRef() {
    return launchLocRef;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value the LaunchLocRef value in a {@link TString} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLaunchLoc(Location)} instead.
   */
  @Deprecated
  public void setLaunchLocRef(TSerial value) {
    this.launchLocRef = value;
  }

  /**
   * Determine if the LaunchLocRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchLocRef() {
    return (this.launchLocRef != null ? this.launchLocRef.isSetValue() : false);
  }

  /**
   * Get the date of the satellite launch.
   * <p>
   * @return the LaunchDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public TCalendar getLaunchDate() {
    return launchDate;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value the LaunchDate value in a {@link TCalendar} data type
   * @since 3.1.0
   */
  public void setLaunchDate(TCalendar value) {
    this.launchDate = value;
  }

  /**
   * Determine if the LaunchDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchDate() {
    return (this.launchDate != null ? this.launchDate.isSetValue() : false);
  }

  /**
   * Get the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @return the GeoNominalLon value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getGeoNominalLon() {
    return geoNominalLon;
  }

  /**
   * Set the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @param value the GeoNominalLon value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setGeoNominalLon(TString value) {
    this.geoNominalLon = value;
  }

  /**
   * Determine if the GeoNominalLon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoNominalLon() {
    return (this.geoNominalLon != null ? this.geoNominalLon.isSetValue() : false);
  }

  /**
   * Get the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @return a {@link JAXBElement<TDistance} instance
   *         @since
   * 3.1.0
   */
  public TDecimal getGeoAltitude() {
    return geoAltitude;
  }

  /**
   * Set the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @param value a {@link JAXBElement} instance
   * @since 3.1.0
   */
  public void setGeoAltitude(TDecimal value) {
    this.geoAltitude = value;
  }

  /**
   * Determine if the GeoAltitude is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoAltitude() {
    return (this.geoAltitude != null);
  }

  /**
   * Get the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @return the NonGeoPeriod value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getNonGeoPeriod() {
    return nonGeoPeriod;
  }

  /**
   * Set the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @param value the NonGeoPeriod value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setNonGeoPeriod(TDecimal value) {
    this.nonGeoPeriod = value;
  }

  /**
   * Determine if the NonGeoPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoPeriod() {
    return (this.nonGeoPeriod != null ? this.nonGeoPeriod.isSetValue() : false);
  }

  /**
   * Get the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @return the NonGeoNumSatellites value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public TInteger getNonGeoNumSatellites() {
    return nonGeoNumSatellites;
  }

  /**
   * Set the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @param value the NonGeoNumSatellites value in a {@link TInteger} data type
   * @since 3.1.0
   */
  public void setNonGeoNumSatellites(TInteger value) {
    this.nonGeoNumSatellites = value;
  }

  /**
   * Determine if the NonGeoNumSatellites is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoNumSatellites() {
    return (this.nonGeoNumSatellites != null ? this.nonGeoNumSatellites.isSetValue() : false);
  }

  /**
   * Get the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @return a {@link JAXBElement<TDistance} instance
   *         @since
   * 3.1.0
   */
  public TDecimal getNonGeoApogee() {
    return nonGeoApogee;
  }

  /**
   * Set the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value a {@link JAXBElement} instance
   * @since 3.1.0
   */
  public void setNonGeoApogee(TDecimal value) {
    this.nonGeoApogee = value;
  }

  /**
   * Determine if the NonGeoApogee is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoApogee() {
    return (this.nonGeoApogee != null);
  }

  /**
   * Get the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @return a {@link JAXBElement<TDistance} instance
   *         @since
   * 3.1.0
   */
  public TDecimal getNonGeoPerigee() {
    return nonGeoPerigee;
  }

  /**
   * Set the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value a {@link JAXBElement} instance
   * @since 3.1.0
   */
  public void setNonGeoPerigee(TDecimal value) {
    this.nonGeoPerigee = value;
  }

  /**
   * Determine if the NonGeoPerigee is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoPerigee() {
    return (this.nonGeoPerigee != null);
  }

  /**
   * Get the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @return the NonGeoInclination value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public TDecimal getNonGeoInclination() {
    return nonGeoInclination;
  }

  /**
   * Set the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @param value the NonGeoInclination value in a {@link TDecimal} data type
   * @since 3.1.0
   */
  public void setNonGeoInclination(TDecimal value) {
    this.nonGeoInclination = value;
  }

  /**
   * Determine if the NonGeoInclination is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoInclination() {
    return (this.nonGeoInclination != null ? this.nonGeoInclination.isSetValue() : false);
  }

  /**
   * Get the externally-assigned International Designator for the satellite.
   * <p>
   * @return the InternationalDesignator value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getInternationalDesignator() {
    return internationalDesignator;
  }

  /**
   * Set the externally-assigned International Designator for the satellite.
   * <p>
   * @param value the InternationalDesignator value in a {@link TString} data
   *              type
   * @since 3.1.0
   */
  public void setInternationalDesignator(TString value) {
    this.internationalDesignator = value;
  }

  /**
   * Determine if the InternationalDesignator is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInternationalDesignator() {
    return (this.internationalDesignator != null ? this.internationalDesignator.isSetValue() : false);
  }

  /**
   * Get the USSPACECOM-assigned space object identification number.
   * <p>
   * @return the ObjectNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getObjectNum() {
    return objectNum;
  }

  /**
   * Set the USSPACECOM-assigned space object identification number.
   * <p>
   * @param value the ObjectNum value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setObjectNum(TString value) {
    this.objectNum = value;
  }

  /**
   * Determine if the ObjectNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObjectNum() {
    return (this.objectNum != null ? this.objectNum.isSetValue() : false);
  }

  /**
   * Get the country and/or administration which registered the satellite.
   * <p>
   * @return the Administration value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Set the country and/or administration which registered the satellite.
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
   * Get the name of the network to which the satellite belongs.
   * <p>
   * @return the NetworkName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getNetworkName() {
    return networkName;
  }

  /**
   * Set the name of the network to which the satellite belongs.
   * <p>
   * @param value the NetworkName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setNetworkName(TString value) {
    this.networkName = value;
  }

  /**
   * Determine if the NetworkName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetworkName() {
    return (this.networkName != null ? this.networkName.isSetValue() : false);
  }

  /**
   * Get the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @return a {@link TString} instance
   * @since 3.1.0
   */
  public List<TString> getRFSystemRef() {
    if (rfSystemRef == null) {
      rfSystemRef = new ArrayList<>();
    }
    return this.rfSystemRef;
  }

  /**
   * Determine if the RFSystemRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSystemRef() {
    return ((this.rfSystemRef != null) && (!this.rfSystemRef.isEmpty()));
  }

  /**
   * Clear the RFSystemRef field. This sets the field to null.
   */
  public void unsetRFSystemRef() {
    this.rfSystemRef = null;
  }

  /**
   * Get the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @return a {@link EarthStation} instance
   * @since 3.1.0
   */
  public List<EarthStation> getEarthStation() {
    if (earthStation == null) {
      earthStation = new ArrayList<>();
    }
    return this.earthStation;
  }

  /**
   * Determine if the EarthStation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEarthStation() {
    return ((this.earthStation != null) && (!this.earthStation.isEmpty()));
  }

  /**
   * Clear the EarthStation field. This sets the field to null.
   */
  public void unsetEarthStation() {
    this.earthStation = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Identifier} instance
   * @since 3.1.0
   */
  public List<Identifier> getIdentifier() {
    if (identifier == null) {
      identifier = new ArrayList<>();
    }
    return this.identifier;
  }

  /**
   * Determine if the Identifier is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdentifier() {
    return ((this.identifier != null) && (!this.identifier.isEmpty()));
  }

  /**
   * Clear the Identifier field. This sets the field to null.
   */
  public void unsetIdentifier() {
    this.identifier = null;
  }

  /**
   * Get the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @return a {@link ServiceArea} instance
   * @since 3.1.0
   */
  public List<ServiceArea> getServiceArea() {
    if (serviceArea == null) {
      serviceArea = new ArrayList<>();
    }
    return this.serviceArea;
  }

  /**
   * Determine if the ServiceArea is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceArea() {
    return ((this.serviceArea != null) && (!this.serviceArea.isEmpty()));
  }

  /**
   * Clear the ServiceArea field. This sets the field to null.
   */
  public void unsetServiceArea() {
    this.serviceArea = null;
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
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withReviewDate(Calendar value) {
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
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withCallSign(String value) {
    setCallSign(new TString(value));
    return this;
  }

  /**
   * Set the type of orbit.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withOrbitType(String value) {
    setOrbitType(new TString(value));
    return this;
  }

  /**
   * Set the status of the satellite.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withLaunchStatus(String value) {
    setLaunchStatus(new TString(value));
    return this;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLaunchLoc(Location)} instead.
   */
  @Deprecated
  public Satellite withLaunchLocRef(TSerial value) {
    setLaunchLocRef(value);
    return this;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withLaunchDate(Calendar value) {
    setLaunchDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withLaunchDate(Date value) {
    setLaunchDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withGeoNominalLon(String value) {
    setGeoNominalLon(new TString(value));
    return this;
  }

  /**
   * Set the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @param value An instances of type {@link TDecimal}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withGeoAltitude(TDecimal value) {
    return this;
  }

  /**
   * Set the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withNonGeoPeriod(Double value) {
    setNonGeoPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withNonGeoNumSatellites(Integer value) {
    setNonGeoNumSatellites(new TInteger(value));
    return this;
  }

  /**
   * Set the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link TDecimal}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withNonGeoApogee(TDecimal value) {
    return this;
  }

  /**
   * Set the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link TDecimal}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withNonGeoPerigee(TDecimal value) {
    return this;
  }

  /**
   * Set the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withNonGeoInclination(Double value) {
    setNonGeoInclination(new TDecimal(value));
    return this;
  }

  /**
   * Set the externally-assigned International Designator for the satellite.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withInternationalDesignator(String value) {
    setInternationalDesignator(new TString(value));
    return this;
  }

  /**
   * Set the USSPACECOM-assigned space object identification number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withObjectNum(String value) {
    setObjectNum(new TString(value));
    return this;
  }

  /**
   * Set the country and/or administration which registered the satellite.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withAdministration(String value) {
    setAdministration(new TString(value));
    return this;
  }

  /**
   * Set the name of the network to which the satellite belongs.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withNetworkName(String value) {
    setNetworkName(new TString(value));
    return this;
  }

  /**
   * Set the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @param values One or more instances of type {@link RFSystemRef...}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withRFSystemRef(TString... values) {
    if (values != null) {
      getRFSystemRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withRFSystemRef(Collection<TString> values) {
    if (values != null) {
      getRFSystemRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @param values One or more instances of type {@link EarthStation...}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withEarthStation(EarthStation... values) {
    if (values != null) {
      getEarthStation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @param values A collection of {@link EarthStation} instances
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withEarthStation(Collection<EarthStation> values) {
    if (values != null) {
      getEarthStation().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Identifier...}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withIdentifier(Identifier... values) {
    if (values != null) {
      getIdentifier().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Identifier} instances
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withIdentifier(Collection<Identifier> values) {
    if (values != null) {
      getIdentifier().addAll(values);
    }
    return this;
  }

  /**
   * Set the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @param values One or more instances of type {@link ServiceArea...}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withServiceArea(ServiceArea... values) {
    if (values != null) {
      getServiceArea().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @param values A collection of {@link ServiceArea} instances
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withServiceArea(Collection<ServiceArea> values) {
    if (values != null) {
      getServiceArea().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Satellite instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Satellite {"
      + (launchLocRef != null ? " launchLocRef [" + launchLocRef + "]" : "")
      + (geoAltitude != null ? " geoAltitude [" + geoAltitude + "]" : "")
      + (internationalDesignator != null ? " internationalDesignator [" + internationalDesignator + "]" : "")
      + (objectNum != null ? " objectNum [" + objectNum + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (orbitType != null ? " orbitType [" + orbitType + "]" : "")
      + (nonGeoInclination != null ? " nonGeoInclination [" + nonGeoInclination + "]" : "")
      + (nonGeoPeriod != null ? " nonGeoPeriod [" + nonGeoPeriod + "]" : "")
      + (nonGeoNumSatellites != null ? " nonGeoNumSatellites [" + nonGeoNumSatellites + "]" : "")
      + (rfSystemRef != null ? " rfSystemRef [" + rfSystemRef + "]" : "")
      + (nonGeoApogee != null ? " nonGeoApogee [" + nonGeoApogee + "]" : "")
      + (earthStation != null ? " earthStation [" + earthStation + "]" : "")
      + (callSign != null ? " callSign [" + callSign + "]" : "")
      + (launchStatus != null ? " launchStatus [" + launchStatus + "]" : "")
      + (geoNominalLon != null ? " geoNominalLon [" + geoNominalLon + "]" : "")
      + (networkName != null ? " networkName [" + networkName + "]" : "")
      + (serviceArea != null ? " serviceArea [" + serviceArea + "]" : "")
      + (identifier != null ? " identifier [" + identifier + "]" : "")
      + (launchDate != null ? " launchDate [" + launchDate + "]" : "")
      + (administration != null ? " administration [" + administration + "]" : "")
      + (nonGeoPerigee != null ? " nonGeoPerigee [" + nonGeoPerigee + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Satellite} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LaunchLocRef - Launch Location Serial (Optional)
   * <p>
   * A reference to a Location that identifies the satellite launch location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location launchLoc;

  /**
   * Get a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLaunchLoc() {
    return launchLoc;
  }

  /**
   * Determine if the launchLoc field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchLoc() {
    return this.launchLoc != null;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value An instances of type {@link Location}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withLaunchLoc(Location value) {
    this.launchLoc = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this Satellite record.
   * <p>
   * This method builds the exported {@link #launchLocRef} field with values
   * from the transient {@link #launchLoc} field. This method should typically
   * be called after the Satellite is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @return The current Satellite object instance
   */
  @Override
  public Satellite prepare() {
    super.prepare();
    this.launchLocRef = launchLoc != null ? launchLoc.getSerial() : null;
    return this;
  }

  /**
   * Update the SSRF data type references in this Satellite record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #launchLoc} with values from the
   * imported {@link #launchLocRef} field. This method should typically be
   * called after the Satellite is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (launchLocRef == null || !launchLocRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (launchLocRef.equals(instance.getSerial())) {
        launchLoc = instance;
        return;
      }
    }
  }//</editor-fold>

}
