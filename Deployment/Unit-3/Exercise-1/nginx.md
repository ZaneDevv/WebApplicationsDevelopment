# NGINX
> Álvaro Fernández Barrero, 2º DAW BIL

Nginx *(engine x)* is a HTTP web server like apache2, but they have indeed their differences. To start off, apache only allows one client at a time whereas nginx uses several processes and an asyncronous programming allowing multiple clients connect at the same time; On top, ngix requires less memory and CPU usage than apache thanks to how it is made.

## Reverse proxy

A reverse proxy is an intermediary server that sits between clients (like web browsers) and backend servers. It forwards client requests to the appropriate server and returns the server’s response to the client, acting as a single entry point for all incoming traffic.

## Installation

To install nginx, we simply must run the command:

```sh
sudo apt install nginx -y```

And, to check if the installation succeed and we already have the service on our device:

```sh
nginx -v```


