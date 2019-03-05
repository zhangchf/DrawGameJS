// server.js
// where your node app starts

const express = require('express');
const app = express();
const http = require('http').Server(app);
const io = require('socket.io')(http);

app.use(express.static('./'));

app.get('/', function(req, res){
  res.sendFile(__dirname + '/fabricDrawing.html');
});

io.on('connection', function(socket){
  console.log('a user connected');
  socket.on('disconnect', function() {
    console.log('user disconnected');
  });

  socket.on('msg-echo', function(...data) {
    console.log('received "echo" message: ' + data);
    io.to(socket.id).emit('msg-echo-back', ...data);
  })
});

http.listen(3000, function(){
  console.log('listening on *:3000');
});

