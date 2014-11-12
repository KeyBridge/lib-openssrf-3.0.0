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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.types.*;
import us.gov.dod.standard.ssrf._3_0.administrative.CodeList;
import us.gov.dod.standard.ssrf._3_0.administrative.Dataset;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * Data element Administrative has several usages: It can be used to inform
 * other data repositories that datasets have been deleted from a data
 * repository; It can also be used to reject an incoming dataset which cannot be
 * validated against the local repository, for example if it refers to unknown
 * datasets. Automated local data repository changes are not permitted on US
 * systems.
 * <p>
 * Sub-Elements are {@link CodeList}, {@link Dataset}
 * <p>
 * Example: Rejecting an Assignment for which the recipient does not have the
 * referenced Transmitter dataset:
 * <pre>
 * &lt;Administrative cls="U"&gt;
 *   &lt;Serial cls="U"&gt;DEU:NFA:DR:123&lt;/Serial&gt;
 *   &lt;MessageRef cls="U"&gt;DEU:NFA:MS:123&lt;/MessageRef&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Action cls="U"&gt;Missing Refs&lt;/Action&gt;
 *   &lt;Dataset&gt;
 *     &lt;Serial cls="U"&gt;USA::AS:456&lt;/Serial&gt;
 *     &lt;MissingRef cls="U"&gt;USA::TX:123&lt;/MissingRef&gt;
 *   &lt;/Dataset&gt;
 * &lt;/Administrative&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.0.0, 11/11/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative", propOrder = {
  "action",
  "dataset",
  "codeList"
})
public class Administrative extends Common<Administrative> {

  /**
   * Action - Action (Required)
   * <p>
   * The action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * Format is L:CDR
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Action", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString action;
  /**
   * Dataset (Optional)
   * <p>
   * Dataset is used within an Administrative transaction to specify the
   * identifier of the datasets on which the action must apply.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Dataset")
  private List<Dataset> dataset;
  /**
   * CodeList (Optional)
   * <p>
   * CodeList contains the actions necessary to create or delete a code entry in
   * a given Code List.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CodeList")
  private List<CodeList> codeList;

  /**
   * Get the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * @return the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAction() {
    return action;
  }

  /**
   * Set the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * @param value the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAction(TString value) {
    this.action = value;
  }

  /**
   * Determine if the Action is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAction() {
    return (this.action != null ? this.action.isSetValue() : false);
  }

  /**
   * Get the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @return a {@link Dataset} instance
   * @since 3.1.0
   */
  public List<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new ArrayList<>();
    }
    return this.dataset;
  }

  /**
   * Determine if the Dataset is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  /**
   * Clear the Dataset field. This sets the field to null.
   */
  public void unsetDataset() {
    this.dataset = null;
  }

  /**
   * Get the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   * <p>
   * @return a {@link CodeList} instance
   * @since 3.1.0
   */
  public List<CodeList> getCodeList() {
    if (codeList == null) {
      codeList = new ArrayList<>();
    }
    return this.codeList;
  }

  /**
   * Determine if the CodeList is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeList() {
    return ((this.codeList != null) && (!this.codeList.isEmpty()));
  }

  /**
   * Clear the CodeList field. This sets the field to null.
   */
  public void unsetCodeList() {
    this.codeList = null;
  }

  /**
   * Set the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withAction(String value) {
    setAction(new TString(value));
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @param values One or more instances of type {@link Dataset...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @param values A collection of {@link Dataset} instances
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  /**
   * Set the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   * <p>
   * @param values One or more instances of type {@link CodeList...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withCodeList(CodeList... values) {
    if (values != null) {
      getCodeList().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   * <p>
   * @param values A collection of {@link CodeList} instances
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withCodeList(Collection<CodeList> values) {
    if (values != null) {
      getCodeList().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Administrative instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Administrative {"
      + (dataset != null ? " dataset [" + dataset + "]" : "")
      + (action != null ? " action [" + action + "]" : "")
      + (codeList != null ? " codeList [" + codeList + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Administrative} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Action}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAction();
  }
}
