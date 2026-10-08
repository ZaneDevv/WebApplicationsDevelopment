# DebulaDB
> A distributed database

![built](https://img.shields.io/badge/build-passing-lightgreen)
![version](https://img.shields.io/badge/version-3.12.2-blue)
![license](https://img.shields.io/badge/license-MIT-orange)

## Index

* [Architecture](#architecture)
* [Components](#components)
* [Installation](#installation)
* [Configuration](#configuration)
* [API](#api)
* [Diagram](#diagram)
* [Tasks](#tasks)
* [Liecense](#license)


## Architecture

* **API Gateway**
    * Gate point for extern requests.
    * Manages routing and traffic limitation.
* **Auth Service**
    * Manages authentification.
    * Validates and creates access tokens.
* **Query Engine**
    * Anallyzes and runs queries.
    * Distributes operations among all storing nodes.
* **Storage Nodes**
    * Stores data physically.
    * Allows replications and horizontal scability.
* Monitoring
    * Collect system metrics.
    * Generates alerts upon errors and service degradation.


## Components

| Compnent | Language | State | Version | Dependency |
| - | - | - | - | - |
| API Gateway | Go | Stable | 1.0.5 | Redis, Prometheus |
| Auth Service | Rust | Stable | 2.5.62 | PostgreSQL, JWT |
| Query Engine | C++ | Beta | 0.2.5 | gRPC, LLVM |
| Storage Node | Rust | Stable | 2.6.12 | RocksDB, Raft |
| Monitoring | Python | Experimental | 0.12.3 | Prometheus, Grafana |

## Installation

Clone the repository and run the installator:

```sh
git clone https://example.com/nebuladb.git
cd nebulabd
./install.sh
```

Check if the installation ran successfully:

```
nebuladb --version
```


## Diagrams

flowchart TD
    user  --> API Gateway --> Auth Service --> Query Engine --> Database


## Tasks

[x] Design the initial architecture.
[x] Implement the API Gateway.
[x] Implement JWT authentification.
[ ] Add automatic replication.
[ ] Implement distributed queries.
[ ] Create monitoring panel.
[ ] Public 3.0 version.

---

> "We build NebulaDB so that the infrastructure's complexity does not have to be visible for those who develop applications."

**Last update**: Octobe 1st, 2026


## License

NebulaDB is distributed under the license MIT.

Check out entire license's text in MIT.
