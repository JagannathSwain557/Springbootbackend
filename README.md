# techlmaginiabackend
backend portal for techlmaginia ui

# techlmaginiaackend
Bankend Spring boot Project integrated with gcd

# LINKS
how to create credential key
https://developers.google.com/workspace/guides/create-credentials
https://cloud.spring.io/spring-cloud-static/spring-cloud-gcp/1.1.0.RC2/multi/multi__spring_data_cloud_datastore.html
https://www.codehim.com/collections/login-page-in-html-with-css-code/#google_vignette


======================Enable google cloud datastore in spring boot====================
follow bellow tutorial
https://codelabs.developers.google.com/codelabs/cloud-spring-datastore#3
> avoid @shell annotations
> download google credentials.json put it in resources folder


================SPRING BOOT Application Deploy=============
> add a new project in cloude console usEast4-nothvirgnia-cheaper

> gcloud congig list -to check the selected project
> gcloud config set project techlmaginiaportal - to change the project
> add a app.yml in springboot project
> add google colude plugin in pom.xml
> run the application
> gcloud app deploy in app root folder
----------------working---------------
gcloud init
gcloud components update
gcloud app deploy

to kill a process
---------------------
netstat -aon | findstr  8090
taskkill /PID 9988 /F



=================COMMAND TO USE NODE and firebase IN webapp ===========
=====> run commands in bash
npm init
npm install webpack --save-dev
npm install firebase
npm run build




url
-----------------
https://techlmaginiaportal.uk.r.appspot.com/v1/webportal/enquiry/create
{
 "id" : "4354356",
 "fullName" : "dfsfd",
 "email":"dfdfasf",
 "phoneNo":"5464536635",
 "subject":"dfsdf sdfasdf",
 "content":"dcsdc sddcsd"
}

https://techlmaginiaportal.uk.r.appspot.com/v1/webportal/enquiry/getall

http://localhost:8080/v1/web/customerTerm


