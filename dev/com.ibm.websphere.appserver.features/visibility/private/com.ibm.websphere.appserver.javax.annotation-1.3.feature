-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=com.ibm.websphere.appserver.javax.annotation-1.3
WLP-DisableAllFeatures-OnConflict: false
singleton=true
IBM-Process-Types: server, \
 client
-features=com.ibm.websphere.appserver.eeCompatible-8.0; ibm.tolerates:="6.0, 7.0"
-bundles=com.ibm.websphere.javaee.annotation.1.3; location:="dev/api/spec/,lib/"; mavenCoordinates="javax.annotation:javax.annotation-api:1.3.2"
kind=ga
edition=core
WLP-Activation-Type: parallel
