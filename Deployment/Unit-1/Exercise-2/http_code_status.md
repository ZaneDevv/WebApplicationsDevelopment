# HTTP Status Codes
> Álvaro Fernández Barrero, 2º DAW BIL

When using the HTTP/S protocol, several different numeric codes are revealed to show whether the system had an error while running and to what it is releated. A common list of these is:

### 200
The fact that the first digit is 2 already tells as that the communication succeed. In this case, as the rest of the digits are 0, it tells us that the communication is just correct. It will bring more information with it according to the method we used.

### 201
Again, since it begins with a 2 we know it suceeded and, as it is specifically 201, we know that a new resource could be created.

### 204
When getting this code, the server has received correctly the information and everything works properly but the server is not returning anything.

### 301
Now, the first digit is a 3, which claims that the client must do something more to complete the request. For the 301 case, the target resources was moved and the requests should be redirected to a different place.

### 304
When receiving the code, the resource the user was looking for was not modified and there is no need to get it again as the client already has a copy of it.

### 400
The very first digit here is 4, stating that something went wrong in client-side. For the code 400, it just claims the client did a bad request and te server will not process it.

### 401
Here, the client is unauthorized and cannot access to the target resource.

### 403
This code says that even though the request is technically valid, the server will not do anything with it because of lack of permissions to a specific resource or because the client attempted to connect to a forbidden resource.

### 404
The most typical and known one, which tells that the request was looking for something that could not be found.

### 500
The prefix 5 shows an error in the server. For the 500 case just shows that something went wrong, but does not provide any further explanation.

### 503
This last code states that the server cannot handle the requests.
