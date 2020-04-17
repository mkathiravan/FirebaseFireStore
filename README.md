# FirebaseFireStore

Firebase Realtime database that is stuctured as a JSON tree but Cloud Firestore is stored data in documents(which is a set of key-value pair) and collection(which is a collection of documents) formats. Realtime Database stored data in JSON tree but Cloud firestore stored data in documents which is very similar to JSON.

## Difference between firebase and firestore?

Both Firebase Realtime Database and Firebase Cloud Firestore are in the ownership of Google and share more than one significant development /deployment variable and operational functionality. But they have some key differences in terms of scaling and querying, performance, security, and support that can’t be neglected. Here a quick comparison of both models to get a basic idea of how the two databases differ from each other.

Cloud Firestore: 

It’s a Firebase new database that is used to build mobile apps. It has better scalability than a realtime database. Also, they have faster queries with richer features, etc.

Firebase Realtime Database: 

It’s an older and original database that will give you a low latency solution for mobile apps. It will sync your data instantly.

### Data Model

Real-time Database: stores data in a JSON tree. Storing of simple data is easier in Real-time Database, whereas complex or hierarchical data is not easier to systemize and organize at scale.

Cloud Firestore: leverages documents and collection formats to store and organize data. While simple data is stored in a JSON tree or documents, the complex data is organized using subcollections.

### Offline Support

Realtime Database: Offline support only for mobile (Android & iOS) devices.

Cloud Firestore: Offline support for mobile (Android & iOS), web clients as well.

### Querying

Realtime Database: provides limited sorting and filtering functionality to run queries for a single property, either filter or sort, can’t use both parameters simultaneously.

Cloud Firestore: allows you to combine filtering and sorting and choose multiple parameters on a property in a single query.

### Presence

Realtime Database: Real-time database records client connection status and provides us updates whenever the client connection is online or offline.

Cloud Firestore: Not supported natively. But that doesn’t mean you don’t have access to this feature. You can use real-time database support for presence, just syncing cloud Firestore and real-time database with the help of cloud functions.

### Writes and Transactions

Realtime Database: Real-time database gives you a basic writes and transactions operation. Like writing data through the update and set operations. Here transaction is on specific data subtree.

Cloud Firestore: Cloud Firestore gives you advanced writes and reactions operations like writing data through the update and sets operations and you can use advanced transformation i.e., array and numeric operations, etc. Transactions can automatically write and read data from any part of your database.


### Performance and Reliability

Realtime Database: offers a single region solution with limited zonal availability.

Cloud Firestore: supports multiple data centers in different regions, distributing your data across multiple servers automatically.

### Scalability

Realtime Database : In real-time database, the scaling process is not automatic, we have to scale on your own. It scales around 200k connections simultaneously and gives you 1k writes per second in a single database. Real-time database gives you no limit on writes.

Cloud Firestore: In the Cloud Firestore Scaling process is automatic. Firebase does it on their own. In Cloud Firestore, it can be scaled over 1 million connections simultaneously and gives you 10k writes per second. And Firebase is going to increase this limit in the future. But the cloud Firestore has a limit on writes to every single document or index also.

### Security

Realtime Database : Authorization and validation are separate. Write and read rules from the mobile SDKs which are secured by Firebase Real-time database rules. You can easily validate the data separately with the valid rules.

Cloud Firestore : Authorization and validation are combined. Write and read rules from the mobile SDKs which are secured by Firestore security rules. Here rules can restrict your queries because if a query’s result might be a kind of data that the user doesn’t have access to then the entire query fails.

### Pricing

Realtime Database: Firebase Real-time database charges only on Storage and bandwidth, which means other things are free. but I think storage and bandwidth charges are a little bit high.

Cloud Firestore: Firebase cloud Firestore charges on your operations like read, delete & write and storage and bandwidth charges are low rather than Real-time database.

![image](https://user-images.githubusercontent.com/39657409/79266164-c6a2ea00-7eb4-11ea-8567-ca3b49a14a35.png)

![image](https://user-images.githubusercontent.com/39657409/79337290-d6690f80-7f42-11ea-9a88-3c395b8720d4.png)

