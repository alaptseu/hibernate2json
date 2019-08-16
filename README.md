# hibernate2json  

The implementaion is taken from [this article](https://vladmihalcea.com/how-to-map-json-objects-using-generic-hibernate-types/).

> The [hibernate-types](https://github.com/vladmihalcea/hibernate-types/) open-source project, not onlythat it offers JSON support, but it allows you to persist ARRAY, HStore, Range, Interval, Range, Inet and many other custom types.

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
