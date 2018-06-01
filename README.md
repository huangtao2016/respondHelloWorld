# respondHelloWorld
# respondHelloWorld

a maven project,springmvc webapp structure.

tools : idea 2017 , github , git

step 1 -- build my maven project
   1. open idea , create a maven project.
   2. add the dependencies for pom.xml , including the jars like follows:
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

    3. as it is a web project , so we configure the web.xml and springMVC.xml .
    4. after that , we add the controller in the source directory 'java' .
       @Controller
       @RequestMapping("/test")
           public class helloController {
           @RequestMapping("/hello")
           public String welcome(){
           return "helloWorld";
           }
        }
        
step 2 -- run my maven project
    1. deploy the local tomcat server ;
    2. run it .
    3. push it to my github 
       the url is : https://github.com/huangtao2016/respondHelloWorld .

  
