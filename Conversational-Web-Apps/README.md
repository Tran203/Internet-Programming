# Conversational Web Apps
  Web applications are by default non-conversational. This means they are stateless, they are unable to keep track of a conversation with a client. This is due to the usage of HTTP which is a stateless communication protocol. To overcome this challenge, we use <em> sessions </em> .
  
 ## Sessions
 Sessions are objects that keep track of the conversation between a client and a web application. The <b> HttpSession </b> class is used to create sessions. After a session is created, communication between the client and the server becomes stateful (re-member previous states)

 ## HTTP
 HTTP (HyperText Transfer Protocol) is a commonly used communication protocol by computers over the World Wide Web. The protocol uses a message-based model for transferring data between clients and servers.
 
 > HTTP Methods
 -  <b> GET: </b> used by the client to get a resource from the server. There’s no payload sent to the server. 
 - <b> POST: </b> used by the client to send data to the server for processing. The sent data becomes the payload not visible to the public. 
 - <b> DELETE: </b> used by the client to remove a resource from the server. The method sends unique id of the resource to be removed. 
 - <b> PUT: </b> used by the client to update the state of a resource in the server. The method sends a unique id of the resource to update, and the new data to be used. 
 - <b> HEAD: </b> used by the client to check if certain resources are available in the server. The server responds by sending back the headers, not the actual data. 
 - <b> OPTIONS: </b> used by the client to check the HTTP methods supported by the server. 
 - <b> TRACE: </b> used for debugging/diagnostic purposes. 
 - <b> CONNECT: </b> used to start a two-way communication with the server.
