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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Enumerated values for fields using the ListCMO type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlType(name = "ListCMO")
@XmlEnum
public enum ListCMO {

  @XmlEnumValue("AM Clear Voice")
  AM_CLEAR_VOICE("AM Clear Voice"),
  @XmlEnumValue("AM Secure Voice")
  AM_SECURE_VOICE("AM Secure Voice"),
  @XmlEnumValue("ASK/OOK")
  ASK_OOK("ASK/OOK"),
  @XmlEnumValue("Audio FSK")
  AUDIO_FSK("Audio FSK"),
  @XmlEnumValue("Binary Phase Shift Key")
  BINARY_PHASE_SHIFT_KEY("Binary Phase Shift Key"),
  @XmlEnumValue("Code Division Multiplex")
  CODE_DIVISION_MULTIPLEX("Code Division Multiplex"),
  COFDM("COFDM"),
  CPFSK("CPFSK"),
  @XmlEnumValue("Data")
  DATA("Data"),
  @XmlEnumValue("Differential PSK")
  DIFFERENTIAL_PSK("Differential PSK"),
  @XmlEnumValue("Doppler Frequency-Shift")
  DOPPLER_FREQUENCY_SHIFT("Doppler Frequency-Shift"),
  @XmlEnumValue("FM Clear Voice")
  FM_CLEAR_VOICE("FM Clear Voice"),
  @XmlEnumValue("FM Secure Voice")
  FM_SECURE_VOICE("FM Secure Voice"),
  @XmlEnumValue("Frequency Division Multiplex")
  FREQUENCY_DIVISION_MULTIPLEX("Frequency Division Multiplex"),
  FSK("FSK"),
  @XmlEnumValue("Gaussian MSK")
  GAUSSIAN_MSK("Gaussian MSK"),
  @XmlEnumValue("Minimum Shift Keying")
  MINIMUM_SHIFT_KEYING("Minimum Shift Keying"),
  @XmlEnumValue("Multichannel ")
  MULTICHANNEL__("Multichannel "),
  @XmlEnumValue("Multichannel Data")
  MULTICHANNEL_DATA("Multichannel Data"),
  @XmlEnumValue("Multichannel PCM Voice")
  MULTICHANNEL_PCM_VOICE("Multichannel PCM Voice"),
  @XmlEnumValue("Multi-channel PCM Voice")
  MULTI_CHANNEL_PCM_VOICE("Multi-channel PCM Voice"),
  @XmlEnumValue("Multichannel Voice")
  MULTICHANNEL_VOICE("Multichannel Voice"),
  @XmlEnumValue("Multichannel Voice/Data")
  MULTICHANNEL_VOICE_DATA("Multichannel Voice/Data"),
  NOISE("NOISE"),
  OFDM("OFDM"),
  PSK("PSK"),
  QAM("QAM"),
  @XmlEnumValue("Quadrature Partial Response Signaling")
  QUADRATURE_PARTIAL_RESPONSE_SIGNALING("Quadrature Partial Response Signaling"),
  @XmlEnumValue("Quadrature PSK")
  QUADRATURE_PSK("Quadrature PSK"),
  @XmlEnumValue("Secure Data")
  SECURE_DATA("Secure Data"),
  @XmlEnumValue("Single Channel")
  SINGLE_CHANNEL("Single Channel"),
  @XmlEnumValue("Single Secure Voice Channel")
  SINGLE_SECURE_VOICE_CHANNEL("Single Secure Voice Channel"),
  @XmlEnumValue("Single Voice Channel")
  SINGLE_VOICE_CHANNEL("Single Voice Channel"),
  @XmlEnumValue("Time Division Multiplex")
  TIME_DIVISION_MULTIPLEX("Time Division Multiplex"),
  @XmlEnumValue("Tuned Frequency Modulation")
  TUNED_FREQUENCY_MODULATION("Tuned Frequency Modulation"),
  @XmlEnumValue("Video")
  VIDEO("Video"),
  @XmlEnumValue("Binary FSK")
  BINARY_FSK("Binary FSK"),
  @XmlEnumValue("Coherent FSK")
  COHERENT_FSK("Coherent FSK"),
  @XmlEnumValue("Coherent MSK")
  COHERENT_MSK("Coherent MSK"),
  @XmlEnumValue("Coherent Quadrature PSK")
  COHERENT_QUADRATURE_PSK("Coherent Quadrature PSK"),
  @XmlEnumValue("Differential Binary PSK")
  DIFFERENTIAL_BINARY_PSK("Differential Binary PSK"),
  @XmlEnumValue("Differential Gaussian MSK")
  DIFFERENTIAL_GAUSSIAN_MSK("Differential Gaussian MSK"),
  @XmlEnumValue("Differential Quadrature PSK")
  DIFFERENTIAL_QUADRATURE_PSK("Differential Quadrature PSK"),
  @XmlEnumValue("Differential Raised Cosine MSK")
  DIFFERENTIAL_RAISED_COSINE_MSK("Differential Raised Cosine MSK"),
  @XmlEnumValue("Direct Sequence Binary FSK")
  DIRECT_SEQUENCE_BINARY_FSK("Direct Sequence Binary FSK"),
  @XmlEnumValue("Direct Sequence Binary PSK")
  DIRECT_SEQUENCE_BINARY_PSK("Direct Sequence Binary PSK"),
  @XmlEnumValue("Direct Sequence Complementary Code Keying")
  DIRECT_SEQUENCE_COMPLEMENTARY_CODE_KEYING("Direct Sequence Complementary Code Keying"),
  @XmlEnumValue("Direct Sequence FSK")
  DIRECT_SEQUENCE_FSK("Direct Sequence FSK"),
  @XmlEnumValue("Direct Sequence MSK")
  DIRECT_SEQUENCE_MSK("Direct Sequence MSK"),
  @XmlEnumValue("Direct Sequence Offset Quadrature PSK")
  DIRECT_SEQUENCE_OFFSET_QUADRATURE_PSK("Direct Sequence Offset Quadrature PSK"),
  @XmlEnumValue("Direct Sequence PSK")
  DIRECT_SEQUENCE_PSK("Direct Sequence PSK"),
  @XmlEnumValue("Direct Sequence Quadrature PSK")
  DIRECT_SEQUENCE_QUADRATURE_PSK("Direct Sequence Quadrature PSK"),
  @XmlEnumValue("Feher QPSK-B")
  FEHER_QPSK_B("Feher QPSK-B"),
  @XmlEnumValue("Feher QPSK-JR")
  FEHER_QPSK_JR("Feher QPSK-JR"),
  @XmlEnumValue("Gaussian FSK")
  GAUSSIAN_FSK("Gaussian FSK"),
  @XmlEnumValue("Multi-index Continuous Phase Modulation")
  MULTI_INDEX_CONTINUOUS_PHASE_MODULATION("Multi-index Continuous Phase Modulation"),
  @XmlEnumValue("Offset Quadrature PSK")
  OFFSET_QUADRATURE_PSK("Offset Quadrature PSK"),
  @XmlEnumValue("Quadrature FSK")
  QUADRATURE_FSK("Quadrature FSK"),
  @XmlEnumValue("Shaped Binary PSK")
  SHAPED_BINARY_PSK("Shaped Binary PSK"),
  @XmlEnumValue("Shaped FSK")
  SHAPED_FSK("Shaped FSK"),
  @XmlEnumValue("Shaped MSK")
  SHAPED_MSK("Shaped MSK"),
  @XmlEnumValue("Shaped Offset Quadrature PSK")
  SHAPED_OFFSET_QUADRATURE_PSK("Shaped Offset Quadrature PSK"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCMO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCMO fromValue(String v) {
    for (ListCMO c : ListCMO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
