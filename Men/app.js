const express = require('express');
const morgan = require('morgan')
const app = express();

app.use(morgan('dev'))


app.use(express.json())
app.use(express.urlencoded({extended:true}))

app.set("view engine", 'ejs')
app.use((req, res, next) => {
    console.log("this is middleware");

    const a = 2;
    const b = 3;
    console.log(a + b)
    return next();
})

app.get('/', (req, res) => {
    res.render('index')
})
app.get('/about', (req, res) => {
    res.send("hello about")
})

app.get('/profile', (req, res) => {
    res.send("hello profile ")
})
app.post('/get-form-data',(req, res) =>{
    console.log(req.body)
    res.send('data recieved')
})


app.listen(3000);