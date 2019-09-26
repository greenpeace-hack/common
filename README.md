# Spring-Boot Document Service Demo

This Fuse application simulates (for demo purposes) a document server.
The goal is to use it as an HTTP backend capable of streaming back very large files.
The client application can invoke this service indicating the document size to download.


### Running the application on your machine

1) Start the application using maven:

		mvn

2) Test the service using the curl command:

		curl -k https://localhost:8443/camel/file/test

   This should return:

		{
		    "status":"ack"
		}

3) Invoke the service using curl to download a small file (1 MB):

		curl -k https://localhost:8443/camel/file/download/1 -o document.txt

   This results in a file being downloaded of 1 MB size.


4) Invoke the service using curl to download a very large file (4 GB):

		curl -k https://localhost:8443/camel/file/download/4092 -o document.txt

   This results in a file being downloaded of 4 GB size.



## Deployment to OpenShift

```
oc new-project p4-dev
oc apply -f .openshift/manifests/ -n p4-dev
```
