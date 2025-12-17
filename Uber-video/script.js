const fs = require('fs');

fs.writeFile('hey.txt', 'hello world', function(err){
    if(err) consoleerror(err);
    else console.log('done');
});