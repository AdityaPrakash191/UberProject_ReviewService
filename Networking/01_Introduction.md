# Computer Networks

`Network` : It is group or system of interconnected people or items.
Computer connected with each other with cables or wireless is called computer networks.

`Internet` : Internet is a network of computer networks.

# History of Internet

`1957` -------> `ARPA` -----------> `1960's - 70's` ---------------------> `1980's` --------> `1990's`

\|/---------------|------------------------|--------------------------------------|----------------|

`Soviet`----------`US`---------(Communicaton System for ARPA's Computer) --------`TCP/Ip` ---------`CERN` -> (Hyperlink based docs)

|------------------| -----------------------|---------------------------------------|-------------------|

`sputnik`-----(Advance research --------`1969-ARPANET` -------------------------`Internet` ---------`1990` => (Tim Bernerlee W.W.W)
project & Agency)

# Protocols

Network Protocols are a set of rules and regulations setup to communicate and share information over a network.
Ex -> HTTP , UDP , TCP , SMTP etc.

# Packets

In order to share data, we can't send big chunk of data over the network. So we divide the data into smaller chunks, these chunks are known as packets.

# Address

sending messages over the network requires the destination details. this detail uniquely identify the end system is called as address.

# Ports

Any Machine could be running many network applications. In order to distinguish the apps for receiving messages we use ports. (port number).

IP-address + Port => Socket
ports helps you to get the packet to specific process on the host.

Every process has 16bit port number = 0 - 65535.

1. 0 - 1023 : well Known ports.
   ex : port 80 -> http
   port 443 -> https

2. 1024 - 49152 : registered ports (This range is changeable)
   They are used by specific, potentially properties apps/process that are known but not system defined.
   sql server -> 1433
   mongo -> 27017

3. 49152 - 65535 : Dynamic ports
