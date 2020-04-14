# FirebaseFireStore

Firebase Realtime database that is stuctured as a JSON tree but Cloud Firestore is stored data in documents(which is a set of key-value pair) and collection(which is a collection of documents) formats. Realtime Database stored data in JSON tree but Cloud firestore stored data in documents which is very similar to JSON.

## Difference between firebase and firestore?

Both Firebase Realtime Database and Firebase Cloud Firestore are in the ownership of Google and share more than one significant development /deployment variable and operational functionality. But they have some key differences in terms of scaling and querying, performance, security, and support that can’t be neglected. Here a quick comparison of both models to get a basic idea of how the two databases differ from each other.

### Data Model

Real-time Database: stores data in a JSON tree. Storing of simple data is easier in Real-time Database, whereas complex or hierarchical data is not easier to systemize and organize at scale.

Cloud Firestore: leverages documents and collection formats to store and organize data. While simple data is stored in a JSON tree or documents, the complex data is organized using subcollections.

### Offline Support

Realtime Database: Android and iOS mobile clients

Cloud Firestore: Web, Android, and iOS clients

### Querying

Realtime Database: provides limited sorting and filtering functionality to run queries for a single property, either filter or sort, can’t use both parameters simultaneously.

Cloud Firestore: allows you to combine filtering and sorting and choose multiple parameters on a property in a single query.

### Performance and Reliability

Realtime Database: offers a single region solution with limited zonal availability.

Cloud Firestore: supports multiple data centers in different regions, distributing your data across multiple servers automatically. 

![image](https://user-images.githubusercontent.com/39657409/79266164-c6a2ea00-7eb4-11ea-8567-ca3b49a14a35.png)
