# ShopeeTest

## Installation

- Intelli J (recommended)
- Java JDK 14
- Chrome 89

## Build steps
 Build steps
```python
 - Select pom.xml -> right click -> Maven -> Download sources
 - Select pom.xml -> right click -> Maven -> Reload Project 
```   

### How to run
```python
1 Go to root folder
2 Select "testNG.xml" file -> right click -> Run As -> Run'../testNg.xml
```

#### Note

If you encounter "Java error", please change the java complier version in the POM file to version in your machine then re-install Maven.

EX: 

```bash
<maven.compiler.source>1.14</maven.compiler.source>
<maven.compiler.target>1.14</maven.compiler.target>
```    
If you're using JAVA 12 then change 1.14 into 1.12
