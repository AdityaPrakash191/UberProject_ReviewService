# Email : SMTP

for executing the functionality of email, SMTP(Simple mail transfer Protocol) is used. Onemore protocol named "POP2" is used in combinatoin with SMTP.

One is used to send emails that are stored in the user's inbox and other is used to retrieve emails sent to a user.

SMTP also uses TCP protocol from transport layer.

Connection for SMTP is setup on port 25.
mail clients gives the actual u1 for end users to send and receives mail. viz gmail, outlook.

`How SMTP works?`

when an email is sent, it is sent to the sender's smtp server using SMTP protocal. (also the same server is configured in the mail clients.)

the smtp server places the mail on a message queue.

then SMTP server initiates a connection with receiver's SMTP server and conducts an initial SMTP handshake.

then finally it sends the email to recipients SMTP server.

the email is downloaded from receiver's SMTP server & then the client shows the mail.

SMTP :- Push protocal
POP2 / IMAP :- pull protocals

if the recipients SMTP server is offline, the sender SMTP server tries again and again after some delta mins.
There is a set threshold after which it stops sending the email & mark it as not delivered.
