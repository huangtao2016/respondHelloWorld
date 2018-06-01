# respondHelloWorld

a maven project , springmvc webapp structure .
tools : idea 2017 , github , git

Step 1 -- build my maven project
   1. open idea , create a maven project.
      after created the maven project , we can see the project structure : a pom.xml ; a web.xml . 
      then , those two files will be configured by us . 
   2. pom.xml is the configuration files of maven , what we should do is to add the dependencies for pom.xml , 
      here , we add the jars that springmvc framework needs and unit test plugin , like follows :
      
      <dependencies>
         <dependency>
             <groupId>junit</groupId>
             <artifactId>junit</artifactId>
             <version>4.11</version>
             <scope>test</scope>
         </dependency>

      <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-core</artifactId>
         <version>5.0.6.RELEASE</version>
      </dependency>

      <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-web</artifactId>
         <version>5.0.6.RELEASE</version>
      </dependency>

      <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-webmvc</artifactId>
         <version>5.0.6.RELEASE</version>
      </dependency>

      <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-test</artifactId>
         <version>5.0.6.RELEASE</version>
      </dependency>

      <!-- servlet start -->
      <dependency>
         <groupId>javax.servlet.jsp.jstl</groupId>
         <artifactId>javax.servlet.jsp.jstl-api</artifactId>
         <version>1.2.1</version>
      </dependency>
      
      <dependency>
         <groupId>taglibs</groupId>
         <artifactId>standard</artifactId>
         <version>1.1.2</version>
      </dependency>
      
      <dependency>
         <groupId>javax.servlet</groupId>
         <artifactId>jstl</artifactId>
         <version>1.2</version>
      </dependency>
      
      <dependency>
         <groupId>javax.servlet</groupId>
         <artifactId>servlet-api</artifactId>
         <version>2.5</version>
      </dependency>
      
      <dependency>
         <groupId>javax.servlet.jsp</groupId>
         <artifactId>jsp-api</artifactId>
         <version>2.1</version>
         <scope>provided</scope>
       </dependency>
       
      <!-- servlet end -->
      </dependencies>

    3. as it is a web project , and we use the springmvc framework , so we configure the web.xml and springMVC.xml .
       in web.xml , we configure CharacterEncodingFilter , servlet and servlet-mapping .
       in springMVC.xml , we configure the annotation and InternalResourceViewResolver .
       which two files are necessary .
       
    4. after that , we can come to add a controller method in the source directory 'java' to handle the request from the web . 
       the controller method like this :
       after we have done it , we can visit the content by the url : http://localhost:8080/test/hello to get the helloWorld.jsp . 
       @Controller
       @RequestMapping("/test")
           public class helloController {
           @RequestMapping("/hello")
           public String welcome(){
           return "helloWorld";
           }
        }
        
step 2 -- run my maven project
    1. to run the maven project , we have to deploy the local tomcat server ;
    2. run it .
    3. push it to my github 
       the url on github is : https://github.com/huangtao2016/respondHelloWorld .

  
