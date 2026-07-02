const jsonServer = require('json-server');

const server = jsonServer.create();
const router = jsonServer.router('student.json');
const middlewares = jsonServer.defaults();

server.use(middlewares);

// Cookie middleware
server.use((req, res, next) => {
    res.setHeader('Set-Cookie', 'language=en-gb');
    next();
});

server.use(router);

server.listen(3000, () => {
    console.log('JSON Server is running on port 3000');
});