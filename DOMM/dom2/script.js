var btn = document.querySelector('button');
var main = document.querySelector('main');

var arr = [
    'Baation me teri ',
    'AB hum na Ayenge',
    'Ab hum naa ayenge',
    'sochaaa tha tere baare me ',
    'Kisi ko na batayenge.. hum na batayenge'
];

btn.addEventListener('click', function() {
    var h1 = document.createElement('h1');
    var a = Math.floor(Math.random() * arr.length);
    var b = Math.floor(Math.random() * 360); // random angle
    var x = Math.floor(Math.random() * 90);  // random top position
    var y = Math.floor(Math.random() * 90);  // random left position

    h1.style.position = 'absolute';
    h1.innerHTML = arr[a];

    // Random position
    h1.style.top = x + '%';
    h1.style.left = y + '%';

    // Random rotation
    h1.style.transform = `rotate(${b}deg)`;

    main.appendChild(h1);
});
