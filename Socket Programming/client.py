"""
Simple client created in python using sockets programming.
"""
import socket

s = socket.socket()

# connecting to the server
s.connect((socket.gethostname(),9999))

# printing the received function
print(s.recv(1024))

s.close()