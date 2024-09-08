# DNS (Domain Name server)

Domain names are unique name s that identifies a website and are mapped to an IP address. To get this mapping we use DNS.

Ip address are difficult for humans to remember
DNS is the layer that helps us to map domain to IP address.

`DNS-lookup` : This is the process using which Domain to IP resolution is done.

`Root DNS ` : first POC for a DNS query. they exist at the top of the hierarchy and points to multiple TLD's.(Top level domain servers).

`Top level domain servers` : for each domain we have a TLD part.
ex :- io , com , edu , gov , in etc.

`Authorization server` : each org with a public email or website should provide DNS records. These records can be stored on dedicated DNS server owned by the org or they can use 3rd party .

`Local DNS cache` : mapping are locally cached.
local resolver library.
if local dns has nothing cached then authoritative/self owned servers are queried.
This local dns is configured generally using DHCP.
