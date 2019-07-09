//package com.you.test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintStream;
//import java.security.AccessController;
//import java.security.PrivilegedAction;
//import java.security.PrivilegedActionException;
//import java.security.PrivilegedExceptionAction;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Properties;
//import java.util.ServiceConfigurationError;
//import java.util.ServiceLoader;
//
//import javax.xml.XMLConstants;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.FactoryConfigurationError;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.validation.Schema;
//
//import org.w3c.dom.DOMImplementation;
//import org.w3c.dom.Document;
//import org.xml.sax.EntityResolver;
//import org.xml.sax.ErrorHandler;
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//import org.xml.sax.SAXNotRecognizedException;
//import org.xml.sax.SAXNotSupportedException;
//
//import com.sun.org.apache.xerces.internal.dom.DOMImplementationImpl;
//import com.sun.org.apache.xerces.internal.dom.DOMMessageFormatter;
//import com.sun.org.apache.xerces.internal.impl.Constants;
//import com.sun.org.apache.xerces.internal.impl.validation.ValidationManager;
//import com.sun.org.apache.xerces.internal.impl.xs.XMLSchemaValidator;
//import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;
//import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl;
//import com.sun.org.apache.xerces.internal.jaxp.JAXPConstants;
//import com.sun.org.apache.xerces.internal.jaxp.validation.XSGrammarPoolContainer;
//import com.sun.org.apache.xerces.internal.parsers.DOMParser;
//import com.sun.org.apache.xerces.internal.util.SAXMessageFormatter;
//import com.sun.org.apache.xerces.internal.utils.XMLSecurityManager;
//import com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager;
//import com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager.Property;
//import com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager.State;
//import com.sun.org.apache.xerces.internal.xni.XMLDocumentHandler;
//import com.sun.org.apache.xerces.internal.xni.parser.XMLComponent;
//import com.sun.org.apache.xerces.internal.xni.parser.XMLComponentManager;
//import com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException;
//import com.sun.org.apache.xerces.internal.xni.parser.XMLDocumentSource;
//import com.sun.org.apache.xerces.internal.xni.parser.XMLParserConfiguration;
//
//public class Test287 {
//	public static void main(String[] args) {
//		Test287DocumentBuilderFactory factory = Test287DocumentBuilderFactory.newInstance();
//		PrintStream err = System.err;
//		err.println(factory);
//	}
//}
//class Test287DocumentBuilderFactory {
//
//	public static Test287DocumentBuilderFactory newInstance() {
//        return Test287FactoryFinder.find(
//                /* The default property name according to the JAXP spec */
//                Test287DocumentBuilderFactory.class, // "javax.xml.parsers.DocumentBuilderFactory"
//                /* The fallback implementation class name */
//                "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
//    }
//
//
//}
//
//class Test287FactoryFinder {
//
//    private static final String DEFAULT_PACKAGE = "com.sun.org.apache.xerces.internal";
//    /**
//     * Internal debug flag.
//     */
//    private static boolean debug = false;
//
//    /**
//     * Cache for properties in java.home/lib/jaxp.properties
//     */
//    private static final Properties cacheProps = new Properties();
//
//    /**
//     * Flag indicating if properties from java.home/lib/jaxp.properties
//     * have been cached.
//     */
//    static volatile boolean firstTime = true;
//
//    /**
//     * Security support class use to check access control before
//     * getting certain system resources.
//     */
//    private static final Test287SecuritySupport ss = new Test287SecuritySupport();
//
//    // Define system property "jaxp.debug" to get output
//    static {
//        // Use try/catch block to support applets, which throws
//        // SecurityException out of this code.
//        try {
//        	System.err.println("Test287FactoryFinder静态块");
//            String val = ss.getSystemProperty("jaxp.debug");
//            // Allow simply setting the prop to turn on debug
//            debug = val != null && !"false".equals(val);
//        }
//        catch (SecurityException se) {
//            debug = false;
//        }
//    }
//
//    private static void dPrint(String msg) {
//        if (true) {
//            System.err.println("JAXP: " + msg);
//        }
//    }
//
//    /**
//     * Attempt to load a class using the class loader supplied. If that fails
//     * and fall back is enabled, the current (i.e. bootstrap) class loader is
//     * tried.
//     *
//     * If the class loader supplied is <code>null</code>, first try using the
//     * context class loader followed by the current (i.e. bootstrap) class
//     * loader.
//     *
//     * Use bootstrap classLoader if cl = null and useBSClsLoader is true
//     */
//    static private Class<?> getProviderClass(String className, ClassLoader cl,
//            boolean doFallback, boolean useBSClsLoader) throws ClassNotFoundException
//    {
//        try {
//            if (cl == null) {
//                if (useBSClsLoader) {
//                    return Class.forName(className, false, Test287FactoryFinder.class.getClassLoader());
//                } else {
//                    cl = ss.getContextClassLoader();
//                    if (cl == null) {
//                        throw new ClassNotFoundException();
//                    }
//                    else {
//                        return Class.forName(className, false, cl);
//                    }
//                }
//            }
//            else {
//                return Class.forName(className, false, cl);
//            }
//        }
//        catch (ClassNotFoundException e1) {
//            if (doFallback) {
//                // Use current class loader - should always be bootstrap CL
//                return Class.forName(className, false, Test287FactoryFinder.class.getClassLoader());
//            }
//            else {
//                throw e1;
//            }
//        }
//    }
//
//    /**
//     * Create an instance of a class. Delegates to method
//     * <code>getProviderClass()</code> in order to load the class.
//     *
//     * @param type Base class / Service interface  of the factory to
//     *             instantiate.
//     *
//     * @param className Name of the concrete class corresponding to the
//     * service provider
//     *
//     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
//     * current <code>Thread</code>'s context classLoader is used to load the factory class.
//     *
//     * @param doFallback True if the current ClassLoader should be tried as
//     * a fallback if the class is not found using cl
//     */
//    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
//                             boolean doFallback)
//        throws FactoryConfigurationError
//    {
//        return newInstance(type, className, cl, doFallback, false);
//    }
//
//    /**
//     * Create an instance of a class. Delegates to method
//     * <code>getProviderClass()</code> in order to load the class.
//     *
//     * @param type Base class / Service interface  of the factory to
//     *             instantiate.
//     *
//     * @param className Name of the concrete class corresponding to the
//     * service provider
//     *
//     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
//     * current <code>Thread</code>'s context classLoader is used to load the factory class.
//     *
//     * @param doFallback True if the current ClassLoader should be tried as
//     * a fallback if the class is not found using cl
//     *
//     * @param useBSClsLoader True if cl=null actually meant bootstrap classLoader. This parameter
//     * is needed since DocumentBuilderFactory/SAXParserFactory defined null as context classLoader.
//     */
//    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
//                             boolean doFallback, boolean useBSClsLoader)
//        throws FactoryConfigurationError
//    {
//        assert type != null;
//        // make sure we have access to restricted packages
//        if (System.getSecurityManager() != null) {
//            if (className != null && className.startsWith(DEFAULT_PACKAGE)) {
//                cl = null;
//                useBSClsLoader = true;
//            }
//        }
//
//        try {
//            Class<?> providerClass = getProviderClass(className, cl, doFallback, useBSClsLoader);
//            if (!type.isAssignableFrom(providerClass)) {
//                throw new ClassCastException(className + " cannot be cast to " + type.getName());
//            }
//            Object instance = providerClass.newInstance();
//            if (debug) {    // Extra check to avoid computing cl strings
//                dPrint("created new instance of " + providerClass +
//                       " using ClassLoader: " + cl);
//            }
//            return type.cast(instance);
//        }
//        catch (ClassNotFoundException x) {
//            throw new FactoryConfigurationError(x,
//                "Provider " + className + " not found");
//        }
//        catch (Exception x) {
//            throw new FactoryConfigurationError(x,
//                "Provider " + className + " could not be instantiated: " + x);
//        }
//    }
//
//    /**
//     * Finds the implementation Class object in the specified order.  Main
//     * entry point.
//     * @return Class object of factory, never null
//     *
//     * @param type                  Base class / Service interface  of the
//     *                              factory to find.
//     * @param fallbackClassName     Implementation class name, if nothing else
//     *                              is found.  Use null to mean no fallback.
//     *
//     * Package private so this code can be shared.
//     */
//    static <T> T find(Class<T> type, String fallbackClassName)
//        throws FactoryConfigurationError
//    {
//        final String factoryId = type.getName();
//        dPrint("fiind factoryId =" + factoryId);
//
//        // Use the system property first
//        try {
//            String systemProp = ss.getSystemProperty(factoryId);
//            if (systemProp != null) {
//                dPrint("found system property, value=" + systemProp);
//                return newInstance(type, systemProp, null, true);
//            }
//        }
//        catch (SecurityException se) {
//            if (debug) se.printStackTrace();
//        }
//
//        // try to read from $java.home/lib/jaxp.properties
//        try {
//            if (firstTime) {
//                synchronized (cacheProps) {
//                    if (firstTime) {
//                        String configFile = ss.getSystemProperty("java.home") + File.separator +
//                            "lib" + File.separator + "jaxp.properties";
//                        File f = new File(configFile);
//                        firstTime = false;
//                        if (ss.doesFileExist(f)) {
//                            dPrint("Read properties file "+f);
//                            cacheProps.load(ss.getFileInputStream(f));
//                        }
//                    }
//                }
//            }
//            final String factoryClassName = cacheProps.getProperty(factoryId);
//
//            if (factoryClassName != null) {
//                dPrint("found in $java.home/jaxp.properties, value=" + factoryClassName);
//                return newInstance(type, factoryClassName, null, true);
//            }
//        }
//        catch (Exception ex) {
//            if (debug) ex.printStackTrace();
//        }
//
//        // Try Jar Service Provider Mechanism
//        T provider = findServiceProvider(type);
//        if (provider != null) {
//            return provider;
//        }
//        if (fallbackClassName == null) {
//            throw new FactoryConfigurationError(
//                "Provider for " + factoryId + " cannot be found");
//        }
//
//        dPrint("loaded from fallback value: " + fallbackClassName);
//        return newInstance(type, fallbackClassName, null, true);
//    }
//
//    /**
//     * Try to find provider using the ServiceLoader API
//     *
//     * @param type Base class / Service interface  of the factory to find.
//     *
//     * @return instance of provider class if found or null
//     */
//    private static <T> T findServiceProvider(final Class<T> type) {
//        try {
//            return AccessController.doPrivileged(new PrivilegedAction<T>() {
//                public T run() {
//                    final ServiceLoader<T> serviceLoader = ServiceLoader.load(type);
//                    final Iterator<T> iterator = serviceLoader.iterator();
//                    if (iterator.hasNext()) {
//                        return iterator.next();
//                    } else {
//                        return null;
//                    }
//                 }
//            });
//        } catch(ServiceConfigurationError e) {
//            // It is not possible to wrap an error directly in
//            // FactoryConfigurationError - so we need to wrap the
//            // ServiceConfigurationError in a RuntimeException.
//            // The alternative would be to modify the logic in
//            // FactoryConfigurationError to allow setting a
//            // Throwable as the cause, but that could cause
//            // compatibility issues down the road.
//            final RuntimeException x = new RuntimeException(
//                    "Provider for " + type + " cannot be created", e);
//            final FactoryConfigurationError error =
//                    new FactoryConfigurationError(x, x.getMessage());
//            throw error;
//        }
//    }
//
//
//}
//class Test287SecuritySupport {
//
//    ClassLoader getContextClassLoader() throws SecurityException{
//        return (ClassLoader)
//                AccessController.doPrivileged(new PrivilegedAction() {
//            public Object run() {
//                ClassLoader cl = null;
//                //try {
//                cl = Thread.currentThread().getContextClassLoader();
//                //} catch (SecurityException ex) { }
//
//                if (cl == null)
//                    cl = ClassLoader.getSystemClassLoader();
//
//                return cl;
//            }
//        });
//    }
//
//    String getSystemProperty(final String propName) {
//        return AccessController.doPrivileged(new PrivilegedAction<String>() {
//                public String run() {
//                	String propName2 = System.getProperty(propName);
//                	System.err.println(propName + "=" + propName2);
//                    return propName2;
//                }
//            });
//    }
//
//    FileInputStream getFileInputStream(final File file)
//        throws FileNotFoundException
//    {
//        try {
//            return
//                AccessController.doPrivileged(new PrivilegedExceptionAction<FileInputStream>() {
//                    public FileInputStream run() throws FileNotFoundException {
//                        return new FileInputStream(file);
//                    }
//                });
//        } catch (PrivilegedActionException e) {
//            throw (FileNotFoundException)e.getException();
//        }
//    }
//
//    InputStream getResourceAsStream(final ClassLoader cl,
//                                           final String name)
//    {
//        return
//            AccessController.doPrivileged(new PrivilegedAction<InputStream>() {
//                public InputStream run() {
//                    InputStream ris;
//                    if (cl == null) {
//                        ris = Object.class.getResourceAsStream(name);
//                    } else {
//                        ris = cl.getResourceAsStream(name);
//                    }
//                    return ris;
//                }
//            });
//    }
//
//    boolean doesFileExist(final File f) {
//    return (
//            AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
//                public Boolean run() {
//                    return new Boolean(f.exists());
//                }
//            })).booleanValue();
//    }
//
//
//}
//
//class Test287DocumentBuilderFactoryImpl {
//
//    /** These are DocumentBuilderFactory attributes not DOM attributes */
//    private Map<String, Object> attributes;
//    private Map<String, Boolean> features;
//    private Schema grammar;
//    private boolean isXIncludeAware;
//
//    /**
//     * State of the secure processing feature, initially <code>false</code>
//     */
//    private boolean fSecureProcess = true;
//
//    /**
//     * Creates a new instance of a {@link javax.xml.parsers.DocumentBuilder}
//     * using the currently configured parameters.
//     */
//    public DocumentBuilder newDocumentBuilder()
//        throws ParserConfigurationException
//    {
//        /** Check that if a Schema has been specified that neither of the schema properties have been set. */
//        if (grammar != null && attributes != null) {
//            if (attributes.containsKey(JAXPConstants.JAXP_SCHEMA_LANGUAGE)) {
//                throw new ParserConfigurationException(
//                        SAXMessageFormatter.formatMessage(null,
//                        "schema-already-specified", new Object[] {JAXPConstants.JAXP_SCHEMA_LANGUAGE}));
//            }
//            else if (attributes.containsKey(JAXPConstants.JAXP_SCHEMA_SOURCE)) {
//                throw new ParserConfigurationException(
//                        SAXMessageFormatter.formatMessage(null,
//                        "schema-already-specified", new Object[] {JAXPConstants.JAXP_SCHEMA_SOURCE}));
//            }
//        }
//
//        try {
//            return new DocumentBuilderImpl(this, attributes, features, fSecureProcess);
//        } catch (SAXException se) {
//            // Handles both SAXNotSupportedException, SAXNotRecognizedException
//            throw new ParserConfigurationException(se.getMessage());
//        }
//    }
//
//    /**
//     * Allows the user to set specific attributes on the underlying
//     * implementation.
//     * @param name    name of attribute
//     * @param value   null means to remove attribute
//     */
//    public void setAttribute(String name, Object value)
//        throws IllegalArgumentException
//    {
//        // This handles removal of attributes
//        if (value == null) {
//            if (attributes != null) {
//                attributes.remove(name);
//            }
//            // Unrecognized attributes do not cause an exception
//            return;
//        }
//
//        // This is ugly.  We have to collect the attributes and then
//        // later create a DocumentBuilderImpl to verify the attributes.
//
//        // Create the Map if none existed before
//        if (attributes == null) {
//            attributes = new HashMap<String, Object>();
//        }
//
//        attributes.put(name, value);
//
//        // Test the attribute name by possibly throwing an exception
//        try {
//            new DocumentBuilderImpl(this, attributes, features);
//        } catch (Exception e) {
//            attributes.remove(name);
//            throw new IllegalArgumentException(e.getMessage());
//        }
//    }
//
//    /**
//     * Allows the user to retrieve specific attributes on the underlying
//     * implementation.
//     */
//    public Object getAttribute(String name)
//        throws IllegalArgumentException
//    {
//        // See if it's in the attributes Map
//        if (attributes != null) {
//            Object val = attributes.get(name);
//            if (val != null) {
//                return val;
//            }
//        }
//
//        DOMParser domParser = null;
//        try {
//            // We create a dummy DocumentBuilderImpl in case the attribute
//            // name is not one that is in the attributes map.
//            domParser =
//                new DocumentBuilderImpl(this, attributes, features).getDOMParser();
//            return domParser.getProperty(name);
//        } catch (SAXException se1) {
//            // assert(name is not recognized or not supported), try feature
//            try {
//                boolean result = domParser.getFeature(name);
//                // Must have been a feature
//                return result ? Boolean.TRUE : Boolean.FALSE;
//            } catch (SAXException se2) {
//                // Not a property or a feature
//                throw new IllegalArgumentException(se1.getMessage());
//            }
//        }
//    }
//
//    public Schema getSchema() {
//        return grammar;
//    }
//
//    public void setSchema(Schema grammar) {
//        this.grammar = grammar;
//    }
//
//    public boolean isXIncludeAware() {
//        return this.isXIncludeAware;
//    }
//
//    public void setXIncludeAware(boolean state) {
//        this.isXIncludeAware = state;
//    }
//
//    public boolean getFeature(String name)
//        throws ParserConfigurationException {
//        if (name.equals(XMLConstants.FEATURE_SECURE_PROCESSING)) {
//            return fSecureProcess;
//        }
//        // See if it's in the features map
//        if (features != null) {
//            Boolean val = features.get(name);
//            if (val != null) {
//                return val;
//            }
//        }
//        try {
//            DOMParser domParser = new DocumentBuilderImpl(this, attributes, features).getDOMParser();
//            return domParser.getFeature(name);
//        }
//        catch (SAXException e) {
//            throw new ParserConfigurationException(e.getMessage());
//        }
//    }
//
//    public void setFeature(String name, boolean value)
//        throws ParserConfigurationException {
//        if (features == null) {
//            features = new HashMap<String, Boolean>();
//        }
//        // If this is the secure processing feature, save it then return.
//        if (name.equals(XMLConstants.FEATURE_SECURE_PROCESSING)) {
//            if (System.getSecurityManager() != null && (!value)) {
//                throw new ParserConfigurationException(
//                        SAXMessageFormatter.formatMessage(null,
//                        "jaxp-secureprocessing-feature", null));
//            }
//            fSecureProcess = value;
//            features.put(name, value ? Boolean.TRUE : Boolean.FALSE);
//            return;
//        }
//
//        features.put(name, value ? Boolean.TRUE : Boolean.FALSE);
//        // Test the feature by possibly throwing SAX exceptions
//        try {
//            new DocumentBuilderImpl(this, attributes, features);
//        }
//        catch (SAXNotSupportedException e) {
//            features.remove(name);
//            throw new ParserConfigurationException(e.getMessage());
//        }
//        catch (SAXNotRecognizedException e) {
//            features.remove(name);
//            throw new ParserConfigurationException(e.getMessage());
//        }
//    }
//
//}
//
//class Test287DocumentBuilderImpl {
//
//    /** Feature identifier: namespaces. */
//    private static final String NAMESPACES_FEATURE =
//        Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACES_FEATURE;
//
//    /** Feature identifier: include ignorable white space. */
//    private static final String INCLUDE_IGNORABLE_WHITESPACE =
//        Constants.XERCES_FEATURE_PREFIX + Constants.INCLUDE_IGNORABLE_WHITESPACE;
//
//    /** Feature identifier: create entiry ref nodes feature. */
//    private static final String CREATE_ENTITY_REF_NODES_FEATURE =
//        Constants.XERCES_FEATURE_PREFIX + Constants.CREATE_ENTITY_REF_NODES_FEATURE;
//
//    /** Feature identifier: include comments feature. */
//    private static final String INCLUDE_COMMENTS_FEATURE =
//        Constants.XERCES_FEATURE_PREFIX + Constants.INCLUDE_COMMENTS_FEATURE;
//
//    /** Feature identifier: create cdata nodes feature. */
//    private static final String CREATE_CDATA_NODES_FEATURE =
//        Constants.XERCES_FEATURE_PREFIX + Constants.CREATE_CDATA_NODES_FEATURE;
//
//    /** Feature identifier: XInclude processing */
//    private static final String XINCLUDE_FEATURE =
//        Constants.XERCES_FEATURE_PREFIX + Constants.XINCLUDE_FEATURE;
//
//    /** feature identifier: XML Schema validation */
//    private static final String XMLSCHEMA_VALIDATION_FEATURE =
//        Constants.XERCES_FEATURE_PREFIX + Constants.SCHEMA_VALIDATION_FEATURE;
//
//    /** Feature identifier: validation */
//    private static final String VALIDATION_FEATURE =
//        Constants.SAX_FEATURE_PREFIX + Constants.VALIDATION_FEATURE;
//
//    /** Property identifier: security manager. */
//    private static final String SECURITY_MANAGER =
//        Constants.XERCES_PROPERTY_PREFIX + Constants.SECURITY_MANAGER_PROPERTY;
//
//    /** Property identifier: Security property manager. */
//    private static final String XML_SECURITY_PROPERTY_MANAGER =
//            Constants.XML_SECURITY_PROPERTY_MANAGER;
//
//    /** property identifier: access external dtd. */
//    public static final String ACCESS_EXTERNAL_DTD = XMLConstants.ACCESS_EXTERNAL_DTD;
//
//    /** Property identifier: access to external schema */
//    public static final String ACCESS_EXTERNAL_SCHEMA = XMLConstants.ACCESS_EXTERNAL_SCHEMA;
//
//
//    private final DOMParser domParser;
//    private final Schema grammar;
//
//    private final XMLComponent fSchemaValidator;
//    private final XMLComponentManager fSchemaValidatorComponentManager;
//    private final ValidationManager fSchemaValidationManager;
//    private final UnparsedEntityHandler fUnparsedEntityHandler;
//
//    /** Initial ErrorHandler */
//    private final ErrorHandler fInitErrorHandler;
//
//    /** Initial EntityResolver */
//    private final EntityResolver fInitEntityResolver;
//
//    private XMLSecurityManager fSecurityManager;
//    private XMLSecurityPropertyManager fSecurityPropertyMgr;
//
//    DocumentBuilderImpl(DocumentBuilderFactoryImpl dbf, Map<String, Object> dbfAttrs,
//            Map<String, Boolean> features)
//        throws SAXNotRecognizedException, SAXNotSupportedException {
//        this(dbf, dbfAttrs, features, false);
//    }
//
//    DocumentBuilderImpl(DocumentBuilderFactoryImpl dbf, Map<String, Object> dbfAttrs,
//            Map<String, Boolean> features, boolean secureProcessing)
//        throws SAXNotRecognizedException, SAXNotSupportedException
//    {
//        domParser = new DOMParser();
//
//        // If validating, provide a default ErrorHandler that prints
//        // validation errors with a warning telling the user to set an
//        // ErrorHandler
//        if (dbf.isValidating()) {
//            fInitErrorHandler = new DefaultValidationErrorHandler(domParser.getXMLParserConfiguration().getLocale());
//            setErrorHandler(fInitErrorHandler);
//        }
//        else {
//            fInitErrorHandler = domParser.getErrorHandler();
//        }
//
//        domParser.setFeature(VALIDATION_FEATURE, dbf.isValidating());
//
//        // "namespaceAware" == SAX Namespaces feature
//        domParser.setFeature(NAMESPACES_FEATURE, dbf.isNamespaceAware());
//
//        // Set various parameters obtained from DocumentBuilderFactory
//        domParser.setFeature(INCLUDE_IGNORABLE_WHITESPACE,
//                !dbf.isIgnoringElementContentWhitespace());
//        domParser.setFeature(CREATE_ENTITY_REF_NODES_FEATURE,
//                !dbf.isExpandEntityReferences());
//        domParser.setFeature(INCLUDE_COMMENTS_FEATURE,
//                !dbf.isIgnoringComments());
//        domParser.setFeature(CREATE_CDATA_NODES_FEATURE,
//                !dbf.isCoalescing());
//
//        // Avoid setting the XInclude processing feature if the value is false.
//        // This will keep the configuration from throwing an exception if it
//        // does not support XInclude.
//        if (dbf.isXIncludeAware()) {
//            domParser.setFeature(XINCLUDE_FEATURE, true);
//        }
//
//        fSecurityPropertyMgr = new XMLSecurityPropertyManager();
//        domParser.setProperty(XML_SECURITY_PROPERTY_MANAGER, fSecurityPropertyMgr);
//
//        fSecurityManager = new XMLSecurityManager(secureProcessing);
//        domParser.setProperty(SECURITY_MANAGER, fSecurityManager);
//
//        if (secureProcessing) {
//            /**
//             * If secure processing is explicitly set on the factory, the
//             * access properties will be set unless the corresponding
//             * System Properties or jaxp.properties are set
//             */
//            if (features != null) {
//                Boolean temp = features.get(XMLConstants.FEATURE_SECURE_PROCESSING);
//                if (temp != null) {
//                    if (temp && Constants.IS_JDK8_OR_ABOVE) {
//                        fSecurityPropertyMgr.setValue(Property.ACCESS_EXTERNAL_DTD,
//                                State.FSP, Constants.EXTERNAL_ACCESS_DEFAULT_FSP);
//                        fSecurityPropertyMgr.setValue(Property.ACCESS_EXTERNAL_SCHEMA,
//                                State.FSP, Constants.EXTERNAL_ACCESS_DEFAULT_FSP);
//                    }
//                }
//            }
//        }
//
//        this.grammar = dbf.getSchema();
//        if (grammar != null) {
//            XMLParserConfiguration config = domParser.getXMLParserConfiguration();
//            XMLComponent validatorComponent = null;
//            /** For Xerces grammars, use built-in schema validator. **/
//            if (grammar instanceof XSGrammarPoolContainer) {
//                validatorComponent = new XMLSchemaValidator();
//                fSchemaValidationManager = new ValidationManager();
//                fUnparsedEntityHandler = new UnparsedEntityHandler(fSchemaValidationManager);
//                config.setDTDHandler(fUnparsedEntityHandler);
//                fUnparsedEntityHandler.setDTDHandler(domParser);
//                domParser.setDTDSource(fUnparsedEntityHandler);
//                fSchemaValidatorComponentManager = new SchemaValidatorConfiguration(config,
//                        (XSGrammarPoolContainer) grammar, fSchemaValidationManager);
//            }
//            /** For third party grammars, use the JAXP validator component. **/
//            else {
//                validatorComponent = new JAXPValidatorComponent(grammar.newValidatorHandler());
//                fSchemaValidationManager = null;
//                fUnparsedEntityHandler = null;
//                fSchemaValidatorComponentManager = config;
//            }
//            config.addRecognizedFeatures(validatorComponent.getRecognizedFeatures());
//            config.addRecognizedProperties(validatorComponent.getRecognizedProperties());
//            setFeatures(features);      // Must set before calling setDocumentHandler()
//            config.setDocumentHandler((XMLDocumentHandler) validatorComponent);
//            ((XMLDocumentSource)validatorComponent).setDocumentHandler(domParser);
//            domParser.setDocumentSource((XMLDocumentSource) validatorComponent);
//            fSchemaValidator = validatorComponent;
//        }
//        else {
//            fSchemaValidationManager = null;
//            fUnparsedEntityHandler = null;
//            fSchemaValidatorComponentManager = null;
//            fSchemaValidator = null;
//            setFeatures(features);
//        }
//
//        //setAttribute override those that may be set by other means
//        setDocumentBuilderFactoryAttributes(dbfAttrs);
//
//        // Initial EntityResolver
//        fInitEntityResolver = domParser.getEntityResolver();
//    }
//
//    private void setFeatures( Map<String, Boolean> features)
//        throws SAXNotSupportedException, SAXNotRecognizedException {
//        if (features != null) {
//            for (Map.Entry<String, Boolean> entry : features.entrySet()) {
//                domParser.setFeature(entry.getKey(), entry.getValue());
//        }
//    }
//    }
//
//    /**
//     * Set any DocumentBuilderFactory attributes of our underlying DOMParser
//     *
//     * Note: code does not handle possible conflicts between DOMParser
//     * attribute names and JAXP specific attribute names,
//     * eg. DocumentBuilderFactory.setValidating()
//     */
//    private void setDocumentBuilderFactoryAttributes( Map<String, Object> dbfAttrs)
//        throws SAXNotSupportedException, SAXNotRecognizedException
//    {
//        if (dbfAttrs == null) {
//            // Nothing to do
//            return;
//        }
//
//        for (Map.Entry<String, Object> entry : dbfAttrs.entrySet()) {
//            String name = entry.getKey();
//            Object val = entry.getValue();
//            if (val instanceof Boolean) {
//                // Assume feature
//                domParser.setFeature(name, (Boolean)val);
//            } else {
//                // Assume property
//                if (JAXP_SCHEMA_LANGUAGE.equals(name)) {
//                    // JAXP 1.2 support
//                    //None of the properties will take effect till the setValidating(true) has been called
//                    if ( W3C_XML_SCHEMA.equals(val) ) {
//                        if( isValidating() ) {
//                            domParser.setFeature(XMLSCHEMA_VALIDATION_FEATURE, true);
//                            // this should allow us not to emit DTD errors, as expected by the
//                            // spec when schema validation is enabled
//                            domParser.setProperty(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
//                        }
//                     }
//                 } else if(JAXP_SCHEMA_SOURCE.equals(name)){
//                    if( isValidating() ) {
//                        String value=(String)dbfAttrs.get(JAXP_SCHEMA_LANGUAGE);
//                        if(value !=null && W3C_XML_SCHEMA.equals(value)){
//                            domParser.setProperty(name, val);
//                        }else{
//                            throw new IllegalArgumentException(
//                                DOMMessageFormatter.formatMessage(DOMMessageFormatter.DOM_DOMAIN,
//                                "jaxp-order-not-supported",
//                                new Object[] {JAXP_SCHEMA_LANGUAGE, JAXP_SCHEMA_SOURCE}));
//                        }
//                     }
//                  } else {
//                     //check if the property is managed by security manager
//                     if (fSecurityManager == null ||
//                             !fSecurityManager.setLimit(name, XMLSecurityManager.State.APIPROPERTY, val)) {
//                         //check if the property is managed by security property manager
//                         if (fSecurityPropertyMgr == null ||
//                                 !fSecurityPropertyMgr.setValue(name, XMLSecurityPropertyManager.State.APIPROPERTY, val)) {
//                             //fall back to the existing property manager
//                             domParser.setProperty(name, val);
//                         }
//                     }
//
//                  }
//             }
//        }
//    }
//
//    /**
//     * Non-preferred: use the getDOMImplementation() method instead of this
//     * one to get a DOM Level 2 DOMImplementation object and then use DOM
//     * Level 2 methods to create a DOM Document object.
//     */
//    public Document newDocument() {
//        return new com.sun.org.apache.xerces.internal.dom.DocumentImpl();
//    }
//
//    public DOMImplementation getDOMImplementation() {
//        return DOMImplementationImpl.getDOMImplementation();
//    }
//
//    public Document parse(InputSource is) throws SAXException, IOException {
//        if (is == null) {
//            throw new IllegalArgumentException(
//                DOMMessageFormatter.formatMessage(DOMMessageFormatter.DOM_DOMAIN,
//                "jaxp-null-input-source", null));
//        }
//        if (fSchemaValidator != null) {
//            if (fSchemaValidationManager != null) {
//                fSchemaValidationManager.reset();
//                fUnparsedEntityHandler.reset();
//            }
//            resetSchemaValidator();
//        }
//        domParser.parse(is);
//        Document doc = domParser.getDocument();
//        domParser.dropDocumentReferences();
//        return doc;
//    }
//
//    public boolean isNamespaceAware() {
//        try {
//            return domParser.getFeature(NAMESPACES_FEATURE);
//        }
//        catch (SAXException x) {
//            throw new IllegalStateException(x.getMessage());
//        }
//    }
//
//    public boolean isValidating() {
//        try {
//            return domParser.getFeature(VALIDATION_FEATURE);
//        }
//        catch (SAXException x) {
//            throw new IllegalStateException(x.getMessage());
//        }
//    }
//
//    /**
//     * Gets the XInclude processing mode for this parser
//     * @return the state of XInclude processing mode
//     */
//    public boolean isXIncludeAware() {
//        try {
//            return domParser.getFeature(XINCLUDE_FEATURE);
//        }
//        catch (SAXException exc) {
//            return false;
//        }
//    }
//
//    public void setEntityResolver(EntityResolver er) {
//        domParser.setEntityResolver(er);
//    }
//
//    public void setErrorHandler(ErrorHandler eh) {
//        domParser.setErrorHandler(eh);
//    }
//
//    public Schema getSchema() {
//        return grammar;
//    }
//
//    public void reset() {
//        /** Restore the initial error handler. **/
//        if (domParser.getErrorHandler() != fInitErrorHandler) {
//            domParser.setErrorHandler(fInitErrorHandler);
//        }
//        /** Restore the initial entity resolver. **/
//        if (domParser.getEntityResolver() != fInitEntityResolver) {
//            domParser.setEntityResolver(fInitEntityResolver);
//        }
//    }
//
//    // package private
//    DOMParser getDOMParser() {
//        return domParser;
//    }
//
//    private void resetSchemaValidator() throws SAXException {
//        try {
//            fSchemaValidator.reset(fSchemaValidatorComponentManager);
//        }
//        // This should never be thrown from the schema validator.
//        catch (XMLConfigurationException e) {
//            throw new SAXException(e);
//        }
//    }
//
//}