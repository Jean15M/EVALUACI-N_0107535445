
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para distribuidor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="distribuidor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distribuidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicamento" type="{http://sw/}medicamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distribuidor", propOrder = {
    "distribuidor",
    "medicamento"
})
public class Distribuidor {

    protected String distribuidor;
    protected Medicamento medicamento;

    /**
     * Obtiene el valor de la propiedad distribuidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * Define el valor de la propiedad distribuidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribuidor(String value) {
        this.distribuidor = value;
    }

    /**
     * Obtiene el valor de la propiedad medicamento.
     * 
     * @return
     *     possible object is
     *     {@link Medicamento }
     *     
     */
    public Medicamento getMedicamento() {
        return medicamento;
    }

    /**
     * Define el valor de la propiedad medicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicamento }
     *     
     */
    public void setMedicamento(Medicamento value) {
        this.medicamento = value;
    }

}
