var arr =[
    {
        team:'CSK',
        primary:'yellow',
        secondary:'blue',
        fullname:'Chennai Super Kings',
        trophies:5,
        captain:'MSD'
},
    {
        team:'RCB',
        primary:'Red',
        secondary:'Black',
        fullname:'ROyal challenges Banglore',
        trophies:3,
        captain:'VK'
},
    {
        team:'PSBN',
        primary:'green',
        secondary:'white',
        fullname:'Punjab TItans',
        trophies:5,
        captain:'GIll '
},
    {
        team:'LNKS',
        primary:'silver',
        secondary:'red',
        fullname:'Lakhnav Giants',
        trophies:3,
        captain:'SGF'
},
]

var btn  = document.querySelector('button')
var h2 = document.querySelector('h2')
var h4 = document.querySelector('h4')
var h5 = document.querySelector('h5')
var h6 = document.querySelector('h6')
var main = document.querySelector('main')

btn.addEventListener('click', function(){
    var num = Math.floor(Math.random()*arr.length);


    h2.innerHTML = arr[num].team
    h4.innerHTML = arr[num].fullname
    h5.innerHTML = arr[num].trophies
    h6.innerHTML = arr[num].captain
    
    h1.style.backgroundColor = arr[num].secondary
    main.style.backgroundColor = arr[num].primary
})