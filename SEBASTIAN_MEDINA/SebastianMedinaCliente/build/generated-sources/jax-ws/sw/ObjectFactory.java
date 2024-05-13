
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CargarDistribuidor_QNAME = new QName("http://sw/", "cargarDistribuidor");
    private final static QName _CargarDistribuidorResponse_QNAME = new QName("http://sw/", "cargarDistribuidorResponse");
    private final static QName _CargarMedicamentos_QNAME = new QName("http://sw/", "cargarMedicamentos");
    private final static QName _CargarMedicamentosResponse_QNAME = new QName("http://sw/", "cargarMedicamentosResponse");
    private final static QName _CrearProducto_QNAME = new QName("http://sw/", "crearProducto");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://sw/", "crearProductoResponse");
    private final static QName _Eliminar_QNAME = new QName("http://sw/", "eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://sw/", "eliminarResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CargarDistribuidor }
     * 
     */
    public CargarDistribuidor createCargarDistribuidor() {
        return new CargarDistribuidor();
    }

    /**
     * Create an instance of {@link CargarDistribuidorResponse }
     * 
     */
    public CargarDistribuidorResponse createCargarDistribuidorResponse() {
        return new CargarDistribuidorResponse();
    }

    /**
     * Create an instance of {@link CargarMedicamentos }
     * 
     */
    public CargarMedicamentos createCargarMedicamentos() {
        return new CargarMedicamentos();
    }

    /**
     * Create an instance of {@link CargarMedicamentosResponse }
     * 
     */
    public CargarMedicamentosResponse createCargarMedicamentosResponse() {
        return new CargarMedicamentosResponse();
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Distribuidor }
     * 
     */
    public Distribuidor createDistribuidor() {
        return new Distribuidor();
    }

    /**
     * Create an instance of {@link Medicamento }
     * 
     */
    public Medicamento createMedicamento() {
        return new Medicamento();
    }

    /**
     * Create an instance of {@link TipoMedicamento }
     * 
     */
    public TipoMedicamento createTipoMedicamento() {
        return new TipoMedicamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDistribuidor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarDistribuidor }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "cargarDistribuidor")
    public JAXBElement<CargarDistribuidor> createCargarDistribuidor(CargarDistribuidor value) {
        return new JAXBElement<CargarDistribuidor>(_CargarDistribuidor_QNAME, CargarDistribuidor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDistribuidorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarDistribuidorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "cargarDistribuidorResponse")
    public JAXBElement<CargarDistribuidorResponse> createCargarDistribuidorResponse(CargarDistribuidorResponse value) {
        return new JAXBElement<CargarDistribuidorResponse>(_CargarDistribuidorResponse_QNAME, CargarDistribuidorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarMedicamentos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarMedicamentos }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "cargarMedicamentos")
    public JAXBElement<CargarMedicamentos> createCargarMedicamentos(CargarMedicamentos value) {
        return new JAXBElement<CargarMedicamentos>(_CargarMedicamentos_QNAME, CargarMedicamentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarMedicamentosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarMedicamentosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "cargarMedicamentosResponse")
    public JAXBElement<CargarMedicamentosResponse> createCargarMedicamentosResponse(CargarMedicamentosResponse value) {
        return new JAXBElement<CargarMedicamentosResponse>(_CargarMedicamentosResponse_QNAME, CargarMedicamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "crearProducto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "crearProductoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
