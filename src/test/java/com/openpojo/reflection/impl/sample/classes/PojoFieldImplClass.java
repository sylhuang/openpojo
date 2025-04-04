/*
 * Copyright (c) 2010-2018 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.reflection.impl.sample.classes;

import lombok.Getter;
import lombok.Setter;

/**
 * @author oshoukry
 */
public class PojoFieldImplClass {

  @SuppressWarnings("unused")
  private static final String STATICFINALFIELD = "Static Final Field";
  private String nonStaticNonFinal;

  @SuppressWarnings("unused")
  private int primitiveIntField;

  @SuppressWarnings("unused")
  private int privateIntField;
  protected int protectedIntField;
  public int publicIntField;
  int packagePrivateIntField;

  private Boolean booleanField;

  private String privateString;

  public transient String transientString;

  public volatile String volatileString;

  @Getter @Setter private String lombokString;

  /**
   * @return the nonStaticNonFinal
   */
  public String getNonStaticNonFinal() {
    return nonStaticNonFinal;
  }

  /**
   * @param nonStaticNonFinal
   *     the nonStaticNonFinal to set
   */
  public void setNonStaticNonFinal(final String nonStaticNonFinal) {
    this.nonStaticNonFinal = nonStaticNonFinal;
  }

  /**
   * @return the booleanField
   */
  public Boolean isBooleanField() {
    return booleanField;
  }

  /**
   * @param booleanField
   *     the booleanField to set
   */
  public void setBooleanField(final Boolean booleanField) {
    this.booleanField = booleanField;
  }

  /**
   * @return the privateString
   */
  public String getPrivateString() {
    return privateString;
  }

  /**
   * @param privateString
   *     the privateString to set
   */
  public void setPrivateString(final String privateString) {
    this.privateString = privateString;
  }
}
