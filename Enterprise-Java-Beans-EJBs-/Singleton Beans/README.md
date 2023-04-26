# Singleton Session Beans
 The container creates one Singleton for the entire web application. Consequently a Singleton is used when we need multiple clients to manipulate a single resource.
 
 ## Example
 A good example a entertainment event that needs to sell 100 tickets online to patrons.
 
 ## How a Singleton works
 Since we have a single bean for multiple clients, surely there are concurrency issues, we use <b> (Container Managed Concurrency) </b> for
 manging the cocurrency access.
 
 The <b><em> @Lock </em> annotation </b> is used to signal that a singleton uses CMC. The annotation takes one of the two values, READ or WRITE. 
 - A lock that is of type <b> READ </b> smply means that a method can be called concurrently by clients.
 - A <b> WRITE </b> lock type means a method can only be used by one client at a time, the rest must wait for their turn.
