# Torrent

It is a protocol for p2p file sharing. A bit torrent client is an application that uses this protocol.

actually it not only follows p2p but instead follows hybrid architecture for file sharing.

allows easy access for file sharing.

A bit torrent client requests files from multiple clients in parallel.

small chunks of data is called pieces.

if a client successfully downloads a piece, torrent tells all other clients, that this piece is now also available in this new client & can be downloaded from this client.

the collection of collaborating clients are called "swarms".

`Torrent File` : A client joins a swarm by downloading .torrent file.
It gives info about the file being shared, like how much bit it is, size of it's pieces, how to start interacting with other clients etc.

Gives info about TRACKER ( tracker is server that tracks who is participating in swarm)

when a client, joins the swarm, it request a list of clients from the tracker & starts communication with these clients over TCP(initially act as a leecher).

when the size of swarm increases, we can also use trackerless torrents using distributed hash tables.

`Que`> What exactly torrent does?

1. it breaks the file being shared into N pieces
   for better performance : 25kb -- 1mb
   it uses TCP so the sharing of pieces is reliable.

2. to ensure pieces integrity -> torrent attaches SHA-1 hash to each pieces.

peers exxhanges pieces they have. peers downlaod the rarest piece first. if any piece is unaavailable in all peers, no one can download it.

This is called as "Rarest first policy"

# TFT policy (tit for tat)

you send data to peers, who send you data. the peers who contribute more can download faster also this creates incentives for seeders.
