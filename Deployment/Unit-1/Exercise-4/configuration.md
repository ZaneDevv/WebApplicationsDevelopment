# Configuration of your server
> Álvaro Fernández Barrero, 2º DAW BIL

## Setting the machine up to date

When it is required to configurate a machine, the first thing to do it to check if it has connection to Internet because we are likely about to be installing a few programs. Thus, an easy way to do that is by running the command `ping`, which simulates sending the information to a specific device by its ID and shows whether the connection was possible.

![Checking connection](./images/check_connection.png)

As we see in the picture, we could connect to the device whose IP is 8.8.8.8, a device provided by Google.

Next, we need to ensure all our packages are updated by running the following commands:

```sh
sudo apt update
sudo apt upgrade -y
``` 
And finally, we reboot the machine running the command:

```sh
sudo reboot
```

## Installing programs

Now that our machine is up to date, we will install the following packages:

* **curl**
* **wget**
* **git**: Program to control the versions of the projects
* **vim**: Text editor
* **nano**: Text editor
* **unzip**
* **tree**: Program to see all the files inside a given directory in a tree-shape
* **net-tools**
* **htop**

```sh
sudo apt install curl wget git vim nano unzip tree net-tools htop
```

The most important one here now is git, so it is interesting to check if it was successfully installed:

```sh
git --version
```

![Git version](./images/git_version.png)

## Checking network connection && SSH

Furthermore, we will check the network settings by running the commands:

```sh
ip a
ip route
```

![Network](./images/network.png)
