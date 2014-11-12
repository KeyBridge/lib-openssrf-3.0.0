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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.channelplan.Channel;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * ChannelPlan describes the plan for the channel set.
 * <p>
 * Sub-Element is {@link Channel}
 * <p>
 * Example:
 * <pre>
 * &lt;ChannelPlan&gt;
 *   &lt;Channel&gt;
 *     &lt;Name cls="U"&gt;Channel Plan One&lt;/Name&gt;
 *     &lt;User  cls="U"&gt;Channel Master&lt;/User &gt;
 *     &lt;ChannelFreq cls="U"&gt;200&lt;/ChannelFreq&gt;
 *   &lt;/Channel&gt;
 *   &lt;Channel&gt;
 *     &lt;Name cls="U"&gt;Channel Plan Seven&lt;/Name&gt;
 *     &lt;User  cls="U"&gt;Channel Meister&lt;/User &gt;
 *     &lt;ChannelFreq cls="U"&gt;400&lt;/ChannelFreq&gt;
 *   &lt;/Channel&gt;
 * &lt;/ChannelPlan&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPlan", propOrder = {
  "name",
  "channel"
})
public class ChannelPlan extends Common<ChannelPlan> {

  /**
   * Name - Channel Plan Name (Required)
   * <p>
   * The name of this channel plan (e.g., "Plan for Wireless Microphones in the
   * Band 162-174 MHz").
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * ChannelPlanRef - Element Content (Required)
   * <p>
   * The serial of the referenced ChannelPlan.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Channel", required = true)
  private List<Channel> channel;

  /**
   * Get the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz").
   * <p>
   * @return the Name value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz").
   * <p>
   * @param value the Name value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the serial of the referenced ChannelPlan.
   * <p>
   * @return a {@link Channel} instance
   * @since 3.1.0
   */
  public List<Channel> getChannel() {
    if (channel == null) {
      channel = new ArrayList<Channel>();
    }
    return this.channel;
  }

  /**
   * Determine if the Channel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannel() {
    return ((this.channel != null) && (!this.channel.isEmpty()));
  }

  /**
   * Clear the Channel field. This sets the field to null.
   */
  public void unsetChannel() {
    this.channel = null;
  }

  /**
   * Set the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz").
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ChannelPlan object instance
   * @since 3.1.0
   */
  public ChannelPlan withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the serial of the referenced ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link Channel...}
   * @return The current ChannelPlan object instance
   * @since 3.1.0
   */
  public ChannelPlan withChannel(Channel... values) {
    if (values != null) {
      getChannel().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the serial of the referenced ChannelPlan.
   * <p>
   * @param values A collection of {@link Channel} instances
   * @return The current ChannelPlan object instance
   * @since 3.1.0
   */
  public ChannelPlan withChannel(Collection<Channel> values) {
    if (values != null) {
      getChannel().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ChannelPlan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ChannelPlan {"
      + (name != null ? " name [" + name + "]" : "")
      + (channel != null ? " channel [" + channel + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ChannelPlan} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Channel Channel}, {@link TString Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetChannel() && isSetName();
  }

}
