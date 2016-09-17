
package com.bloomberg.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instruments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instrument" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Instrument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="macro" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Macro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instruments", propOrder = {
    "instrument",
    "macro"
})
public class Instruments {

    protected List<Instrument> instrument;
    protected List<Macro> macro;

    /**
     * Gets the value of the instrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instrument }
     * 
     * 
     */
    public List<Instrument> getInstrument() {
        if (instrument == null) {
            instrument = new ArrayList<Instrument>();
        }
        return this.instrument;
    }

    /**
     * Gets the value of the macro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Macro }
     * 
     * 
     */
    public List<Macro> getMacro() {
        if (macro == null) {
            macro = new ArrayList<Macro>();
        }
        return this.macro;
    }

}
