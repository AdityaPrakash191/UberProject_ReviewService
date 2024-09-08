# Transport Layer

Transport layer, takes messages from network to applications layer vice & versa.

It segements the data in small managable pieces called as "segments" or "datagrams".

It allows logical app-app delivery,
It multiplexes & demultiplexes data.

# where it exists

transport layer also exist on end systems.
In transport layer there are 2 main protocols.

1. TCP -> Transfer control protocol
2. UDP -> User datagram protocol

Difference between TCP and UDP

`TCP`

1. while using TCP small pieces of data are call segments.
2. ensures reliable and in-order delivery of segments.
3. detects modification on the packets during delivery and corrects them.
4. Slower than UDP
   ex : HTTP , Email , FTP

`UDP`

1. while using UDP small pieces of data are call datagrams.
2. does not ensures reliable and in-order delivery of segments.
3. It also detects modification on the packets during delivery but do not corrects them.
4. Faster than TCP.
   ex -> VOIP , live streaming

# Reliable Data Transfer

Lets see some work arounds for network layer imperfection.

1. Checksums :- the first imperfection for network layer is that segments may be corrupted by transmission errors. checksum is an error detection mechanism. Checksum (arithmetic sum) are attached with the segment. which is verified by user.

2. Retransmission Timers :- the second imperfection is that segments may be lost. To resolve these retransmission timers are used. the value of retansmission timers should be greater than round trip time.

`Limitation of retransmission timers` 3. Sequence Numbers :- This is an identification sequence attached with each segment to identify duplicate.

# Sliding window -

It is used to avoid overload receivers that can happen due to piplining of that sender is doing. There are set of consecutive numbers that senders uses in transmitting to ensures waitless data transfer. At the beginning of session, senders & receivers agrees on window size.
