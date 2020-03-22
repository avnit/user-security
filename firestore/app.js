const http = require('http');
const express = require('express')
const app = express()

const hostname = '127.0.0.1';
const port = 8000;

app.get('/', (req,res) => res.send('Hello world'))

app.listen(port,hostname, () => console.log(`server running at http://${hostname}:${port}/`))



// const server = http.createServer((req,res) => {
//     res.statusCode = 200;
//     res.setHeader('Content-Type', 'text/json');
//     res.end('hello world');
// });

// server.listen(port,hostname, () => {
//     console.log(`server running at http://${hostname}:${port}/`);
// });
