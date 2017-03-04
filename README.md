# ::Result ::

Task	| Information						   	| Elapsed time
--------|---------------------------------------------------------------|--------------:
Task1 	| Copy the file one byte at a time.			   	| 3.919276 sec
Task2 	| Copy the file using a byte array of size 1KB(1024)	   	| 0.059276 sec
Task3 	| Copy the file using a byte array of size 4KB(4*1024)	   	| 0.057436 sec
Task4 	| Copy the file using a byte array of size 64KB(64*1024)	| 0.053841 sec
Task5 	| Copy the file using BufferedReader and PrintWriter	   	| 0.127120 sec




# :: Explaination ::

Task1 used the 1st most of time since it copies one byte at a time.

Task5 used the 2nd most of time since it losts time to create bufferedReader and PrintWriter.

Task2 used the 3nd most of time since it copies using array of size 1KB(1024).

Task3 used the 4th most of time since its functions as Task2 but array of size 4KB(4*1024).

Task4 used the 5th most of time since its functions as Task2 but array of size 64KB(4*1024).