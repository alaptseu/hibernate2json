# hibernate2json  

The implementaion is taken from https://vladmihalcea.com/2016/06/20/how-to-map-json-objects-using-generic-hibernate-types/

To use add maven dependency:

```xml
<dependency>
  <groupId>com.github.alaptseu</groupId>
  <artifactId>hibernate2json</artifactId>
  <version>1.0</version>
</dependency>
```
if you prefer snapshot version:

```xml
<repositories>
  <repository>
     <id>oss.snapshots</id>
     <name>OSS Sonatype Snapshot Repository</name>
      <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
      <releases>
       <enabled>false</enabled>
      </releases>
      <snapshots>
       <enabled>true</enabled>
      </snapshots>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.alaptseu</groupId>
  <artifactId>hibernate2json</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
