"""
Simple server created in python using sockets programming.
"""
import socket

# socket object created
s = socket.socket()

# getting host/ IP address
host = socket.gethostname()

# binding the socket to required ip and port
s.bind((host,9999))

# server starts to listen
s.listen(5)

while True:

    # getting connection object and address if connected to a client
    con, addr = s.accept()

    print("Connected to: ",addr)

    # sending message
    con.send(b'You are connected')
    # closing the connection when done
    con.close()
