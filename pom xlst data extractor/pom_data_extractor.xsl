<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- 
Description: extract data from pom.xml file (info about dependencies)
Usage: execute with pom.xml (root <project> element must be without schema declarations)
Hint: to do the transformation, use http://www.w3schools.com/xsl/tryxslt.asp?xmlfile=cdcatalog&xsltfile=cdcatalog
 -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
    <pre>
<xsl:for-each select="project/dependencies/dependency">
call mvn install:install-file -Dfile="%LIBDIR%"/FNAME -DgroupId=<xsl:value-of select="groupId"/> -DartifactId=<xsl:value-of select="artifactId"/> -Dversion=<xsl:value-of select="version"/> -Dpackaging=jar</xsl:for-each>
    </pre>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>