var btn = document.querySelectorAll('button');
const buttons = [

  {
    btn: document.getElementById('btn-0'), sound: document.getElementById('sound-0')
  },
  { btn: document.getElementById("btn-1"), sound: document.getElementById("sound-1") },
    { btn: document.getElementById("btn-2"), sound: document.getElementById("sound-2") },
    { btn: document.getElementById("btn-3"), sound: document.getElementById("sound-3") }
];
document.addEventListener('keydown', () =>{
  let random = Math.floor(Math.random()*3);
  
  buttons[random].sound.currentTime = 0;
  buttons[random].sound.play();
  
buttons[random].btn.style.backgroundColor ="yellow"
setTimeout(()=>{
       buttons[random].btn.style.background = "";
}, 400)
});