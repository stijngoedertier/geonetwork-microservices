/**
 * (c) 2020 Open Source Geospatial Foundation - all rights reserved This code is licensed under the
 * GPL 2.0 license, available at the root application directory.
 */

package org.fao.geonet.index.model.dcat2;

import static org.fao.geonet.index.model.dcat2.Namespaces.RDF_URI;
import static org.fao.geonet.index.model.dcat2.Namespaces.XML_URI;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class RdfLiteral {

  /**
   *  Convert ISO639 language codes from alpha-3 to alpha-2 notation.
   */
  public static String mapLanguageCode(String alpha3) {
    switch (alpha3) {
      case "bul": return "bg";
      case "cze": return "cs";
      case "dan": return "da";
      case "ger": return "de";
      case "gre": return "el";
      case "eng": return "en";
      case "spa": return "es";
      case "est": return "et";
      case "fin": return "fi";
      case "fre": return "fr";
      case "gle": return "ga";
      case "hrv": return "hr";
      case "ita": return "it";
      case "lav": return "lv";
      case "lit": return "lt";
      case "hun": return "hu";
      case "mlt": return "mt";
      case "dut": return "nl";
      case "pol": return "pl";
      case "por": return "pt";
      case "rum": return "ru";
      case "slo": return "sk";
      case "slv": return "sl";
      case "swe": return "sv";
      default: return "en";
    }
  }

  @XmlAttribute(name = "lang", namespace = XML_URI)
  String lang;

  @XmlAttribute(name = "datatype", namespace = RDF_URI)
  String datatype;

  @XmlValue
  String value;

  /**
   * Constructor.
   *
   * @param lang Optional, for language-tagged literals, include a 2-letter language code (ISO639-1)
   * @param datatype Optional, include a datatype (e.g. xsd:DateTime).
   * @param value Mandatory
   */
  public RdfLiteral(String lang, String datatype, String value) {
    this.lang = lang;
    this.datatype = datatype;
    this.value = value;
  }
}
